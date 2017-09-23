Se sigue el tutorial de https://netbeans.org/kb/docs/javaee/entappclient.html.
Modificación para ajustarlo al HolaMundo (ejercicio propuesto).

3 partes (o proyectos de Netbeans):
1. Java Class Library donde residirá la interfaz remota. (taza de café)
2. Enterprise Application donde correrá Glassfish. (triángulo)
    * Se crea un módulo EJB.
    * Session Bean de tipo Stateless y crea una interfaz remota al proyecto número 1.
    * Se generará un JAR a partir de la interfaz generada en el proyecto 1.
    * En el fichero generado (SessionBean), se implementará la interfaz.
    * Se despliega (Deploy) el proyecto.
        * Me dio error en build-impl.xml, que se solucionó presionando Clean & Build.
3. Enterprise Application Client. También basado en Glassfish.
    * En la clase principal que se crea (Main.java, por defecto), se hace un binding (Insert code) con el EJB Session Stateless.
    * Será el SessionBean del proyecto 2, apartado b.
    * Por último se arranca la aplicación (Run).
