document.addEventListener('DOMContentLoaded', () => {
    const cardValues = ['A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E', 'F', 'F', 'G', 'G', 'H', 'H'];

    const memoryGame = document.getElementById('memoryGame');

    let selectedCards = [];
    let matchedCards = [];

    // Shuffle the card values
    cardValues.sort(() => Math.random() - 0.5);

    // Create the cards
    cardValues.forEach((value, index) => {
        const card = document.createElement('div');
        card.classList.add('card');
        card.dataset.value = value;
        card.addEventListener('click', flipCard);
        memoryGame.appendChild(card);
    });

    function flipCard() {
        const selectedCard = this;

        if (selectedCard.classList.contains('matched') || selectedCards.length === 2) {
            return;
        }

        selectedCard.classList.add('flipped');

        selectedCards.push(selectedCard);

        if (selectedCards.length === 2) {
            setTimeout(checkMatch, 500);
        }
    }

    function checkMatch() {
        const [card1, card2] = selectedCards;

        const isMatch = card1.dataset.value === card2.dataset.value;

        if (isMatch) {
            card1.classList.add('matched');
            card2.classList.add('matched');
            matchedCards.push(card1, card2);
        } else {
            card1.classList.remove('flipped');
            card2.classList.remove('flipped');
        }

        selectedCards = [];

        if (matchedCards.length === cardValues.length) {
            alert('Parabéns! Você ganhou o jogo!');
            resetGame();
        }
    }

    function resetGame() {
        memoryGame.innerHTML = '';
        matchedCards = [];
        cardValues.sort(() => Math.random() - 0.5);
        cardValues.forEach((value, index) => {
            const card = document.createElement('div');
            card.classList.add('card');
            card.dataset.value = value;
            card.addEventListener('click', flipCard);
            memoryGame.appendChild(card);
        });
    }
});
