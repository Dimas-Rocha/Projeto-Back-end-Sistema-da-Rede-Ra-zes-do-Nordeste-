package service;

@Service
public class FidelidadeService {



    public Integer gerarPontos(
            Double valor){


        return valor.intValue();

    }


}
