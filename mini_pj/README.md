## ⚓️ 항해99 Chapter1 5조 미니 프로젝트

### 👊 프로젝트 개요

- 프로젝트 제목: 💪 운동갈지도
- 프로젝트 설명: 내 주변 운동할 수 있는 곳들을 보여주는 지도 사이트
- 프로젝트 기간: 2022.07.11 ~ 2022.07.14

### 💁‍♂️ 참여자

- 남궁은
- 안승현
- 이길종

### 🛠️ 사용 기술

- HTML5, CSS3, JavaScript
- Python (flask, jinja2)
- AWS
- MongoDB
- Bootstrap
- PyCharm, Visual Studio Code, Sourcetree

### ✔️ 구현 기능

- JINJA2 템플릿 엔진 사용
- JWT 방식 로그인
- 카카오 지도 API 구현
- 댓글 기능

### 🔫 트러블 슈팅

- 상세페이지로 데이터가 안넘어가는 현상

  > app.py에서 정의한 주소와 html 주소가 달라서 발생

- 풀리퀘스트 후 로컬에 찌꺼기 커밋이나 푸쉬가 남아있는 현상

  > 메인에 바로 푸쉬하지 못하도록 깃허브 설정을 해놓고, 각자 브랜치를 따 작업한 뒤 머지 후 메인 브랜치에 푸쉬

- 눌렀을때 페이지 변경하고 싶어서 script에 함수 추가하였으나 잘 안됨

  > 요소에 onclick="location.href='(타겟페이지)';" 속성 추가로 해결

- 크롤링한 결과를 db에 넣을때 잘 들어가지 않는 문제

  > 데이터를 for문으로 재가공해서 해결

- 로드뷰 및 지도가 나타나지 않는 문제

  > div의 class 속성이 중복된 걸 발견하고 수정

- 데이터 받아온 것을 db에서 분류하고 싶었음

  > 요소 추가해서 필터링에 사용
  > for i in range(15):
  > doc={
  > 'gunum':1 <!--구분용 요소-->
  > }
  > db.scgym.insert_one(doc)

- 배포시점 jinja2.exceptions.TemplateNotFound 문제발생

  > 패키지 설치로 해결

- 로그인이 먹통이 되었고 git bash에서 로그 확인한 결과 Typeerror: Object of type bytes is not JSON serializable 에러 발생

  > token = jwt.encode(payload, SECRET_KEY, algorithm='HS256')에 .decode('utf-8') 붙여서 해결

- 이미 쓰여져있는 댓글이 로딩이 잘 되지 않는 문제가 있었음. 페이지 로딩에서 문제가 있다고 생각하여 새로고침 함수로 해결하고자 여러번 시도

  > 로드뷰가 렌더링 되는 함수에서 reload 함수를 호출하지 않고, 리뷰불러오는 함수 위치를 외부에서 document.ready로 변경하여 해결

- css 적용이 안되는 경우

  > css 우선순위에 따라 차등분배, 부트스트랩 라이브러리를 사용하는 경우 개발자 도구를 통해 해당 셀럭터를 끌고와 css 재적용

- 닉네임 중복버튼 오류
  > db에 들어있는 id와 중복되었다는 부분에서 힌트를 얻어서 db.users.find_one({'id': checkid_receive}) 부분을 ->db.users.find_one({'nick': checknick_receive})

### 📁 발표 자료

https://www.youtube.com/watch?v=D1s6BnOHnV4
