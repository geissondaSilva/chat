package br.geisson.chat.chat.features.mensagem;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mensagem")
@Getter
@Setter
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mensagem")
    @SequenceGenerator(name = "seq_mensagem", sequenceName = "seq_mensagem", allocationSize = 1)
    private Long id;

    private String texto;

    @Column(name = "idremetente")
    private Integer idRemetente;

    @Column(name = "iddestinatario")
    private Integer idDestinatario;

    @Column(name = "datahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    @PrePersist
    public void prePersist() {
        this.dataHora = new Date();
    }
}
