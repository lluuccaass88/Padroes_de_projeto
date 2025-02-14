package br.com.cod3r.prototype.functionalCloneBuilder;

import br.com.cod3r.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);

    User cloneUser = user.cloneBuilder()
            .name("Lucas")
            .address(new Address("Padre Reus", 686))
            .build();

    User cloneUser2 = cloneUser.cloneBuilder()
            .age(90)
            .address(new Address("Joao Bertuzi", 2115))
            .build();

    User cloneUser3 = cloneUser.cloneBuilder()
            .age(01)
            .build();

    System.out.println(cloneUser);
    System.out.println(cloneUser2);
    System.out.println(cloneUser3);
	}
}