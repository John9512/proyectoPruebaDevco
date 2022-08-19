#language:es
Característica:Realizar una busqueda de alojamiento sin atutenticarse en Booking.com
  Como usuario externo
  Quiero realizar una busqueda
  Para mirar opciones de viajes

  @ReservaAlojamiento1
  Esquema del escenario: Realizar reserva de alojamiento desde pagina de inicio sin niños
    Dado que el usuario ingresa a la pagina de inicio
    | ID | destino | fechaInicio | fechaFin| adultos | ninos | habitaciones |
    |<ID>|<Destino>|<FechaInicio>| <FechaFin>|<Adultos>|<Ninos>|<Habitaciones>|
    Cuando el usuario ingresa el destino, fecha y personas a viajar
    Entonces deberia mirar el resultado de la busqueda
    Ejemplos:
    |ID|Destino|FechaInicio|FechaFin|Adultos|Ninos|Habitaciones|
    | 1|Medellin| 2022-09-01 | 2022-10-01 | 2      | 0   |1           |
    | 2|Pasto   | 28 diciembre 2023  | 7 enero 2022 | 5      | 0   |3           |
