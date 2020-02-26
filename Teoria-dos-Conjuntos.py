import random
import os

array_one = []
array_two = []
array_result = ""

def Uniao(A,B,C):
    A = set(A)
    B = set(B)
    C = A | B;
    return sorted(C)

def Intersecao(A,B,C):
    A = set(A)
    B = set(B)
    C = A & B;
    return (sorted(C))

def Diferenca(A,B,C):
    A = set(A)
    B = set(B)
    C = A - B;
    return (sorted(C))

def Membro(x,A):
    if(x in A):
        return True
    else:
        return False

def Cria_Conj_Vazio(A):
    A.clear()
    print("Conjunto vazio!")
    return A

def Insere(x,A):
    A.append(x)
    print("Valor adicionado com sucesso!")

def Remove(x,A):
    index = A.index(x)
    A.pop(index)
    print("Valor removido com sucesso!")

def Atribui(A,B):
    A = set(A)
    B = set(B)
    A = B
    return sorted(A)

def Min(A):
    return min(A)

def Max(A):
    return max(A)

def Igual(A,B):
    A = set(A)
    B = set(B)
    if(A == B):
        return True
    else:
        return False

if __name__== "__main__":    
    array_result = ""
    array_result = set(array_result)
    input_user = 0;
    
    while(input_user != 3):
        input_user = int(input("Menu\n1)Informar valores da Array\n2)Visualizar valores\n3)Sair\n\nMenu de Operações\n4)União\n5)Interseção\n6)Diferença\n7)Membro\n8)Esvaziar conjunto\n9)Inserir\n10)Remover\n11)Atribuir\n12)Mínimo\n13)Máximo\n14)Igual\nOpção --> "))
        if(input_user == 1):
            array_one_1 = input("Digite os números para a primeira Array -> ")
            array_one = array_one_1.split(" ")
            array_two_1 = input("Digite os números para a segunda Array -> ")
            array_two = array_two_1.split(" ")
            os.system("clear")
            #Finish here
        if(input_user == 2):
            os.system("clear")
            print(f"Array 1 --> {array_one}\nArray 2 --> {array_two}")
        if(input_user == 4):
            os.system("clear")
            print(Uniao(array_one,array_two,array_result))
        if(input_user == 5):
            os.system("clear")
            print(Intersecao(array_one,array_two,array_result))
        if(input_user == 6):
            os.system("clear")
            print(Diferenca(array_one,array_two,array_result))
        if(input_user == 7):
            os.system("clear")
            user = input("Digite o número desejado --> ")
            print("Resultado -> ",Membro(user,array_one))
        if(input_user == 8):    
            os.system("clear")
            Cria_Conj_Vazio(array_one)
        if(input_user == 9):
            os.system("clear")
            user_a = input("Digite o valor a ser inserido --> ")
            Insere(user_a,array_one)
        if(input_user == 10):
            os.system("clear")
            user_b = input("Digite o valor a ser removido --> ")
            Remove(user_b,array_one)
        if(input_user == 11):
            os.system("clear")
            print(Atribui(array_one,array_two))
        if(input_user == 12):
            os.system("clear")
            print(Min(array_one))
        if(input_user == 13):
            os.system("clear")
            print(Max(array_one))
        if(input_user == 14):
            os.system("clear")
            print("Resultado --> ",Igual(array_one,array_two))