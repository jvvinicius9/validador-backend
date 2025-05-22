# ✅ Validador Backend – Spring Boot

Projeto criado como parte da disciplina de **Desenvolvimento Web Back-End**, com foco em **validação de dados usando Bean Validation (Jakarta)** no Spring Boot.

---

## 🔧 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Bean Validation (Jakarta)
- Lombok
- Maven
- Postman (para testes manuais)

---

## 📦 Funcionalidades

### 🔹 Produto
- Validação de campos como `nome`, `preço`, `estoque`, `descrição`
- DTO com padrão Builder
- Teste de validação no terminal (`ValidadorProduto`)
- Endpoint `POST /api/produtos` com validação automática

### 🔹 Cliente
- Validação de campos como `nome`, `email`, `cpf` e `idade`
- DTO com padrão Builder
- Teste de validação no terminal (`ValidadorCliente`)
- Endpoint `POST /api/clientes` com validação automática

---

## 🚀 Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/jvvinicius9/validador-backend.git
```

2. Abra no IntelliJ ou VS Code

3. Execute a classe `ProdutoApiApplication`

4. Teste os endpoints usando o Postman:
   - `POST /api/produtos`
   - `POST /api/clientes`

---

## 📬 Exemplo de Requisição (Produto)

```http
POST /api/produtos
Content-Type: application/json

{
  "id": 1,
  "nome": "Teclado Mecânico",
  "descricao": "Switch azul, RGB",
  "preco": 299.99,
  "estoque": 10
}
```

---

## ✅ Resultado Esperado

- Resposta 201 Created com o DTO
- Em caso de erro, resposta 400 com mensagens de validação

---

## 👨‍💻 Autor

Desenvolvido por João Vinicius – Projeto acadêmico 📘
