# language: pt
Funcionalidade: Transferência entre contas

Como usuário do Bug Bank
Quero transferir valores entre contas
Para que o saldo seja debitado da conta origem e creditado na conta destino

Contexto:
Dado que estou na aplicação Bug Bank

Cenário: Realizar transferência com sucesso entre duas contas

Dado que criei a conta "Conta1" com saldo inicial de 1000
E criei a conta "Conta2" com saldo inicial de 1000
E estou logado na conta "Conta1"

Quando realizo uma transferência de 200 para a conta "Conta2"

Então o saldo da conta "Conta1" deve ser 800
E o saldo da conta "Conta2" deve ser 1200
E devo visualizar a mensagem de transferência realizada com sucesso