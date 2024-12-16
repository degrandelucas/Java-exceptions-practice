# Projeto de Estudo - Tratamento de Exceções e Consumo de API com Java

Este projeto tem como objetivo explorar o tratamento de exceções em Java e o consumo de APIs públicas. Durante a execução, diferentes cenários de exceção são tratados e dados de uma API pública (GitHub API) são consumidos para demonstrar boas práticas no uso de bibliotecas como **HttpClient** e **Gson**.

---

## Funcionalidades Principais

1. **Tratamento de Exceções em Divisão por Zero:**
    - O programa solicita ao usuário dois números (numerador e denominador) e trata a exceção caso o denominador seja igual a zero.

2. **Autenticação Simulada com Tratamento de Exceção Personalizada:**
    - Um exemplo prático de autenticação onde, ao inserir um usuário ou senha inválidos, uma exceção personalizada é lançada e tratada.

3. **Consumo de API do GitHub para Obter Dados de Perfis Públicos:**
    - Permite que o usuário digite um nome de usuário do GitHub e exibe as informações públicas deste perfil, como nome, localização, empresa e número de repositórios públicos.

---

## Estrutura do Código

### Classes e Suas Responsabilidades

- **`App`**
    - Classe principal responsável por:
        - Capturar entradas do usuário.
        - Demonstrar o tratamento de exceções em cenários diversos.
        - Consumir a API do GitHub utilizando o `Connection`.

- **`Connection`**
    - Classe para realizar requisições HTTP utilizando o **HttpClient**.
    - Contém o método `fetchUserProfile` para buscar o perfil de um usuário do GitHub.

- **`GitHubGsonDataConversation`**
    - Classe que utiliza a biblioteca **Gson** para converter o JSON retornado pela API em um objeto Java do tipo `GitHubProfile`.

- **`Profile`**
    - Classe para armazenar os dados do perfil do GitHub após a conversão.
    - Implementa o método `toString` para exibir os dados formatados.

- **`GitHubProfile`**
    - Record para mapear as informações retornadas pela API (exemplo: login, nome, localização).

- **`Cadastro`**
    - Classe que simula o cadastro de um usuário e realiza validações de login.
    - Lança a exceção personalizada `ExceptionLoginInvalido` em caso de falha de autenticação.

- **`ExceptionLoginInvalido`**
    - Exceção personalizada para sinalizar erros de login.

---

## Como Executar o Projeto

1. **Clone o repositório.**

2. **Configure o ambiente Java.**
    - Certifique-se de ter o **Java 11 ou superior** instalado.

3. **Compile e execute o projeto.**
    - Compile os arquivos `.java`:
      ```bash
      javac -cp gson-<version>.jar *.java
      ```
    - Execute o programa:
      ```bash
      java -cp gson-<version>.jar:. exceptions.practice.application.App
      ```

4. **Interaja com o programa.**
    - Realize as interações no console:
        - Digite os valores para a divisão.
        - Tente realizar o login com o usuário e senha cadastrados.
        - Insira um nome de usuário do GitHub para buscar informações.

---

## Tecnologias Utilizadas

- **Java 11 ou superior:** Linguagem utilizada para o desenvolvimento.
- **HttpClient:** Para realizar requisições HTTP.
- **Gson:** Para converter JSON em objetos Java.
- **Scanner:** Para captura de entradas do usuário.
- **API pública:** GitHub API.

### Endpoints Utilizados

- **GitHub API:**  
  Endpoint: `https://api.github.com/users/{username}`  
  Cabeçalho: `Accept: application/vnd.github+json`

---

## Autor

Lucas Degrande