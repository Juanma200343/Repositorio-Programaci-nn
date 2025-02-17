#Ejercicio 2 

def calMedia (num1,num2):
    media = (num1 + num2)/2
    return media

numdia = int(input("¿Cuantos dias?"))
for i in range (0,numdia):
    numdia = int(input("¿Cuantos dias?"))
    temperaturaMax = int(input("Introduce la temperatura Max"))
    temperaturaMin = int(input("Introduce la temperatura Min"))
    resultadofun= calMedia(temperaturaMax,temperaturaMin) 
    print (resultadofun)