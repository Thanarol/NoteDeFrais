package slam.itis.NoteDeFrais.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FicheFrais {

    @Id
    private String mois;

    @Id
    private String idVisiteur;

    @Column(name = "nb_justificatifs")
    private Integer nbJustificatifs;

    @Column(name = "montant_valide")
    private Double montantValide;

    @Column(name = "date_modif")
    private LocalDate dateModif;

    // Getters et Setters
    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getIdVisiteur() {
        return idVisiteur;
    }

    public void setIdVisiteur(String idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    public Integer getNbJustificatifs() {
        return nbJustificatifs;
    }

    public void setNbJustificatifs(Integer nbJustificatifs) {
        this.nbJustificatifs = nbJustificatifs;
    }

    public Double getMontantValide() {
        return montantValide;
    }

    public void setMontantValide(Double montantValide) {
        this.montantValide = montantValide;
    }

    public LocalDate getDateModif() {
        return dateModif;
    }

    public void setDateModif(LocalDate dateModif) {
        this.dateModif = dateModif;
    }
}
