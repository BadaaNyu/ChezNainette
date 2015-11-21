/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPackage;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author François
 */
@Entity
@Table(name = "DESCRIPTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Description.findAll", query = "SELECT d FROM Description d"),
    @NamedQuery(name = "Description.findByIddescription", query = "SELECT d FROM Description d WHERE d.iddescription = :iddescription"),
    @NamedQuery(name = "Description.findByDescription", query = "SELECT d FROM Description d WHERE d.description = :description"),
    @NamedQuery(name = "Description.findByDenom", query = "SELECT d FROM Description d WHERE d.denom = :denom")})
public class Description implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDESCRIPTION")
    private Integer iddescription;
    @Size(max = 150)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DENOM")
    private String denom;
    @JoinColumn(name = "IDARTICLE", referencedColumnName = "IDARTICLE")
    @ManyToOne
    private Article idarticle;
    @JoinColumn(name = "IDLANGUE", referencedColumnName = "IDLANGUE")
    @ManyToOne
    private Langue idlangue;

    public Description() {
    }

    public Description(Integer iddescription) {
        this.iddescription = iddescription;
    }

    public Description(Integer iddescription, String denom) {
        this.iddescription = iddescription;
        this.denom = denom;
    }

    public Integer getIddescription() {
        return iddescription;
    }

    public void setIddescription(Integer iddescription) {
        this.iddescription = iddescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public Article getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(Article idarticle) {
        this.idarticle = idarticle;
    }

    public Langue getIdlangue() {
        return idlangue;
    }

    public void setIdlangue(Langue idlangue) {
        this.idlangue = idlangue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddescription != null ? iddescription.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Description)) {
            return false;
        }
        Description other = (Description) object;
        if ((this.iddescription == null && other.iddescription != null) || (this.iddescription != null && !this.iddescription.equals(other.iddescription))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.Description[ iddescription=" + iddescription + " ]";
    }
    
}
