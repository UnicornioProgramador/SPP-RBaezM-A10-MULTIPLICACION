/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.a10p3;
import java.util.Scanner;
/**
 *
 * @author Dany
 */
public class SPPRBaezMA10P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             MVectores();
    }
        
        
      public static void MVectores() {  
        int r;
        
       r=TamMat();
       
       int [][]Matriz1 = GeneracionMatriz(r);
       int[][]Matriz2 = GeneracionMatriz(r);
       

       MatricesMultiplicacion ( Matriz1, Matriz2);
       
}
    
    public static int  TamMat(){
        int r;
        System.out.println("Introduce tamaño de matrices");
 r = SolicitaEntero();
 return r;
            
    }
    
    public static int [][] GeneracionMatriz(int r) {
        Scanner kb = new Scanner (System.in);
    int t;
        int [][] Matriz = new int [r][r];
        t = (r*r);
        System.out.println("Introduce datos de matriz, capacidad de "+ t + " variables.");
        
        for (int i = 0; i < Matriz.length; i++ ) 
        {
        
            
            for (int j = 0; j < Matriz.length; j++) 
            {

                System.out.println("Introduce varaible " + i +","+ j );

                Matriz[i][j]=SolicitaEntero();

            }
       
        }
        
        return Matriz;
    
    
    }
    
   
    

    
    public static void error() {
    

        System.out.println("Se ha producido un error en la ejecucion del programa.");
        Salida();
        
    
    }
    
    public static void Salida() {
        Scanner kb = new Scanner (System.in);
        int x;
    
        System.out.println("Inserta un numero para reiniciar.");
        System.out.println("Inserta cualquier otra tecla para salir.");
    
    try {
        x =kb.nextInt();
        MVectores();
    
    }
    catch (Exception ex) {
        System.exit(0);
            
        }
    
    
    
    
    
    }
    
    public static int SolicitaEntero() {
    
    
       
   Scanner kb = new Scanner(System.in);
   int e=0;
        
        
        try {
            
            e =kb.nextInt();
              
        }
        catch (Exception ex) {
            
           error();
            
        }
        
        return e;
    
    }
    

     
     public static void MatricesMultiplicacion(int [][]a,int [][] b) {
         
         
         
         System.out.println("Calculo de Matriz 1 * Matriz 2.");
         
         
         for ( int i = 0; i < a.length; i++) {
         
          for (int j = 0; j < a[1].length; j++  ) {
         
            for (int K =0; K< a.length; K++ ) {
          
                int Matriz3 = a[i][K] * b [K][j];
                
                System.out.println(Matriz3);
           
           
          }
            
         
         }
         
         
         }
         
         
             
         
         System.out.println("Calculo de Matriz 2 * Matriz 1.");
         
         
         for ( int i = 0; i < a.length; i++) {
         
          for (int j = 0; j < a[1].length; j++  ) {
         
            for (int K =0; K< a.length; K++ ) {
          
                int Matriz3 = a[j][K] * b [K][i];
                
                System.out.println(Matriz3);
           
           
          }
            
         
         }
         
         
         }
           
         
     }    
    
    
}
