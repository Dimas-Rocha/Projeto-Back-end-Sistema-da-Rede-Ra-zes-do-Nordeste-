package entity;

@Entity
@Getter
@Setter
public class Produto {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    private String nome;


    private String descricao;


    private Double preco;


    private Boolean sazonal;


    private Boolean ativo=true;


}