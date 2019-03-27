package com.bb.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motor {
	@Autowired
	private Fualtank fualtank;
                 Syatem.out.println("new statement");
	@Override
	public String toString() {
		return "Motor [fualtank=" + fualtank + "]";
	}
}
