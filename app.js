var makeInput = document.getElementById("make");
var modelInput = document.getElementById("model");
var colorInput = document.getElementById("color");
// when the page loads
// check local storage for car data
var carInfo = JSON.parse(localStorage.getItem("carInfo"));
if(carInfo){
makeInput.value=carInfo.make;
makeInput.value=carInfo.model;
makeInput.value=carInfo.color;
}
// update form values using the car data
document.
getElementById("car-form") 
.addEventListener("submit", function (event) {
event.preventDefault();
// get values from the form
var make = makeInput.value.trim();
var model = modelInput.value.trim();
var color = colorInput.value.trim();
console.log("make",make);
console.log("model",model);
console.log("color",color);
// if values are valid
if(!make||!model||!color){
    return;
}
// save them in local storage
    var carInfo={
        make: make,
        model:model,
        color:color
    }
    localStorage.setItem("carInfo",JSON.stringify(carInfo));
});