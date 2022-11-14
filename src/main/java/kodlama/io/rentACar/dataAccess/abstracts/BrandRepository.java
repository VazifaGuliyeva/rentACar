package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entitties.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository {
   List<Brand> getAll(); //getAll i cagiran biri markalari listeleyir
}
