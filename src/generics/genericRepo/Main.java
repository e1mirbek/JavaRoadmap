package generics.genericRepo;

import generics.genericRepo.model.Product;
import generics.genericRepo.model.User;
import generics.genericRepo.repository.InMemoryRepository;
import generics.genericRepo.service.ProductService;
import generics.genericRepo.service.UserService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать !!! ");

        // Создаем репозиторий с конкретными типами

        InMemoryRepository <User> userInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository <Product> productInMemoryRepository = new InMemoryRepository<>();

        // Создаем сервисы

        UserService userService = new UserService(userInMemoryRepository);
        ProductService productService = new ProductService(productInMemoryRepository);

        // вывод

        System.out.println("=== Работа с пользователями ===");

        userService.createUser(1L, "Иван Иванов", "ivan@example.com");
        userService.createUser(2L, "Петр Петров", "petr@example.com");
        userService.getUser(1L);
        userService.getUser(2L);
        userService.deleteUser(1L);
        userService.getUser(1L);

        System.out.println("\\n=== Работа с продуктами ===");
        productService.createProduct(1L, "Ноутбук", 999.99);
        productService.createProduct(2L, "Смартфон", 499.99);
        productService.getProduct(1L);
        productService.getProduct(2L);
        productService.deleteProduct(2L);
        productService.getProduct(2L);
    }
}
