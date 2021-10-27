# Web

Este es un proyecto web java normal. Para crearlo, hay que primero configurar un tomcat y luego crear una aplicacion web de tipo "dynamic web proyect"

Si no utilizamos maven para crear el proyecto, debemos hacer las configuraciones mediante el classpath. Además deberemosd de poner las librerías de terceros en WEB-INF/lib. No hace falta configurar el classpath con las librerias metidas en WEB-INF, tomcat automaticamente va a esta carpeta a buscar las librerías.

Si queremos convertir el proyecto web en un proyecto maven, podemos hacerlo una vez creado pulsando en boton derecho sobre el proyecto | configure | convert to maven proyect

Si renombrais un proyecto web es posible que se queden como context root el nombre del anterior proyecto. Si desplegais la app en el proyecto web y sigue estando el nombre anterior podeis cambiar en properties del proyecto | web proyect settings | context root