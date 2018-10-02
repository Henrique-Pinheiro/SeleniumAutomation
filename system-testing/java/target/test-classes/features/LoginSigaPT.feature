# language: pt
Funcionalidade: Login no (MARAVILHOSO) SIGA, sistema ERP da FATEC-Sorocaba

  Contexto:
    Dado que eu como usuário gostaria de acessar o SIGA

  Cenário: Acessando a aplicação com Usuário e Senha não cadastrados
    Dado que eu preencha o campo Usuário com o valor "1284639425SP"
    E eu preencha o campo Senha com o valor "756941285"
    Quando eu clicar no botão Confirmar
    Então a mensagem "Não confere Login e Senha" deve ser exibida

  Cenário: Acessando a aplicação com um Usuário não cadastrado e Senha cadastrada
    Dado que eu preencha o campo Usuário com o valor "1284639425SP"
    E eu preencha o campo Senha com o valor "46946593839"
    Quando eu clicar no botão Confirmar
    Então a mensagem "Não confere Login e Senha" deve ser exibida

  Cenário: Acessando a aplicação com um Usuário cadastrado e Senha não cadastrada
    Dado que eu preencha o campo Usuário com o valor "566440969SP"
    E eu preencha o campo Senha com o valor "756941285"
    Quando eu clicar no botão Confirmar
    Então a mensagem "Não confere Login e Senha" deve ser exibida

  Cenário: Acessando a aplicação com Usuário cadastrado e Senha vazia
    Dado que eu preencha o campo Usuário com o valor "1284639425SP"
    Quando eu clicar no botão Confirmar
    Então a mensagem "Forneça a senha" deve ser exibida

  Cenário: Acessando a aplicação com Usuário e Senha cadastrados
    Dado que eu preencha o campo Usuário com o valor "566440969SP"
    E eu preencha o campo Senha com o valor "46946593839"
    Quando eu clicar no botão Confirmar
    Então a Home do SIGA deve ser exibida
    E os seguintes dados devem ser exibidas:
      | Nome do dado       | Valor do dado                 |
      | Nome               | HENRIQUE PINHEIRO RODRIGUES   |
      | E-mail             | pinheiro_henrique@hotmail.com |
      | CPF                | 46946593839                   |
      | Data de nascimento | 14/05/1999                    |
