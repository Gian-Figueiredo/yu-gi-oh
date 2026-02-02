# Yu-gi-oh Simplificado
A ideia geral é criar um jogo de cartas semelhante ao Yu-gi-oh!, porém com regras mais simples e acessíveis.

# Regras
## Objetivo
**Vitoria**: vence o jogador que zerar os pontos de vida do oponente, cada um inicia com 8000 pontos.

**monstros**: cada carta é um monstro que possui atributos de ataque e defesa, em batalha um monstro pode ficar em modo de ataque ou defesa, casa o ataque de um supere o ataque do outro e eles lutem, o com menor pontuação é destruido, em caso de empate ambos serão destruidos, caso o ataque seja direcionado a um monstro em modo defesa, se o ataque do atacante superar a defesa o monstro será destruido, mas no caso contrario, a defesa do defensor for maior, o atacante não é destruido e a diferença é recebida como dano pelo jogador que atacou, assim como para os outros casos, que exceto em ataque direto ao player quando o ataque do monstro é deferido em sua totalidade ao hp do player, a diferença no status do ataque do monstro vencedor para o perdedor é convertida em dano.

**efeitos**: monstros tem atributos de de tipo, guerreiro, zumbi; elemento, luz, fogo; esses tem vatangens sobre outros, guerreiro tem vatangem sobre zumbi, fogo sobre gelo, isso dá temporariamente um boost no ataque e na defesa do monstro.

## Cartas
Cada carta terá um elemento e um tipo, com isso haverá várias interações entre elementos e tipos, com alguns possuindo vantagem em relação a outros.

O Monstros do tipo guerreiro dão mais dano nos Monstros do tipo zumbi, os Monstros do tipo zumbi dá mais dano em Monstros do tipo fada e Monstros do tipo fada dão mais dano nos Monstros do tipo guerreiro

Monstros do elemento escuridão dão mais dano nos Monstros do elemento fogo, Monstros do elemento fogo dão mais dano nos Monstros do elemento ar e os Monstros do elemento ar dão mais dano nos Monstros do elemento escuridão.

Caso um monstro tenha uma vantagem, ele derá 1.5x de dano, caso ele tenha duas vantagem ele derá 3x de dano e caso ele tenha uma vantagem e uma desvantagem ele dará 1.5x de dano, mas tomará 1.5x de dano

### Ataque e defesa
* **Ataque**: A carta ataca uma carta do oponente. Se o oponente não estiver carta na mão, ele perde os pontos de vida. Se sofrerem um ataque, o dano é subtraído da sua defesa.\
* **Defesa**: A carta usa sua defesa para defender ataques. Se o dano do ataque for maior que sua defesa, a carta morre e o restante do dano vai direto para o jogador. Se a carta sobreviver, sua defesa é diminuída pelo ataque.

## Fluxo do jogo
### Começo
Cada jogador possui seu deck (um conjunto de 40 cartas escolhido aleatoriamente)\
Cada jogador compra cinco cartas de seu deck antes da fase de preparação, essas cartas ficam na mão jogador\
É decidido quem começa primeiro

### Turno
Em cada rodada, o jogador precisa puxar cartas do deck até ter 5 cartas na mão.\
Cartas podem usar seus efeitos ou atacar\
Quando o jogador decidir finalizar seu turno, passa para a turno do oponente

# Diagrama de classes
![Diagrama de classe](https://img.plantuml.biz/plantuml/png/RLFBRjim4BppAmYTt0HIdI0dmp2YMhBXeguA9Rxa4b0IvR0LIPUYWW95FwR77leL_h4EPRqAv4Jkpd1sTadUrvOPsyYAv1MhQ_e5aIWO_KbyQhayQRgWKMEO5LeXPNJ1W2weK1RXLtraXJOtI7oyRCVaxIHv3Rx81JET_EmTm5Sj2Y1SvToODw1VfFFKgRIUb9PyGH-i4Ug8yEKqU2bu_isPnG9LPyAi8VcMeEEqQhaZrC0hKTjbIr-HvsUSPmNyQjLfc5dB1B5Tf-vbnWohNa0Pia50Ktuq40u2yab8OM5Pdd__45B39hsRTuL7HssLeK4wwP1PzhtXaovBNeyNO4LxGuzOzbhLrcWaUSKbLzO1SRU5qvnLULCn4p6bPwnwTV2wxyQfeUbJ9U0iBhcm-h-vSTN8QHLOtHxYD8rtQKAU3liFEnB5--JpBY6RC0g78trzy1z13qcOaasoJKZyi3wakoXC7BL_TDwDHwzydtgttd3f6BbMzln7aZupiB16bqllAMquuFCWk9jxtMn7qYNs_TNepZsRKYW-mQRD3Z1HsdAQQMkrfBgyI9Db1gbsPZNbzOddvx-bo14itsShSaMV6fa9UaqBJ1uFXcxmXP3UDdZtN41_X5egHbTGLucGUspTv_m7)

# Organização dos pacotes
Foi divido em dois diretórios distinto, o bin, que armazenas os arquivos binários e o src que armazena os códigos fonte.

![Diagrama de diretórios](https://img.plantuml.biz/plantuml/png/PL0x3i8m3DrpYboWd82X4ZCBi2EJMCYGn5NiBbJSdJJYqnGFbln-Ud8l2bd76Cm0xWvNj9ATdOmjumA8s3rGCa-pv3TykQ5JQNIxaWDhOSQ1XPGpSIC-KS7F631YKfQrRLGAZVu0oNEa1tZE2_Z8MR5Y9M0kQhTTzsvITxqRymV-g_0bVg4z9Z-_vWK0)

# Paradigmas da orientação à objetos usados

# Padrões de projetos utilizados
