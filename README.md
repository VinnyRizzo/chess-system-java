## ♟ Projeto Xadrez em Java
Este projeto é uma implementação completa do jogo de xadrez usando Java e princípios da programação orientada a objetos, com todas as regras oficiais do jogo, incluindo movimentos especiais como roque, en passant e promoção de peão.

## ✨ Funcionalidades Principais
🧩 Tabuleiro 8x8 renderizado via terminal

♔ Todas as peças oficiais: Rei, Rainha, Torre, Bispo, Cavalo e Peão

✅ Movimentos básicos validados conforme as regras do xadrez

🔁 Controle de turnos e validação de jogadas

👀 Verificação de xeque e xeque-mate

📜 Histórico de peças capturadas

## 🎯 Movimentos Especiais
👑 Roque (castling) — lado do rei e lado da dama
<img width="519" height="536" alt="Roque" src="https://github.com/user-attachments/assets/c3ed3370-1443-4e37-8661-a0ed8f071d04" />
⚡ En passant
<img width="716" height="577" alt="En Passant" src="https://github.com/user-attachments/assets/c701d9f4-7166-4c62-9929-28d67ce49883" /> 
🔄 Promoção de Peão (automática para Rainha com opção de troca)
<img width="617" height="545" alt="Promoção" src="https://github.com/user-attachments/assets/2e4b2891-be61-4c89-986e-df3c4d9e8582" />

## 📸 Ilustrações
🧩 Tabuleiro no Terminal
<img width="641" height="273" alt="Tabuleiro" src="https://github.com/user-attachments/assets/2cf51981-5068-4e43-a765-96754bd844f5" />
♘ Todas as Peças
<img width="575" height="347" alt="Peças" src="https://github.com/user-attachments/assets/6e0f35a7-6c97-4893-b182-7f76b4de5774" />
## 📜 Histórico de Peças Capturadas
<img width="197" height="82" alt="Capturas" src="https://github.com/user-attachments/assets/3a3ea141-41a2-432c-8a5e-577f04371b81" />
## 🗂️ Estrutura do Projeto
bash
Copiar
Editar
src/
├── boardgame/       # Lógica genérica do tabuleiro
│   ├── Board.java
│   ├── Piece.java
│   └── Position.java
│
├── chess/           # Lógica específica do jogo de xadrez
│   ├── ChessMatch.java
│   ├── ChessPiece.java
│   ├── ChessPosition.java
│   └── ChessException.java
│
└── chess/pieces/    # Implementação das peças (Rei, Rainha, etc.)
    ├── King.java
    ├── Queen.java
    ├── Rook.java
    ├── Bishop.java
    ├── Knight.java
    └── Pawn.java
🚀 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seuusuario/chess-java.git
Compile o projeto:

Via IDE (IntelliJ, Eclipse etc.)

Ou via terminal:

bash
Copiar
Editar
javac chess/App.java
Execute a classe principal:

bash
Copiar
Editar
java chess.App
Use o terminal para jogar com comandos no formato padrão:

Exemplo:

e2 → posição de origem

e4 → posição de destino

🎲 Exemplos de Movimentos Especiais
👑 Roque do Rei: Rei anda duas casas para a direita e a torre salta por cima dele

👸 Roque da Dama: Rei anda duas casas para a esquerda com a torre vindo do canto

⚡ En Passant: Captura especial do peão após avanço duplo do oponente

🔄 Promoção: Peão que alcança a última linha vira outra peça (normalmente Rainha)

## 🛠️ Tecnologias Utilizadas
☕ Java 11+

🧱 Programação Orientada a Objetos (POO)

🚨 Uso de exceções personalizadas para regras específicas do jog
