package slam.itis.NoteDeFrais.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import slam.itis.NoteDeFrais.Repository.LigneFraisForfaitRepository;
import slam.itis.NoteDeFrais.model.LigneFraisForfait;

@Service
public class LigneFraisForfaitService {

    @Autowired
    private LigneFraisForfaitRepository repository;

    public List<LigneFraisForfait> getAllLignes() {
        return repository.findAll();
    }

    public List<LigneFraisForfait> getLignesByVisiteur(String idVisiteur) {
        return repository.findByIdIdVisiteur(idVisiteur);
    }

    public List<LigneFraisForfait> getLignesByMois(String idMois) {
        return repository.findByIdIdMois(idMois);
    }

    public LigneFraisForfait saveLigne(LigneFraisForfait ligne) {
        return repository.save(ligne);
    }
}
