/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
import java.util.*;
public class iWannaGoHome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("input ypur money : ");
        int money = input.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char plan = input.next().charAt(0);
        if (plan == 'A' ){
            money += (money * 0.015);
        }
        else if (plan == 'C'){
            money += (money * 0.015);
        }else if (plan == 'B'){
            money += (money * 0.02);
        }else if (plan == 'X'){
            money += (money * 0.05);
        }
        System.out.println("Your total money in one year = " + money);
    }
}
