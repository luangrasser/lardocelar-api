package br.com.jlsolutions.lardocelarapi.service;

import br.com.jlsolutions.lardocelarapi.dao.ProdutoRepository;
import br.com.jlsolutions.lardocelarapi.form.ProdutoForm;
import br.com.jlsolutions.lardocelarapi.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(ProdutoForm form) {
        Produto produto = form.transform();
        return repository.save(produto);
    }

    public List<Produto> pesquisar(String chave) {
        return repository.findAllByNomeContains(chave);
    }

    public void excluir(Integer id) throws Exception {
        Produto produto = repository.findById(id).orElse(null);
        if (produto == null) {
            throw new Exception("Produto não encontrado.");
        }
        repository.delete(produto);
    }
}
