package ListaDupla;

import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ListLigada {   
   public static void main(String[] args) throws Exception {      
      Scanner sc = new Scanner(System.in);      
      Lista lista = new Lista();      
      String valor = null, resp = null;      
      do{         
         System.out.println("Escolha a opção\n1->Inserir no Início:\n2->Inserir no fim:\n3->Pesquisar um valor:\n4->Listar valores da lista:");      
         resp = sc.next();         
         if(resp.equals("1")){
            System.out.println("Digite um valor:");
            valor = sc.next();
            //Insere valore no inicio da lista.
            try {
               lista.Insere_Inicio(valor);
            } 
            catch (ExportException e) {               
               e.printStackTrace();
            }
         }            
         else if(resp.equals("2")){
            System.out.println("Digite um valor:");
            valor = sc.next();
            //Insere valores no final da lista.
            try {
               lista.Insere_Fim(valor);
            } 
            catch (ExportException e) {               
               e.printStackTrace();
            }         
         }            
         else if(resp.equals("3")){
            System.out.println("Digite um valor:");
            valor = sc.next();
            //Pesquisa por valores na lista.
            if(lista.Procura(valor) == true)
               System.out.println("Valor existe na lista!");
            else
               System.out.println("Valor não existe na lista!");            
         }         
         else if(resp.equals("4")){
            ArrayList<String> listar = new ArrayList<String>();
            //Recebe os valores da lista em um ArrayList e os imprime.
            try {
                listar = lista.Listar();
            } 
            catch (EmptyStackException e) {
               e.printStackTrace();               
            }
            
            for(String elemento : listar){
               System.out.print(elemento + " ");
            }
            System.out.println();
         }
         else
            System.out.println("Opção inválida!");
      }
      while(resp != "9");      
   }
}
