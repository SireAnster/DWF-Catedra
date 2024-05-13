function barra_carrito() {
    var barra = document.getElementById('barra');
    if (barra.style.right === '0px') {
      barra.style.right = '-300px';
    } else {
        barra.style.right = '0px';
    }
}