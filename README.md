# GTICS_LAB7_20221747

Para clonar el repositorio usamos git clone (link del code github)

para desplegar localmente debemos tener instalado, docker, java 17 y win scp (opcional)
para verificar o modificar los archivos de forma manual

para construir la aplicacion hacemos package en el apartado maven de nuestro proyecto

para construir la imagen docker usamos
docker build -t miwebapp:local .

y para ejecutar la base de datos mysql
docker run -d 
     --name mysql-db \
      -e MYSQL_ROOT_PASSWORD=root \
  -e MYSQL_DATABASE=trabajadores_db \
  -v $(pwd)/docker/init.sql:/docker-entrypoint-initdb.d/init.sql \
  -p 3306:3306 \
  mysql:8.0

podriamos usar este mismo concepto para la aplicacion pero podemos hacerlo de forma grafica
ejecutando directamente del apartado docker-local en project-structure, usando nuestro dockerfile
que esta en el mismo proyecto, para asi tener ambos apartados guardados en un contenedor y no depender mas de inteljidea ni mysql

para verificar nuestros contenedores y sus caracteristicas nos apoyaremos de 
docker ps
y de 
docker logs (contenedor)
para ver la salida de los logs de nuestra aplicacion

para nube

de la misma forma construimos la imagen
docker build -t miwebapp:remote .


para ejecutar la aplicacion de spring boot 
debes configurar un apartado de conexion para tu docker file donde especificas
(en la configuracion del ssh) tu username y tu ip publica ( o elastica en su defecto)
se encuentra de forma grafica en la documentacion pruebas y logs (pdf que esta aqui mismo en el proyecto)

una vez verificado esto debemos tambien tener cuidado con restringir la base de datos remota
en application.properties, la recomendacion es tener todos los apartados en none e ir habilitandolos como validate uno a uno.