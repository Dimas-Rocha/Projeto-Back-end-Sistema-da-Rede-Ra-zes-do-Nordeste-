package service;

@Service
@RequiredArgsConstructor
public class EstoqueService {



    private final EstoqueRepository repository;



    public void validarEstoque(
            Long produto,
            Integer quantidade){


        Estoque estoque =
                repository.buscarProduto(produto);



        if(
                estoque.getQuantidade()
                        < quantidade
        ){

            throw new RuntimeException(
                    "Estoque insuficiente"
            );

        }

    }



    public void baixar(
            Long produto,
            Integer quantidade){

        Estoque estoque =
                repository.buscarProduto(produto);


        estoque.setQuantidade(
                estoque.getQuantidade()
                        - quantidade
        );


        repository.save(estoque);

    }


}
