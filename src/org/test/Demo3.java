package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

@ManagedBean
@ViewScoped
public class Demo3 {

	private final Logger logger = Logger.getLogger(this.getClass());

	private long count;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public String incrementCount() {
		logger.debug("setCount");
		count++;
		return null;
	}

	// @PostConstruct
	// public void init() {
	// logger.debug("init...");
	// count = new Date().getTime();
	// }
}
