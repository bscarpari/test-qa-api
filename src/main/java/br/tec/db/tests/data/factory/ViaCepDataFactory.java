package br.tec.db.tests.data.factory;

import br.tec.db.tests.model.ViaCep;
import br.tec.db.tests.utils.FakerUtils;

public class ViaCepDataFactory {
    private static FakerUtils fakerUtils = new FakerUtils();

    public static String cepValido() {
        return fakerUtils.faker.address().zipCode();
    }

    public static String cepInvalido() {
        return "00000000";
    }

    public static ViaCep viaCep(boolean wrongObject) {
        ViaCep viaCep = new ViaCep();

        if (!wrongObject) {
            viaCep.cep = fakerUtils.faker.address().zipCode();
            viaCep.logradouro = fakerUtils.faker.address().streetName();
            viaCep.complemento = fakerUtils.faker.address().secondaryAddress();
            viaCep.bairro = fakerUtils.faker.address().cityName();
            viaCep.localidade = fakerUtils.faker.address().city();
            viaCep.uf = fakerUtils.faker.address().stateAbbr();
            viaCep.ibge = fakerUtils.faker.number().digits(7);
            viaCep.gia = fakerUtils.faker.number().digits(7);
            viaCep.ddd = fakerUtils.faker.phoneNumber().cellPhone().substring(1, 3);
            viaCep.siafi = fakerUtils.faker.number().digits(4);
        }

        return viaCep;
    }
}
