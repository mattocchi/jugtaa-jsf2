package org.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;

@ManagedBean
@RequestScoped
public class Demo1 {

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
		return null;
	}

}
