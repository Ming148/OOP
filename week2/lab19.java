/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
import java.util.*;
public class lab19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print(number);
        for (int sign = 1; sign < number;sign++){
            System.out.print("=");
        }
        System.out.println('+');
    }
}
