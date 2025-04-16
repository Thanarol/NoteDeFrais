package slam.itis.NoteDeFrais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.Visiteur;

@Repository
public interface VisiteurRepository extends JpaRepository<Visiteur, Long> {
    Visiteur findByLogin(String login);
    Visiteur findByMdp(String mdp);
  //  List<Visiteur> findByRegion(String region);

}


