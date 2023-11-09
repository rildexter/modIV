function mostrarAtributos() {
    const selectedAnimal = document.getElementById("animalType").value;
    document.getElementById("cachorroAttributes").style.display = selectedAnimal === "Cachorro" ? "block" : "none";
    document.getElementById("gatoAttributes").style.display = selectedAnimal === "Gato" ? "block" : "none";
}

function cadastrarAnimal() {
    const selectedAnimal = document.getElementById("animalType").value;
    const name = document.getElementById("name").value;
    const attributes = {};

    if (selectedAnimal === "Cachorro") {
        attributes.raca = document.getElementById("raca").value;
    } else if (selectedAnimal === "Gato") {
        attributes.cor = document.getElementById("cor").value;
    }

    const animalList = document.getElementById("animalList");
    const listItem = document.createElement("li");

    let formattedAttributes = "";
    for (const key in attributes) {
        formattedAttributes += `${key}: ${attributes[key]}, `;
    }
    formattedAttributes = formattedAttributes.slice(0, -2); // Remova a última vírgula e espaço

    listItem.textContent = `${selectedAnimal} - Nome: ${name}, ${formattedAttributes}`;
    animalList.appendChild(listItem);

    // Limpar os campos do formulário
    document.getElementById("name").value = "";
    document.getElementById("raca").value = "";
    document.getElementById("cor").value = "";
}
