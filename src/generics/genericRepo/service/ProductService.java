package generics.genericRepo.service;

import generics.genericRepo.model.Product;
import generics.genericRepo.repository.Repository;

public class ProductService {
    private final Repository <Product> productRepository;

    public ProductService(Repository<Product> productRepository) {
        this.productRepository = productRepository;
    }


    public void createProduct (Long id, String name, double price) {
        Product product = new Product(id, name, price);
        productRepository.save(product);
    }

    public Product getProduct (Long id) {
        return productRepository.findById(id);
    }

    public void deleteProduct (Long id) {
        productRepository.delete(id);
    }
}
