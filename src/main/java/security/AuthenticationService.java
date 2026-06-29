package security;


import dto.LoginRequest;
import dto.LoginResponse;
import entity.Usuario;
import repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UsuarioRepository repository;

    private final PasswordEncoder encoder;

    private final JwtService jwtService;

    public LoginResponse login(LoginRequest request) {

        Usuario usuario = repository.findByEmail(request.getEmail())

                .orElseThrow(() ->
                        new RuntimeException("Usuário não encontrado"));

        if (!encoder.matches(request.getSenha(),
                usuario.getSenha())) {

            throw new RuntimeException("Senha inválida");

        }

        String token =
                jwtService.generateToken(usuario);

        return new LoginResponse(token, "Bearer");

    }

}
