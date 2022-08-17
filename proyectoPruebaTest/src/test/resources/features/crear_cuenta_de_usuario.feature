# language:es

Característica: Validar la creación de una cuenta de usuario en la pagina Booking.com
  Escenario: rio: Crear una cuenta de usuario con correo electronico
    Dado que el usuario ingresa en la opcion Hazte una cuenta
    Cuando el usuario ingresa su correo y contrasena
      |ID| correoElectronico | contrasena |
      |<ID>| <correoElectronico> | <contrasena> |
    Entonces deberia ver el mensaje de creacion exitosa
