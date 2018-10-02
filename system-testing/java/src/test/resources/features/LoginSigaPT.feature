# language: pt
Funcionalidade: Login na (MARAVOLHOSA)plataforma SIGA da FATEC-Sorocaba

  Contexto:
    Dado Eu como usuário gostaria de logar na aplicação

  Cenário: Usuário com usuario invalido e senha invalida
    Dado que o usuário preenche o campo usuario com o valor "1284639425SP"
    E o usuário preenche o campo senha com o valor "756941285"
    Quando o usuário clicar no botão Confirmar
    Então A mensagem "" será exibida