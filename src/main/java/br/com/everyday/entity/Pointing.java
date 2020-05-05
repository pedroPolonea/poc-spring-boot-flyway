package br.com.everyday.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="pointing")
public class Pointing {
	
	@Id
	@Column(name="idPointing", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="dtInput", nullable=false)
	private LocalDateTime dateInput;
	@Column(name="dtOut")
	private LocalDateTime dateOutput;
	@ManyToOne
	private AppointedDay appointedDay;
}

			