# msa-study
Microservice Architecture Study

### Spring Cloud 추가
* `Eureka Server`, `Eureka Client` 를 추가하여 마이크로서비스들의 정보를 레지스트리에 등록할 수 있도록 하고 마이크로서비스의 동적인 탐색과 로드밸런싱을 제공하게 한다.

### Spring Cloud Gateway 추가
* `API Gateway` 중 하나인 **SCG**는 클라이언트 요청 앞단에 위치하여 다음과 같은 특징을 갖는다.
  * 인증 및 권한 부여
  * 응답 캐싱
  * 속도 제한
  * 부하 분산
  * IP 허용 목록에 추가
* Zuul VS SCG
  * Zuul 은 Tomcat 을 사용하고 SCG 는 **Netty** 를 사용한다. (Netty 는 비동기 네트워킹을 지원하는 어플리케이션 프레임워크)
  * Zuul 은 Blocking 방식, SCG 는 non-Blocking 방식이다.
  * Zuul 은 Filter 로만 동작하지만, SCG 는 Predicates 와 Filter 를 조합하여 동작한다.