package src.com.example;

import java.util.ArrayList;
import java.util.Collections;

abstract class Conjunto {

    public abstract ArrayList Uniao(ArrayList A,ArrayList B);
    public abstract ArrayList Intersecao(ArrayList A,ArrayList B);
    public abstract ArrayList Diferenca(ArrayList A,ArrayList B);
    public abstract boolean Membro(int x,ArrayList A);
    public abstract void Conjunto_Vazio(ArrayList A);
    public abstract void Insere(int x,ArrayList A);
    public abstract void Remove(int x,ArrayList A);
    public abstract void Atribui(ArrayList A,ArrayList B);
    public abstract Object Min(ArrayList A);
    public abstract Object Max(ArrayList A);
    public abstract boolean Igual(ArrayList A,ArrayList B);

  }
  
  class Teoria extends Conjunto {
    public ArrayList Uniao(ArrayList A , ArrayList B ) {
        A.addAll(B);
        return A;
    }
    public ArrayList Intersecao(ArrayList A, ArrayList B){
        A.retainAll(B);
        return B;
    }
    public ArrayList Diferenca(ArrayList A,ArrayList B){
      A.removeAll(B);
      return A;
    }
    public boolean Membro(int x,ArrayList A){
        if(A.contains(x)){
            return true;
        }else{
          return false;
        }
    }
    public void Conjunto_Vazio(ArrayList A){
        A.clear();
    }
    public void Insere(int x,ArrayList A){
        if(A.contains(x) != true){
            A.add(x);
        }
    }
    public void Remove(int x,ArrayList A){
        A.remove(A.indexOf(x));
    }
    public void Atribui(ArrayList A,ArrayList B){
        A.clear();
        for(int i=0;i<B.size();i++){
          A.add(B.get(i));
        }
    }
    public Object Min(ArrayList A){
      return Collections.min(A);
    }
    public Object Max(ArrayList A){
        return Collections.max(A);
    }
    public boolean Igual(ArrayList A,ArrayList B){
      return A.equals(B);
    }
  }
