package br.tec.db.tests.specs;

import br.tec.db.tests.utils.Manipulation;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class InitialViaCepSpecs {
    private static final String BASE_URL = Manipulation.getProp().getProperty("BASE_URL");

    public static RequestSpecification setup() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .log(LogDetail.BODY)
                .setContentType(ContentType.JSON)
                .build();
    }
}
