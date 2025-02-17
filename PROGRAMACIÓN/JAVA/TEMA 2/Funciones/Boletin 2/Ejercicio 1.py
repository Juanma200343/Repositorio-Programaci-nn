#Ejercicio 1 Boletin 2

def LetraA (lista):
    contador = 0
    letra = "a"
    for palabra in lista:
        for caracter in palabra:
            if caracter == letra:
                contador += 1
    return contador


nombre= input ('Dime tu nombre:')
apellido = input ('Dame tu primer apellido:')
apellidos = input ('Dame tu segundo apellido:')
lista = [nombre, apellido, apellidos]
print(LetraA(lista))