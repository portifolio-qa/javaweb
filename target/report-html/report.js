$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cadastrarContas.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastrar Conta",
  "description": "Como usuário do Bug Bank\r\nQuero acessar o site do banco\r\nPara realizar a transferência de valores",
  "id": "cadastrar-conta",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Cria duas contas com saldo",
  "description": "",
  "id": "cadastrar-conta;cria-duas-contas-com-saldo",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 13,
  "name": "clico em \"Registrar\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencho \u003cemail\u003e \u0026 \u003cnome\u003e \u0026 \u003csenha\u003e \u0026 \u003cconfirma_Senha\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "a opção de conta com saldo está habilitada",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clica no botão \"Cadastrar\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "deve visualizar a mensagem \"A conta foi criada com sucesso\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "cadastrar-conta;cria-duas-contas-com-saldo;",
  "rows": [
    {
      "cells": [
        "e-mail",
        "nome",
        "senha",
        "confirma_Senha"
      ],
      "line": 21,
      "id": "cadastrar-conta;cria-duas-contas-com-saldo;;1"
    },
    {
      "cells": [
        "conta1@gmail.com",
        "Conta1",
        "teste123",
        "teste123"
      ],
      "line": 22,
      "id": "cadastrar-conta;cria-duas-contas-com-saldo;;2"
    },
    {
      "cells": [
        "conta2@gmail.com",
        "Conta2",
        "teste123",
        "teste123"
      ],
      "line": 23,
      "id": "cadastrar-conta;cria-duas-contas-com-saldo;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 9,
  "name": "Login",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que acesso o sistema",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 22,
  "name": "Cria duas contas com saldo",
  "description": "",
  "id": "cadastrar-conta;cria-duas-contas-com-saldo;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 13,
  "name": "clico em \"Registrar\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencho \u003cemail\u003e \u0026 Conta1 \u0026 teste123 \u0026 teste123",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "a opção de conta com saldo está habilitada",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clica no botão \"Cadastrar\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "deve visualizar a mensagem \"A conta foi criada com sucesso\"",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 9,
  "name": "Login",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que acesso o sistema",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "Cria duas contas com saldo",
  "description": "",
  "id": "cadastrar-conta;cria-duas-contas-com-saldo;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 13,
  "name": "clico em \"Registrar\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencho \u003cemail\u003e \u0026 Conta2 \u0026 teste123 \u0026 teste123",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "a opção de conta com saldo está habilitada",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clica no botão \"Cadastrar\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "deve visualizar a mensagem \"A conta foi criada com sucesso\"",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});