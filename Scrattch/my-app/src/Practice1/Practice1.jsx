//import './Practice2.js'

export default function Practice1(){
  return(
    <div>
      <label for="Input">Give Name to the Task</label>
      <input type="text" placeholder="Add Soethig to DisplaY" value="" id="Input" />
      <ul id="ItemsTobeAdded">

      </ul>
      <button id="ClickedOnAddButton">Add Task </button>
    </div>
  )
}
/*
let arr=["Task1","Task2"];
document.getElementById("ClickedOnAddButton").addEventListener("click",function (){
  let message=document.getElementById("Input").value;
  console.log(message)
  let parenList=document.getElementById("ItemsTobeAdded")
  {arr.map((ele)=>{
        let li=document.createElement("li");
        li.textContent=message;
        parenList.appendChild(li);
      })}
  document.getElementById("InputField").value="";
})
*/