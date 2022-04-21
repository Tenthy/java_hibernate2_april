package ru.kmetha.hibernatemvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kmetha.hibernatemvc.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityManagerProductService {

    @Autowired
    private EntityManagerProduct entityManagerProduct;

    public List<Product> findAll() {
        return entityManagerProduct.findAll();
    }

    public Product findById(Long id) {
        return entityManagerProduct.findById(id);
    }

    public Product save(Product product) {
        return entityManagerProduct.save(product);
    }

    public void deleteById(Long id) {
        entityManagerProduct.deleteById(id);
    }
}
