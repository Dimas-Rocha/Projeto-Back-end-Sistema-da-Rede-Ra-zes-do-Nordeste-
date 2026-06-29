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


}
