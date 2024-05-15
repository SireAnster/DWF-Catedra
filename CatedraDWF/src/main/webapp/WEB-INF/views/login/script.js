document.addEventListener("DOMContentLoaded", function() {
    // Obtener el formulario por su ID
    var form = document.getElementById("loginForm");
    var btnBack = document.getElementById("btnBack");


    // Agregar evento de envío al formulario
    form.addEventListener("submit", function(event) {
        event.preventDefault(); // Evitar que se envíe el formulario de manera convencional

        // Obtener los valores de los campos del formulario
        var nombre = document.getElementById("nombre").value;
        var contacto = document.getElementById("contacto").value;
        var email = document.getElementById("email").value;

        // Aquí puedes realizar validaciones adicionales si es necesario

        // Ejemplo de acción: Mostrar los datos en consola
        console.log("Nombre:", nombre);
        console.log("Contacto:", contacto);
        console.log("Correo electrónico:", email);

        btnBack.addEventListener("click", function() {
            // Regresar a la página anterior
            window.history.back();
        });

        // Aquí puedes agregar lógica para enviar los datos a tu servidor o realizar otras acciones
    });
});
