package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository {
    private List <Product> productData = new ArrayList<>();

    public Product create (Product product) {
        productData.add(product);
        return product;
    }
    public Product findById(String productId) {
        for (Product product : productData) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        // Return null if product not found
        return null;
    }

    public Product update(Product updatedProduct) {
        for (Product product : productData) {
            if (product.getProductId().equals(updatedProduct.getProductId())) {
                // Update product attributes
                product.setProductName(updatedProduct.getProductName());
                product.setProductQuantity(updatedProduct.getProductQuantity());
                // Return updated product
                return product;
            }
        }
        // Return null if product not found
        return null;
    }

    public Product delete (String idProductDelete) {
        for (Product currentProduct : productData) {
            if (currentProduct.getProductId().equals(idProductDelete)) {
                productData.remove(currentProduct);
                return currentProduct;
            }
        }
        return null;
    }
    public Iterator <Product> findAll() {
        return productData.iterator();
    }
}