document.addEventListener("DOMContentLoaded", function() {
    var menuItems = [
        { nombre: "Hamburguesa", precio: 10.99, imagen: "img/hamburguesa.jpg" },
        { nombre: "Pizza", precio: 8.99, imagen: "img/pizza.jpg" },
        { nombre: "Ensalada", precio: 6.99, imagen: "img/ensalada.jpg" },
        { nombre: "Espaguetti", precio: 9.99, imagen: "img/Espaguetti.jpg" },
        { nombre: "Copa de Vino", precio: 7.99, imagen: "img/vino.jpg" },
        { nombre: "Trago Jack Daniels", precio: 7.99, imagen: "img/JackDaniel.jpg" }
    ];

    var menuContainer = document.getElementById("menu-container");

    menuItems.forEach(function(item) {
        var menuItem = document.createElement("div");
        menuItem.classList.add("col-md-4", "mx-3");

        var card = document.createElement("div");
        card.classList.add("card", "mb-4", "shadow-sm");

        var cardBody = document.createElement("div");
        cardBody.classList.add("card-body");

        var itemName = document.createElement("h5");
        itemName.classList.add("card-title");
        itemName.textContent = item.nombre;

        var itemPrice = document.createElement("p");
        itemPrice.classList.add("card-text");
        itemPrice.textContent = "Precio: $" + item.precio.toFixed(2);

        var itemImage = document.createElement("img");
        itemImage.classList.add("img-fluid");
        itemImage.src = item.imagen;
        itemImage.alt = item.nombre;

        cardBody.appendChild(itemName);
        cardBody.appendChild(itemPrice);
        cardBody.appendChild(itemImage);

        card.appendChild(cardBody);
        menuItem.appendChild(card);
        menuContainer.appendChild(menuItem);
    });

    // Obtener el botón de inicio de sesión por su clase
    var btnLogin = document.querySelector(".btn-login");
    var btnReservar = document.querySelector(".btn-reservar")
    var btnMenu = document.querySelector(".btn-menu")

    // Agregar evento de clic al botón para redireccionar
    btnLogin.addEventListener("click", function() {
        // Redirigir a la página de inicio de sesión
        window.location.href = '/DWF-Catedra/CatedraDWF/src/main/webapp/WEB-INF/views/login/index.html'; // Reemplaza 'login.php' con la URL real de tu página de inicio de sesión
    });

    btnReservar.addEventListener("click", function () {
        window.location.href='/DWF-Catedra/CatedraDWF/src/main/webapp/WEB-INF/views/resume/index.html';
    });

    btnMenu.addEventListener("click", function() {
        // Redirigir a la página de inicio de sesión
        window.location.href = '/DWF-Catedra/CatedraDWF/src/main/webapp/WEB-INF/views/pantallaMenu(Daniel)/Menu.html'; // Reemplaza 'login.php' con la URL real de tu página de inicio de sesión
    });
});
