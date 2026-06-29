package entity;

@Entity
@Getter
@Setter
public class Pedido {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private Cliente cliente;


    @ManyToOne
    private Unidade unidade;


    @Enumerated(EnumType.STRING)
    private CanalPedido canalPedido;


    @Enumerated(EnumType.STRING)
    private StatusPedido status;


    private Double valorTotal;

    @GetMapping
    public List<Pedido> buscar(
            @RequestParam(required=false)
            CanalPedido canalPedido){


        if(canalPedido != null){

            return repository
                    .findByCanalPedido(canalPedido);

        }


        return repository.findAll();

    }
}
