⏰ Relógio Digital (JavaFX)
===========================

Uma aplicação desktop simples que exibe a hora atual, construída com Java e a biblioteca gráfica JavaFX.

Este projeto foi desenvolvido como um exercício prático para aplicar conceitos de animação e atualização de interface (GUI) em tempo real, utilizando `Timeline` e `KeyFrame` do JavaFX.

<img width="207" height="129" alt="relogiodigital" src="https://github.com/user-attachments/assets/ed8d54fd-0fda-4654-a43b-142221c8937f" />

✨ Features (Funcionalidades)
------------------------------

* **Exibição da Hora Atual:** Mostra a hora, minuto e segundo no formato `HH:mm:ss`.
* **Atualização em Tempo Real:** O relógio atualiza a cada segundo, garantindo a precisão.
* **Interface Estilizada:** Interface limpa com fundo preto e texto em amarelo, simulando um relógio digital clássico.
* **Construído com JavaFX:** Utiliza a `Timeline` do JavaFX para criar o "tick" do relógio de forma eficiente.

🛠️ Tecnologias Utilizadas
---------------------------

O projeto foi construído utilizando:

* **Java** (JDK 17 ou superior)
* **JavaFX** (Para a interface gráfica e animação)
* **Maven** (Para gerenciamento de dependências e build do projeto)

▶️ Como Executar
-----------------

Para rodar este projeto localmente, você precisará ter o **Java (JDK)** e o **Maven** instalados em sua máquina.

1.  Clone o repositório (use o novo nome que corrigimos):

    ```bash
    git clone [https://github.com/joaorooliveira/relogio-digital.git](https://github.com/joaorooliveira/relogio-digital.git)
    ```

2.  Navegue até o diretório do projeto:

    ```bash
    cd relogio-digital
    ```

3.  Compile e execute a aplicação usando o Maven:
    *(O plugin do JavaFX cuidará de tudo)*

    ```bash
    mvn clean javafx:run
    ```

4.  A aplicação deverá abrir em uma nova janela exibindo o relógio.

Licença
-------

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
