<img width="91" alt="image" src="https://github.com/user-attachments/assets/7ac9a4c4-9c28-4092-a2aa-1ef30ee40402" />

<h1>클라우드 기반 네이티브 앱 개발 </h1>
- AI 기반 자동 출판 및 구독 플랫폼


##  프로젝트 개요

<img width="435" alt="image" src="https://github.com/user-attachments/assets/b298a76c-c600-469a-8f07-8b12b06afc21" />





 __도메인 이해__
 - 작가가 글을 쓰고 AI가 자동으로 표지 이미지를 만들어 전자책으로 등록해 주는 출간 자동화 플랫폼
 - 구독자는 월정액으로 다양한 책을 무제한 열람하며, KT 고객에게는 특별 포인트 혜택이 제공
 - 3회 이상 열람된 도서는 '베스트셀러'로 선정되어 더 많은 구독자에게 노출


## 유사 사례 - KT 밀리의 서재
KT의 '밀리의 서재'는 전자책, 오디오북, 챗북, 오브제북 등 다양한 콘텐츠를 무제한으로 제공하는 구독형 독서 플랫폼입니다. KT 고객은 '
필수팩L' 부가서비스를 통해 월 9,900원에 이용할 수 있으며, 장기 고객은 '마이 KT' 앱에서 제공하는 장기혜택쿠폰을 통해 1개월 무료 이
용권을 받을 수 있습니다.


<img width="521" alt="밀리의 서재 이미지" src="https://github.com/user-attachments/assets/818584f7-6f9e-4179-a3ae-7fe9231fca05" />

## 개발 요구 사항
<img width="500" alt="image" src="https://github.com/user-attachments/assets/4d84e032-d410-4487-ba28-98eb56df4351" />
### 비기능 요건
<img width="490" alt="image" src="https://github.com/user-attachments/assets/4857d9f0-9c46-4a14-99e6-e351af126918" />


## 프로세스 흐름
<img width="383" alt="image" src="https://github.com/user-attachments/assets/459e0b00-966b-48e6-a112-786f38656edd" />

## 구성도
<img width="420" alt="image" src="https://github.com/user-attachments/assets/cd53cca7-e840-46a6-b843-ec5cc76879bc" />


## 공통 수행 단계
<img width="516" alt="image" src="https://github.com/user-attachments/assets/bef7af20-053f-4248-80a9-59c437f04f2c" />

<img width="463" alt="image" src="https://github.com/user-attachments/assets/03ce5bf1-6860-4672-b8eb-b8d7973e595d" />

---

1차
 - [x]  도메인 분석과 유저 스토리 도출
 - [ ] 이벤트스토밍 (개념 설계)

2차
 - [ ] 이벤트스토밍 (상세 설계)
 - [ ] 이벤트스토밍 완료 - 헥사고날 다이어그램 작성

3차
 - [ ] 서비스 분장 및 협업 환경 구성 - 개발 환경 구성 및 코딩 시작
 - [ ] 단위 마이크로서비스 구현 (Biz 로직 / AI 코딩)

4차
 - [ ] 이벤트 드리븐 아키텍처 적용
 - [ ] API 게이트웨이 구현 및 테스트 결과 확인(트래픽 라우팅)

5차
 - [ ] 심플 프론트엔드 구현
 - [ ] 중간 산출물 점검 - 심플 프론트엔드 완료

6차
 - [ ] 마이크로서비스 배포
 - [ ] 컨테이너 오케스트레이션 (셀프힐링 / 무정지배포)

7차
 - [ ] 서비스 메시 적용
 - [ ] 컨테이너 기반 서비스 모니터링 로그 통합 모니터링 적용

8차
 - [ ] 서비스별 파이프라인 설정
 - [ ] 마무리

## 🔧 기술 스택  

<!-- Java -->
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)

<!-- Spring Boot -->
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)

<!-- React -->
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)

<!-- MSAEz -->
![MSAEz](https://img.shields.io/badge/MSAEz-Tool-FF6F00?style=for-the-badge&logo=databricks&logoColor=white)

<!-- Docker -->
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

<!-- Kubernetes -->
![Kubernetes](https://img.shields.io/badge/Kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white)

<!-- Azure -->
![Azure](https://img.shields.io/badge/Azure-0078D4?style=for-the-badge&logo=microsoft-azure&logoColor=white)

<!-- CI/CD -->
![CI/CD](https://img.shields.io/badge/CI%2FCD-AE3EAD?style=for-the-badge&logo=gitlab&logoColor=white)
