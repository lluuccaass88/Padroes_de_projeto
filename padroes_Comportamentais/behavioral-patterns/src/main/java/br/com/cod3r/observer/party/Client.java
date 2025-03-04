package br.com.cod3r.observer.party;

import br.com.cod3r.observer.party.observer.Friend;
import br.com.cod3r.observer.party.observer.Wife;
import br.com.cod3r.observer.party.subject.Doorman;

public class Client {

	public static void main(String[] args) {
    Doorman doorman = new Doorman();
    doorman.add(new Wife());
    doorman.add(new Friend());

    System.out.println("Husband is comming");
    doorman.setStatus(true);
	}
}
