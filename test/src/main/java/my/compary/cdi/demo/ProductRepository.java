package my.compary.cdi.demo;

import java.util.Optional;

public interface ProductRepository {

    void save(Product product);

    Optional<Product> findById(Long id);

    boolean hasStock(Long id);
}
