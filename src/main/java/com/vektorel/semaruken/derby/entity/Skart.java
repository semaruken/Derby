/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.derby.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sema
 */
@Entity
@Table(name = "GNL_Skart")
public class Skart implements Serializable {

    private Long id;
    private String tanim;
    private String kod;
    private Long barkod;
    private Long birimFiyat;
    private Date gelisTarihi;

    @Id
    //@SequenceGenerator(name = "SEQ_Skart", sequenceName = "SEQ_Skart", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Skart_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Tanim", length = 50)
    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

    @Column(name = "Kod", length = 100)
    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Column(name = "Barkod", length = 100)
    public Long getBarkod() {
        return barkod;
    }

    public void setBarkod(Long barkod) {
        this.barkod = barkod;
    }

    @Column(name = "BirimFiyat", length = 100)
    public Long getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(Long birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    @Column(name = "Gelis_Tarihi")
    @Temporal(TemporalType.DATE)
    public Date getGelisTarihi() {
        return gelisTarihi;
    }

    public void setGelisTarihi(Date gelisTarihi) {
        this.gelisTarihi = gelisTarihi;
    }

    @Override
    public String toString() {
        return "Skart{" + "id=" + id + ", tanim=" + tanim + ", kod=" + kod + ", barkod=" + barkod + ", birimFiyat=" + birimFiyat + ", gelisTarihi=" + gelisTarihi + '}';
    }
    
}
