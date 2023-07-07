var request = new XMLHttpRequest();

let textArea = document.getElementById('textArea');
function getResult(){
    let answer;
    request.open("POST","/submitText",false);
    request.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    request.onreadystatechange = function() {
        if(request.readyState === XMLHttpRequest.DONE && request.status===200){
            answer = request.response;
        }
    };
    request.send(textArea.value);
    alert("First unique char from the array of unique chars is "+""+answer+"");

}