package slam.itis.NoteDeFrais.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Visiteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String mdp;
    // rajouter un role

    // Relation avec FicheFrais
    @OneToMany(mappedBy = "visiteur", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FicheFrais> fichesFrais;

    // Constructeurs

    public Visiteur(){}

    public Visiteur( String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public List<FicheFrais> getFichesFrais() {
        return fichesFrais;
    }

    public void setFichesFrais(List<FicheFrais> fichesFrais) {
        this.fichesFrais = fichesFrais;
    }
}