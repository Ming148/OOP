/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
import java.util.Scanner;
public class grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numX = input.nextInt();
        int numY = input.nextInt();
        int numZ = input.nextInt();
        double total = (numX + numY + numZ)/3;
        System.out.println(total);
    }
}
