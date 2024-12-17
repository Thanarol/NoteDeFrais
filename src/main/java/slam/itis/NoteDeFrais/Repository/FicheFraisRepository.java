package slam.itis.NoteDeFrais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.FicheFrais;

@Repository
public interface FicheFraisRepository extends JpaRepository<FicheFrais, FicheFrais> {
    List<FicheFrais> findByIdVisiteur(String idVisiteur);
}