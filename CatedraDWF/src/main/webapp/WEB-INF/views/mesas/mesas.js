document.addEventListener("DOMContentLoaded", () => {
    const mesas = document.querySelectorAll('.mesa');

    mesas.forEach(mesa => {
        mesa.addEventListener('click', () => {
            // Aquí puedes agregar la lógica para seleccionar la mesa
            alert(`Has seleccionado la mesa ${mesa.id}`);
        });
    });
});
