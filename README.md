# Processos #2

Aplicação que lista os processos ativos, permite ao usuário entrar com o nome ou o PID do processo e o mate.
Java Project com uma classe chamada KillController.java no package controller e uma classe Main.java no package view.

A classe KillController.java tem 4 métodos.

1) O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo privado);
   
2) O segundo, chamado listaProcessos, que verifica o SO e, de acordo com SO, selecione o comando para listar os processos ativos.
(O método deve receber todas as linhas de saída do processo de listagem e exibi-las em console);

3) O terceiro, chamado mataPid, que recebe um PID como parâmetro de entrada, verifica o SO e, de acordo com SO, selecione o comando para matar o processo e o finalize;

4) O quarto, chamado mataNome, que recebe um nome de processo como parâmetro de entrada, verifica o SO e, de acordo com SO, selecione o comando para matar o processo e o finalize.
