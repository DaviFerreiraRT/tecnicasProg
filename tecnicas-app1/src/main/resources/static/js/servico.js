function submeterServico() {
    let maoDeObra = document.getElementById("maoDeObra").value;


    let servico = {
        'maoDeObra': maoDeObra
    };

    function reqListener() {
        adicionarServico(servico);

        let oReq = new XMLHttpRequest();
        oReq.onload = reqListener;
        oReq.open("POST", "servico", true);
        oReq.setRequestHeader("Content-Type", "application/json");
        oReq.send(JSON.stringify(servico));

    }
}

function adicionarServico(servico) {
    let container = document.createElement("div");
    container.classList.add("containerServico");

    let maoDeObra = document.createElement("div");
    maoDeObra.classList.add("row");
    maoDeObra.innerHTML = "<h2>" + servico.maoDeObra + "</h2>";


    let precoTotal = document.createElement("div");
    precoTotal.classList.add("row");
    let p = document.createElement("p");

    container.appendChild(maoDeObra);

    document.getElementById("servico").appendChild(container);

    alert("Cadastrado com sucesso!")
}

function exibirservicos() {
    let oReq = new XMLHttpRequest();
    oReq.onload = function () {
        let listaDeServicos = JSON.parse(this.responseText);
        for (let i = 0; i < listaDeServicos.length; i++) {
            adicionarServico(listaDeServicos[i]);
        }
    };
    oReq.open("GET", "servico", true);
    oReq.setRequestHeader("Content-Type", "application/json");
    oReq.send();
}