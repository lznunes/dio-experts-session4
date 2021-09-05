package dio.experts.productcatalog.controller;


import dio.experts.productcatalog.model.Product;
import dio.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findbyid(@PathVariable Integer id ){
        return  productRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    Iterable<Product> findall(){
        return productRepository.findAll();
    }


}
