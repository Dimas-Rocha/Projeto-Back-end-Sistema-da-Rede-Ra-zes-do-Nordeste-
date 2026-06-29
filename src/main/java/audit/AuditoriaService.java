package audit;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuditoriaService {


    private final AuditoriaRepository repository;



    public void registrar(
            String usuario,
            String acao){



        Auditoria a =
                new Auditoria();


        a.setUsuario(usuario);

        a.setAcao(acao);

        a.setDataHora(
                LocalDateTime.now()
        );



        repository.save(a);



    }


}
