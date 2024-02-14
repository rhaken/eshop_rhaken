package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(String productId);
    Product update(Product product);
    Product create (Product product);
    Product delete(String idProductDelete);
}