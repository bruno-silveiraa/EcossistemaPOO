# Ecossistema POO

Projeto em Java usando Programacao Orientada a Objetos.

## Tema

Ecossistema com somente animais e plantas:

- 3 animais: coelho, raposa e abelha.
- 1 planta generica.

## Conceitos de POO usados

- `Coisa`: classe abstrata principal, com atributos comuns.
- `Animal`: classe abstrata que herda de `Coisa`.
- `Planta`: classe concreta que herda de `Coisa`.
- `Coelho`, `Raposa` e `Abelha`: classes concretas que herdam de `Animal`.
- Polimorfismo no `Main`, usando uma lista de `Animal`.
- Sobrescrita de metodos com `agir()` e `mostrarEstado()`.
- Interacao com o usuario usando `Scanner` e menu de opcoes.

## Como compilar pelo terminal

Na pasta `EcossistemaPOO`, execute:

```bash
javac -d bin src/Main.java src/base/*.java
java -cp bin Main
```

## Menu do programa

Ao executar, o usuario pode escolher opcoes como:

- Mostrar o estado do ecossistema.
- Fazer a planta crescer.
- Fazer o coelho comer a planta.
- Fazer a abelha polinizar a planta.
- Fazer a raposa cacar o coelho.
- Fazer todos os animais agirem.
- Sair do programa.
