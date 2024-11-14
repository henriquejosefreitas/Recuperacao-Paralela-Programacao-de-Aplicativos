/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recup_pergunta9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Recup_Pergunta9 {

    public static void main(String[] args) throws IOException {

    Scanner scan = new Scanner(System.in);
    System.out.println("Por favor digite o nome do lutador: ");
    String nome = scan.next();

    System.out.println("Por favor digite o peso do lutador: ");
    int peso = scan.nextInt();

    String categ = "";
        
    if (peso < 65){
    categ = "Pena";
    
    }else if(peso >= 65 & peso < 72){
    categ = "Leve";
    
    }else if(peso >= 72 & peso < 79){
    categ = "Ligeiro";
    
    }else if(peso >= 79 & peso < 86){
    categ = "Meio Médio";
    
    }else if(peso >= 86 & peso < 93){
    categ = "Médio";
    
    }else if(peso >= 93 & peso < 100){
    categ = "Meio Pesado";
    
    }else if(peso >= 100){
    categ = "Pesado";
    
    }

            String nomeArquivo = "Lutador_e_Peso"+".txt";
            FileWriter arquivo = new FileWriter ("P:\\TURMAS\\HTC-DDS-19\\Henrique José F. Moreira\\"+ nomeArquivo + ".txt") ;
            PrintWriter writer = new PrintWriter(arquivo);
                writer.println("O lutador "+nome+" pesa "+peso+" kg e se enquadra na categoria "+categ);

            writer.close();

        System.out.println("Arquivo enviado!");            
            
        }

    }


