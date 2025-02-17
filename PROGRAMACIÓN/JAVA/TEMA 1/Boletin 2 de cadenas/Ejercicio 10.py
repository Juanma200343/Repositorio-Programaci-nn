#Ejercicio 10
cadenaE = (input("Introduce un numero :"))
cadenaS = ""
contador = 0

for i in range(len(cadenaE)-1,0,-1) :
    contador = contador +1
    if contador != 3 :
        cadenaS= cadenaE[i] + cadenaS
   
    else: 
        contador = 0
        cadenaS= "." + cadenaE[i] + cadenaS
print(cadenaE [0] + cadenaS)
       
