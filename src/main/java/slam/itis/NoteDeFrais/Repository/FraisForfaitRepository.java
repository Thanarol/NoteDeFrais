package slam.itis.NoteDeFrais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.FraisForfait;

@Repository
public interface FraisForfaitRepository extends JpaRepository<FraisForfait, String> {
    List<FraisForfait> findByLibelle(String libelle);
    List<FraisForfait> findByLibelleContaining(String keyword);
    List<FraisForfait> findByMontantLessThanEqual(Double montant);
    List<FraisForfait> findByMontantGreaterThanEqual(Double montant);
}