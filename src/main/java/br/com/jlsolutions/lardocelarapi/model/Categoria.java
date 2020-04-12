package br.com.jlsolutions.lardocelarapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Categoria {

    ALIMENTACAO("Alimentação"),
    HORTIFRUTI("Hortifrúti"),
    HIGIENE("Higiene pessoal"),
    LIMPEZA("Limpeza"),
    FARMACIA("Farmácia");

    private String descricao;

}
