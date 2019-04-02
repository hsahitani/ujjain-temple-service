package com.ujjain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ujjain.entity.Temple;
import com.ujjain.repo.TempleRepository;
import com.ujjain.service.UjjainTempleService;

public class UjjainTempleServiceImpl implements UjjainTempleService {

	@Autowired
	private TempleRepository templeRepo;
	
	
	@Override
	public boolean addTemple(Temple temple) {
		Temple savedTemple = templeRepo.save(temple);
		return savedTemple != null;
	}

}
