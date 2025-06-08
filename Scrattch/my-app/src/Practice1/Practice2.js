
let load=document.getElementById("ButtonToBeClicked").addEventListener('click',
  function () {
    let element=document.getElementById("HeadingToBeChanged");
    element.textContent="M Namer is hero born in VIJAYAWADA"
    console.log(element)
  }
);
console.log("hello");

let loader=document.getElementById("ButtonToBeClicked1").addEventListener('click',
  function () {
    let element=document.getElementById("UnorderedDomTraversal");
    element.firstElementChild.classList.add("Highlight");
    
    console.log(element)
  }
);

let loader12=document.getElementById("ButtonToBeClicked12").addEventListener('click',
  function () {
    let element=document.getElementById("ParentCotent");
    let head1=document.createElement("h1");
    head1.textContent="Content Have Been Added";
    
    element.appendChild(head1);
    
    console.log(element)
  }
);


let loader123=document.getElementById("ButtonToBeClicked123").addEventListener('click',
  function () {
    let element=document.getElementById("RemovingContent");
    element.lastElementChild.remove();
    
    
    console.log(element)
  }
);


let loader1234=document.getElementById("ButtonToBeClicked1234").addEventListener('click',
  function (event) {
    event.preventDefault();
    let element=document.getElementById("inputte").value;
    console.log(element)
    document.getElementById("AfterSubmit").textContent=`Added Text Content is ${element}`;
    document.getElementById("inputte").value="";
  }
);

function PromisePractice() {
  return new Promise((resolve, reject) => {
    let istrue = false;

    setTimeout(() => {
      if (istrue) {
        resolve("Success: Can go further");
      } else {
        reject("Failure: Need to call again");
      }
    }, 3000);
  });
}

// PromisePractice()
//   .then((value) => console.log(value))
//   .catch((value) => console.log(value));
// console.log("hello");
async function handling() {
  try{ 
  let promiseobj=await PromisePractice();
  console.log(promiseobj);
  }
  catch(error){
    console.log(error);
  }
}

handling()

class srihas{
   constructor(name){
    this.name=name;
   }

   greet(){
    console.log( `Mname is ${this.name}`);
   }

}


console.log("hellofergegeqrgg");
setTimeout(() => {
  console.log("internal;");
}, 4000);
console.log("External;");

document.getElementById("ClickToAddTask").addEventListener("click",function (){
  let message=document.getElementById("InputField").value;
  console.log(message)
  let unorderList=document.getElementById("unorderedListContainer");
  let divElement=document.createElement("li");
  let listElement=document.createElement("li");
  listElement.id=message;

  listElement.textContent=message;
  unorderList.appendChild(listElement);
  document.getElementById("InputField").value="";
})

document.getElementById("unorderedListContainer").addEventListener("click",function (event){
let elemet=event.target;
elemet.style.textDecoration = "line-through";
let unorderList=document.getElementById("unorderedListContainer");
//unorderList.removeChild(elemet);
  
  
})
let arr=[];

if(arr.length===0){
  const parenList=document.getElementById("ItemsTobeAdded");
 let li=document.createElement("li");
  li.textContent="Please Add something ";
  parenList.appendChild(li);
}

document.getElementById("ClickedOnAddButton").addEventListener("click",function (){
  let message=document.getElementById("Input").value;
  arr.push(message);
  console.log(message)
  renderList();
  
})


document.getElementById("ItemsTobeAdded").addEventListener("click",function (event){
let element1=event.target;
console.log(element1.tagName);
if(element1.tagName==="BUTTON"){
    const index = parseInt(event.target.getAttribute("data-index"));
    arr.splice(index, 1);
    renderList();
    
}
element1.style.textDecoration = "line-through";
let unorderList=document.getElementById("unorderedListContainer");
//unorderList.removeChild(elemet);
  
  
})

function renderList(){
  const parenList=document.getElementById("ItemsTobeAdded");
  parenList.innerHTML="";
  let i=0
  arr.forEach(element => {
        let divEle=document.createElement("div");
        divEle.style.display='flex';
        let button=document.createElement("button");
        button.id=element;
        button.style.border='20px';
        button.style.padding='10px';
        button.textContent="Delete";
        button.setAttribute("data-index", i++);
        let li=document.createElement("p");
        li.id=element;
        li.textContent=element;
        divEle.appendChild(button);
        divEle.appendChild(li);
        divEle.style.backgroundColor="red";
        parenList.appendChild(divEle);

  });
  document.getElementById("Input").value="";
}