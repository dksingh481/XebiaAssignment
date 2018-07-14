package com.xebia.yakshop.parser;

public class ParserFactory {
	public static Parser getXMLParser() {
		return new XMLParser();
	}
}
