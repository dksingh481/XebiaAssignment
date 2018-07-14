package com.xebia.yakshop.parser;

import java.io.InputStream;

import javax.xml.bind.JAXBException;

import com.xebia.yakshop.model.Herd;

public interface Parser {
	public Herd parse(InputStream ins) throws JAXBException;
}
