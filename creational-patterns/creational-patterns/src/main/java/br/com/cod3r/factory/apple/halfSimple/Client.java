package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPone11Factory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
    IPhoneFactory iPhoneFactory11 = new IPone11Factory();
    IPhoneFactory iPhoneFactoryx = new IPhoneXFactory();

		System.out.println("### Ordering an iPhone X");
    IPhone iPhoneX = iPhoneFactoryx.orderIPhone("standard");

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
	  IPhone iPhone11 = iPhoneFactory11.orderIPhone("highEnd");

  }
}
