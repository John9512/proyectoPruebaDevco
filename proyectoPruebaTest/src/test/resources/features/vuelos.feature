#language:es
Característica:Realizar una busqueda de vuelos sin atutenticarse en Booking.com
  Como usuario externo
  Quiero realizar una busqueda de vuelos
  Para mirar opciones de viajes en vacaciones

  @ReservaVuelos1
  Esquema del escenario: Realizar busqueda de vuelos desde pagina de inicio sin niños
    Dado que el usuario ingresa a la pagina de inicio
      | ID   | tipoVuelo   | adultos           | origen   | destino   | fechaInicio   | fechaFin   |
      | <ID> | <TipoVuelo> | <CantidadAdultos> | <Origen> | <Destino> | <FechaInicio> | <FechaFin> |
    Cuando el usuario ingresa el origen, destino y fecha de vuelo
    Entonces deberia mirar el resultado de la busqueda para vuelo
    Ejemplos:
      | ID | TipoVuelo       | CantidadAdultos | Origen  | Destino   | FechaInicio | FechaFin   |
      | 2  | Primera clase   | 2               | Cali    | Pasto     | 2022-12-20  | 2023-01-05 |
      | 1  | Turista premium | 1               | Pereira | Cartagena | 2022-08-20  | 2022-08-22 |
