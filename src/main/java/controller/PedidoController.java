package controller;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor

public class PedidoController {



    private final PedidoService service;



    @PostMapping

    public Pedido criar(
            @RequestBody PedidoRequest request){

        return service.criar(request);

    }



    @GetMapping

    public List<Pedido> listar(){

        return service.listar();

    }



}
