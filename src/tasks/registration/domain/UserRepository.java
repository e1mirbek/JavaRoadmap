package tasks.registration.domain;


// → интерфейс хранилища

import java.util.List;

public interface UserRepository {

    // договор методы

    boolean save (User user);
    boolean existsByEmail (String email);
    List <User> findAll();


}
