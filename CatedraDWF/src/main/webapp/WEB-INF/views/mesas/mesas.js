document.addEventListener("DOMContentLoaded", function() {
    var mesas = document.querySelectorAll('.mesa');

    mesas.forEach(function (mesa) {
        mesa.addEventListener('click', function () {
            mesas.forEach(function (m) {
                m.classList.remove('selected');
            });
            mesa.classList.add('selected');
            console.log('Mesa seleccionada:', mesa.textContent);

            // Agregar la clase 'selected' solo a la mesa clickeada
            mesa.classList.add('selected');

            // Obtener el ID de la mesa seleccionada
            var mesaId = mesa.id;

            // Redirigir a la página de reservas con el ID de la mesa como parámetro
            window.open('/DWF-Catedra/CatedraDWF/src/main/webapp/WEB-INF/views/pantallaMenu(Daniel)/Menu.html' + mesaId, '_blank');
        });
    });
});