package org.test;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean
@SessionScoped
public class Demo2 {

	private final Logger logger = Logger.getLogger(this.getClass());

	private long count;

	public long getCount() {
		logger.debug("getCount");
		return count;
	}

	public void setCount(long count) {
		logger.debug("setCount");
		this.count = count;
	}

	public String incrementCount() {
		logger.debug("incrementCount");
		count++;
		return "demo3";
	}

	@PostConstruct
	public void init() {
		logger.debug("init...");
		count = new Date().getTime();
	}
}
