package generics.genericRepo.service;

import generics.genericRepo.model.User;
import generics.genericRepo.repository.Repository;

public class UserService {

    private final Repository <User> userRepository;

    public UserService(Repository<User> userRepository) {
        this.userRepository = userRepository;
    }

    public  void createUser (Long id, String name, String email) {
        User user = new User(id, name, email);
        userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUser (Long id) {
        userRepository.delete(id);
    }
}
