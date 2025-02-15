package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class Client {

	public static void main(String[] args) {
    System.out.println("------ TV - HDMI ----------");

    Computer pc1 = new Computer();
		TV tvWithHDMI = new TV();
    pc1.connectPort(tvWithHDMI);
    pc1.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor - VGA ----------");
		
    Computer pc2 = new Computer();
    OldMonitor oldMonitorWithVGA = new OldMonitor();
    pc2.connectPort(new HDMIToVGAAdapter(oldMonitorWithVGA));
    pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor - VGA - Class Adapter ----------");

    Computer pc3 = new Computer();
    HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
    pc3.connectPort(monitorAdaptee);
    pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");

	}
}
