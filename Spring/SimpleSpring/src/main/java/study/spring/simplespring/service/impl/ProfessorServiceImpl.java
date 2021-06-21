package study.spring.simplespring.service.impl;

import org.springframework.stereotype.Service;

import study.spring.simplespring.service.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Override
	public String addData() {
		// TODO Auto-generated method stub
		return "교수데이터를 추가합니다.";
	}

	@Override
	public String getDataItem() {
		// TODO Auto-generated method stub
		return "교수데이터의 상제정보를 조회합니다.";
	}

	@Override
	public String getDataList() {
		// TODO Auto-generated method stub
		return "교수목록을 조회합니다.";
	}

	@Override
	public String editData() {
		// TODO Auto-generated method stub
		return "교수데이터를 수정합니다.";
	}

	@Override
	public String deleteData() {
		// TODO Auto-generated method stub
		return "교수데이터를 삭제합니다.";
	}

}
