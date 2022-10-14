/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal2 {
    // Created by 21342015_Siptya Savira Rahmi

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       
    System.out.print("Masukan Jumlah Baris: ");
    int a = in.nextInt();
  
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j < i; j++) 
      {
        System.out.print(" ");
      }
      for (int k = i; k <= a; k++) 
      {
        System.out.print("# ");
      }
      System.out.println("");
    }
    for (int i = a; i >= 1; i--) {
      for (int j = 1; j < i; j++) 
      {
        System.out.print(" ");
      }
      for (int k = i; k <= a; k++) 
      {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
    
    

