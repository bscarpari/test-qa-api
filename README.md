<a name="readme-top"></a>

# Desafio Técnico - API - QA

![Intellij](https://img.shields.io/badge/Intellij-logo?style=flat-square&color=%23000000)
![Java](https://img.shields.io/badge/JAVA_17-logo?style=flat-square&color=%23FF7800)
![RestAssured](https://img.shields.io/badge/RestAssured-logo?style=flat-square&color=%234EA94B)
![Junit](https://img.shields.io/badge/Junit-logo?style=flat-square&color=%2314692E)
![Lombok](https://img.shields.io/badge/Lombok-logo?style=flat-square&color=grey)

Este projeto consiste em um desafio técnico para demonstrar conhecimentos acerca de Automação de Testes em API. A API de
exemplo a ser utilizada é [ViaCEP](https://viacep.com.br/ws/CEP/json).

## Rodar o projeto localmente

1. Clone o repositorio

```ssh
git clone https://github.com/bscarpari/test-qa-api.git
```

2. Entre na pasta criada

```ssh
cd test-qa-api
``` 

3. Abra o projeto na IDE IntelliJ

4. Certifique de configurar o SDK do projeto para Java 17

```text
File > Project Structure > Project > Project SDK > 17
```

5. Crie um arquivo chamado `application.properties` na pasta `src/main/resources` e adicione este exato trecho de
   código:

```properties
BASE_URL=https://viacep.com.br
```

5. Para rodar todos os testes de uma só vez:

```text
a. Acesse a dependência lateral direita escrita "Maven"
b. Abra o Lifecycle
c. Execute o comando "test"
```

## Responsável

<table>
    <tr>
      <td align="center">
        <a href="https://github.com/bscarpari">
          <img src="https://avatars.githubusercontent.com/u/53575457?v=4" width="100px;" /><br>
          <sub>
            <b>Bruno Scarpari</b>
          </sub>
        </a>
      </td>
    </tr>
</table>

## Cobertura de testes

- [X] Cenário 1: Cep Válido
- [X] Cenário 2: Cep Inválido

## Licença

[MIT](https://choosealicense.com/licenses/mit/)

<p align="right">(<a href="#readme-top">voltar para o topo</a>)</p>
