let contadorLike = [0, 0, 0];
let contadorComentario = [0, 0, 0]
function deuLike(num) {

    const botaoCurtir = document.getElementById(`botaoCurtir-${num}`);
    if (botaoCurtir.innerHTML === 'Curtir') {
        contadorLike[num]++;
    
        botaoCurtir.innerHTML = 'Remover'
        botaoCurtir.classList.remove('btn-primary')
        botaoCurtir.classList.add('btn-danger');
    } else {
        contadorLike[num]--;
        botaoCurtir.innerHTML = 'Curtir'
        botaoCurtir.classList.remove('btn-danger')
        botaoCurtir.classList.add('btn-primary');


    }
    const qntLikes = document.getElementById(`likes-${num}`);
    qntLikes.innerHTML = `${contadorLike[num]} curtidas`
}

function adicionarComentario(num) {
    const comentario = document.getElementById(`comentario-${num}`).value
    if (comentario === "") {
        return
    }
    const divComentario = document.getElementById(`comments-${num}`)

    const p = document.createElement("p")
    p.appendChild(document.createTextNode(`- ${comentario}`))
    divComentario.appendChild(p)

    contadorComentario[num]--;
    const divQntComentario = document.getElementById(`qntComentarios-${num}`)
    divQntComentario.innerHTML = `${contadorComentario[num]} comentários`
}