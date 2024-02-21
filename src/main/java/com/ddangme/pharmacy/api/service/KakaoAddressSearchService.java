package com.ddangme.pharmacy.api.service;

import com.ddangme.pharmacy.api.dto.KakaoApiResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Slf4j
@Service
@RequiredArgsConstructor
public class KakaoAddressSearchService {

    /*
    RestTemplate: 스프링 프레임워크에서 제공하는 HTTP 통신을 위한 클라이언트 라이브러리
    RESTful 웹 서비스에 대한 요청을 보내고 응답을 받는데 사용한다. 주로 외부 API 호출 및 웹 서비스 간 통신에 활용된다.

    HTTP 요청 및 응답 처리: HTTP 요청을 보내고 응답을 받아오는 기능을 제공한다. 이를 통해 원격 서버와의 통신을 쉽게할 수 있다.
    HTTP 요청 및 응답 헤더 설정: 요청 및 응답 헤더를 설정할 수 있어서 다양한 옵션을 커스터마이징할 수 있다.
    HTTP 요청 및 응답의 JSON 변환: JSON 데이터를 자바 객체로 변환하거나 자바 객체를 JSON 으로 변환하는 기능을 제공한다. 이를 통해 JSON 기반의 RESTful 웹 서비스와 쉽게 통신할 수 있다.
    에러 처리: HTTP 상태 코드를 확인하여 에러 처리를 할 수 있다.
     */
    private final RestTemplate restTemplate;
    private final KakaoUriBuilderService kakaoUriBuilderService;

    @Value("${kakao.rest.api.key}")
    private String kakaoRestApiKey;

    public KakaoApiResponseDto requestAddressSearch(String address) {

        if(ObjectUtils.isEmpty(address)) return null;

        URI uri = kakaoUriBuilderService.buildUriByAddressSearch(address);

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "KakaoAK " + kakaoRestApiKey);
        HttpEntity<Object> httpEntity = new HttpEntity<>(headers);

        // kakao api 호출
        return restTemplate.exchange(uri, HttpMethod.GET, httpEntity, KakaoApiResponseDto.class).getBody();
    }
}
