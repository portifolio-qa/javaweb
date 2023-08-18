# language: pt

 Funcionalidade: Cadastrar Conta
  Como usuário do Bug Bank
  Quero acessar o site do banco
  Para realizar a transferência de valores


	Contexto: Login
		Dado que acesso o sistema
		
Esquema do Cenario: Cria duas contas com saldo 
		Quando clico em "Registrar" 
		E preencho <email> & <nome> & <senha> & <confirma_Senha> 
		E a opção de conta com saldo está habilitada
		E clica no botão "Cadastrar"
		Então deve visualizar a mensagem "A conta foi criada com sucesso"
		
Exemplos: 	

		| e-mail            | nome     | senha     | confirma_Senha |
    | conta1@gmail.com  | Conta1   | teste123  | teste123		    |
    | conta2@gmail.com  | Conta2   | teste123  | teste123  		  |		
