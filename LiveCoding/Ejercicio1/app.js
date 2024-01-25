const wordsArray = ['caramelo', 'mosca', 'gato', 'lavadero', 'taco', 'computadora', 'ratón'];
const wordString = "banda";

const wordLarge = (str, array) => {
    return array.filter(word => word.length > str.length);
};

const resultado = wordLarge(wordString, wordsArray);
console.log(resultado);
