package com.telkommedika.ListDokter.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;



@Entity
@Table(name = "list_dokter")
public class ListDokterEntity {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "listdokter_id")
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "bidang")
    private String bidang;

    @Column(name = "shift")
    private String shift;

    @Column(name = "telefon")
    private String telefon;
    public ListDokterEntity() {
    }

    public ListDokterEntity(Long id, String nama, String bidang, String shift, String telefon) {
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.shift = shift;
        this.telefon = telefon;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
