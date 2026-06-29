package security;


import dto.LoginRequest;
import dto.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class AuthService {


    private final UsuarioRepository repository;

    private final PasswordEncoder encoder;

    private final JwtService jwt;



    public LoginResponse login(
            LoginRequest request){


        Usuario usuario =
                repository.findByEmail(
                                request.getEmail()
                        )

                        .orElseThrow(
                                ()-> new RuntimeException(
                                        "Usuário inválido"
                                )
                        );



        if(
                !encoder.matches(
                        request.getSenha(),
                        usuario.getSenha()
                )
        ){

            throw new RuntimeException(
                    "Senha incorreta"
            );

        }



        String token =
                jwt.gerarToken(
                        usuario.getEmail()
                );



        return new LoginResponse(
                token,
                "Bearer"
        );



    }


}
