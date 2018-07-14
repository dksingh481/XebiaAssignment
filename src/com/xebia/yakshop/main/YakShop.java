package com.xebia.yakshop.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.xebia.yakshop.model.Herd;
import com.xebia.yakshop.model.LabYak;
import com.xebia.yakshop.parser.ParserFactory;
import com.xebia.yakshop.service.IService;
import com.xebia.yakshop.service.ServiceImpl;
import com.xebia.yakshop.util.Util;

public class YakShop {
	public static void main(String args[]) throws IOException{
		InputStream ins=null;
		try {
			if(args.length<2) {
				throw new IllegalArgumentException("Invalid number of arguments, Use: java YakShop 'file path' 'number of days'");
			}
			ins=new FileInputStream(new File(args[0]));
			if(!Util.isNumeric(args[1])) {
				throw new NumberFormatException("Second argument should be numeric");
			}
			Integer T=Integer.parseInt(args[1]);
			Herd herd=ParserFactory.getXMLParser().parse(ins);
			IService service=new ServiceImpl();
			System.out.println("In Stock:");
			System.out.printf("%10.3f liters of milk\n", service.getMilkProduction(herd, T));
			System.out.printf("%10d skins of wool\n", service.getSkinOfWool(herd, T));
			System.out.println("Herd:");
			for(LabYak labyak:herd.getLabYaks()) {
				System.out.printf("%10s %.2f years old \n", labyak.getName(),service.getYakFutureAge(labyak, T));
			}
		}catch(IllegalArgumentException exp) {
			exp.printStackTrace();
			System.out.println("\nSample: java YakShop herd.xml 13");
		}catch(FileNotFoundException exp) {
			exp.printStackTrace();
		}catch(Exception exp) {
			exp.printStackTrace();
		}finally {
			if(ins!=null) {
				ins.close();
			}
		}
	}
}
