function showDate() {
    document.querySelector('#showDate').innerHTML = new Date();
}
function showTable() {
    //getting the input string
    //console.log("hello");
    let numstr = document.querySelector('#exampleInputnum').value;
    //console.log(numstr);
    //converting that to number type if not empty
    let num = 0;
    if (numstr != "") {
        num = Number.parseInt(numstr);
        let str = "";
        for (let i = 1; i <= 10; i++) {
            str = str + `${num}*${i}=${num * i}` + "<br/>";
        }
        document.querySelector('#showTable').innerHTML = `${str}`;
    }
    else {
        document.querySelector('#showTable').innerHTML = "";
    }
}

//Writing the functionality using event listener 
const btnReverse = document.getElementById("reverse");
function showReverse() {
    let str1 = document.querySelector("#inputNum1").value;
    if (str1 !== "") {
        let rev = 0;
        let num1 = Number.parseInt(str1);
        while (num1 > 0) {
            let r = num1 % 10;
            rev = rev * 10 + r;
            num1 = Math.floor(num1 / 10);
        }
        document.querySelector("#showResult").innerHTML = "Reverse of number:" + `${rev}`;
    } else {
        document.querySelector("#showResult").innerHTML = "";
    }
}

const btnPalindrome = document.getElementById('isPalindrome');

function checkPalindrome() 
{
    let str = document.querySelector('#inputNum1').value;
    if (str != null) 
    {
        let num = Number.parseInt(str);
        let rev = 0;
        let temp = num;
        while (num > 0) 
        {
            let r = num % 10;
            rev = rev * 10 + r;
            num = Math.floor(num / 10);
        }
        if (temp == rev) 
        {
            document.querySelector("#showResult").innerHTML = "palindrome";
        }
        else
        {
            document.querySelector("#showResult").innerHTML = "not palindrome";
        }

    } 
    else 
    {
        document.querySelector("#showResult").innerHTML = "";
    }
}
const btnsum = document.getElementById('sumOfDigits');
function sumOfDigits()
{
    let str=document.querySelector('#inputNum1').value;
    if(str!="")
    {
        let sum=0;
        let num=Number.parseInt(str);
        let digit=0;
        while(num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=Math.floor(num/10);
        }
        document.querySelector("#showResult").innerHTML="sum of digits"+`${sum}`;
    }
    else{
        document.querySelector('#showResult').innerHTML="";
    }
}

//Adding event listener to perform an action 
//passing the function showReverse as an argument(function callback)
btnReverse.addEventListener('click', showReverse);
//Adding event Listener to perform to check palindrome or not 
btnPalindrome.addEventListener('click', checkPalindrome);

btnsum.addEventListener('click', sumOfDigits);
