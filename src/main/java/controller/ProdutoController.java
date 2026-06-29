package controller;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {


    private final ProdutoService service;



    @GetMapping
    public List<Produto> listar(){

        return service.listar();

    }



    @PostMapping
    public Produto criar(@RequestBody Produto produto){

        return service.salvar(produto);

    }


}
