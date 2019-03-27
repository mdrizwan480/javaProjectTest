package com.bb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:Fualtank.properties")
public class Fualtank {
	@Value("${fualtankNo}")
	protected int fualtankNo;
	@Value("${fualType}")
	protected String fualType;
	@Value("${capacity}")
	protected int capacity;
	
	public int getFualtankNo() {
		return fualtankNo;
	}

	public String getFualType() {
		return fualType;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "Fualtank [fualtankNo=" + fualtankNo + ", fualType=" + fualType + ", capacity=" + capacity + "]";
	}
	
	

}
