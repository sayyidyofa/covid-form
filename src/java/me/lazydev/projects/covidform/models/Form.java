/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.lazydev.projects.covidform.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yoffa
 */
@Entity
@Table(name = "form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Form.findAll", query = "SELECT f FROM Form f")
    , @NamedQuery(name = "Form.findById", query = "SELECT f FROM Form f WHERE f.id = :id")
    , @NamedQuery(name = "Form.findByNoKtp", query = "SELECT f FROM Form f WHERE f.noKtp = :noKtp")
    , @NamedQuery(name = "Form.findByNama", query = "SELECT f FROM Form f WHERE f.nama = :nama")
    , @NamedQuery(name = "Form.findByNomerTelepon", query = "SELECT f FROM Form f WHERE f.nomerTelepon = :nomerTelepon")})
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "no_ktp")
    private String noKtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nomer_telepon")
    private String nomerTelepon;

    public Form() {
    }

    public Form(Integer id) {
        this.id = id;
    }

    public Form(Integer id, String noKtp, String nama, String alamat, String nomerTelepon) {
        this.id = id;
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
        this.nomerTelepon = nomerTelepon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomerTelepon() {
        return nomerTelepon;
    }

    public void setNomerTelepon(String nomerTelepon) {
        this.nomerTelepon = nomerTelepon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Form)) {
            return false;
        }
        Form other = (Form) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "me.lazydev.projects.covidform.models.Form[ id=" + id + " ]";
    }
    
}
