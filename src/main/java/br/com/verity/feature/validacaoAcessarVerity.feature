#language:pt
#coding:utf-8

  Funcionalidade: Acessar e validar a pagina web

Cenario: Acessar a pagina web e validar titulos
  Dado que esteja acessando a pagina "https://www.verity.com.br"
  E realiza a validacao dos titulos "SOMOS HUMANOS"
  E realiza a validacao dos titulos "SOMOS DIGITAIS"
  Quando realiza a validacao do titulo "SOMOS VERITY_"
  Então verifica o titulo "Agentes de transformação inspirando protagonismo nas pessoas e gerando resultados para organizações."


Cenario: Acessar a pagina web, validar titulos e preencher formulario
  Dado que esteja acessando a pagina "https://www.verity.com.br"
  E clica no menu "VERITY LAB"
  E realiza a validacao dos titulos "Conteúdo exclusivo"
  E realiza a validacao dos titulos "VERITY LAB"
  E preenche o campo "Nome completo" com "Yuniel Torres Rodriguez"
  E preenche o campo "Empresa" com "Verity"
  E preenche o campo "E-mail" com "yunierick@gmail.com"
  E preenche o campo "Telefone" com "11943692538"
  E clica no checkBox
  E clico no botao Participar