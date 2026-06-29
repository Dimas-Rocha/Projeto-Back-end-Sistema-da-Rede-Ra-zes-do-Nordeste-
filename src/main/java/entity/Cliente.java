package entity;

@Entity
@Getter
@Setter
public class Cliente {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    private Usuario usuario;


    private String cpf;


    private String telefone;


}