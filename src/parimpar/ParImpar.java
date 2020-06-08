/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
        System.out.println ("Digite um número");
        
        int n = entrada.nextInt();
        //System.out.println(n%2 == 0? "par": "impar");
        if (n%2 == 0)
           System.out.println("par");
        else
            System.out.println("Impar");
        
    }
    
}
