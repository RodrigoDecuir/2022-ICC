Introducción a Ciencias de la Computación
=========================================

Proyecto Final
-----------

### Fecha de entrega: martes 20 de diciembre, 2022

* *Rodrigo André Decuir Fuentes*
* *320022711*

#### Instrucciones de ejecución:

* Dentro del directorio donde se encuentra el archivo pom.xml, compilar:
```
$ mvn compile
```

* Pruebas unitarias:
```
$ mvn test 
```

* Instalación y uso:
```
$ mvn install 
$ 
$ 
```

### Instrucciones del proyecto:

Para este proyecto desarrollarás un programa que simule la reservación de habitaciones de hotel y boletos de avión para una agencia llamada **“Puma-Tours”**, la cual cada año, realiza una excursión con fecha de salida _10_ de julio y regreso _15_ de julio.

---
La agencia es dueña de los siguientes bienes:

- "Hotel Tropical".

- "Avión".

---

> **Hotel Tropical.** Cuenta con 15 habitaciones, que se distribuyen de la siguiente manera:

> **Habitación sencilla.**
* Costo: $580 por noche.
* Habitación con una sola cama matrimonial.
* Número de ocupantes: de 1 a 2.
* Total de habitaciones de esta categoría: 5.

> **Suite Familiar.**
* Costo: $1200 por noche.
* Habitación con una cama kingsize y dos camas individuales.
* Número de ocupantes: de 1 a 5.
* Total de habitaciones de esta categoría: 10.
---
> **Avión**
* El avión dispone de 50 asientos los cuales se enumeran de la forma: A1, A2, …, A50.
* El costo de incluir boletos de avión al viaje es de $4000 por persona y es vuelo redondo.
---
**Funcionamiento del programa:**
Al ejecutarse el programa se deberá mostrar el siguiente menú:
---
BIENVENIDO A LA AGENCIA PUMA-TOURS

Selecciona una de las siguientes opciones:
1. Crear reservación para el hotel “Tropical”.
2. Cancelar reservación.
3. Buscar reservación.
4. Ver todas las reservaciones.
5. Consultar el estatus de las habitaciones del hotel “Tropical”.
6. Consultar información del avión.
7. Salir del programa.
---
**Opción 1** - Crear reservación para el hotel “Tropical”

Al acceder a esta opción se le preguntará al cliente:
1. Nombre del titular de la reservación.
2. Número de acompañantes del titular (0 a 4).
3. ¿Incluye vuelos?

**Observaciones:**
- Dependiendo del número de huéspedes que proporcione el cliente se asignará uno de los dos tipos de habitación. (Sencilla o familiar).
- No se puede asignar habitaciones que ya estén reservadas. No se pueden hacer reservaciones para clientes con más de 4 acompañantes.

- Si la reservación incluirá vuelos, se deben mostrar los asientos disponibles para la ida y para el regreso y el cliente podrá elegir los asientos para él y sus acompañantes.

**Ejemplo:**

VUELO DE IDA

Selecciona uno de los asientos disponibles:
1. A1.
2. A2.
3. A7.
   …..
   _44_. A49.

VUELO DE REGRESO:

Selecciona uno de los asientos disponibles:
1. A10
2. A22
3. A23
   …
   _30_. A50

**Nota:** Si el cliente necesitará ‘k’ boletos, pero sólo quedan ‘m’ asiento disponibles, donde **_'m' es menor a 'k'_**, se le notifica al cliente que no puede agregar vuelos y el servicio de avión no procede.

Después de preguntar al cliente toda esta información, se mostrará un mensaje indicando que la reservación se ha realizado con éxito y se ‘Guardará’ en un registro (Un arreglo de objetos de tipo Reservación) la siguiente información:
- Identificador de la reservación (Una cadena alfanumérica de longitud 4), la puedes generar de manera aleatoria.
- Nombre del titular y número de acompañantes.
- Precio que se pagó.
- Número de habitación asignada.
- Incluye vuelo Sí/No.
- Número de los Asientos apartados en el vuelo de ida (en caso de que la reservación los incluya).
- Número de los Asientos apartados en el vuelo de regreso (en caso de que la reservación los incluya).
---
**Opción 2** - Cancelar reservación.

Solicita el número de identificación de la reservación y la borra de los registros liberando la habitación que se había asignado y dejando disponibles todos los asiento de avión en caso de haberlos agregado.

---

**Opción 3** - Buscar reservación.

Esta opción proporciona la información de una reservación dado el número de identificación y mostrará en pantalla:
- Identificador de la reservación (Una cadena alfanumérica de longitud 4), la puedes generar de manera aleatoria.
- Nombre del titular y número de acompañantes.
- Precio que se pagó.
- Número de habitación asignada.
- Incluye vuelo Sí/No.
- Número de los Asientos apartados en el vuelo de ida (en caso de que la reservación los incluya).
- Número de los Asientos apartados en el vuelo de regreso (en caso de que la reservación los incluya).
---
**Opción 4** - Ver todas las reservaciones.

Muestra todas las reservaciones que se tienen registradas, para cada una de ellas, muestra:

- Identificador de la reservación (Una cadena alfanumérica de longitud 4), la puedes generar de manera aleatoria.
- Nombre del titular y número de acompañantes.
- Precio que se pagó.
- Número de habitación asignada.
- Incluye vuelo Sí/No.
- Número de los Asientos apartados en el vuelo de ida (en caso de que la reservación los incluya).
- Número de los Asientos apartados en el vuelo de regreso (en caso de que la reservación los incluya).
---
**Opción 5** - Consultar el estatus de las habitaciones del hotel “Tropical”.

Muestra para cada habitación (1 a 15) sólo si ya está ocupada o disponible. Si está ocupada muestra el número de reservación bajo la cual está ocupada.

---

**Opción 6** - Consultar información del avión.

Mostrará en pantalla los asientos 1 a 50 para el viaje de ida y regreso indicando solamente si el asiento está ocupado o disponible.

**Ejemplo:**

VUELO DE IDA:
1. Disponible.
2. Disponible.
3. Ocupado.
   …..
   _50_. Disponible.

VUELO DE REGRESO:
1. Ocupado.
2. Disponible.
3. Disponible.
   …..
   _50._ Disponible.
---
Opción 7 - Termina el programa.

---
Usa excepciones sólo para evitar que no se introduzcan datos inconsistentes desde el teclado y que el programa ‘se caiga’, no es necesario que crees nuevas. Crea tantas clases como creas necesarias para realizar este proyecto.

Usa persistencia con serialización para mantener la información de las ventas.