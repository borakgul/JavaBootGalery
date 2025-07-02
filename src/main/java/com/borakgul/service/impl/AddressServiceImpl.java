package com.borakgul.service.impl;

import org.springframework.stereotype.Service;

import com.borakgul.exception.BaseException;
import com.borakgul.exception.ErrorMessage;
import com.borakgul.exception.MessageType;
import com.borakgul.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {
 
	public void test() {

		throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,null));
	}
}
