package br.com.cod3r.adapter.hexagonal.core.usecases;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;

import java.util.List;

public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  public void createUser(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void saveUser(User newUser) {
    boolean alreadyUsedEmail = userRepository.getAll().stream()
            .anyMatch(user -> user
                    .getEmail()
                    .equalsIgnoreCase(user.getEmail()));
    if(alreadyUsedEmail){
      throw new IllegalArgumentException("Email already used");
    }
    userRepository.save(newUser);
  }

  public List<User> getUsers() {
    return userRepository.getAll();
  }

}
