package br.tec.db.tests.contract;

import br.tec.db.tests.client.ViaCepClient;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ViaCepContractTest {
    private final ViaCepClient viaCepClient = new ViaCepClient();

    @Test
    @DisplayName("Validar contrato de endereço com CEP válido")
    public void testValidCepContract() {
        var cep = "94135350";

        viaCepClient.getViaCep(cep)
                .then()
                    .log().body()
                    .assertThat().statusCode(HttpStatus.SC_OK)
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/valid-cep.json"))
                ;
    }

    @Test
    @DisplayName("Validar contrato de endereço com CEP inválido")
    public void testInvalidCepContract() {
        var cep = "94135351";

        viaCepClient.getViaCep(cep)
                .then()
                    .log().body()
                    .assertThat().statusCode(HttpStatus.SC_OK) // OBS.: má prática retornar 200, deveria ser 404
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/error-response.json"))
                ;
    }
}
