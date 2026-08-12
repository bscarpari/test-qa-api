<a name="readme-top"></a>

<img alt="Header" width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=7B61FF&height=180&section=header&text=API%20Test%20Automation&fontSize=38&fontColor=ffffff&fontAlignY=32&desc=Java%2017%20%C2%B7%20REST%20Assured%20%C2%B7%20JUnit&descAlignY=52&descSize=16"/>

<h3 align="center">Automated API testing with Java, REST Assured and JUnit</h3>

<p align="center">
  <a href="https://www.linkedin.com/in/bscarpari/">
    <img alt="Made by" src="https://img.shields.io/badge/-Bruno%20Scarpari-blue?style=flat-square&logo=Linkedin&logoColor=white">
  </a>

  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/bscarpari/test-qa-api?style=flat-square">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/bscarpari/test-qa-api?style=flat-square">

  <a href="https://github.com/bscarpari/test-qa-api/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/bscarpari/test-qa-api?style=flat-square">
  </a>

  <img alt="License" src="https://img.shields.io/github/license/bscarpari/test-qa-api?style=flat-square">
</p>

<p align="center">
  <a href="#-about">About</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-coverage">Coverage</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-getting-started">Getting started</a>
</p>

---

## 🌐 About

Automated test suite for a public REST API, written in **Java 17** with **REST Assured** and **JUnit**.

The suite validates response status, payload structure and error handling against [ViaCEP](https://viacep.com.br/ws/CEP/json), a Brazilian postal-code lookup service. Environment configuration is externalized, so the base URL is never hardcoded into the tests.

<sub>Originally solved as a technical challenge.</sub>

---

## 🚀 Technologies

![Java](https://img.shields.io/badge/Java%2017-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST%20Assured-4EA94B?style=for-the-badge&logo=java&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC0000?style=for-the-badge&logo=java&logoColor=white)

- **Java 17** — language and runtime
- **REST Assured** — fluent API for HTTP requests and response assertions
- **JUnit** — test lifecycle and assertions
- **Lombok** — boilerplate reduction in POJOs and response models
- **Maven** — build and test execution

---

## 🧪 Coverage

| Scenario | Description |
|----------|-------------|
| Valid postal code | Returns `200` with the expected address fields correctly populated |
| Invalid postal code | Returns the documented error response instead of a valid address |

<!-- PLACEHOLDER: cenários que valem adicionar — cada um vira uma linha acima.
     - Malformed CEP (letras, tamanho errado) → 400
     - Non-existent but well-formed CEP → resposta de erro
     - Response time dentro de threshold
     - Contrato: presença e tipo de cada campo do payload -->

**Structure**

```plaintext
src/
├── main/
│   └── resources/
│       └── application.properties   # base URL (not versioned)
└── test/
    └── java/                        # test classes
```

---

## 💻 Getting started

**Requirements**

| Tool | Version |
|------|---------|
| Java (JDK) | 17 |
| Maven | 3.8+ |
| IntelliJ IDEA | any recent version |

**1. Clone the repository**

```bash
git clone https://github.com/bscarpari/test-qa-api.git
cd test-qa-api
```

**2. Open the project in IntelliJ IDEA**

**3. Set the project SDK to Java 17**

```text
File > Project Structure > Project > Project SDK > 17
```

**4. Create the configuration file**

Create `src/main/resources/application.properties` with:

```properties
BASE_URL=https://viacep.com.br
```

> This file is not versioned, so each environment can point to a different base URL.

**5. Run the tests**

Via terminal:

```bash
mvn test
```

Or through the IDE:

```text
Maven panel (right sidebar) > Lifecycle > test
```

---

## 📄 License

[MIT](https://choosealicense.com/licenses/mit/)

---

<p align="center">
  Made with 💜 by <a href="https://www.linkedin.com/in/bscarpari/">Bruno Scarpari</a> ·
  <a href="https://github.com/bscarpari">GitHub</a> ·
  <a href="mailto:bscarpari.dev@gmail.com">Email</a>
</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<img alt="Footer" width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=7B61FF&height=100&section=footer"/>
