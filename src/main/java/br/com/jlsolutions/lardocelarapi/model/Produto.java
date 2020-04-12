package br.com.jlsolutions.lardocelarapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public @Data class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private Double quantidade;
    private TipoUnidade tipoUnidade;
    private Categoria categoria;

}
