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

## Ejercicio de las Figuras
### Crear unproyecto con maven

- **Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes)**: Para crear un proyecto maven usamos la ayuda de los arquetipos en este caso el comando usado es:
    > **mvn archetype.generate**
- Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype",  con los siguientes parámetros:
  - Grupo: edu.eci.cvds
  - Id del Artefacto: Patterns
  - Paquete: edu.eci.cvds.patterns
  - archetypeArtifactId: maven-archetype-quickstart
  > mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -Dpackage=edu.eci.cvds.patterns -DarchetypeArtifactId=maven-archetype-quickstart
 
### Compilar y ejecutar
- **Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn**: mvn package empaqueta el proyecto (en caso que sea un proyecto java simple genera un jar, si es un web genera un war).
- Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass":
  > mvn exec:Java -Dexec.mainClass="edu.eci.cvds.patterns.App
- Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?: En este caso si no se tenia en cuenta que es un arreglo muestra el ultimo valor que encuentre en el arreglo.

### Hacer el esqueleto de la aplicacion

Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:

- Sin parámetros

 ![SinParametro](https://github.com/jua1000n/LAB2-CVDS/blob/main/resources/SinParametro.png)

- Parámetro: qwerty

![Parametroqwerty](https://github.com/jua1000n/LAB2-CVDS/blob/main/resources/Parametroqwerty.png)

- Parámetro: pentagon

![Parametropentagon](https://github.com/jua1000n/LAB2-CVDS/blob/main/resources/Parametropentagon.png)

- Parámetro Hexagon

![ParametroHexagon](https://github.com/jua1000n/LAB2-CVDS/blob/main/resources/ParametroHexagon.png)

- **¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**: El unico que se llega a ejecutar de manera correcta es el ultimo "Hexagon", debido a que es el unico que cumple los parametros que se establecieron.


Para que sirve **gitignore**: Es un archivo de texto que le dice a git que archivos o carpetas ignorar en un proyecto, generalmente se coloca en el directorio raiz de un proyecto.
