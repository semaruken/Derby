package com.vektorel.semaruken.derby.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sema
 */
@Entity
@Table(name = "GNL_MUSTERI")
public class Musteri implements Serializable {

    private long id;
    private String ad;
    private String soyad;

    @Id
    //@SequenceGenerator(name = "SEQ_MUSTERI", sequenceName = "SEQ_MUSTERI", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MUSTERI_ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "AD", length = 50)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "SOYAD", length = 50)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Musteri{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + '}';
    }
    
    
}
