package br.tec.db.tests.client;

import br.tec.db.tests.specs.InitialViaCepSpecs;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ViaCepClient {
    private static final String PATH = "/ws/{BASE_CEP}/json";

    public Response getViaCep(String cep) {
        return
                given()
                        .spec(InitialViaCepSpecs.setup())
                .when()
                        .with()
                        .pathParam("BASE_CEP", cep)
                        .get(PATH)
                ;
    }
}


