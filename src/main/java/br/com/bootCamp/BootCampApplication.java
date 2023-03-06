package br.com.bootCamp;

import br.com.bootCamp.Atividades;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BootCampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCampApplication.class, args);

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

		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("BootCamp Java POO");
		bootCamp.setDescricao("BootCampo voltado ao POO");
		bootCamp.getConteudos().add(atividade1);
		bootCamp.getConteudos().add(atividade2);
		bootCamp.getConteudos().add(mentoria);

		System.out.println("-------------------------------");

		Devs devGustavo = new Devs();
		devGustavo.setNome("Gustavo");
		devGustavo.inscreverBootCamp(bootCamp);
		System.out.println("Conteúdos inscritos Gustavo:" + devGustavo.getConteudosInscritos());
		System.out.println("-");
		devGustavo.progredir();
		System.out.println("Conteúdos inscritos Gustavo:" + devGustavo.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Gustavo:" + devGustavo.getConteudosConcluidos());
		System.out.println("XP:" + devGustavo.calcularTotalXp());
		System.out.println("-");
		devGustavo.progredir();
		System.out.println("Conteúdos inscritos Gustavo:" + devGustavo.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Gustavo:" + devGustavo.getConteudosConcluidos());
		System.out.println("XP:" + devGustavo.calcularTotalXp());

		System.out.println("-------------------------------");

		Devs devGabriel = new Devs();
		devGabriel.setNome("Gabriel");
		devGabriel.inscreverBootCamp(bootCamp);
		System.out.println("Conteúdos inscritos Gabriel:" + devGabriel.getConteudosInscritos());
		devGabriel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Gabriel:" + devGabriel.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Gabriel:" + devGabriel.getConteudosConcluidos());
		System.out.println("XP:" + devGabriel.calcularTotalXp());

		System.out.println("-------------------------------");



	}



}
