package study.spring.simplespring.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import study.spring.simplespring.model.Department;
import study.spring.simplespring.service.DepartmentService;

/** 학과 관리 컨트롤러 **/
@Controller
public class DepartmentController {

	/** Service 패턴 구현체 주입 **/
	// --> import study.spring.simplespring.service.DepartmentService;
	@Autowired
	DepartmentService departmentService;
	
	/** "/프로젝트이름"에 해당하는 ContextPath 변수 주입 **/
	// -->
	@Value("#{servletContext.contextPath}")
	String contextPath;
	
	/** 목폭 페이지 **/
	@RequestMapping(value = "/department/list.do", method=RequestMethod.GET)
	public String list(Model model, HttpServletResponse response,
			// 검색어
			@RequestParam(value="keyword", required = false) String keyword) {
		// 조회에 필요한 조건값(검색어)를 beans에 담는다.
		Department input = new Department();
		input.setDname(keyword);
		input.setLoc(keyword);

		
		List<Department> output = null; // 조회결과가 저장될 객체
		
		try {
			// 데이터 조회하기
			output = departmentService.getDepartmentList(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// View 처리
		model.addAttribute("output", output);
		model.addAttribute("keyword", keyword);
		return "department/list";
	}
	
	/** 작성 폼 페이지 **/
	@RequestMapping(value = "/department/add.do", method = RequestMethod.GET)
	public String add(Model model, HttpServletResponse response) {
		return "department/add";
	}
	
	/** 작성폼에 대한 action 페이지 **/
	@RequestMapping(value = "/department/add_ok.do", method = RequestMethod.POST)
	public void addOk(Model model, HttpServletResponse response, 
			@RequestParam(value="dname") String dname,
			@RequestParam(value="loc") String loc) {
		
		// 저장할 값들을 Beans에 담는다.
		Department input = new Department();
		input.setDname(dname);
		input.setLoc(loc);
		
		try {
			// 데이터 저장 --> 데이터 저장에 성공하면 파라미터로 전달하는 input 객체에 PK값이 저장된다.
			departmentService.addDepartment(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 저장결과를 확인하기 위해서 데이터 저장시 생성되는 PK값을 상세 페이지로 전달해야 한다.
		String redirectUrl = contextPath + "/department/detail.do?deptno=" + input.getDeptno(); 
		
		try {
			response.sendRedirect(redirectUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 상세 페이지 **/
	@RequestMapping(value = "/department/detail.do", method = RequestMethod.GET)
	public String detail(Model model, HttpServletResponse response,
			@RequestParam(value="deptno") int deptno) {
		
		// 데이터 조회에 필요한 조건값을 Beans에 저장하기
		Department input = new Department();
		input.setDeptno(deptno);
		
		// 조회결과를 저장할 객체 선언
		Department output = null;
		
		try {
			// 데이터 조회
			output = departmentService.getDepartmentItem(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// View 처리
		model.addAttribute("output", output);
		
		return "department/detail";
	}
	
	/** 삭제 처리 구현 **/
	@RequestMapping(value = "/department/delete_ok.do", method = RequestMethod.GET)
	public void deleteOk(Model model, HttpServletResponse response) {
	}
	
	/** 수정 폼 페이지 **/
	@RequestMapping(value = "/department/edit.do", method = RequestMethod.GET)
	public String edit(Model model, HttpServletResponse response) {
		return "department/edit";
	}
	
	/** 수정폼에 대한 action 페이지 **/
	@RequestMapping(value = "/department/edit_ok.do", method = RequestMethod.POST)
	public void editOk(Model model, HttpServletResponse response) {
		
	}
	
	
}	
