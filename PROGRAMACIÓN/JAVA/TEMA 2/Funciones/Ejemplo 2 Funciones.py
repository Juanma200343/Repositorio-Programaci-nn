#Ejemplo 2 Funciones

def exponente(num1,num2):
    contador = 0 
    if num2 == 0:
        resultado = 1
    else:
        resultado = 1   
        for i in range(1,num2+1):
            resultado = resultado * num1
    return resultado

resultadoFuncion = exponente (5,0)
print (resultadoFuncion)

resultadoFuncion = exponente (5,1)
print (resultadoFuncion)

