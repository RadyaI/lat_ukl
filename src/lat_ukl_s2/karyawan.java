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
public class karyawan implements user {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public karyawan(){
    this.namaKaryawan.add("Admin");
    this.alamat.add("sawojajar");
    this.telepon.add("081276424");
    this.jabatan.add(0);
    }
    public void setJabatan(int jabatan){
    this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
    return this.jabatan.get(id);
    }
    public int JmlhKaryawan(){
    return this.namaKaryawan.size();
    }

    @Override
    public void setNama(String namaKaryawan) {
       this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
     this.namaKaryawan.add(alamat);
    }

    @Override
    public void SetTelepon(String Telepon) {
       this.namaKaryawan.add(Telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
      return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
      return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }
}
