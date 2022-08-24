/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
import java.util.Scanner;
public class weLa {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Hours : ");
        int Hours = input.nextInt();
        System.out.print("Mins  : ");
        int Mins = input.nextInt();

        Hours *= 3600;
        Mins *= 60;

        int Secs = Hours + Mins;
        System.out.println("Secs = " + Secs);
        
    }
}
