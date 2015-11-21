/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author François
 */
@Entity
@Table(name = "REDUCTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reduction.findAll", query = "SELECT r FROM Reduction r"),
    @NamedQuery(name = "Reduction.findByIdreduction", query = "SELECT r FROM Reduction r WHERE r.idreduction = :idreduction"),
    @NamedQuery(name = "Reduction.findByPourcentagereduc", query = "SELECT r FROM Reduction r WHERE r.pourcentagereduc = :pourcentagereduc"),
    @NamedQuery(name = "Reduction.findByDatedebut", query = "SELECT r FROM Reduction r WHERE r.datedebut = :datedebut"),
    @NamedQuery(name = "Reduction.findByDatefin", query = "SELECT r FROM Reduction r WHERE r.datefin = :datefin"),
    @NamedQuery(name = "Reduction.findByCodesecret", query = "SELECT r FROM Reduction r WHERE r.codesecret = :codesecret")})
public class Reduction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDREDUCTION")
    private Integer idreduction;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "POURCENTAGEREDUC")
    private BigDecimal pourcentagereduc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEDEBUT")
    @Temporal(TemporalType.DATE)
    private Date datedebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEFIN")
    @Temporal(TemporalType.DATE)
    private Date datefin;
    @Size(max = 20)
    @Column(name = "CODESECRET")
    private String codesecret;
    @JoinColumn(name = "IDCATEGORIE", referencedColumnName = "IDCATEGORIE")
    @ManyToOne
    private Categorie idcategorie;

    public Reduction() {
    }

    public Reduction(Integer idreduction) {
        this.idreduction = idreduction;
    }

    public Reduction(Integer idreduction, BigDecimal pourcentagereduc, Date datedebut, Date datefin) {
        this.idreduction = idreduction;
        this.pourcentagereduc = pourcentagereduc;
        this.datedebut = datedebut;
        this.datefin = datefin;
    }

    public Integer getIdreduction() {
        return idreduction;
    }

    public void setIdreduction(Integer idreduction) {
        this.idreduction = idreduction;
    }

    public BigDecimal getPourcentagereduc() {
        return pourcentagereduc;
    }

    public void setPourcentagereduc(BigDecimal pourcentagereduc) {
        this.pourcentagereduc = pourcentagereduc;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public String getCodesecret() {
        return codesecret;
    }

    public void setCodesecret(String codesecret) {
        this.codesecret = codesecret;
    }

    public Categorie getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Categorie idcategorie) {
        this.idcategorie = idcategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreduction != null ? idreduction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reduction)) {
            return false;
        }
        Reduction other = (Reduction) object;
        if ((this.idreduction == null && other.idreduction != null) || (this.idreduction != null && !this.idreduction.equals(other.idreduction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.Reduction[ idreduction=" + idreduction + " ]";
    }
    
}
