function dropLocations() {
    // Get the checkbox
    var checkBox = document.getElementById("dropdiff");
    // Get the output text
    var text = "Frankfurt";
    var element = document.querySelector('.drops');

    // If the checkbox is checked, display the output text
    if (checkBox.checked == true){
        document.getElementById("droplocation").value = "Frankfurt";
        element.style.visibility='visible';
        //text.style.display = "block";
    } else {
        element.style.visibility='hidden';

    }
}

function creatBox() {


    var checkbox = document.createElement('input');
    checkbox.type = 'checkbox';
    checkbox.id = 'car';
    checkbox.name = 'interest';
    checkbox.value = 'car';

    var label = document.createElement('label')
    label.htmlFor = 'car';
    label.appendChild(document.createTextNode('Car'));

    var br = document.createElement('br');
}

