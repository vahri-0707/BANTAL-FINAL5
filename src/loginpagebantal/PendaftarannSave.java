/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpagebantal;

public class PendaftarannSave {
  String Nama ;
  String Email ;
  String Password;
  String TanggalLahir ;
  String Riwayatkesehatan ;
  String Pekerjaan ;
  String nomorhp ;
  String kotadankab;
  String Jkelamin;

    public PendaftarannSave(String Nama, String Email, String Password, String TanggalLahir, String Riwayatkesehatan, String Pekerjaan, String nomorhp, String kotadankab, String Jkelamin) {
        this.Nama = Nama;
        this.Email = Email;
        this.Password = Password;
        this.TanggalLahir = TanggalLahir;
        this.Riwayatkesehatan = Riwayatkesehatan;
        this.Pekerjaan = Pekerjaan;
        this.nomorhp = nomorhp;
        this.kotadankab = kotadankab;
        this.Jkelamin = Jkelamin;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getRiwayatkesehatan() {
        return Riwayatkesehatan;
    }

    public void setRiwayatkesehatan(String Riwayatkesehatan) {
        this.Riwayatkesehatan = Riwayatkesehatan;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getKotadankab() {
        return kotadankab;
    }

    public void setKotadankab(String kotadankab) {
        this.kotadankab = kotadankab;
    }

    public String getJkelamin() {
        return Jkelamin;
    }

    public void setJkelamin(String Jkelamin) {
        this.Jkelamin = Jkelamin;
    }
  
  
}
