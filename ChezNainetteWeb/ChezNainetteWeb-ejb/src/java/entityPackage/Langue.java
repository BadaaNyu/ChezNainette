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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author François
 */
@Entity
@Table(name = "LANGUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Langue.findAll", query = "SELECT l FROM Langue l"),
    @NamedQuery(name = "Langue.findByIdlangue", query = "SELECT l FROM Langue l WHERE l.idlangue = :idlangue"),
    @NamedQuery(name = "Langue.findByDenom", query = "SELECT l FROM Langue l WHERE l.denom = :denom")})
public class Langue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDLANGUE")
    private Integer idlangue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DENOM")
    private String denom;
    @OneToMany(mappedBy = "idlangue")
    private Collection<Description> descriptionCollection;
    @OneToMany(mappedBy = "idlangue")
    private Collection<Denominationcat> denominationcatCollection;
    @OneToMany(mappedBy = "idlangue")
    private Collection<Client> clientCollection;

    public Langue() {
    }

    public Langue(Integer idlangue) {
        this.idlangue = idlangue;
    }

    public Langue(Integer idlangue, String denom) {
        this.idlangue = idlangue;
        this.denom = denom;
    }

    public Integer getIdlangue() {
        return idlangue;
    }

    public void setIdlangue(Integer idlangue) {
        this.idlangue = idlangue;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    @XmlTransient
    public Collection<Description> getDescriptionCollection() {
        return descriptionCollection;
    }

    public void setDescriptionCollection(Collection<Description> descriptionCollection) {
        this.descriptionCollection = descriptionCollection;
    }

    @XmlTransient
    public Collection<Denominationcat> getDenominationcatCollection() {
        return denominationcatCollection;
    }

    public void setDenominationcatCollection(Collection<Denominationcat> denominationcatCollection) {
        this.denominationcatCollection = denominationcatCollection;
    }

    @XmlTransient
    public Collection<Client> getClientCollection() {
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlangue != null ? idlangue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Langue)) {
            return false;
        }
        Langue other = (Langue) object;
        if ((this.idlangue == null && other.idlangue != null) || (this.idlangue != null && !this.idlangue.equals(other.idlangue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.Langue[ idlangue=" + idlangue + " ]";
    }
    
}
