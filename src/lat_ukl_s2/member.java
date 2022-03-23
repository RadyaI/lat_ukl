/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_ukl_s2;

import java.util.ArrayList;

/**
 *
 * @author radya
 */
public class member implements user {  
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat =new ArrayList<String>();
    private ArrayList<String> telepon =new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    //konstraktor = namanya sama dengan kelas
    public member(){
    this.namaMember.add("Radya");
    this.alamat.add("malang");
    this.telepon.add("0899999999");
    this.saldo.add(100000);
    
    this.namaMember.add("Angga");
    this.alamat.add("mataram");
    this.telepon.add("0899912312");
    this.saldo.add(400000);
    
    this.namaMember.add("budi");
    this.alamat.add("jember");
    this.telepon.add("0895756999");
    this.saldo.add(200000);
    
    }
    public void setSaldo(int saldo){
    this.saldo.add(saldo);
    }
   
    public int getsaldo(int idmember){
    return this.saldo.get(idmember);
    }
    public void editsaldo(int idmember,int saldo){
    this.saldo.set(idmember, saldo);
    }
    public int getJumlahmember(){
    return this.saldo.size();
    }
    
    @Override
    public void setNama(String namamember) {
       this.namaMember.add(namamember);
    }
    
    @Override
    public void setAlamat(String alamat) {
     this.alamat.add(alamat);
    }

    @Override
    public void SetTelepon(String Telepon) {
       this.telepon.add(Telepon);
    }

    @Override
    public String getNama(int idmember) {
      return this.namaMember.get(idmember);
    }

    @Override
    public String getTelepon(int idmember) {
     return this.telepon.get(idmember);
    }

    @Override
    public String getAlamat(int idmember) {
     return this.alamat.get(idmember);
    }

    
}
