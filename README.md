# MAPA - Programação Avançada ☕

Este repositório contém a entrega da atividade MAPA (Material de Avaliação Prática da Aprendizagem) da disciplina de Programação Avançada. O objetivo do projeto é demonstrar o domínio sobre os pilares da Programação Orientada a Objetos e o processamento de requisições web utilizando Servlets.

## 🚀 Tecnologias Utilizadas
* **Java:** Linguagem principal do projeto.
* **Apache Maven:** Gerenciamento de dependências e automação de build (`pom.xml`).
* **Apache Tomcat 9:** Servidor de aplicação web para deploy do Servlet.
* **Java Servlet API (`javax.servlet`):** Processamento de requisições HTTP.

## 📂 Estrutura do Projeto

O projeto foi dividido em duas entregas principais:

### 1. Herança e Polimorfismo (`Main.java`)
Localizado na raiz do projeto, este arquivo demonstra o conceito de herança em Java.
* **Superclasse `Animal`:** Define a estrutura base e o comportamento genérico.
* **Subclasse `Cachorro`:** Herda de Animal, utiliza o construtor `super()` e aplica polimorfismo ao sobrescrever (override) o método `fazerSom()`.

### 2. Aplicação Web Servlet (`app-servlet/`)
Um projeto web estruturado com Maven que exibe uma página HTML dinâmica.
* **`BemVindoServlet.java`:** Intercepta requisições `GET` e retorna uma página HTML com uma mensagem de boas-vindas.
* **`web.xml`:** Mapeamento explícito da rota `/bemvindo` para garantir o funcionamento fluido no servidor Tomcat.

## ⚙️ Como Executar

**Para testar a Herança:**
Basta compilar e rodar o arquivo `Main.java` em qualquer terminal ou IDE:
```bash```

javac Main.java

java Main


**Para testar o Servlet:** 

Navegue até a pasta app-servlet.

Realize o build do projeto com o Maven:

mvn clean package

1. Faça o deploy do arquivo app-servlet.war (gerado na pasta target) em um servidor Apache Tomcat.

2. Acesse no navegador: http://localhost:8080/app-servlet/bemvindo

### Passo 3: Salvar as alterações
1. Depois de colar o texto, role a página até o topo (ou até o final, dependendo do layout) e clique no botão verde **"Commit changes..."** (Salvar alterações).
2. Uma janelinha vai abrir. Pode deixar a mensagem padrão e clicar novamente no botão verde **"Commit changes"**.

Pronto! A página inicial do seu repositório agora vai exibir essa documentação bonita, explicando exatamente do que se trata a sua aplicação e como rodá-la. É o toque final perfeito para a sua entrega.
