/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author François
 */
@Entity
@Table(name = "ARTICLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a"),
    @NamedQuery(name = "Article.findByIdarticle", query = "SELECT a FROM Article a WHERE a.idarticle = :idarticle"),
    @NamedQuery(name = "Article.findByPrix", query = "SELECT a FROM Article a WHERE a.prix = :prix"),
    @NamedQuery(name = "Article.findByPoids", query = "SELECT a FROM Article a WHERE a.poids = :poids"),
    @NamedQuery(name = "Article.findByHauteur", query = "SELECT a FROM Article a WHERE a.hauteur = :hauteur"),
    @NamedQuery(name = "Article.findByLargeur", query = "SELECT a FROM Article a WHERE a.largeur = :largeur"),
    @NamedQuery(name = "Article.findByProfondeur", query = "SELECT a FROM Article a WHERE a.profondeur = :profondeur"),
    @NamedQuery(name = "Article.findByPhoto", query = "SELECT a FROM Article a WHERE a.photo = :photo")})
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDARTICLE")
    private Integer idarticle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRIX")
    private BigDecimal prix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POIDS")
    private BigDecimal poids;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HAUTEUR")
    private BigDecimal hauteur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LARGEUR")
    private BigDecimal largeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROFONDEUR")
    private BigDecimal profondeur;
    @Size(max = 30)
    @Column(name = "PHOTO")
    private String photo;
    @JoinColumn(name = "IDCATEGORIE", referencedColumnName = "IDCATEGORIE")
    @ManyToOne
    private Categorie idcategorie;
    @OneToMany(mappedBy = "idarticle")
    private Collection<Description> descriptionCollection;
    @OneToMany(mappedBy = "idarticle")
    private Collection<ComArt> comArtCollection;

    public Article() {
    }

    public Article(Integer idarticle) {
        this.idarticle = idarticle;
    }

    public Article(Integer idarticle, BigDecimal prix, BigDecimal poids, BigDecimal hauteur, BigDecimal largeur, BigDecimal profondeur) {
        this.idarticle = idarticle;
        this.prix = prix;
        this.poids = poids;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.profondeur = profondeur;
    }

    public Integer getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(Integer idarticle) {
        this.idarticle = idarticle;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public BigDecimal getHauteur() {
        return hauteur;
    }

    public void setHauteur(BigDecimal hauteur) {
        this.hauteur = hauteur;
    }

    public BigDecimal getLargeur() {
        return largeur;
    }

    public void setLargeur(BigDecimal largeur) {
        this.largeur = largeur;
    }

    public BigDecimal getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(BigDecimal profondeur) {
        this.profondeur = profondeur;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Categorie getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Categorie idcategorie) {
        this.idcategorie = idcategorie;
    }

    @XmlTransient
    public Collection<Description> getDescriptionCollection() {
        return descriptionCollection;
    }

    public void setDescriptionCollection(Collection<Description> descriptionCollection) {
        this.descriptionCollection = descriptionCollection;
    }

    @XmlTransient
    public Collection<ComArt> getComArtCollection() {
        return comArtCollection;
    }

    public void setComArtCollection(Collection<ComArt> comArtCollection) {
        this.comArtCollection = comArtCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarticle != null ? idarticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.idarticle == null && other.idarticle != null) || (this.idarticle != null && !this.idarticle.equals(other.idarticle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.Article[ idarticle=" + idarticle + " ]";
    }
    
}
