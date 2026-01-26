# Yu-gi-oh Simplificado
A ideia geral é criar um jogo de cartas semelhante ao Yu-gi-oh!, porém com regras mais simples e acessíveis.

# Regras
## Objetivo
Cada jogador possui pontos de vida\
O objeto é reduzir os pontos de vida do oponente a zero.

## Tipos de carta
### Cartas de monstros
As chamadas cartas normais\
Possuem tipo e elemento\
Podem atacar ou defender

### Cartas de efeito
Essas cartas servem apenas para aplicar Buff e Debuff em tipos e/ou elementos de cartas

## Fluxo do jogo
### Começo
Cada jogador possui seu deck (um conjunto de 40 cartas escolhido aleatoriamente)\
Cada jogador compra cinco cartas de seu deck antes da fase de preparação, essas cartas ficam na mão jogador

### Fase de preparação
Nessa fase é escolhido aleatoriamente quem começa.\
Não pode atacar ainda.\
Nessa fase, pode escolher apenas colocar uma carta em modo de defesa ou usar um carta de efeito

### Turno
Em cada rodada, o jogador precisa comprar cartas até ter 5 cartas na mão.\
O jogador pode escolher ações para cada carta.\
Cartas de monstros podem entrar em modo de ataque ou modo de defesa\
Cartas de efeito podem usar seus efeitos ou fazer nada
Quando o jogador decidir finalizar seu turno, passa para a turno do oponente

### Modos de ataque e defesa
* **Modo de ataque**: Nesse modo, a carta ataca uma carta do oponente. Se o oponente não estiver carta de monstro na mão, ele perde os pontos de vida. Se sofrerem um ataque, o dano é subtraído do seu ponto de ataque, se ficar igual ou abaixo de zero, a carta morre e o restante do dano vai para o jogador.\
* **Modo de defesa**: Nesse modo, a carta usa sua defesa para defender ataques. Se o oponente atacar cartas em modo de defesa, o dano é subtraído de sua defesa, se ficar igual ou abaixo de zero, a carta morre e o restante do dano vai para o jogador.\

# Diagrama de classes
![Diagrama de classe](https://img.plantuml.biz/plantuml/png/RLFBRjim4BppAmYTt0HIdI0dmp2YMhBXeguA9Rxa4b0IvR0LIPUYWW95FwR77leL_h4EPRqAv4Jkpd1sTadUrvOPsyYAv1MhQ_e5aIWO_KbyQhayQRgWKMEO5LeXPNJ1W2weK1RXLtraXJOtI7oyRCVaxIHv3Rx81JET_EmTm5Sj2Y1SvToODw1VfFFKgRIUb9PyGH-i4Ug8yEKqU2bu_isPnG9LPyAi8VcMeEEqQhaZrC0hKTjbIr-HvsUSPmNyQjLfc5dB1B5Tf-vbnWohNa0Pia50Ktuq40u2yab8OM5Pdd__45B39hsRTuL7HssLeK4wwP1PzhtXaovBNeyNO4LxGuzOzbhLrcWaUSKbLzO1SRU5qvnLULCn4p6bPwnwTV2wxyQfeUbJ9U0iBhcm-h-vSTN8QHLOtHxYD8rtQKAU3liFEnB5--JpBY6RC0g78trzy1z13qcOaasoJKZyi3wakoXC7BL_TDwDHwzydtgttd3f6BbMzln7aZupiB16bqllAMquuFCWk9jxtMn7qYNs_TNepZsRKYW-mQRD3Z1HsdAQQMkrfBgyI9Db1gbsPZNbzOddvx-bo14itsShSaMV6fa9UaqBJ1uFXcxmXP3UDdZtN41_X5egHbTGLucGUspTv_m7)

# Organização dos pacotes
Foi divido em dois diretórios distinto, o bin, que armazenas os arquivos binários e o src que armazena os códigos fonte.

![Diagrama de diretórios](https://img.plantuml.biz/plantuml/png/PL0x3i8m3DrpYboWd82X4ZCBi2EJMCYGn5NiBbJSdJJYqnGFbln-Ud8l2bd76Cm0xWvNj9ATdOmjumA8s3rGCa-pv3TykQ5JQNIxaWDhOSQ1XPGpSIC-KS7F631YKfQrRLGAZVu0oNEa1tZE2_Z8MR5Y9M0kQhTTzsvITxqRymV-g_0bVg4z9Z-_vWK0)

# Paradigmas da orientação à objetos usados

# Padrões de projetos utilizados
