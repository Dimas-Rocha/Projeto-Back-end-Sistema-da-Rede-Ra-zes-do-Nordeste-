package audit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Auditoria {


    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private Long id;


    private String usuario;


    private String acao;


    private LocalDateTime dataHora;


    private String endpoint;


}
