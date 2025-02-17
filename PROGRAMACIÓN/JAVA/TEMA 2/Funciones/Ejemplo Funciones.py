#Ejemplo Funciones

def exponente(num1,num2):
    resultado = 1
    for i in range(1,num2+1):
        resultado = resultado * num1
    return resultado

resultadoFuncion = exponente (5,1)
print (resultadoFuncion)

resultadoFuncion = exponente (5,2)
print (resultadoFuncion)

resultadoFuncion = exponente (5,3)
print (resultadoFuncion)

