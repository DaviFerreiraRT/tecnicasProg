let contadorLike = 0;
let contadorComentario = 0
function deuLike() {

    const botaoCurtir = document.getElementById("botaoCurtir");
    if (botaoCurtir.innerHTML === 'Curtir') {
        contadorLike++;
        botaoCurtir.innerHTML = 'Remover'
        botaoCurtir.classList.remove('btn-primary')
        botaoCurtir.classList.add('btn-danger');
    } else {
        contadorLike--;
        botaoCurtir.innerHTML = 'Curtir'
        botaoCurtir.classList.remove('btn-danger')
        botaoCurtir.classList.add('btn-primary');


    }
    const qntLikes = document.getElementById("likes");
    qntLikes.innerHTML = `${contadorLike} curtidas`


}

function adicionarComentario() {
    const comentario = document.getElementById("comentario").value
    if(comentario === ""){
        return
    }
    const divComentario = document.getElementById("comments")

    const p = document.createElement("p")
    p.appendChild(document.createTextNode(`- ${comentario}`))
    divComentario.appendChild(p)
    
    contadorComentario++;
    const divQntComentario = document.getElementById("qntComentarios")
    divQntComentario.innerHTML = `${contadorComentario} comentários`
}