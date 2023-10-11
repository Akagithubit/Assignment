function reverseWordsAndSort(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");
    
    // Reverse each word and store them in a new array
    let reversedWords = words.map(word => {
      return word.split("").reverse().join("");
    });
    
    // Sort the reversed words in descending order
    reversedWords.sort((a, b) => {
      return b.localeCompare(a);
    });
    
    // Join the sorted reversed words back into a sentence
    let reversedAndSortedSentence = reversedWords.join(" ");
    
    return reversedAndSortedSentence;
  }
  
  // Ask the user for input
  const inputSentence = prompt("Please enter a sentence:");
  if (inputSentence !== null) {
    const result = reverseWordsAndSort(inputSentence);
    console.log(result);
  } else {
    console.log("You canceled the input.");
  }