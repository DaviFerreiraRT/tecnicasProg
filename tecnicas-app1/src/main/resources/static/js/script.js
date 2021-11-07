
function submeterFormulario() {
    let nome = document.getElementById("nome").value;
    let fabricante = document.getElementById("fabricante").value;
    let qntEstoque = document.getElementById("qntEstoque").value;
    let preco = document.getElementById("preco").value;

    let estoque = {
        'nome' : nome,
        'fabricante' : fabricante,
        'qntEstoque':qntEstoque,
        'preco' : preco,
    };

    function reqListener () {
        let estoque = JSON.parse(this.responseText);
        adicionarestoque(estoque);
    }

    let oReq = new XMLHttpRequest();
    oReq.onload = reqListener;
    oReq.open("POST", "estoque", true);
    oReq.setRequestHeader("Content-Type", "application/json");
    oReq.send(JSON.stringify(estoque));
}

function adicionarestoque(estoque) {
    let container = document.createElement("div");
    container.classList.add("container");

    let nome = document.createElement("div");
    nome.classList.add("row");
    nome.innerHTML = "<h2>" + estoque.nome + "</h2>";

    let fabricante = document.createElement("div");
    fabricante.classList.add("row");
    fabricante.innerHTML = "<h2>" + estoque.fabricante + "</h2>";

    let qntEstoque = document.createElement("div");
    qntEstoque.classList.add("row");
    qntEstoque.innerHTML = "<h2>" + estoque.qntEstoque + "</h2>";

    let preco = document.createElement("div");
    preco.classList.add("row");
    let p = document.createElement("p");
    p.innerHTML = estoque.preco;
    preco.appendChild(p);

    container.appendChild(nome);
    container.appendChild(preco);
    container.appendChild(qntEstoque);
    document.getElementById("estoque").appendChild(container);

    alert("Cadastrado com sucesso!")
}

function exibirestoques() {
    let oReq = new XMLHttpRequest();
    oReq.onload = function() {
        let listaDeestoques = JSON.parse(this.responseText);
        for (let i = 0; i < listaDeestoques.length; i++) {
            adicionarestoque(listaDeestoques[i]);
        }
    };
    oReq.open("GET", "estoque", true);
    oReq.setRequestHeader("Content-Type", "application/json");
    oReq.send();
}

window.addEventListener("load", function () {
   exibirestoques();
});
