/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPackage;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author François
 */
@Entity
@Table(name = "COM_ART")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComArt.findAll", query = "SELECT c FROM ComArt c"),
    @NamedQuery(name = "ComArt.findByIdcomArt", query = "SELECT c FROM ComArt c WHERE c.idcomArt = :idcomArt"),
    @NamedQuery(name = "ComArt.findByQuantite", query = "SELECT c FROM ComArt c WHERE c.quantite = :quantite"),
    @NamedQuery(name = "ComArt.findByPrix", query = "SELECT c FROM ComArt c WHERE c.prix = :prix")})
public class ComArt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCOM_ART")
    private Integer idcomArt;
    @Column(name = "QUANTITE")
    private Integer quantite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRIX")
    private BigDecimal prix;
    @JoinColumn(name = "IDARTICLE", referencedColumnName = "IDARTICLE")
    @ManyToOne
    private Article idarticle;
    @JoinColumn(name = "IDCOMMANDE", referencedColumnName = "IDCOMMANDE")
    @ManyToOne
    private Commande idcommande;

    public ComArt() {
    }

    public ComArt(Integer idcomArt) {
        this.idcomArt = idcomArt;
    }

    public ComArt(Integer idcomArt, BigDecimal prix) {
        this.idcomArt = idcomArt;
        this.prix = prix;
    }

    public Integer getIdcomArt() {
        return idcomArt;
    }

    public void setIdcomArt(Integer idcomArt) {
        this.idcomArt = idcomArt;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public Article getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(Article idarticle) {
        this.idarticle = idarticle;
    }

    public Commande getIdcommande() {
        return idcommande;
    }

    public void setIdcommande(Commande idcommande) {
        this.idcommande = idcommande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomArt != null ? idcomArt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComArt)) {
            return false;
        }
        ComArt other = (ComArt) object;
        if ((this.idcomArt == null && other.idcomArt != null) || (this.idcomArt != null && !this.idcomArt.equals(other.idcomArt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.ComArt[ idcomArt=" + idcomArt + " ]";
    }
    
}
