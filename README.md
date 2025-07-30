♟️ Projeto Xadrez em Java - Chess Game
Este projeto é uma implementação completa do jogo de xadrez em Java, com regras oficiais e movimentos especiais, utilizando orientação a objetos e abstrações para tabuleiro, peças e regras do jogo.

✨ Funcionalidades principais
🏁 Implementação do tabuleiro 8x8.

♔ Todas as peças oficiais do xadrez: Rei, Rainha, Torre, Bispo, Cavalo e Peão.

✅ Movimentos básicos de cada peça, validados conforme regras do xadrez.

🎯 Tratamento de movimentos especiais:

👑 Roque (castling) — lado rei e lado dama.

⚡ En passant.

🔄 Promoção de peão (promoção automática para rainha, com possibilidade de troca).

🚨 Verificação de xeque e xeque-mate.

🔄 Controle de turnos e validação de jogadas.

📜 Histórico de peças capturadas.

🗂️ Estrutura do projeto
🟦 boardgame — Classes genéricas do tabuleiro (Board, Piece, Position).

♟️ chess — Lógica do xadrez, incluindo partida (ChessMatch), peças específicas (ChessPiece), posições de xadrez (ChessPosition) e exceções (ChessException).

👑 chess.pieces — Implementação de cada peça do xadrez (King, Queen, Rook, Bishop, Knight, Pawn).

🚀 Como usar
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

🎲 Exemplo de movimentos especiais
👑 Roque do lado do rei: move o rei duas casas para a direita e a torre para a casa ao lado do rei.

👸 Roque do lado da dama: move o rei duas casas para a esquerda e a torre para a casa ao lado do rei.

⚡ En passant: captura especial do peão adversário em movimento diagonal após avanço de duas casas.

🔄 Promoção: peão que alcança a última linha pode ser promovido a qualquer peça (normalmente rainha).

🛠️ Tecnologias
☕ Java 11+

🧱 Paradigma Orientado a Objetos

🚨 Uso de exceções personalizadas para regras do jogo


