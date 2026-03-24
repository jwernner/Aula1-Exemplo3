/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.exemplo3;

import java.util.Scanner;

/**
 *
 * @author jwern
 */
public class Aula1Exemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        double salarioB, salarioL, imposto;

        System.out.println("Digite o salário bruto:");
        salarioB = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite o percentual do imposto:");
        imposto = Double.parseDouble(sc.nextLine());

        salarioL = salarioB - salarioB * imposto / 100;

        System.out.printf("Salario liquido: %.2f", salarioL);
        
    }
    
}
