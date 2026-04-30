# Sistema de Folha de Pagamento

## Descrição

Sistema de folha de pagamento desenvolvido em Java que permite cadastrar colaboradores de diferentes tipos de vínculo e calcular o salário de cada um com base em regras específicas. Ao final, é possível gerar uma listagem com todos os funcionários cadastrados e seus respectivos salários.

## Contexto

Este projeto foi desenvolvido como atividade prática da disciplina de Java na Universidade Anhembi Morumbi. O objetivo é aplicar os conceitos estudados em sala de aula em um problema concreto, simulando uma situação real de uso.

Todo o sistema foi construído utilizando apenas os recursos apresentados durante as aulas, sem bibliotecas externas ou recursos avançados além do que foi ensinado até o momento.

---

## Conceitos de Java aplicados

- Tipos de dados primitivos: `int`, `double`
- Tipo `String` para armazenar textos
- Constante com `final` para o salário-base
- Leitura de dados pelo terminal com `Scanner`
- Estrutura de repetição `do-while` para manter o menu ativo
- Estrutura condicional `switch` para identificar a opção escolhida
- Validação de entrada com `if` e verificação de tipo com `hasNextInt()`
- `ArrayList<String>` para armazenar a lista de funcionários
- Loop `for` para percorrer e exibir a folha de pagamento
- Códigos de escape ANSI para colorir o texto no terminal

---

## Regras do sistema

- O salário-base fixo é de **R$ 2.000,00** para todos os tipos de funcionário.
- Dependendo do tipo de vínculo, um valor adicional pode ser somado ao salário-base.
- Valores negativos para vendas, comissão, quantidade de peças e valor por peça são rejeitados pelo sistema.
- Se o usuário digitar uma opção que não seja um número, o sistema exibe uma mensagem de erro e aguarda uma nova entrada.
- O sistema continua em execução até que o usuário escolha a opção de sair.

---

## Tipos de colaboradores

### Funcionário padrão

Recebe exatamente o salário-base, sem nenhum acréscimo. Para cadastrá-lo, basta informar o nome e o número de matrícula.

**Salário:** R$ 2.000,00

---

### Funcionário comissionado

Além do salário-base, recebe uma comissão calculada sobre o total de vendas realizadas no período. A porcentagem de comissão é informada no momento do cadastro.

**Cálculo:**
```
comissão = total de vendas × (percentual / 100)
salário final = R$ 2.000,00 + comissão
```

---

### Funcionário de produção

Além do salário-base, recebe um valor proporcional à quantidade de peças que produziu. O valor pago por peça é definido no momento do cadastro.

**Cálculo:**
```
produção = quantidade de peças × valor por peça
salário final = R$ 2.000,00 + produção
```

---

## Funcionalidades do menu

Ao iniciar o sistema, um menu é exibido com as seguintes opções:

### Opção 1 - Cadastrar funcionário padrão

O sistema solicita:
- Nome do funcionário
- Número de matrícula

O funcionário é cadastrado com o salário-base de R$ 2.000,00 e adicionado à lista.

---

### Opção 2 - Cadastrar funcionário comissionado

O sistema solicita:
- Nome do funcionário
- Número de matrícula
- Total de vendas realizadas no período
- Percentual de comissão

O sistema valida se os valores são positivos, calcula a comissão, soma ao salário-base e cadastra o funcionário.

---

### Opção 3 - Cadastrar funcionário de produção

O sistema solicita:
- Nome do funcionário
- Número de matrícula
- Quantidade de peças produzidas
- Valor pago por peça

O sistema valida se os valores são positivos, calcula o total de produção, soma ao salário-base e cadastra o funcionário.

---

### Opção 4 - Gerar folha de pagamento

Exibe no terminal a lista completa de todos os funcionários cadastrados na sessão atual, com o tipo de vínculo, nome, matrícula e salário calculado.

---

### Opção 0 - Sair

Encerra o sistema.

---

## Exemplo de uso

A seguir, uma simulação de uma sessão no terminal:

```
--- FOLHA DE PAGAMENTO ---
Escolha a opção desejada:
1 - Funcionário padrão
2 - Funcionário comissionado
3 - Funcionário produção
4 - Gerar folha de pagamento
0 - Sair
Digite a opção desejada:
1
Insira nome do funcionário
Ana Lima
Insira o número de matrícula
1001
Funcionário cadastrado:
Padrão - Ana Lima - 1001 - 2000.0

Digite a opção desejada:
2
Insira nome do funcionário
Carlos Souza
Insira o número de matrícula
1002
Digite o total de vendas
5000
Digite a porcentagem de comissão
10
Funcionário cadastrado:
Comissionado - Carlos Souza - 1002 - 2500.0

Digite a opção desejada:
3
Insira nome do funcionário
Marcos Reis
Insira o número de matrícula
1003
Digite a quantidade de peças produzidas
200
Digite o valor por peça produzida
5
Funcionário cadastrado:
Produção - Marcos Reis - 1003 - 3000.0

Digite a opção desejada:
4
Folha de Pagamento
Padrão - Ana Lima - 1001 - 2000.0
Comissionado - Carlos Souza - 1002 - 2500.0
Produção - Marcos Reis - 1003 - 3000.0

Digite a opção desejada:
0
Encerrando sistema...
```

---

## Estrutura do projeto

O projeto contém uma única classe:

```
src/
└── Sistema.java
```

### Sistema.java

Contém todo o código do sistema dentro do método `main`. As responsabilidades estão organizadas da seguinte forma:

Inicialização do `Scanner` e do `ArrayList`
Definição do salário-base como constante
Loop principal com o menu de opções
Cada `case` do `switch` trata um tipo de funcionário ou ação
Validação de entradas inválidas antes de processar os dados

---

## Como executar

### Pré-requisitos

JDK instalado (versão 8 ou superior)
Terminal ou IDE de sua preferência (IntelliJ IDEA, VS Code, Eclipse, etc.)

### Pela IDE (IntelliJ IDEA)

1. Abra o projeto na IDE.
2. Localize o arquivo `Sistema.java` na pasta `src`.
3. Clique com o botão direito sobre o arquivo e selecione **Run 'Sistema.main()'**.
