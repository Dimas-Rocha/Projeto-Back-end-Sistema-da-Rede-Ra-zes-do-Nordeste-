package entity;

@Entity
@Getter
@Setter
public class Unidade {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    private String nome;


    private String cidade;


    private String estado;


    private String endereco;


}