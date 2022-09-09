/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
public class Player {

    private String name;
    private String team;

    public void setName(String n) {
        name = n;
    }

    public void setTeam(String t) {
        team = t;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public boolean isSameTeam(Player p) {
        return p.team.equals(team);
//        if (p.team.equals(team)){
//            return true;
//        } else {
//            return false;
//        }
    }
//    public static void main(String[] args) {
//        Player p1 = new Player();
//        p1.setName("bank");
//        p1.setTeam("Gate OR");
//        
//        Player p2 = new Player();
//        p2.setName("Khim");
//        p2.setTeam("Gate OR");
//        
//        if(p1.isSameTeam(p2)){
//            System.out.println(p1.getName() + " is a same team with " + p2.getName());
//        } else{
//            System.out.println(p1.getName() + " is not a same team with " + p2.getName());
//        }
//    }
}
