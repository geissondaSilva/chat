package br.geisson.chat.chat.messaging;

import br.geisson.chat.chat.features.mensagem.Mensagem;
import br.geisson.chat.chat.features.mensagem.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @Autowired
    private MensagemRepository repository;

    @MessageMapping("send")
    @SendTo("message/received")
    public Mensagem send(Mensagem message) {
        repository.save(message);
        return message;
    }
}
