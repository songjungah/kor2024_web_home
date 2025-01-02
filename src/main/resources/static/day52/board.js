/*
    [POST 전송시]
    const option = {
        method : 'POST',
        Headers : {'Content-Type' : 'application/json'},
        body : JSON.stringify(전송할 객체)
    }

    fetch('자바컨트롤러 URL', 옵션)
        .then(response => response.json())
        .then(data => {응답결과코드})
        .catch(error => {오류결과코드})
 */


// (1) 글쓰기 함수, 함수명 : write(), 사용처 : [등록]버튼 클릭시, 매개변수 : X, 반환값 : X
function bwrite() {  // JS 함수중에 내장된 write 함수가 존재함으로 중복이다. write() -> _write()

    // [1] input 마크업에 입력받은 값을 가져오기
        // 1-1. document.querySelector() 함수 이용하여 DOM 마크업 객체 가져오기
        let titleInput = document.querySelector('.titleInput');
        let contentInput = document.querySelector('.contentInput');
        let pwdInput = document.querySelector('.pwdInput');

        // 1-2. 가져온 dom 객체의 value 속성을 가져오기
        let title = titleInput.value;
        let content = contentInput.value;
        let pwd = pwdInput.value;

    // [2] 입력받은 값들을 객체화
    let board = {title : title, content : content, pwd : pwd};


    // [3] fetch 함수를 이용한 자바에게 입력받은 값 전달하고 응답받기
    const option = {        // 통신할 때 사용할 부가정보가 담긴 객체

        // (1) method : HTTP 통신 할 때 사용할 메소드 선택 [get:호출, post:저장, put:수정, delete:삭제]
        method : 'POST',    
        
        // (2) Headers : HTTP 통신의 부가정보
        // Content-Type : 보내고자 하는 데이터의 타입 설정 / application/json : JSON 타입
        Headers : {'Content-Type' : 'application/json'},
        
        // (3) body : HTTP 통신의 본문
        // JSON.stringify(객체) : JSON 객체타입을 문자열 타입으로 변환 함수
        body : JSON.stringify(board),

        // INPUT 으로 부터 입력받은 값들을 JSON 형식의 문자열타입으로 자바에게 전송
    }

    fetch('/day52/write', option)           // fetch('통신할 URL', 옵션)
        .then(response => response.json())      // .then(매개변수명 => 매개변수명.json()) : 응답 결과를 json 타입으로 변환
        .then(data => {                         // .then(매개변수명/응답값 => {응답결과 코드;})
            // [4] 응답 결과에 따른 메세지 출력   
            if(data == true) {
                alert('write success');
                findAll();
            } else {
                alert('write fail')
            }
        })
        .catch(error => {console.log(error);})  // .catch(매개변수명 => {오류결과 코드;})


}   // f end


// (2) 글출력 함수
function findAll() {

    // fetch 출력

    fetch('/day52/findall')
        .then(r => r.json())
        .then(data => {console.log(data)})
        .catch(e => {console.log(e)})

}   // f end