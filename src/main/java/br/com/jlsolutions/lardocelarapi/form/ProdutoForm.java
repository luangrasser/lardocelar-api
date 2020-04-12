package br.com.jlsolutions.lardocelarapi.form;

import br.com.jlsolutions.lardocelarapi.model.Categoria;
import br.com.jlsolutions.lardocelarapi.model.Produto;
import br.com.jlsolutions.lardocelarapi.model.TipoUnidade;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProdutoForm {

    private Integer id;
    private String nome;
    private Double quantidade;
    private String tipoUnidade;
    private String categoria;

    public Produto transform() {
        return Produto.builder()
                .id(id)
                .nome(nome)
                .quantidade(quantidade)
                .tipoUnidade(TipoUnidade.valueOf(tipoUnidade))
                .categoria(Categoria.valueOf(categoria))
                .build();
    }
}
