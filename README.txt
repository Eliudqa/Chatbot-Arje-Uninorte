
# Proyecto ChatBot con Java Swing y API de Ollama

## Instalación
1. Clona el repositorio desde GitHub:
   ```bash
   git clone https://github.com/usuario/proyecto-chatbot.git
   ```
2. Abre el proyecto en tu entorno de desarrollo integrado (IDE) de Java preferido.
3. Configura Java y las librerías necesarias para solicitudes HTTP, como `HttpClient`.
4. Compila y ejecuta el proyecto en el IDE.

## Uso
1. **Iniciar el programa**: Ejecuta la aplicación desde el IDE o desde el archivo `.jar` generado.
2. **Ingresar preguntas**: En el área de texto de la interfaz, escribe la pregunta para el chatbot y presiona "Enviar" para obtener una respuesta.
3. **Limpiar chat**: Presiona "Limpiar Chat" para borrar todas las conversaciones de la sesión actual.
4. **Ver historial**: Haz clic en "Ver Historial" para revisar las conversaciones anteriores en el chat.

## Integrantes del Proyecto
- **Eliud Quiroz** - [GitHub: Eliudqa](https://github.com/Eliudqa)
- **Alejandro Rada** - [GitHub: alezdoweither](https://github.com/alezdoweither)
- **Santiago Guevara** - [GitHub: dilonfrancis](https://github.com/dilonfrancis)
- **Juan Lucas Murcia** - [GitHub: juanlucasmurcia](https://github.com/juanlucasmurcia)

Como colaborar en el proyecto

## Descripción del Proyecto

Este proyecto consiste en el desarrollo de un chatbot de escritorio utilizando Java Swing, conectado a la API de Ollama para generar respuestas automáticas. Los colaboradores implementarán la interfaz gráfica, conexión a la API y manejo de historial, aplicando buenas prácticas de programación y siguiendo un flujo de trabajo colaborativo en GitHub.

## Estructura General

- **Interfaz Gráfica (GUI)**: Creada en Java Swing, consta de:
  - Un campo de texto para escribir preguntas.
  - Una sección para mostrar respuestas.
  - Botones para enviar preguntas, limpiar el chat, y ver el historial.
- **Conexión con la API**: Utiliza HttpURLConnection o una librería similar para solicitar respuestas a la API de Ollama.
- **Historial**: Almacena el historial de conversación en arreglos y lo muestra en la interfaz.
- **Manejo de Errores**: Notifica al usuario sobre errores de conexión o respuesta demorada.

## Requerimientos Técnicos

- **Java 8 o superior**.
- **API de Ollama**: Acceso y conexión funcional.
- **GitHub** para la colaboración.

## Configuración del Entorno

1. **Clonar el repositorio**:
   ```
   git clone <URL-del-repositorio>
   ```
2. **Configurar el entorno de desarrollo**:
   - Abre el proyecto en un IDE compatible (como IntelliJ IDEA o NetBeans).
   - Asegúrate de que el archivo `ChatbotFrame.java` esté en la carpeta `src/chatbot`.
3. **Configuración de API**:
   - La conexión con Ollama se establece en el archivo `ChatbotFrame.java`. Se espera que los colaboradores prueben la API para verificar las respuestas.

## Convenciones de Desarrollo

- **Nombres de Métodos y Variables**: Usar `camelCase` para nombres de métodos y variables. Los nombres de las clases deben estar en `PascalCase`.
- **Comentarios**: Documentar funciones y métodos clave con comentarios concisos.
- **Bucles y Recursión**: Optimizar bucles, como en el caso de desplazamiento de historial, y manejar excepciones.
  
## Flujo de Trabajo en GitHub

1. **Ramas de Trabajo**:
   - Crear una rama para cada funcionalidad o tarea (por ejemplo, `feature/historial` o `feature/conexion-api`).
   - Evitar trabajar en la rama `main` directamente.
  
2. **Pull Requests (PR)**:
   - Los PR deben incluir una descripción clara de los cambios.
   - Asignar al menos un revisor.
   - Responder a los comentarios antes de hacer el merge.
  
3. **Commits**:
   - Los mensajes de commit deben ser breves pero informativos, por ejemplo:
     ```
     git commit -m "Implementa el manejo de historial con arreglos"
     ```

## Tareas de Colaboración

### 1. Desarrollo de la Interfaz

**Responsabilidades**:
- Crear los elementos de la interfaz de usuario: campos de texto, botones, y áreas de visualización.
- Utilizar un diseño intuitivo para mejorar la interacción del usuario.

### 2. Conexión con la API

**Responsabilidades**:
- Implementar métodos para realizar solicitudes a la API de Ollama.
- Crear un controlador de errores que maneje desconexiones o tiempos de espera largos.

### 3. Manejo de Historial

**Responsabilidades**:
- Almacenar las preguntas y respuestas en arreglos.
- Permitir que el usuario visualice el historial desde la interfaz.

### 4. Manejo de Errores

**Responsabilidades**:
- Implementar mensajes de error en la interfaz en caso de desconexiones o errores de la API.
- Asegurar que el programa continúe ejecutándose después de cualquier error.

## Contribución al Manual de Usuario

Cada colaborador debe agregar detalles sobre las secciones que desarrolla al manual de usuario, incluyendo:
- **Descripción de la funcionalidad**.
- **Instrucciones de uso**.
- **Solución de problemas comunes**.

## Buenas Prácticas

1. **Revisar código antes del commit**.
2. **Testear la aplicación** antes de subir cambios a `main`.
3. **Comunicación**: Utilizar el sistema de issues en GitHub para reportar problemas o sugerencias.

## Recursos

- **Java API Documentation**: Para referencias sobre Swing y manejo de excepciones.
- **GitHub Docs**: Instrucciones sobre el flujo de trabajo colaborativo y manejo de pull requests.

