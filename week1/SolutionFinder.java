/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
public class SolutionFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double a = 4, b = 8, c = 3, x1, x2;
        x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
        x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
      
    }
}
