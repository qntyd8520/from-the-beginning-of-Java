package study.spring.springhelper.retrofit;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Retrofit;
import study.spring.springhelper.helper.RetrofitHelper;
import study.spring.springhelper.model.Image;
import study.spring.springhelper.model.Image.Documents;
import study.spring.springhelper.service.ApiKakaoSearchService;

/** Lombok의 Log4j 객체 */
// import lombok.extern.slf4j.Slf4j;
@Slf4j
/** JUnit에 의한 테스트 클래스로 정의 */
// import org.junit.runner.RunWith;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
/** Spring의 설정 파일들을 읽어들이도록 설정 (**은 `모든` 이라는 의미) */
// import org.springframework.test.context.ContextConfiguration;
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*-context.xml" })
/** 웹 어플리케이션임을 명시 */
// import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
/** 메서드 이름순서로 실행하도록 설정 (설정하지 않을 경우 무작위 순서로 실행됨) */
// import org.junit.FixMethodOrder;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KakaoImageSearchTest {

    // RetrofitHelper 객체 주입 설정
    @Autowired
    RetrofitHelper retrofitHelper;

    /** 원격지 JSON을 가져오는 테스트 메서드 */
    @Test
    public void testA() {
        /** 1) API 연동 객체 생성 */
        // Retrofit 객체 생성
        // --> import retrofit2.Retrofit;
        // --> import study.spring.springhelper.service.ApiKakaoSearchService;
        Retrofit retrofit = retrofitHelper.getRetrofit(ApiKakaoSearchService.BASE_URL);

        // Service 객체를 생성한다. 구현체는 Retrofit이 자동으로 생성해 준다.
        ApiKakaoSearchService apiKakaoSearchService = retrofit.create(ApiKakaoSearchService.class);

        /** 2) API 연동 */
        // 검색 결과를 저장할 Beans 객체 선언
        // --> import study.spring.springhelper.model.Image;
        Image image = null;

        // KakaoOpenAPI를 통해 검색 결과 받아옴.
        Call<Image> call = apiKakaoSearchService.getImage("스프링 웹 프로그래밍", 1, 50);

        try {
            image = call.execute().body();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /** 3) 조회결과를 반복문을 활용해서 출력한다. */
        if (image != null) {
            List<Documents> list = image.getDocuments();
            
            for (Documents item : list ) {
                log.debug(" >>> " + item.toString());
            }
        }
    }
}