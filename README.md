
# Laughing Octo Disco

"Laughing Octo Disco" é uma API RESTful desenvolvida com uma arquitetura baseada em MVC (Model-View-Controller). O projeto utiliza JPA para a persistência de dados, MySQL como banco de dados, e as bibliotecas Lombok e Spring Web para facilitar o desenvolvimento.

## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **JPA (Java Persistence API)**
- **MySQL**
- **Lombok**
- **Spring Web**
- **MySQL Driver**

## Estrutura do Projeto

A estrutura do projeto segue o padrão MVC:
- **Model:** Representa as entidades do banco de dados usando JPA.
- **View:** Sendo uma API REST, não há uma interface gráfica; as respostas são enviadas em formato JSON.
- **Controller:** Gerencia as requisições HTTP e direciona as operações para os serviços.

## Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Polabiel/laughing-octo-disco.git
   ```

2. Configure o banco de dados MySQL:
   - Crie um banco de dados e ajuste as configurações de conexão em `application.properties` ou `application.yml`.

3. Execute o projeto com o Maven ou outra ferramenta de sua preferência:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a API no endereço:
   ```
   http://localhost:8080/
   ```

## Endpoints

Aqui estão alguns exemplos de endpoints disponíveis:

- `GET /api/entidade`: Retorna uma lista de entidades.
- `POST /api/entidade`: Cria uma nova entidade.
- `PUT /api/entidade/{id}`: Atualiza uma entidade existente.
- `DELETE /api/entidade/{id}`: Remove uma entidade.

## Contribuição

Para contribuir, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça o commit das suas alterações:
   ```bash
   git commit -m 'Adicionando nova feature'
   ```
4. Faça o push para a branch:
   ```bash
   git push origin minha-feature
   ```
5. Abra um pull request.

## Licença

Esse projeto está licenciado sob a [Nome da Licença]. Por favor, adicione detalhes sobre a licença utilizada.
