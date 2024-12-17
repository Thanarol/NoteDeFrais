package slam.itis.NoteDeFrais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.LigneFraisForfait;

@Repository
public interface LigneFraisForfaitRepository extends JpaRepository<LigneFraisForfait, LigneFraisForfait> {
    List<LigneFraisForfait> findByIdIdVisiteur(String idVisiteur);
    List<LigneFraisForfait> findByIdIdMois(String idMois);
    List<LigneFraisForfait> findByIdIdFraisForfait(String idFraisForfait);
}
