package br.com.everyday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everyday.entity.AppointedDay;

@Repository
public interface AppointedDayRepository extends JpaRepository<AppointedDay, Long>{

}
