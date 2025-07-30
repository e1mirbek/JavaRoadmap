package tasks.registration.infrastructure;

// → реализация репозитория (Map)

import tasks.registration.domain.User;
import tasks.registration.domain.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 📘 Объяснение:
//  Мы сделали хранилище,
//  как будто это база данных.
//  Чистая архитектура позволяет заменить реализацию потом на Mongo, PostgreSQL и т.д.

public class InMemoryUserRepository implements UserRepository {


    private final Map <String, User> storage = new HashMap<>();


    @Override
    public boolean save(User user) {

        if (existsByEmail(user.getEmail())) return false;
        storage.put(user.getEmail(), user);
        return true;

    }

    @Override
    public boolean existsByEmail(String email) {
        return storage.containsKey(email);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storage.values());
    }

}
