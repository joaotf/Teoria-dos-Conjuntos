package src.com.example;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
      Teoria x = new Teoria();
      ArrayList array_1 = new ArrayList<>();
      ArrayList array_2 = new ArrayList<>();
      int menu = 0,input1=1,input2=1;
      boolean vontade = false;
      do{
          menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1)Array 1 - Input\n2)Array 2 - Input\n3)Visualizar valores\n4)Sair\n\nMenu de Operações\n5)União\n6)Interseção\n7)Diferença\n8)Membro\n9)Esvaziar conjunto\n10)Inserir\n11)Remover\n12)Atribuir\n13)Mínimo\n14)Máximo\n15)Igual\nOpção --> "));
          switch (menu) {
            case 1:
                input1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para adicionar na Array 1 --> "));
                array_1.add(input1);
                break;
            case 2:
                input2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para adicionar na Array 2 --> "));
                array_2.add(input2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Array 1 --> "+array_1+"\n"+"Array 2 --> "+array_2);
                break;
            case 4:
                System.exit(0);
            case 5:
                JOptionPane.showMessageDialog(null,x.Uniao(array_1,array_2));
                break;    
            case 6:
                JOptionPane.showMessageDialog(null,x.Intersecao(array_1,array_2));
                break;
            case 7:
                JOptionPane.showMessageDialog(null,x.Diferenca(array_1,array_2));
                break;
            case 8:
                int input_user = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor --> "));
                JOptionPane.showMessageDialog(null,x.Membro(input_user,array_1));
                break;
            case 9:
                x.Conjunto_Vazio(array_1);
                break;
            case 10:
                int input_user_x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor --> "));
                x.Insere(input_user_x,array_1);
                break;
            case 11:
                int input_user_y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor --> "));
                x.Remove(input_user_y,array_1);
                break;
            case 12:
              x.Atribui(array_1,array_2);
              break;
            case 13:
              JOptionPane.showMessageDialog(null,"Mínimo valor encontrado --> "+x.Min(array_1));
              break;
            case 14:
              JOptionPane.showMessageDialog(null,"Máximo valor encontrado --> "+x.Max(array_1));
              break;
            case 15:
              JOptionPane.showMessageDialog(null,"Igualdade --> "+x.Igual(array_1,array_2));
              break;
          }
      }while(menu != 4);
      
    }
}
