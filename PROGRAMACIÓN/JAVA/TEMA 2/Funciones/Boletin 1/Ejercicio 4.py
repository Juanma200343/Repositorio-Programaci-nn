#Ejercicio 4
def calculaMax(num):
    max = -99999999
    for i in range (len(num)):
        if num [i] > max:
            max = num[i] 
    return max

lista = []
while len(lista) <=10 :
    num2= int(input("Dame numeros: "))
    lista.append(num2)

print(calculaMax(lista))