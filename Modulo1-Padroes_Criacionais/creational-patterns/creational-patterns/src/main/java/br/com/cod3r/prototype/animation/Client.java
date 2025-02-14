package br.com.cod3r.prototype.animation;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.prototype.animation.model.Person;
import br.com.cod3r.prototype.animation.model.PersonSamples;

public class Client {
	private static List<Person> frames = new ArrayList<Person>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

  public static Person moveLeft(Person p) throws CloneNotSupportedException {
    Person person = (Person) p.clone();
    person.left();
    frames.add(person);
    return person;
  }

  public static Person moveRight(Person p) throws CloneNotSupportedException {
    Person person = (Person) p.clone();
    person.right();
    frames.add(person);
    return person;
  }

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
    PersonSamples samples = new PersonSamples();

    Person person = samples.get("stickMan");

    frames.add(person);
    person = moveLeft(person);
    person = moveLeft(person);
    person = moveLeft(person);
    person = moveLeft(person);
    person = moveLeft(person);
    person = moveRight(person);
    person = moveRight(person);
    person = moveRight(person);
    person = moveRight(person);
    person = moveRight(person);

    animate();
	}
}
