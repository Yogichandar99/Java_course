//declaring an array 
const arr=[1,2,3,4,5,6,7,8];

//displaying the array elements
for(let i=0;i<arr.length;i++)
{
    console.log(arr[i]);
}

//declaring functions in javascript 
function add(a,b)
{
    return a+b;
}

//Other way 
mul=function(a,b)
{
    return a*b;
}
//other way by using lambda function or arrow function
sum=(a,b)=>a+b;

//implementing callbacks 
//callbacks are nothing but function implementation is passed as a variable 
//here in the below function we are passing the array and the functionality to implement by using callback
function perform(arr,callback)
{
    let res=arr[0];
    for(let i=1;i<arr.length;i++)
    {
        res=callback(res,arr[i]);
    }
    return res;
}
big=(a,b)=>a>b?a:b;
//as we used the callback we can pass any functionality such as addition,summation or mul
let res=perform(arr,sum);
console.log(res);
let mulOfArray=perform(arr,mul)
console.log(mulOfArray);
let sumOfArray=perform(arr,add)
console.log(sumOfArray);