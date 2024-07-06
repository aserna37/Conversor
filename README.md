# Convertidor de Moneda con API Externa

Este proyecto de Java te permite convertir una cantidad de una moneda a otra utilizando una API externa de tasas de cambio. Utiliza la biblioteca Gson para manejar los datos JSON devueltos por la API.

## Características

- Convierte un valor específico de una moneda a otra.
- Utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real.
- Configuración flexible a través de la clase `ApiConfig`.

## Cómo usar

1. Clona el repositorio a tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Java (por ejemplo, IntelliJ IDEA).
3. Configura tu clave de API en la clase `ApiConfig`.
4. Ejecuta la clase `Main` para comenzar la aplicación.
5. Sigue las instrucciones en la consola para seleccionar la opción de cambio y agrega el monto
## Ejemplo de Uso

Supongamos que deseas convertir 100 USD a EUR:

```plaintext
Seleccione la opción deseada:
1) --> Dólar a Peso Argentino
2) --> Peso Argentino a Dolar
3) --> Dólar a Real Brasileño
4) --> Real Brasileño a Dólar
5) --> Dólar a Peso Colombiano
6) --> Peso Colombiano a Dólar

Digite valor

y te dara la respuesta con el valor indicado y el cambio a realizar