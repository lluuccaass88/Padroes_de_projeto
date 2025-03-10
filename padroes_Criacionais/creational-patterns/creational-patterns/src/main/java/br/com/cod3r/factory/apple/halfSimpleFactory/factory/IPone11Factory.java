package br.com.cod3r.factory.apple.halfSimpleFactory.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class IPone11Factory extends IPhoneFactory {
  public IPhone createIPhone(String level) {
    if(level.equals("standard")) {
      return new IPhone11();
    } else if(level.equals("highEnd")) {
      return new IPhone11Pro();
    } else return null;
  }
}
