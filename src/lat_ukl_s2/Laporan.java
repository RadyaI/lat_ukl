/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_ukl_s2;

/**
 *
 * @author radya
 */
public class Laporan {
    public void laporan(barang bar){
    int x =bar.getJmlBarang();
    
        System.out.println();
        System.out.println("Tabel barang");
        System.out.println("");
        System.out.println("Nama barang \tStok \tHarga");
        for (int i=0; i<x; i++){
            System.out.println(bar.getNamaBarang(i)+"\t"+bar.getStok(i)+"\t"+bar.getHarga(i));
           
        }
    }
    public void laporan (member Member){
    int x =Member.getJumlahmember();
    
        System.out.println("");
        System.out.println("Tabel member");
        System.out.println("");
        System.out.println("Nama \tAlamat  \tTelepon \tSaldo"  );
        for (int i=0; i<x; i++){
            System.out.println(Member.getNama(i)+"\t"+Member.getAlamat(i)+"\t"+"\t"+Member.getTelepon(i)+"\t"+Member.getsaldo(i));
        }
    }
    public void laporan(transaksi trans,barang bar){
    int x =trans.getjmltransaksi();
    
        System.out.println("");
        System.out.println("Laporan transaksi");
        System.out.println("");
        System.out.println("Nama barang \ttQty \tHarga \tJumlah");
        
        int total=0;
        for (int i=0; i<0; i++){
        int jumlah=trans.getBanyaknya(i)*bar.getHarga(trans.getidBarang(i));
        total+=jumlah;
        
            System.out.println(bar.getNamaBarang(trans.getidBarang(i))+"\t"+trans.getBanyaknya(i)+"\t"+bar.getHarga(trans.getidBarang(i))+"\t"+jumlah);
        }
        System.out.println("Total omset= "+total);
    }
}
