
# Proyecto ChatBot con Java Swing y API de Ollama

## Descripción
Este proyecto consiste en el desarrollo de un chatbot de escritorio en **Java** utilizando **Java Swing** para la interfaz gráfica y la **API de Ollama** para las respuestas de IA. El proyecto sigue buenas prácticas de desarrollo de software, incluyendo la modularidad del código, manejo de errores, y uso de GitHub para colaboración y control de versiones.

## Objetivo
El objetivo de este laboratorio es que los estudiantes desarrollen una aplicación de escritorio que implemente un chatbot interactivo conectado a la API de Ollama, siguiendo las mejores prácticas de programación y documentación.

## Funcionalidades

### Interfaz Gráfica (Java Swing)
- **Área de Entrada de Texto**: Permite al usuario escribir preguntas para el chatbot.
- **Área de Visualización de Respuestas**: Muestra las respuestas generadas por la API.
- **Botones de Interacción**:
  - **Enviar**: Envía la pregunta a la API de Ollama y muestra la respuesta.
  - **Limpiar Chat**: Borra la conversación actual.
  - **Ver Historial**: Muestra el historial de conversaciones almacenado.

### Conexión con la API de Ollama
- Realiza solicitudes HTTP a la API de Ollama para obtener respuestas de IA.
- Usa librerías como `HttpURLConnection` o `HttpClient` para manejar las solicitudes HTTP.

### Estructura del Código
- **Modularización**:
  - **Enviar Pregunta**: Método para enviar la pregunta del usuario.
  - **Recibir Respuesta**: Procesa y muestra la respuesta del chatbot.
  - **Gestión del Historial**: Almacena el historial en un arreglo y permite acceder a él.
- **Manejo de Errores**:
  - Muestra mensajes claros en la interfaz en caso de errores de conexión o demoras en la respuesta.
  - Implementa un controlador de excepciones para manejar fallos de conexión y errores de API.

### Gestión del Historial
- El historial de conversación se gestiona exclusivamente con arreglos.
- Opcionalmente, los datos pueden guardarse en archivos para recuperación futura.
- Muestra el historial de forma estructurada en la interfaz.

### Colaboración en GitHub
- Uso de GitHub para trabajo en equipo:
  - Cada miembro del equipo trabaja en una rama separada.
  - Los cambios se integran mediante pull requests con revisiones de código.
  - La actividad de cada miembro es rastreable a través de commits.

## Instalación
1. Clona el repositorio desde GitHub:
   ```bash
   git clone https://github.com/usuario/proyecto-chatbot.git
   ```
2. Importa el proyecto en tu IDE de Java.
3. Asegúrate de tener configurado Java y las librerías necesarias para solicitudes HTTP.
4. Compila y ejecuta el programa.

## Uso
1. Ejecuta el programa desde el IDE o desde el archivo `.jar` generado.
2. Escribe una pregunta en el área de entrada y haz clic en "Enviar" para recibir una respuesta del chatbot.
3. Usa "Limpiar Chat" para borrar la conversación actual.
4. Usa "Ver Historial" para revisar las conversaciones previas.

## Contribución
1. Cada miembro debe trabajar en una rama separada.
2. Realiza pull requests con descripciones claras para integrar los cambios en la rama principal.
3. Sigue las buenas prácticas de commits y revisiones de código.

## Manual de Usuario
1. **Instalación y Configuración**: Sigue las instrucciones de la sección de instalación.
2. **Uso de la Interfaz**:
   - **Enviar Pregunta**: Escribe en el área de entrada y presiona "Enviar".
   - **Ver Historial**: Haz clic en "Ver Historial" para revisar conversaciones.
   - **Limpiar Chat**: Borra el historial de la sesión actual.
3. **Manejo de Errores**:
   - La interfaz muestra mensajes en caso de problemas de conexión o demoras en la respuesta.
4. **Guía de Contribución en GitHub**:
   - Crea ramas para nuevas funcionalidades.
   - Realiza pull requests y participa en las revisiones de código.
   - Resuelve conflictos siguiendo las prácticas de GitHub.

## Integrantes del Proyecto
- **Eliud Quiroz** - [GitHub: Eliudqa](https://github.com/Eliudqa)
- **Alejandro Rada** - [GitHub: alezdoweither](https://github.com/alezdoweither)
- **Santiago Guevara** - [GitHub: dilonfrancis](https://github.com/dilonfrancis)
- **Juan Lucas Murcia** - [GitHub: juanlucasmurcia](https://github.com/juanlucasmurcia)
