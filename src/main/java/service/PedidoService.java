package service;

@Service
@RequiredArgsConstructor
public class PedidoService {



    private final PedidoRepository pedidoRepository;


    private final EstoqueService estoqueService;



    public Pedido criar(
            PedidoRequest request){



        Pedido pedido = new Pedido();


        pedido.setCanalPedido(
                request.getCanalPedido()
        );


        pedido.setStatus(
                StatusPedido.RECEBIDO
        );



        for(
                ItemPedidoRequest item :
                request.getItens()
        ){


            estoqueService.validarEstoque(
                    item.getProdutoId(),
                    item.getQuantidade()
            );


            estoqueService.baixar(
                    item.getProdutoId(),
                    item.getQuantidade()
            );


        }



        return pedidoRepository.save(pedido);



    }

}
