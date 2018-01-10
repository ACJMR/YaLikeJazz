# YaLikeJazz
Colin Hosking
<br>
George Liang
<br>
Xinyi Huang 

# Project Vision 
Juno is a recreation of the famous card game UNO. The user will be able to play against other human players by selecting the number of players, 
then taking turns when it is the right turn for each user. The objective is to come out number one against other players by playing all the cards in your hand. 

# Lauch Instructions
To begin a new game: <br>
1) compile Woo.java in the terminal.

	$ javac Woo.java

2) run Woo.java.

	$ java Woo.java

3) select how many players you desire. <br>
The game will begin, please pass the device between players for their respective turns.

# Rules of Juno
1. Card Types
	* Each card is one of four suites (Red, Green, Yellow, Blue) 
	* 0 - 9 Numbered Cards 
	* Skip Turn --skips the next player’s turn
	* Reverse -- reverses the turn sequence 
	* Draw Two -- the following player draws two cards
	* Wild Card -- player selects a suite to change the gameplay
	* Wild Card Draw Four - player selects a suite to change to and the next player draws four cards 
2. Setup
	* 2-4 players (user selected) are dealt 7 cards each from a shuffled deck
	* One card is revealed to begin the “center pile”, the remaining cards are placed in another “draw pile” where players draw their cards from
3. Gameplay 
	* Each player takes turns playing one of their cards into the “center pile”
	* In order to be placed in the center, a card must be either...
	* - The same suite (color) as the center card
	* - The same card-type as the center card
	* - Any type of wildcard
	* If a player has no playable cards, they must draw cards from the “draw pile” until they have a playable one
	* A player wins when they have zero cards
