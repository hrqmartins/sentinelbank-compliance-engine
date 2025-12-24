# SentinelBank - Compliance & Anti-Fraud Engine 🛡️

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-CONCLUÍDO-green?style=for-the-badge)

O **SentinelBank Compliance Engine** é uma solução de backend desenvolvida para mitigar riscos operacionais e fraudes financeiras. Diferente de sistemas bancários convencionais, este projeto foca na camada de **validação de conformidade (Compliance)**, simulando as regras rigorosas de instituições bancárias.

## 🚀 Diferenciais do Projeto

Este projeto não é apenas um CRUD. Ele foi arquitetado para demonstrar maturidade em **Orientação a Objetos** e resolução de problemas complexos:

- **Arquitetura Plugável:** Uso de Interfaces para permitir que novas regras de segurança sejam adicionadas sem modificar o motor principal (Open/Closed Principle).
- **Análise de Risco Quantitativa:** Implementação de um Score de Risco baseado em pesos e criticidade.
- **Tratamento de Exceções de Negócio:** Gestão robusta de erros para garantir a continuidade do sistema em ambientes críticos.

## 🧠 Lógica de Negócio (Score de Risco)

O sistema calcula a probabilidade de fraude ($S$) de cada transação utilizando a fórmula:

$$S = \sum_{i=1}^{n} (V_i \cdot W_i)$$

Onde:
- $V$: Resultado da validação (0 para sucesso, 1 para falha).
- $W$: Peso de criticidade da regra infringida.

Se $S$ ultrapassar o limite estabelecido pelo banco, a transação é automaticamente enviada para análise humana ou bloqueada.

## 🛠️ Tecnologias e Conceitos Aplicados

- **Java SE:** Utilização de recursos modernos da linguagem.
- **Polimorfismo:** Implementação dinâmica de regras de segurança via interfaces.
- **Encapsulamento:** Proteção rigorosa dos dados sensíveis da transação.
- **Java Time API:** Manipulação precisa de fusos horários e janelas de risco.

## 🏗️ Arquitetura do Sistema

Abaixo, o modelo de classes (UML) que sustenta a inteligência do motor:



*(<a href="https://ibb.co/cS5FPJJP"><img src="https://i.ibb.co/sdSwhjjh/Untitled-diagram-2025-12-24-225251.png" alt="Untitled-diagram-2025-12-24-225251" border="0"></a>)*

## 📂 Como rodar o projeto
1. Clone o repositório.
2. Certifique-se de ter o JDK 17+ instalado.
3. Execute a classe `TesteSistema.java` para ver as simulações de transações sendo processadas pelo motor.

---
**Desenvolvido por Henrique Martins** *Estudante de Análise e Desenvolvimento de Sistemas - FIAP*
