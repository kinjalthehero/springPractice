package org.kinjal.project.springTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
    MobileProcessor cpu;
	
	public void getPhone () {
		System.out.println("Here is your Samsung phone");
		cpu.process();
	}
}
