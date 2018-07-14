package com.xebia.yakshop.parser;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.xebia.yakshop.model.Herd;

public class XMLParser implements Parser{
	private Herd herd;
	@Override
	public Herd parse(InputStream ins) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Herd.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        herd = (Herd) unmarshaller.unmarshal(ins);
		return herd;
	}
}
