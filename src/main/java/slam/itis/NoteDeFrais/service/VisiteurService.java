package slam.itis.NoteDeFrais.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import slam.itis.NoteDeFrais.Repository.VisiteurRepository;
import slam.itis.NoteDeFrais.model.FicheFrais;
import slam.itis.NoteDeFrais.model.Visiteur;

@Service
public class VisiteurService {

    private final VisiteurRepository visiteurRepository;

    // ✅ Injection par constructeur (plus propre que @Autowired)
    public VisiteurService(VisiteurRepository visiteurRepository) {
        this.visiteurRepository = visiteurRepository;
    }

    public List<Visiteur> getAllVisiteurs() {
        return visiteurRepository.findAll();
    }

    public Optional<Visiteur> getVisiteurById(Long id) {
        return visiteurRepository.findById(id);
    }

    public Visiteur saveVisiteur(Visiteur visiteur) {
        return visiteurRepository.save(visiteur);
    }

    public void deleteVisiteur(Long id) {
        visiteurRepository.deleteById(id);
    }

    public Visiteur getVisiteurByLogin(String login) {
        return visiteurRepository.findByLogin(login);
    }

    public Visiteur getVisiteurByMdp(String mdp) {
        return visiteurRepository.findByMdp(mdp);
    }

    /* 
    public Map<String, Long> countVisiteursParRegion() {
        return visiteurRepository.findAll().stream()
                .collect(Collectors.groupingBy(Visiteur::getRegion, Collectors.counting()));
    }

    public Map<String, Double> totalFraisParRegion() {
        return visiteurRepository.findAll().stream()
            .collect(Collectors.groupingBy(
                Visiteur::getRegion, 
                Collectors.summingDouble(visiteur -> 
                    visiteur.getFichesFrais().stream()  // Utilisation de getFichesFrais au lieu de getFicheFrais
                        .mapToDouble(ficheFrais -> ficheFrais.getMontantValide())  // Correctement mapper les montants
                        .sum()  // Somme des montants des fiches de frais
                )
            ));
    }
    */
}
