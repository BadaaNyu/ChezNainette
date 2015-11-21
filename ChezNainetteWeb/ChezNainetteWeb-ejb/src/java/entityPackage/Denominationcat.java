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
@Table(name = "DENOMINATIONCAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Denominationcat.findAll", query = "SELECT d FROM Denominationcat d"),
    @NamedQuery(name = "Denominationcat.findByIdLangue", query = "SELECT d FROM Denominationcat d "
            + "JOIN Categorie c on (d.idCategorie = c.idCategorie)"),
    @NamedQuery(name = "Denominationcat.findByIddenomination", query = "SELECT d FROM Denominationcat d WHERE d.iddenomination = :iddenomination"),
    @NamedQuery(name = "Denominationcat.findByDenom", query = "SELECT d FROM Denominationcat d WHERE d.denom = :denom")})
public class Denominationcat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDENOMINATION")
    private Integer iddenomination;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DENOM")
    private String denom;
    @JoinColumn(name = "IDCATEGORIE", referencedColumnName = "IDCATEGORIE")
    @ManyToOne
    private Categorie idcategorie;
    @JoinColumn(name = "IDLANGUE", referencedColumnName = "IDLANGUE")
    @ManyToOne
    private Langue idlangue;

    public Denominationcat() {
    }

    public Denominationcat(Integer iddenomination) {
        this.iddenomination = iddenomination;
    }

    public Denominationcat(Integer iddenomination, String denom) {
        this.iddenomination = iddenomination;
        this.denom = denom;
    }

    public Integer getIddenomination() {
        return iddenomination;
    }

    public void setIddenomination(Integer iddenomination) {
        this.iddenomination = iddenomination;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public Categorie getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Categorie idcategorie) {
        this.idcategorie = idcategorie;
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
        hash += (iddenomination != null ? iddenomination.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Denominationcat)) {
            return false;
        }
        Denominationcat other = (Denominationcat) object;
        if ((this.iddenomination == null && other.iddenomination != null) || (this.iddenomination != null && !this.iddenomination.equals(other.iddenomination))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPackage.Denominationcat[ iddenomination=" + iddenomination + " ]";
    }
    
}
