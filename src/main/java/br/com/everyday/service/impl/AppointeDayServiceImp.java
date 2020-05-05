package br.com.everyday.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everyday.entity.AppointedDay;
import br.com.everyday.repository.AppointedDayRepository;
import br.com.everyday.service.AppointedDayService;

@Service
public class AppointeDayServiceImp implements AppointedDayService {

	@Autowired
	private AppointedDayRepository appointedDayRepository;
	
	public List<AppointedDay> getAll() {
		return appointedDayRepository.findAll();
	}

}
