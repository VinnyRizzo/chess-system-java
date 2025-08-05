## ♟ Projeto Xadrez em Java - Chess Game

Este projeto é uma implementação completa do jogo de xadrez em Java, com regras oficiais e movimentos especiais, utilizando orientação a objetos e abstrações para tabuleiro, peças e regras do jogo.

## ✨ Funcionalidades principais

🏁 Implementação do tabuleiro 8x8.

<img width="641" height="273" alt="Image" src="https://github.com/user-attachments/assets/2cf51981-5068-4e43-a765-96754bd844f5" />

♔ Todas as peças oficiais do xadrez: Rei, Rainha, Torre, Bispo, Cavalo e Peão.

<img width="575" height="347" alt="Image" src="https://github.com/user-attachments/assets/6e0f35a7-6c97-4893-b182-7f76b4de5774" />


## 🎯 Tratamento de movimentos especiais:

👑 Roque (castling) — lado rei e lado dama.

<img width="519" height="536" alt="Image" src="https://github.com/user-attachments/assets/c3ed3370-1443-4e37-8661-a0ed8f071d04" />

⚡En passant.

<img width="716" height="577" alt="Image" src="https://github.com/user-attachments/assets/c701d9f4-7166-4c62-9929-28d67ce49883" />

 🔄 Promoção de peão (promoção automática para rainha, com possibilidade de troca).

<img width="617" height="545" alt="Image" src="https://github.com/user-attachments/assets/2e4b2891-be61-4c89-986e-df3c4d9e8582" />

🚨 Verificação de xeque e xeque-mate.

🔄 Controle de turnos e validação de jogadas.

## 📜 Histórico de peças capturadas.

<img width="197" height="82" alt="Image" src="https://github.com/user-attachments/assets/3a3ea141-41a2-432c-8a5e-577f04371b81" />

## 🗂️ Estrutura do projeto
🟦 boardgame — Classes genéricas do tabuleiro (Board, Piece, Position).

♟️ chess — Lógica do xadrez, incluindo partida (ChessMatch), peças específicas (ChessPiece), posições de xadrez (ChessPosition) e exceções (ChessException).

👑 chess.pieces — Implementação de cada peça do xadrez (King, Queen, Rook, Bishop, Knight, Pawn).


## 🚀 Como usar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seuusuario/chess-java.git
Compile o projeto usando sua IDE favorita ou via terminal com javac.

Execute a classe principal que inicia a partida (exemplo):

bash
Copiar
Editar
java chess.App
Utilize o terminal ou interface (se implementada) para fazer movimentos no formato padrão, como e2 para posição origem e e4 para destino.


## 🎲 Exemplo de movimentos especiais
👑 Roque do lado do rei: move o rei duas casas para a direita e a torre para a casa ao lado do rei.

👸 Roque do lado da dama: move o rei duas casas para a esquerda e a torre para a casa ao lado do rei.

⚡ En passant: captura especial do peão adversário em movimento diagonal após avanço de duas casas.

🔄 Promoção: peão que alcança a última linha pode ser promovido a qualquer peça (normalmente rainha).


## 🛠️ Tecnologias
☕ Java 11+
🧱 Paradigma Orientado a Objetos

🚨 Uso de exceções personalizadas para regras do jogo
