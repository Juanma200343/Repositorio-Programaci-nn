#Ejercicio 1 Funciones

def multiplo (num,num2):
    mult= False
    if num % num2 == 0 :
      mult=True  
    return mult

num1= int(input("Introduce un num"))
num2= int(input("Introduce otro num"))
resultado = (num1,num2)
print(resultado)