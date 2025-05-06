# Desafio Java: Gerenciamento de Ninjas com Herança

**Descrição do Desafio**

O desafio consiste em criar um programa em Java para gerenciar informações de ninjas utilizando o conceito de herança. O programa deve envolver a criação de uma classe base chamada `Ninja` e uma subclasse chamada `Uchiha`.   

**Requisitos:**

1.  **Classe `Ninja`:**
    * Definir os atributos:
        * `nome` (String)
        * `idade` (int)
        * `missao` (String)
        * `nivelDificuldade` (String)
        * `statusMissao` (String) 
    * Criar um método `mostrarInformacoes()` que exibe todos esses atributos. 

2.  **Classe `Uchiha`:**
    * Criar uma subclasse `Uchiha` que herda da classe `Ninja`. 
    * Adicionar um atributo adicional:
        * `habilidadeEspecial` (String) 
    * Criar um método `mostrarHabilidadeEspecial()` para exibir a habilidade especial do ninja Uchiha. 

3.  **Sobrescrita de Método:**
    * Sobrescrever o método `mostrarInformacoes()` na classe `Uchiha` para incluir a exibição da `habilidadeEspecial`. 

**Desafio Adicional (Opcional):**

* Implementar um menu interativo utilizando a classe `Scanner` para permitir ao usuário:
    * Exibir informações de todos os ninjas.
    * Adicionar novos ninjas.
    * Atualizar as habilidades especiais dos Uchihas. 

**Objetivo:**

Praticar o uso de herança, entrada de usuário e controle de fluxo em Java. 
