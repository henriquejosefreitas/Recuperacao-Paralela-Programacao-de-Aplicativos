/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recup_pergunta4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author h.moreira
 */
public class Recup_Pergunta4 {

    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero:"));
        int ant = num -1;
        int suc = num +1;

        String result= "numero: "+num+"\n antecessor: "+ant+"\n sucessor: "+suc;
    JOptionPane.showMessageDialog(null, result);

    }
}

