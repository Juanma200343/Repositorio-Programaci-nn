#Ejercicio 7 modificado 1º y Ultima mayuscula 
nombrecompleto= input("Pon un nombre completo :")
separacion = nombrecompleto.split()
for mayuscula in separacion:
    print(palabra[0].upper() + mayuscula[1:-1].lower() + mayuscula[-1].upper())