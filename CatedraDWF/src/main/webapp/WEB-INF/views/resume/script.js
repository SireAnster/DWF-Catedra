document.addEventListener("DOMContentLoaded", function() {
    const pedidoForm = document.getElementById("pedidoForm");

    pedidoForm.addEventListener("submit", function(event) {
        event.preventDefault(); // Evitar el envío estándar del formulario

        const formData = new FormData(pedidoForm);
        const datosPedido = {
            mesa: formData.get("mesa"),
            menu: formData.get("menu"),
            bebida: formData.get("bebida"),
        };

        // Enviar los datos al backend (puedes usar fetch u otra técnica)
        fetch('generar_recibo.php', {
            method: 'POST',
            body: JSON.stringify(datosPedido),
            headers:{
                'Content-Type': 'application/json'
            }
        })
            .then(response => response.text())
            .then(data => {
                console.log(data); // Recibes el recibo desde el backend
                // Aquí podrías mostrar el recibo en una ventana emergente o redirigir a una página de recibo
            })
            .catch(error => {
                console.error('Error:', error);
            });
    });
});
