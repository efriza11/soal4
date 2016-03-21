/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;

/**
 *
 * @author guest-oBkzHj
 */
import java.util.ArrayList;

public class MainMember {

    public static ArrayList<Member> mem = new ArrayList<>();

    public static void main(String[] args) {

        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        m1.setnama("Michael");
        m1.setTeam("Chibi-Chibi");
        m1.setumur("18");
        m1.nilaiattitude(70);
        m1.nilaipenampilan(75);
        m1.nilaisuara(90);

        m2.setnama("Brad Mcquaid");
        m2.setTeam("Captain");
        m2.setumur("28");
        m2.nilaiattitude(50);
        m2.nilaipenampilan(66);
        m2.nilaisuara(73);

        m3.setnama("Doug Mcquaid");
        m3.setTeam("Superman");
        m3.setumur("44");
        m3.nilaiattitude(60);
        m3.nilaipenampilan(52);
        m3.nilaisuara(43);

        mem.add(m1);
        mem.add(m2);
        mem.add(m3);
        tampil();
    }

    public static void tampil() {
        for (int i = 0; i < mem.size(); i++) {
            System.out.println("===========Daftar member===========");
        System.out.println("Nama            :"+mem.get(i).getnama());    
        System.out.println("Team            :"+mem.get(i).getteam());    
        System.out.println("Umur            :"+mem.get(i).getumur());    
        System.out.println("Nilai Rata-rata :"+mem.get(i).getnilai());    
        
        }
        
    }

}
