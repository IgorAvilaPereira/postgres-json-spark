# postgres-json-spark


O repositório [postgres-json-spark](https://github.com/IgorAvilaPereira/postgres-json-spark) é uma API REST desenvolvida com **Apache Spark (Java)**, **JDBC** e **PostgreSQL**, focada no gerenciamento de pedidos que utilizam dados em formato JSON.

### 🔍 Funcionalidades principais

* **Armazenamento de pedidos em JSON**: Cada pedido é representado como um objeto JSON, permitindo flexibilidade na estrutura dos dados.
* **Integração com PostgreSQL**: Os dados dos pedidos são armazenados em um banco de dados PostgreSQL, aproveitando sua capacidade de lidar com dados JSON.
* **API RESTful**: A API permite operações CRUD (Criar, Ler, Atualizar, Excluir) para gerenciar os pedidos.
* **Testes com Postman**: O repositório inclui um arquivo de coleção do Postman (`postman.json`) para facilitar a execução de testes na API.

### 🛠️ Tecnologias utilizadas

* **Spark (Java)**: Framework para processamento de dados em larga escala.
* **JDBC**: Conector para interação com o banco de dados PostgreSQL.
* **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.
* **GSON**: Biblioteca para conversão entre objetos Java e JSON.

### 🚀 Como executar

1. **Rodar a API**:

   * Execute a classe `MainSparkAPIREST.java` para iniciar a API.([ichi.pro][1])

2. **Banco de dados**:

   * Utilize o arquivo `dump.sql` para criar a estrutura necessária no PostgreSQL.([github.com][2])

3. **Testes**:

   * Importe o arquivo `postman.json` no Postman para testar os endpoints da API.

### 📄 Exemplo de estrutura de pedido

```json
{
    "id": 8,
    "customer": "Igor",
    "items": [
        {
            "product": "TV",
            "qty": 6
        }
    ]
}
```

### English version

The repository [postgres-json-spark](https://github.com/IgorAvilaPereira/postgres-json-spark) is a **Java-based REST API** project that integrates **Apache Spark**, **PostgreSQL**, and **JDBC** to manage and process JSON-formatted orders.

---

### 🔍 Key Features

* **Order storage in JSON format**: Each order is represented as a JSON object, offering flexible data structure.
* **PostgreSQL integration**: Orders are stored in a PostgreSQL database using its native JSON support.
* **RESTful API**: Provides basic CRUD operations to create, read, update, and delete orders.
* **Postman collection**: Includes a `postman.json` file for testing endpoints via Postman.

---

### 🛠️ Technologies Used

* **Spark (Java)** – For scalable data processing and serving the API.
* **JDBC** – For connecting to the PostgreSQL database.
* **PostgreSQL** – As the relational database storing JSON data.
* **GSON** – For converting Java objects to/from JSON.

---

### 🚀 How to Run

1. **Start the API**
   Run the `MainSparkAPIREST.java` class to start the Spark-based REST server.

2. **Database Setup**
   Use the `dump.sql` file to set up the required PostgreSQL database structure.

3. **Test the API**
   Import the `postman.json` file into Postman and run the preconfigured requests.

---

### 📄 Example JSON Order Structure

```json
{
  "id": 8,
  "customer": "Igor",
  "items": [
    {
      "product": "TV",
      "qty": 6
    }
  ]
}
```

## OFF-TOPIC

### Mustache templates

* Create _resources_ folder in _/src/main/_
* Create _templates_ folder inside _resources_
* Create _public_ folder inside _resources_
