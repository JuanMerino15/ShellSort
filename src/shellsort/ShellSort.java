/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan
 */
public class ShellSort {
    
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
    
    int A[]=new int [20];
        int n,i,j,k,incremento,aux;
        System.out.print("Escribe el tamaño del arreglo: ");
        entrada = bufer.readLine();
        n = Integer.parseInt(entrada);
     
        for(i=1;i<=n;i++){
            System.out.print("A["+i+"]= ");
            entrada = bufer.readLine();
            A[i] = Integer.parseInt(entrada);
        }
     
     
        incremento=n/2;
 
           while(incremento>0){
               for(i=incremento+1;i<=n;i++){
                     j=i-incremento;
                        while(j>0){
                           if(A[j]>=A[j+incremento]){
                                aux = A[j];
                                A[j] = A[j+incremento];
                                A[j+incremento] = aux;
    }
          else{
               j=0;
     }
               j=j-incremento;
   }
  }
  incremento=incremento/2;
 }
     
     
        System.out.println("EL ARREGLO ORDENADO");
           for(i=1;i<=n;i++){
             System.out.println("    [" +i+ "]:   " + A[i]);
         
        }
 
 
 
 
}
}
    
    

