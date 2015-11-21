/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPackage;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author François
 */
@Entity
@Table(name = "CATEGORIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c"),
    @NamedQuery(name = "Categorie.findByIdcategorie", query = "SELECT c FROM Categorie c WHERE c.idcategorie = :idcategorie"),
    @NamedQuery(name = "Categorie.findByCouleur", query = "SELECT c FROM Categorie c WHERE c.couleur = :couleur")})
public class Categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCATEGORIE")
    private Integer idcategorie;
    @Size(max = 20)
    @Column(name = "COULEUR")
    private String couleur;
    @OneToMany(mappedBy = "idcategorie")
    private Collection<Article> articleCollection;
    @OneToMany(mappedBy = "idcategorie")
    private Collection<Reduction> reductionCollection;
    @OneToMany(mappedBy = "idcategorie")
    private Collection<Denominationcat> denominationcatCollection;

    public Categorie() {
    }

    public Categorie(Integer idcategorie) {
        this.idcategorie = idcategorie;
    }

    public Integer getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Integer idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @XmlTransient
    public Collection<Article> getArticleCollection() {
        return articleCollection;
    }

    public void setArticleCollection(Collection<Article> articleCollection) {
        this.articleCollection = articleCollection;
    }

    @XmlTransient
    public Collection<Reduction> getReductionCollection() {
        return reductionCollection;
    }

    public void setReductionCollection(Collection<Reduction> reductionCollection) {
        this.reductionCollection = reductionCollection;
    }

    @XmlTransient
    public Collection<Denominationcat> getDenominationcatCollection() {
        return denominationcatCollection;
    }

    public void setDenominationcatCollection(Collection<Denominationcat> denominationcatCollection) {
        this.denominationcatCollection = denominationcatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategorie != null ? idcategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.idcategorie == null && other.idcategorie != null) || (this.idcategorie != null && !this.idcategorie.equals(other.idcategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.Categorie[ idcategorie=" + idcategorie + " ]";
    }
    
}
