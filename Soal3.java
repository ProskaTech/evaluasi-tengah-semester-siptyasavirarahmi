/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Soal3 {
    // Created by 21342015_Siptya Savira Rahmi

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukan Angka");
        angka = Integer.parseInt(a);
         
        if (angka >= 0){
            JOptionPane.showMessageDialog(null,"Angka"+angka+"merupakan bilangan positif");
        }
        else{
            JOptionPane.showMessageDialog(null,"Angka"+angka+"merupakan bilangan negatif");
    }
    }
    
}
