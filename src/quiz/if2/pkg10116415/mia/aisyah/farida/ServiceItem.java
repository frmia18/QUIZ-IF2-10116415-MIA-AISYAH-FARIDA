/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116415.mia.aisyah.farida;

/**
 *Nama  : MIA AISYAH F
 *Kelas : PBO2
 *NIM   : 10116415  
 *Deskripsi Program : Quiz
 */
  
public interface ServiceItem {

    public void displayService();

    public float getPrice(int serviceItem);

    public boolean checkMemberStatus(String statusMember);

    public float getSale(boolean isMember, float parServicePrice);
}