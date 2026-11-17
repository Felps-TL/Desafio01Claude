# ⚔️ Maratona Java — Desafio 01: Arena de Batalha

![Java](https://shields.io)
![IntelliJ IDEA](https://shields.io)
![Status](https://shields.io)

Simulador de batalha por turnos desenvolvido em **Java** durante os estudos da **Maratona Java (DevDojo)** para praticar os fundamentos de Programação Orientada a Objetos (POO).

---

## 🎯 Conceitos Praticados

* **Classes e Objetos:** Modelagem de atributos (`nome`, `vida`, `atk`, `def`) e instanciação de personagens.
* **Métodos e Parâmetros:** Criação de comportamentos com retorno (`calcularDano`) e sem retorno (`atacar`).
* **Modificadores de Acesso e Pacotes:** Organização do código entre os pacotes `Main` e `Test`.
* **Estruturas de Controle:** Uso de condicionais (`if/else`) para cálculo de dano mínimo e laços de repetição (`while`) para o sistema de turnos.

---

## 📂 Estrutura do Projeto

```text
src/
└── Desafio01/
    ├── Main/
    │   ├── Personagem.java       # Regras de atributos, ataque e cálculo de dano
    │   └── PersonagemPrint.java  # Exibição formatada dos status dos lutadores
    └── Test/
        └── Arena.java            # Ponto de entrada (main) e loop da batalha
```

---

## 💻 Exemplo de Saída no Console

```text
Nome: Goku | Vida: 100 | Ataque: 25 | Defesa: 5
Nome: Naruto | Vida: 90 | Ataque: 15 | Defesa: 8
--------- DUELO ---------
Goku atacou Naruto e causou 17 de dano! (Naruto: 73 de vida)
Naruto atacou Goku e causou 10 de dano! (Goku: 90 de vida)
...
--------- FIM DO DUELO ---------
Vencedor: Goku!
```

---

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com
   ```
2. Abra a pasta do projeto no **IntelliJ IDEA**.
3. Navegue até `src/Desafio01/Test/Arena.java` e execute o método `main`.

---

## 👨‍💻 Autor

Desenvolvido por **[Seu Nome](https://github.com)** 🚀
