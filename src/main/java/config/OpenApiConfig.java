package config;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Raízes do Nordeste API")
                        .version("1.0.0")
                        .description("API REST para gerenciamento da rede de franquias Raízes do Nordeste.")
                        .contact(new Contact()
                                .name("Equipe Back-end")
                                .email("contato@raizes.com"))
                        .license(new License()
                                .name("MIT")));
    }

}
