# 📦 Sistema de Cálculo de Frete (MVC, MVP e MVVM)

Este projeto tem como objetivo implementar um **sistema simples de cálculo de frete** utilizando três padrões arquiteturais amplamente utilizados no desenvolvimento de software: MVC, MVP e MVVM. A proposta é demonstrar, na prática, as diferenças entre essas arquiteturas, mantendo a mesma Regra de Negócio:

- frete = (peso * 0.5) + (distancia * 0.2);
- Se o peso for maior que **10kg**, é adicionada uma taxa fixa de **R$ 10,00**;

## 🧠 Padrões Arquiteturais

### º MVC (Model-View-Controller)

- **Model:** Responsável pela lógica de negócio
- **View:** Interface com o usuário (entrada e saída)
- **Controller:** Intermedia a comunicação entre Model e View

📌 O Controller recebe os dados da View, envia para o Model e retorna o resultado.

### º MVP (Model-View-Presenter)

- **Model:** Lógica de negócio
- **View:** Interface (passiva, apenas exibe dados)
- **Presenter:** Contém toda a lógica de controle

📌 A View se comunica com o Presenter através de interfaces.

### º MVVM (Model-View-ViewModel)

- **Model:** Lógica de negócio
- **View:** Interface com o usuário
- **ViewModel:** Responsável por preparar os dados para a View

📌 Muito usado com interfaces reativas (JavaFX, Android).

## 💻 Como Executar o Projeto

### 1. Pré-requisitos
- Java JDK 17 instalado
- VS Code ou terminal

### 2. Compilar o projeto

Para Windows:
```bash
javac -d . (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

### 3. Executar

MVC:
```bash
java mvc.Main
```

MVP:
```bash
java mvp.Main
```

MVVM:
```bash
java mvvm.Main
```

## ✅ Boas Práticas Aplicadas
- Separação de responsabilidades
- Organização em pacotes
- Reutilização da regra de negócio
- Código modular e legível