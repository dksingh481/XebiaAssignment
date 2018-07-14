package com.xebia.yakshop.service;

import com.xebia.yakshop.model.Herd;
import com.xebia.yakshop.model.LabYak;

public class ServiceImpl implements IService {

	@Override
	public Double getMilkProduction(Herd herd, Integer T) {
		Double milk=0.0;
		for(LabYak labyak:herd.getLabYaks()) {
			if(labyak.getSex().equalsIgnoreCase("f")) {
				long futureAge=Math.round(getYakFutureAge(labyak,T)*100);
				long currentAge=Math.round(labyak.getAge()*100);
				for(long i=currentAge;i<futureAge;i++) {
					milk=milk+(50-i*0.03);
				}
			}			
		}		
		return milk;
	}

	@Override
	public Integer getSkinOfWool(Herd herd, Integer T) {
		Integer skin=0;
		for(LabYak labyak:herd.getLabYaks()) {
			long currentAge=Math.round(labyak.getAge()*100);
			if(currentAge>100) {
				skin++;
				long futureAge=Math.round(getYakFutureAge(labyak,T)*100);
				long dayForSkin=Math.round(8+currentAge*0.01);
				while(currentAge+dayForSkin+1<futureAge) {
					currentAge=currentAge+dayForSkin;
					skin++;
				}
			}			
		}
		return skin;
	}

	@Override
	public Double getYakFutureAge(LabYak labyak, Integer T) {
		Double age=0.0;
		age=(labyak.getAge()*100+T)/100;
		if(age>10.0) {
			return 10.0;
		}
		return age;
	}
}
