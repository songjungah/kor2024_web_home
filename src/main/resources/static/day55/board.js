// 글쓰기 함수
function onWrite() {
    console.log('onWrite load');
    
    // [1] 저장 게시물 정보 샘플, 추후에 document.querySelector 이용하여 입력받아 할 예정
    let sampleBoard = {
        "btitle" : "테스트제목" , 
        "bcontent" : "테스트내용" , 
        "bwriter" : "유재석" ,
        "bpwd" : "1234"
      }

    // [2] fetch 함수에 사용할 옵션 객체
    let option = {
        method : 'POST',
        headers : {'Content-Type' : 'application/json'},    // HTTP 데이터 전송시 body 사용
        body : JSON.stringify(sampleBoard)                  // HTTP 에 보낼 데이터를 body에 작성   
    }

    // [3] fetch 함수 사용
    fetch('/write', option)
        .then(response => response.json())
        .then(data => {console.log(data)})
        .catch(error => {console.log(error)})
}

// 전체 글 출력 함수
function onFindAll() {
    console.log('onWrite load');

    // [1] fetch
    fetch('/findall')
        .then(response => response.json())
        .then(data => {console.log(data)})
        .catch(error => {console.log(error)})
} 

// 개별 글 출력 함수
function onFindId() {
    console.log('onWrite load');

    // [1] 조회할 게시물 번호, 샘플은 DB 에 존재하는 게시물 번호 진행
    let sampleBno = 3;

    // [2] fetch
    fetch(`/findid?bno=${sampleBno}`)
        .then(response => response.json())
        .then(data => {console.log(data)})
        .catch(error => {console.log(error)})
}

// 수정 글 출력 함수
function onUpdate() {
    console.log('onWrite load');

    // [1] 수정할 게시물 번호
    let sampleBoard = {"bno" : 3, "btitle" : "수정한 제목2", "bcontent" : "수정한 내용2"};

    // [2] fetch
    fetch(`/update`, {method :  'PUT',
                     headers : {'Content-Type' : 'application/json'},
                     body : JSON.stringify(sampleBoard)
    })
        .then(r => r.json())
        .then(d => {console.log(d)})
        .catch(e => {console.log(e)})
}

// 글 삭제 함수
function onDelete() {
    console.log('onWrite load');

    // [1] 삭제할 게시물 번호
    let sampleBno = 4;

    // [2] fetch
    fetch(`/delete?bno=${sampleBno}`, {method : 'delete'})
        .then(r => r.json())
        .then(d => {console.log(d)})
        .catch(e => {console.log(e)})
}