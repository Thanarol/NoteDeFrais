package slam.itis.NoteDeFrais.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FraisForfait {

    @Id
    private String id;

    private String libelle;
    private Double montant;

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}