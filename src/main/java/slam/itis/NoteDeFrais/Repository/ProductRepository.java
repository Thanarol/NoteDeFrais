package slam.itis.NoteDeFrais.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import slam.itis.NoteDeFrais.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByPriceLessThan(Double price);
    List<Product> findByDescriptionContaining(String keyword);
}
