package br.tec.db.tests.data.provider;

import br.tec.db.tests.data.factory.ViaCepDataFactory;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ViaCepDataProvider {
    /**
     * Gera a massa de dados para o cadastro de um ENDEREÇO com valores válidos
     *
     * @return Stream<Arguments>
     */
    static Stream<Arguments> validViaCepDataProvider() {
        return Stream.of(
                Arguments.of(ViaCepDataFactory.cepValido()),
                Arguments.of(ViaCepDataFactory.viaCep(false))
        );
    }

    /**
     * Gera a massa de dados para o cadastro de um ENDEREÇO com valores válidos
     *
     * @return Stream<Arguments>
     */
    static Stream<Arguments> invalidViaCepDataProvider() {
        return Stream.of(
                Arguments.of(ViaCepDataFactory.cepValido()),
                Arguments.of(ViaCepDataFactory.viaCep(false))
        );
    }
}
