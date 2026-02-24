
# Projeto de Automação de Testes – Java Web

## Sobre o Projeto

Este projeto tem como objetivo demonstrar conhecimentos sólidos em Automação de Testes utilizando Java, aplicando boas práticas de engenharia de software, arquitetura de testes e padrões de design.

A solução foi estruturada para garantir:

- Escalabilidade
- Manutenibilidade
- Reutilização de código
- Clareza na organização dos testes
- Separação de responsabilidades

---

## Stack Tecnológica

- Java
- Selenium WebDriver
- JUnit 5
- Maven
- Allure Report
- BDD com Gherkin

---

## Conceitos Aplicados

- Arquitetura de Automação de Testes
- Programação Orientada a Objetos (POO)
- Page Object Model (POM)
- Design Patterns
- Clean Code
- BDD (Behavior Driven Development)
- Separação de responsabilidades (SRP)

---

## Estrutura do Projeto

src

├── main

└── test

├── helpers

├── pages

├── runners

├── steps

└── resources

└── features

### Descrição das Camadas

**Helpers**
Responsáveis por centralizar utilidades e abstrações, evitando hardcode nos testes e promovendo reutilização e flexibilidade na criação de dados.

**Pages**
Implementação do padrão Page Object Model (POM), garantindo encapsulamento de elementos e ações da interface, facilitando manutenção.

**Runners**
Responsáveis por inicializar e executar os testes, integrando o fluxo BDD com o framework de execução.

**Steps**
Implementação dos passos definidos nas features, promovendo clareza entre regra de negócio e automação.

**Features**
Escritas em Gherkin, garantindo padronização e legibilidade do comportamento esperado da aplicação.

---

## Relatórios de Execução

A execução dos testes gera relatórios detalhados contendo:

- Status dos testes (Pass / Fail)
- Evidências
- Logs
- Tempo de execução
- Organização por suítes

O relatório pode ser acessado via:

- Allure Report
- Pasta `target/report-html`

---

## Como Executar o Projeto

### Executar testes

```bash
mvn clean test
```

### Gerar relatório Allure

```
allure serve target/allure-results
```

## Objetivo Técnico

Este projeto foi desenvolvido com foco em:

* Demonstrar maturidade em automação
* Aplicar padrões reconhecidos de mercado
* Estruturar testes com visão de engenharia
* Garantir legibilidade e manutenção a longo prazo

## Desafio

O principal desafio foi estruturar uma arquitetura de testes limpa e escalável, evitando acoplamento excessivo e garantindo organização clara entre regras de negócio e implementação técnica.

![1771958845318](image/README/1771958845318.png)


## Autora

Rose Dias

QA Engineer | Automação de Testes | Java | Backend Quality
