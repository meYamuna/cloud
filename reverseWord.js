function reverseWords(sentence) 
{
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    return reversedWords.join(' ');
}

const input = 'this is a sunny day';
const reversed = reverseWords(input);
console.log('Reversed sentence:',reversed);