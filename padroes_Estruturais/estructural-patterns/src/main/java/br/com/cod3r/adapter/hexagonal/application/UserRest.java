package br.com.cod3r.adapter.hexagonal.application;

import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.Map;

public class UserRest {

  private UserService userService;

	public UserRest() {
    UserRepository userRepository = new UserMemoryDatabaseAdapter();
    this.userService = new UserService(userRepository);
	}

	public Integer post(Map<String, String> values) {
    
		return 201;
	}
	
	public Integer get() {
		return 200;
	}
}
