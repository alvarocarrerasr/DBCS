# Ejercicio 1:

https://plus.google.com/111442597926418284621/posts/Tv3GKUc64GX

Imposible seguir por un error 500 interno del servidor Glassfish
Info:   Exception Occurred :null
Warning:   StandardWrapperValve[FacesServlet]: Servlet.service() for servlet FacesServlet threw exception
java.lang.IllegalStateException: getOutputStream() has already been called for this response
	at org.apache.catalina.connector.Response.getWriter(Response.java:777)

Por lo visto, es un bug que Oracle no ha corregido aún, la comunidad ha sacado un fork llamado Payara. Más info: https://stackoverflow.com/questions/33048435/glassfish-admin-console-throws-java-lang-illegalstateexception-when-creating-jdb

----

