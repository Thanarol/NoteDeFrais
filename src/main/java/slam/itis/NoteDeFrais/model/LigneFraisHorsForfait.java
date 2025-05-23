package slam.itis.NoteDeFrais.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LigneFraisHorsForfait {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Double montant;
    private String libelle;

    // Relation avec FicheFrais (ManyToOne : plusieurs lignes hors forfait pour une fiche)
    @ManyToOne
    @JoinColumn(name = "fiche_frais_id", nullable = false) // Clé étrangère
    @JsonBackReference // Ajouté pour éviter la boucle infinie lors de la sérialisation
    private FicheFrais ficheFrais;

    // Constructeurs
    public LigneFraisHorsForfait(FicheFrais ficheFrais, LocalDate date, Double montant, String libelle) {
        this.ficheFrais = ficheFrais;
        this.date = date;
        this.montant = montant;
        this.libelle = libelle;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FicheFrais getFicheFrais() {
        return ficheFrais;
    }

    public void setFicheFrais(FicheFrais ficheFrais) {
        this.ficheFrais = ficheFrais;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}