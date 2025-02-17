
cad = "Juanma"
num = input("Introduzca un num :")
longitud = len(cad)

continuar = True

while  continuar:
    if len(cad)<4:
           cad = input("Dame una cadena")
    else :  
        continuar = False

if num %2 == 0:
    print ((cad [2] + cad [4])*longitud)

elif num %3 == 0:
    print ((cad [1] + cad [2])*longitud)

elif num %7 == 0:
    print ((cad [0] + cad [3])*longitud)