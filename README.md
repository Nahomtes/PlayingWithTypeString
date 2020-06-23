# UsingStringMethods

Assignment:
Create a program that will allow users to enter a word, and a character number index. Your program will print out the size of the word, as well as the substring (starting from 0) to the index the user specified. If the user entered index is larger than the size of the word, the program will print "Index is larger than length".

    BEGIN
        PROMPT: Enter a word
        GET word
        PROMPT: Enter a number as an index:
        Get index
        
        Set wordLength = word.length
        Set subStringWord = SubString word from 0 to index
        
        IF index > wordLength THEN
            Display: "Index is larger than lenth."
        ELSE
            Display: "The length of " + word + " is: " + wordLength
            Display: "The substring from 0 to " + index + " is: " + subStringWord
        ENDIF 
    
    END
