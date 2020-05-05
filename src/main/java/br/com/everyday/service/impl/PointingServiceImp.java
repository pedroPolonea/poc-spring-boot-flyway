package br.com.everyday.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everyday.entity.Pointing;
import br.com.everyday.repository.PointingRepository;
import br.com.everyday.service.PointingService;

@Service
public class PointingServiceImp implements PointingService{

	@Autowired
	private PointingRepository pointingRepository;
	
	public List<Pointing> getAll() {
		return pointingRepository.findAll();
	}

}
