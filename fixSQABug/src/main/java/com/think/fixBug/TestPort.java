package com.think.fixBug;

import java.util.ArrayList;
import java.util.List;

public class TestPort {

	public static void main(String[] args) {

		List<Port> ports = new ArrayList<>();
		Port port1 = new Port();
		Port port2 = new Port();
		Port port3 = new Port();
		port1.setVirtual(true);
		port1.setPortName("virtualport");
		port2.setVirtual(false);
		port2.setPortName("physicalport");
		port3.setVirtual(false);
		port3.setPortName("test");
		ports.add(port1);
		ports.add(port2);
		ports.add(port3);

		ports.stream().filter(port -> !port.isVirtual()).filter(port -> port.getPortName().equals("test"))
			.forEach(p -> System.out.println(p.getPortName()));


	}

}
