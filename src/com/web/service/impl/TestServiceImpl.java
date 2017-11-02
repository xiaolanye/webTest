package com.web.service.impl;

import org.springframework.stereotype.Service;

import com.web.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {
	
	/* (non-Javadoc)
	 * @see com.web.service.impl.ITestService#dotest()
	 */
	@Override
	public void doTest(){
		System.out.println("------doTest-----");
	}
}
