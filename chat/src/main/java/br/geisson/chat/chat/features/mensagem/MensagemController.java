package br.geisson.chat.chat.features.mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mensagem")
public class MensagemController {

    @Autowired
    private MensagemRepository repository;

    @PostMapping
    public ResponseEntity<Mensagem> enviar(@RequestBody Mensagem mensagem) {
        return ResponseEntity.ok(repository.save(mensagem));
    }

    @GetMapping()
    public ResponseEntity<List<Mensagem>> findMessage(@RequestParam("pessoa") Integer pessoa,
                                                      @RequestParam("amigo") Integer amigo) {
        return ResponseEntity.ok(repository.findMessages(pessoa, amigo));
    }
}
