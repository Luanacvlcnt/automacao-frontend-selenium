# Automação Frontend - Selenium + Java

Projeto de automação de testes end-to-end para a aplicação [OrangeHRM](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login), desenvolvido como estudo/prática de automação de testes com Selenium WebDriver.

## Objetivo

Automatizar o fluxo de login da aplicação, aplicando boas práticas de organização e manutenibilidade de código.

## Tecnologias utilizadas

- Java 17
- Selenium WebDriver 4 - automação do navegador
- TestNG - framework de testes
- Maven - gerenciamento de dependências e build
- Page Object Model (POM) com Page Factory - padrão de projeto para organização dos elementos e ações da página

## Estrutura do projeto

src/test/java/testes/
├── LoginPageFactory.java   -> Page Object com elementos e ações da tela de login
└── LoginTest.java          -> Classe de teste do fluxo de login

## Como executar

1. Clone o repositório:
```bash
   git clone https://github.com/Luanacvlcnt/automacao-frontend-selenium.git
```
2. Importe o projeto no Eclipse como Maven Project
3. Aguarde o download das dependências (Maven > Update Project)
4. Execute a classe LoginTest.java como TestNG Test

## Cenário coberto

- Login com credenciais válidas e validação do título da página após autenticação

## Próximos passos

- [ ] Adicionar esperas explícitas (WebDriverWait)
- [ ] Implementar relatórios com Extent Reports
- [ ] Adicionar testes de cenários negativos (login inválido)
- [ ] Configurar execução via GitHub Actions