/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recup_pergunta2;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Recup_Pergunta2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua idade em: anos, meses e dias");
        
        System.out.println("Ano:");
        int ano = scan.nextInt();
        
        System.out.println("Meses:");
        int mes = scan.nextInt();
        
        System.out.println("Dias:");
        int dias = scan.nextInt();

        
        int soma = (mes*30)+(ano*365)+dias;
        
        System.out.println(ano+" anos, "+mes+" meses e "+dias+" dias = "+soma+"dias.");
        
    }
}
