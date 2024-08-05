package br.tec.db.tests.functional;

import br.tec.db.tests.client.ViaCepClient;
import br.tec.db.tests.model.ViaCep;
import br.tec.db.tests.model.responses.ErrorResponse;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ViaCepFunctionalTest {
    private final ViaCepClient viaCepClient = new ViaCepClient();

    @Test
    @DisplayName("Validar contrato de endereço com CEP válido")
    public void testValidCep() {
        var cep = "94135350";

        ViaCep viaCep = viaCepClient.getViaCep(cep)
                .then()
                    .log().body()
                    .assertThat().statusCode(HttpStatus.SC_OK)
                    .extract().as(ViaCep.class)
                ;

        Assertions.assertAll(
                () -> Assertions.assertEquals("94135-350", viaCep.getCep()),
                () -> Assertions.assertEquals("Rua São Jerônimo", viaCep.getLogradouro()),
                () -> Assertions.assertEquals("", viaCep.getComplemento()),
                () -> Assertions.assertEquals("", viaCep.getUnidade()),
                () -> Assertions.assertEquals("Bom Sucesso", viaCep.getBairro()),
                () -> Assertions.assertEquals("Gravataí", viaCep.getLocalidade()),
                () -> Assertions.assertEquals("RS", viaCep.getUf()),
                () -> Assertions.assertEquals("4309209", viaCep.getIbge()),
                () -> Assertions.assertEquals("", viaCep.getGia()),
                () -> Assertions.assertEquals("51", viaCep.getDdd()),
                () -> Assertions.assertEquals("8683", viaCep.getSiafi())
        );
    }

    @Test
    @DisplayName("Validar contrato de endereço com CEP inválido")
    public void testInvalidCep() {
        var cep = "94135351";

        ErrorResponse erroResponse = viaCepClient.getViaCep(cep)
                .then()
                    .log().body()
                    .assertThat().statusCode(HttpStatus.SC_OK) // OBS.: má prática retornar 200, deveria ser 404
                    .extract().as(ErrorResponse.class)
                ;

        Assertions.assertEquals("true", erroResponse.getErro());
    }
}
