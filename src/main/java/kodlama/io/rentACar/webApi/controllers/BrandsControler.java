package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entitties.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsControler {

    private BrandService brandService;

    public BrandsControler(BrandService brandService) {
        super();
        this.brandService = brandService;
    }
    @GetMapping("getAll")   //postman swagger nedir

    public List<Brand> getall(){
        return brandService.getAll();

    }
}
