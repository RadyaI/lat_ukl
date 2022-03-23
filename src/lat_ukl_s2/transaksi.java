/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_ukl_s2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author radya
 */
public class transaksi {
    
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idMember = new ArrayList<Integer>();
    
    public transaksi() {
    this.idMember.add(0);
    this.idBarang.add(0);
    this.banyak.add(2);
    this.idMember.add(0);
    this.idBarang.add(1);
    this.banyak.add(3);
    this.idMember.add(1);
    this.idBarang.add(0);
    this.banyak.add(1);
    this.idMember.add(1);
    this.idBarang.add(2);
    this.banyak.add(2);
 }
    public void prosesTransaksi(member member, transaksi trans, barang bar){
    Scanner myObj = new Scanner (System.in);
        System.out.print("Masukkan id member: ");
        int idMember = myObj.nextInt();
        System.out.println("Selamat datang "+member.getNama(idMember));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>(); 
    int i=0;
    int temp=0;
    
    do{
        System.out.print("Masukkan kode barang: ");
        temp=myObj.nextInt();
        if (temp!=99){
        idBarang.add(temp);
            System.out.print(bar.getNamaBarang (idBarang.get(i))+"sebanyak: ");
             banyak.add(myObj.nextInt());
             i++;
        }
      
        
    
    }while(temp!=99);
        System.out.print("Transaksi belanja "+member.getNama(idMember)+" sebagai berikut: ");
        System.out.println("nama barang \tQty \tHarga \tJumlah \t");
        
        int total=0;
        int x = idBarang.size();
        for (int j=0; j<x; j++){
        int jumlah=banyak.get(j)*bar.getHarga(idBarang.get(j));
        total+=jumlah;
            System.out.print(bar.getNamaBarang(idBarang.get(j))+"\t"+idBarang.get(j)+"\t"+bar.getHarga(idBarang.get(j))+"\t"+jumlah);
         trans.settransaksi(bar, idMember, idBarang.get(j),banyak.get(j));
        }
        System.out.print("Total belanja: "+total);
        member.editsaldo(idMember, member.getsaldo(idMember)-total);
}
    public void settransaksi(barang bar, int idMember, int idBarang, int banyaknya){
    this.idMember.add(idMember);
    this.idBarang.add(idBarang);
    this.banyak.add(banyaknya);
    bar.editStok(idBarang, bar.getStok(idBarang)-banyaknya);
    }
    public int getidBarang(int id){
    return this.idBarang.get(id);
    }
    public int getBanyaknya(int id){
    return this.banyak.get(id);
    }
    public int getidMember(int id){
    return this.idMember.get(id);
    }
    public int getjmltransaksi(){
    return this.idMember.size();
    }

    }

    