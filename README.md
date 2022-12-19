# OMA (OpenAPI Metrics Analyzer)
## _Herramienta para el cálculo automático de métricas de APIs Web_

OMA es una herramienta que permite calcular de manera automática 14 métricas estáticas y objetivas de APIs Web en base a una especificación de OpenAPI, mostrando los resultados obtenidos por pantalla.
Fue desarrollada en el marco de un proyecto de investigación en la Universidad Nacional de la Patagonia Austral (UNPA) durante el año 2022.
En este documento se encuentra la información básica en lo que concierne a OMA.

## Funcionamiento

OMA calcula automáticamente varias métricas de API utilizando como entrada una especificación de OpenAPI. La interfaz gráfica presenta un campo de texto en el que se permite que el usuario ingrese el nombre de un archivo JSON o YAML con la especificación OpenAPI de la API que se desea analizar. También se aceptan URLs de especificación OpenAPI como entrada válida (por ejemplo: https://petstore3.swagger.io/api/v3/openapi.json). A continuación, una vez que el usuario haya introducido la especificación OpenAPI que desea evaluar y pulsado en el botón "Analizar", se mostrarán los resultados para cada métrica en el campo de texto correspondiente.

## Metricas Disponibles

OMA permite calcular las siguientes métricas estáticas y objetivas de manera automática:
- Versión: Se refiere a la versión de la API tal como aparece en el elemento “info” de la especificación.
- Número de Recursos: Toma la cantidad de rutas diferentes en el elemento “paths” de la especificación.
- Número de Recursos de Solo Lectura: Cuenta la cantidad de recursos que soportan el método GET dentro de las rutas del elemento “paths”.
- Número de Recursos POST: Cuenta la cantidad de recursos que soportan el método POST dentro de las rutas del elemento “paths”.
- Número de Recursos DELETE: Cuenta la cantidad de recursos que soportan el método DELETE dentro de las rutas del elemento “paths”.
- Peso de Recursos de Solo Lectura: Tiene en cuenta la proporción en forma de porcentaje de la cantidad de recursos que soportan el método GET del total de recursos.
- Peso de Recursos POST: Tiene en cuenta la proporción en forma de porcentaje de la cantidad de recursos que soportan el método POST del total de recursos.
- Peso de Recursos DELETE: Tiene en cuenta la proporción en forma de porcentaje de la cantidad de recursos que soportan el método DELETE del total de recursos.
- Longitud de Ruta Máxima: Es la longitud de la ruta más larga encontrada, teniendo en cuenta todas las rutas del elemento “paths”.
- Longitud de Ruta Promedio: Es el promedio de longitud de ruta de todas las rutas que se encuentran en el elemento “paths”.
- Número de Parámetros: Cuenta el total de parámetros de todas las rutas definidas en el elemento “paths” de la especificación.
- Número de Parámetros Obligatorios: Cuenta la cantidad de parámetros obligatorios del total, es decir, aquellos que cuenten con el atributo “required: true”.
- Número de Parámetros Opcionales: Cuenta la cantidad de parámetros opcionales del total, es decir, aquellos que cuenten con el atributo “required: false”.
- Promedio de Parámetros: Es el promedio de parámetros por ruta de todas las rutas definidas en “paths”.

## Aviso

El proyecto con el código fuente utiliza Maven para hacer uso de las dependencias necesarias para el correcto funcionamiento de la herramienta. Es posbile que la herramienta no funcione de manera adecuada si no se cuenta con Maven instalado en el equipo.