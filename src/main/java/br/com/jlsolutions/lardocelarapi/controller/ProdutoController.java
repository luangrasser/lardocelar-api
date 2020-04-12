package br.com.jlsolutions.lardocelarapi.controller;

import br.com.jlsolutions.lardocelarapi.form.ProdutoForm;
import br.com.jlsolutions.lardocelarapi.service.ProdutoService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/produto")
@Api(description = "Controller para gerenciar os produtos da lista de compra")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(ProdutoForm form) {
        try {
            return ResponseEntity.ok(service.salvar(form));
        } catch (Exception e) {
            log.error("Falha ao salvar produto.");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/pesquisar")
    public ResponseEntity<?> pesquisar(@RequestParam(value = "chave") String chave) {
        try {
            return ResponseEntity.ok().body(service.pesquisar(chave));
        } catch (Exception e) {
            log.error("Falha ao salvar produto na lista.");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<?> excluir(@PathVariable(value = "id") Integer id) {
        try {
            service.excluir(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            log.error("Falha ao excluir produto.");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
