package com.ddangme.pharmacy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;

/*
@EnableRetry: Spring Retry 를 활성화 시키는 역할을 한다. 이 어노테이션이 붙은 클래스는 Spring Retry 가 동작하는데 필요한 기능들을 활성화 한다.
@Configuration: 해당 클래스가 Spring 의 설정 클래스임을 나타낸다. Spring 은 애플리케이션의 구성을 정의하는 데 사용되는 여러 설정 클래스를 스캔하고 로드한다.

따라서 'RetryConfig' 클래스는 Spring Retry 를 사용하기 위해 필요한 설정을 포함하고 있으며,
'@EnableRetry' 어노테이션을 통해 Spring Retry 가 활성화된다.
이 설정 클래스를 스프링 애플리케이션의 구성에 포함시키면 애플리케이션 전체에서 Spring Retry 기능을 사용할 수 있게 된다.
 */

@EnableRetry
@Configuration
public class RetryConfig {
}
