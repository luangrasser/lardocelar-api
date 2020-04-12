package br.com.jlsolutions.lardocelarapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoUnidade {

    UN("Unidade"),
    KILO("Kg"),
    GRAMA("g");

    public String descricao;
}
