/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
import java.util.Scanner;
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble(), area = Math.PI;
        area *= Math.pow(radius, 2);
        System.out.println(area);
    }
}
