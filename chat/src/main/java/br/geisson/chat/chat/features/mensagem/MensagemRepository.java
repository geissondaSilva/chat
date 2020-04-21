package br.geisson.chat.chat.features.mensagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

    @Query("select m from Mensagem m where (m.idRemetente = :id or m.idDestinatario = :id) " +
            " and (m.idRemetente = :amigo or m.idDestinatario = :amigo) " +
            " order by m.dataHora")
    public List<Mensagem> findMessages(@Param("id") Integer idPessoa, @Param("amigo") Integer amigo);
}
