#Ejercicio 7 Boletin 2 
nombrecompleto= input("Pon un nombre completo :")
separacion=nombrecompleto.split()
for palabra in separacion:
    print(palabra[0].upper() + palabra[1:])