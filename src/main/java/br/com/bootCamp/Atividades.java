package br.com.bootCamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atividades {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    private Double calcularXP() {
        return null;
    }

    @Override
    public String toString() {
        return "Atividades{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
