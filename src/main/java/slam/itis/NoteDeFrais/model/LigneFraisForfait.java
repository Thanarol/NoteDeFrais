package slam.itis.NoteDeFrais.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneFraisForfait {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idVisiteur;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idmois;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idFraisForfait;

    private Integer quantite;

    // Getters et Setters
    public String getIdVisiteur() {
        return idVisiteur;
    }

    public void setIdVisiteur(String idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    public String getMois() {
        return idmois;
    }

    public void setMois(String idmois) {
        this.idmois = idmois;
    }

    public String getIdFraisForfait() {
        return idFraisForfait;
    }

    public void setIdFraisForfait(String idFraisForfait) {
        this.idFraisForfait = idFraisForfait;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
}