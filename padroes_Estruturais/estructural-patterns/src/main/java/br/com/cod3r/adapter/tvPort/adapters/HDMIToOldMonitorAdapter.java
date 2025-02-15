package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

  public HDMIToOldMonitorAdapter() {
    super();
    System.out.println( "Conecting the HDMI/VGA adapter...");
  }

  @Override
  public void setImage(String image) {
    System.out.println("Converting the image from HDMI to VGA");
    super.setImage(image);
  }

    @Override
  public void setSound(String sound) {
      System.out.println("Don't sound here!");
  }
}
