package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.entitties.concretes.Brand;

import java.util.List;

public interface BrandService { // is kurallari yazilacaq icine
    List<Brand> getAll();
}
