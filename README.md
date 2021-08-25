# LAB2-CVDS
## La Herramineta MAVEN
- **Cual es su mayor utilidad**: 
Que es un software que se usa para la gestion y construccion de proyectos java, con un formato basado en XML
 
- **Fases de MAVEN**:
   1. Maven validate: valida que el proyecto disponga de la información necesaria para ser procesado.
   2. Maven Compile: se encarga de validar los ficheros fuentes .java
   3. Maven Test: después de compilar el código ejecuta las pruebas unitarias.
   4. Maven Package: se encarga de empaquetar el código a un formato estandar de Java,
    para permitir su ejecución o depliegue en el servidor.
   5. Maven Verify: lanza test de integración para confirmar que el funcionamiento de todo es adecuado.
   6. Mven Install: se encarga de desplegar el artefacto en el repositorio local y permite el acceso a esté.
   7. Maven Deploy: permite desplegar el artefacto en un servidor remoto.

- **Ciclo de vida de la construcción:**
 Cada proyecto de Maven consta de tres ciclos de vida independientes
   1. Ciclo de vida limpio: su finalidad es elimina la salida de la compilación en el directorio de compilación. 
   2. Ciclo de vida predeterminado: responsable del despliegue del proyecto.
   3. Ciclo de vida del sitio: os complementos de sitios web de Maven se utilizan generalmente para crear nuevos
documentos, crear informes, implementar sitios web.
 
- **Para qué sirven los plugins:**
Los plugins son un fragmento de código que amplia las funciones de una herramienta. En maven los plugons tienen
metas. Las metas ejecutan tareas de construcción como: compilar el proyecto, empaquetarlo e implementarlo en un
servidor local o remoto.
 
- **Qué es y para qué sirve el repositorio central de maven:**
Es la ubicación predeterminada para Maven donde se encuentran las librerias de uso general y la cual permite
descargar todas las bibliotecas de dependencia del proyecto para su uso.

##Ejercicio de las Figuras
