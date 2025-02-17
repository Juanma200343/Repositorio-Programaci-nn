#Ejercicio Evaluable cifrado Cesar

def cifrar(texto,numdesp,alfabeto):

    for c in range(len(texto)):
        cifrado = []
        posicion= alfabeto.index(texto[c])
        nuevaposicion = posicion + numdesp
        if nuevaposicion > 27:
            nuevaposicion= posicion-len(alfabeto)

        nuevaletra = alfabeto[nuevaposicion]
        cifrado.append(nuevaletra)
    return texto

def descifrar(textoDescifrado,numdesp,alfabeto):

    for c in range(len(texto)):
        cifrado = []
        posicion= alfabeto.index(texto[c])
        nuevaposicion = posicion + numdesp
        if nuevaposicion > 27:
            nuevaposicion= posicion-len(alfabeto)
        if nuevaletra < 0:
            nuevaposicion= posicion-len(alfabeto)

        nuevaletra = alfabeto[nuevaposicion]
        cifrado.append(nuevaletra)

    return textoDescifrado

#Apartado 2 
def imprimeMenu():
    print("1.Introducir nuevo usuario ")
    print("2.Modificar palabra de cifrado ")
    print("3.Cifrar mensaje")
    print("4.Descifrar mensaje")
    print("5.Eliminar usuario ")
    print("6.Terminar ")
    while not(opcion=="1" or opcion=="2" or opcion=="3" or opcion=="4" or opcion=="5"or opcion=="6"):
        print("1.Introducir nuevo usuario  ")
        print("2.Modificar palabra de cifrado  ")
        print("3.Cifrar mensaje")
        print("4.Descifrar mensaje")
        print("5.Eliminar usuario ")
        print("6.Terminar ")
    return opcion
  
def altausuario(usuarioregis,clavesregis):
   alta = input("¿Quien eres?")
    yaregis = 

    return usuario

def modificarclave(usuario,claves)
    alta = input("¿Quien eres?")
    existe = usuario.count(usuario)
    


alfabeto =["a, b, c, d, e, f, g, h, i, j, k, l, m, n, ñ ,o, p, q, r, s, t,u, v, w, x, y, z"] 
texto = "casa" 
opcion = input("Indique que opción desea realizar: ").upper()
usuario = []
clave = []

while respuesta != 6:
    respuesta = ""
    respuesta=imprimeMenu()  
match respuesta:
        case "1": print (f"Introducir nuevo usuario  :",usuario())
        case "2": print (f"Modificar palabra de cifrado:",texto())
        case "3": print (f"Cifrar mensaje:",texto())
        case"4": print (f"Descifrar mensaje:",textoDescifrado())
        case"5": print (f"Eliminar usuario:",eliminarusu())
        case"6": print (f"Terminar:",finalizar())
