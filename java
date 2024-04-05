const phrases = [
    "Hello my name is Jessie Kang. Nice to meet you.Have a nice summer.",
    "Your eyes have a little green in them.",
    // Add more phrases here if needed
];

let currentPhraseIndex = 0; // Initialize current phrase index

newButton.addEventListener('click', () => {
    currentIndex = 0; // Reset currentIndex
    const currentPhrase = phrases[currentPhraseIndex]; // Get the current phrase
    for (let i = 0; i < letters.length; i++) {
        letters[i].textContent = currentPhrase[i] || '';
        letters[i].dataset.letter = currentPhrase[i] || '';
        letters[i].style.color = '#9ca3af';
    }
    currentPhraseIndex = (currentPhraseIndex + 1) % phrases.length; // Rotate to the next phrase
});
