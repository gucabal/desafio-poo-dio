package br.com.bootCamp;

import br.com.bootCamp.Atividades;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BootCampApplication {

	public static void main(String[] args) {
		Atividades atividade1 = new Atividades();
		atividade1.setTitulo("Curso Java");
		atividade1.setDescricao("Curso sobre java e desenvolvimento orientada a objetos");
		atividade1.setCargaHoraria(50);

		Atividades atividade2 = new Atividades();
		atividade2.setTitulo("Curso Js");
		atividade2.setDescricao("Curso sobre Js");
		atividade2.setCargaHoraria(15);

		Mentorias mentoria = new Mentorias();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Mentoria para desenvolvedores iniciantes");
		mentoria.setDataDaMentoria(LocalDate.now());

		System.out.println(atividade1);
		System.out.println(atividade2);
		System.out.println(mentoria);

		SpringApplication.run(BootCampApplication.class, args);
	}



}
