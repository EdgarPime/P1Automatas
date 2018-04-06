El programa es un analizador lexico el cual valida que un archivo en lenguaje 
php es correcto, el funcionamiento del pruebama es el siguiente:
primero se le ingresa el nombre del archivo el cual esta en la carpeta o ubicacion
del programa, luego se da click en el boton analizar para que este genere los tokens
encontrados en en archivo, imprimiendose en un textArea al igual que los errores,
pero si es archivo analizado contiene errores este desplegara un mesaje de error 
y generara un archivo en el cual se encuentran todos los errores o tokens que
mis expresiones regulares no validaron, pero si el archivo es correcto este 
desplegaran un archivo .out donde vuelve a copiar todo el codigo analizado pero 
correctamente. Mi programa es robusto porque se pueden encontrar facilmente los errores,
ya se encuentran declarados las mayoria de palabras sobre el lenguaje ademas
de imprimir en que linea se encuentran los errores. Se crearon estructuras principales
para las estructuras de control, funcion, entre otros, pero si en dado caso no lo reconoce
este va reconociendo token por token para ver si adentro de la estructrura esta todo bien.
Y por ultimo cabe mensionar que no importan como se escriban las palabras, me 
refiera o mayusculas y minusculas ya que mi archivo genera otro con todas las 
palabras en minisculas para que no esxista ningun problema para finalmente si todo esta
bien imprimirlo correctamente.