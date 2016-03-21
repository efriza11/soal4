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
public class Member {

    private String nama;
    private String team;
    private String umur;
    private int nilai;

    public void setnama(String nm) {
        nama = nm;
    }

    public void setTeam(String tm) {
        team = tm;
    }

    public void setumur(String umr) {
        umur = umr;
    }

    public void nilaipenampilan(int p) {
       int nilai1 = p;
       nilai+=nilai1;
    }

    public void nilaisuara(int s) {
       int nilai2 = s;
       nilai+=nilai2;
    }

    public void nilaiattitude(int a) {
       int nilai3 = a;
       nilai+=nilai3;
    }

    public String getnama() {
        return nama;
    }

    public String getteam() {
        return team;
    }

    public String getumur() {
        return umur;
    }

    public int getnilai() {
        return nilai/3;
    }
        
}
