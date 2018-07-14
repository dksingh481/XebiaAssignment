package com.xebia.yakshop.service;

import com.xebia.yakshop.model.Herd;
import com.xebia.yakshop.model.LabYak;

public interface IService {
	public Double getMilkProduction(Herd herd,Integer T);
	public Integer getSkinOfWool(Herd herd,Integer T);
	public Double getYakFutureAge(LabYak labyak,Integer T);
}
