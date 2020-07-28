# ESCUELA POLITÉCNICA NACIONAL (EPN)
# ESCUELA DE FORMACIÓN DE TECNÓLOGOS (ESFOT)
# TÓPICOS ESPECIALES
# EXAMEN 1ER BIMESTRE
# CARLOS LUCERO, DIANA NARVÁEZ
Creación de un chat en tiempo real con usuarios, mediante la autenticación de un correo electrónico usando el método de autenticación que posee firebase. Contiene formulario de registro, un formulario de login y un layout de los mensajes, en dicho chat se puede crear usuarios y logear los usuarios chatear en tiempo real con los demás usuarios logiados y también se puede enviar fotos todos los mensajes de texto, imágenes y usuarios se almacena en una base de datos de firebase.
El proyecto realizado se basa en la elaboración de una aplicación de chat, el cual permite la interacción entre usuarios los cuales pueden enviar texto y fotos.
Se desarrolló en la versión Android 5.1 API Lollipop, la aplicación fue probada en diferentes dispositivos los cuales fueron:
•	Xiaomi Mi 8 lite
 
•	Xiaomi Mi9TPro
 
•	RealmeXT
 
•	Nexus X5
 
•	Emulacion en una Tablet
 
Explicacion importante del codigo
•	Activities para el orden del LAUNCHER. Se debe poner la actividad en LAUNCHER para que sea la primera actividad que se va a ver al momento de abrir la aplicación.
 
•	Codigo para el permiso de leer datos externos a la aplicación, en nuestro caso lo debemos utilizar para poder escoger y enviar imágenes que tenga nuestro telefono almacenado. Para la lectura y escritura de archivos.
 
 
•	Librerias de firebase, recyclreview y circleimagen. Para la coneccion con la base de datos utilizamos las librerias de firebase y las otras es para el diseño de la lista y las tarjetas que contienen nuestros mensajes y la ultima es para dar diseño a las imágenes redondearla y recortar imagen.
 
•	Public void para el enviod e mensajes con condicion en este caso si se envia un “2” vendria a ser una imagen se podra observar la imagen mediante la url que se envie por tal motivo se utiliza un Glide y si se envia un “1” seria un mensaje de texto en el cual no necesita de ninguna url y no requiere Glide.
 
•	Condicion para el cambio de imagen de perfil que se muestre quien y que imagen se escogio al momento del cambio de foto de perfil.
 
•	Long para setear y dar formato a la hora que se va a presentar con el envio de mensajes.
 
•	Boton enviar con nombre de usuario, la foto de perfil, tipo de mensaje y la hora de envio.
 
•	Envio de imágenes con almacenamiento en base de datos. Las imágenes se envian con todos los datos que contienen en boton enviar.
 

Manual de uso 
1.	Intalamos la apk, una vez instalada se mostrara el siguiente icono damos clic.
 
2.	Mostrandonos la siguiente interfaz la cual nos permitira realizar el registro para el acceso al chat grupal, si es asi haga clic en Registrate.
3.	Si ya tenemos una cuenta registrada debemos ingresar nuestro correo electrónico y contraseña, clic en Entrar listo estaremos en el chat con los demás usuarios ya antes registrados.
 
4.	Ingresar sus datos personales y clic en Registrate

5.	Nos pedira otorgarle permisos clic en Allow
 
6.	Y estaremos en el chat con los demas usuarios ya antes registrados .
 

Referencias

[1] 	A. Barber, «Stackoverflow,» Stackoverflow, 03 julio 2014. [En línea]. Available: https://stackoverflow.com/questions/8954293/permission-to-read-data-from-sd-card. [Último acceso: 25 Julio 2020].
[2] 	Firebase, «Firebase,» 21 Noviembre 2019. [En línea]. Available: https://firebase.google.com/docs/auth/android/password-auth?hl=es-419. [Último acceso: 25 Julio 2020].
[3] 	A. v. d. Hoven, «Stackoverflow,» Stackoverflow, 23 Abril 2014. [En línea]. Available: https://stackoverflow.com/questions/1819142/how-should-i-validate-an-e-mail-address. [Último acceso: 26 Julio 2020].
[4] 	Firebase y Android Studio. [Película]. Perú: KAD, 2018. 




