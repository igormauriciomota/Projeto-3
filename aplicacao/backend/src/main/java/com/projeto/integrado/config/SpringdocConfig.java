package org.springframework.context.annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@Component
@Configurable
public class SpringdocConfig {
	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
              .info(new Info().title("API Restful Projeto Integrado")
              .description("Documentação do Projeto Integrado.")
              .version("2.5.0")
              .license(new License().name("Apache 2.5").url("https://springdoc.org/")))
              .externalDocs(new ExternalDocumentation()
              .description("Link do Repositório da Aplicação")
              .url("https://github.com/igormauriciomota/Projeto-3"));
	  }
}
