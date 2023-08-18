# language: pt

Funcionalidade: Transferência de Contas  
  Como usuário do Bug Bank
  Quero acessar o site do banco
  Para realizar a transferência de valores



Contexto: Home
	Dado que estou logado na aplicação
	E possuo duas contas cadastradas

 
Esquema do Cenario: Testar transfêrencia e saldo
      Dado a conta criada para o dono <dono> de numero <numero> com o saldo <saldo>
      Quando o Conta1 realiza a transfêrencia no valor de <transferência> na Conta2
      Entao o Conta2 tem o saldo no valor de <saldo_esperado> na conta
   
Exemplos: 

| <dono> | <numero> | <saldo> | <transferência> | <saldo_esperado>|
|conta1  | 111      | 1000    | 100             | 900             | 
|conta2  | 222      | 1000    | 200             | 1100            | 
