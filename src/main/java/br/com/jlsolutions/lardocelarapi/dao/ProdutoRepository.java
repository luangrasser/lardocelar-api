package br.com.jlsolutions.lardocelarapi.dao;

import br.com.jlsolutions.lardocelarapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findAllByNomeContains(String chave);
}
