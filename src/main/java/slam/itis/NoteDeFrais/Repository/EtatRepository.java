package slam.itis.NoteDeFrais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.Etat;

@Repository
public interface EtatRepository extends JpaRepository<Etat, String> {
    List<Etat> findByLibelle(String libelle);
    List<Etat> findByLibelleContaining(String keyword);
}
