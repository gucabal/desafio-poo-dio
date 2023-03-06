package br.com.bootCamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Mentorias {

    private String titulo;
    private String descricao;
    private LocalDate dataDaMentoria;


    private Double calcularXP(){
        return null;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataDaMentoria=" + dataDaMentoria +
                '}';
    }

}

