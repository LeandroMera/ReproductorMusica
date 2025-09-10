Reproductor de Música JavaFX desarrollado en Java, con una interfaz gráfica sencilla y funcional. Permite reproducir archivos de audio, gestionar listas de canciones y controlar la reproducción desde la ventana principal.

Características

Reproducción de archivos de música (MP3, WAV, etc.).

Interfaz gráfica intuitiva con controles de reproducción: Play, Pause, Stop.

Posibilidad de mostrar listas de canciones (playlist).

Acceso a la ventana principal desde otras clases mediante Main.getStage().

Ligero y fácil de usar.

Tecnologías utilizadas

Java 17+

JavaFX

IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans

Instalación y ejecución

Clonar el repositorio:

git clone https://github.com/tuUsuario/tuRepositorio.git


Ir a la carpeta del proyecto:

cd tuRepositorio


Ejecutar desde tu IDE favorito abriendo la clase Main.java
O, si usas Maven:

mvn clean install
mvn javafx:run

Estructura del proyecto
org.gorditodev.reproductormusica
│
├── Main.java             # Clase principal, inicia la app
├── VentanaPrincipal.java # Interfaz principal
├── ...                   # Otros controladores o utilidades

Uso

Abrir la aplicación.

Seleccionar las canciones que deseas reproducir.

Usar los controles de reproducción: Play, Pause, Stop.

Navegar por la lista de canciones y gestionar la reproducción.
