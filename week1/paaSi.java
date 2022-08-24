/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
import java.util.Scanner;
public class paaSi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double vat = input.nextDouble();
        vat = (vat * 7)/100;
        System.out.println(vat);
    }
}
