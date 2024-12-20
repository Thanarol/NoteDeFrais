package slam.itis.NoteDeFrais.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.Visiteur;

@Repository
public interface VisiteurRepository extends JpaRepository<Visiteur, String> {
Optional<Visiteur> findByLogin(String login);
List<Visiteur> findByVille(String ville);
List<Visiteur> findByDateEmbaucheAfter(LocalDate date);
}
