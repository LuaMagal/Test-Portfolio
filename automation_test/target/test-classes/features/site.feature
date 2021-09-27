#language:pt
#encoding> UTF-8
@cadastro
Funcionalidade: Cadastro
  @acessarcadastro
 Cenario: Acesso inicial e informacao pessoal
     Dado que o usuario acesse a pagina de cadastro
     E informar o seu email "ajaxmundial@saintemail.com"
     E clique em Create an Account
     Entao deve informar seu titulo
     E primeiro nome "Tiago"
     E sobrenome "Diminutivo"
     E senha "123fjh@"
     E Data de nascimento 26/11/"2000"
     Dado que o usuario tenha informado as suas informacoes pessoais
     E seu endereco  "Rua 500, Quadra 333, Casa 22"
     E seu endereco segunda linha  "Goiania, Goias"
     E sua cidade "Goiania"
     E seu estado "Alabama"
     E seu CEP "77758"
     E seu pais "United States"
     E seu numero de celular "+55 (62) 9855 9753" 
     E clicar no botao de register
     Entao entao o usuario deve estar logado
    
    
    
 
    
    

