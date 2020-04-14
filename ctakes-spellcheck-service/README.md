# Spell Check


## Setup
There is a tiny sample dictionary file in the dictionaries directory. You can replace this with your when you are ready. Dictionaries are read from here on startup of the application. 
```
mvn clean package
java -jar rest-service/target/spellcheck-service*.jar --dictionariesDirectory=dictionaries
```

## Limitation
The service is not able to process words shorter than three characters in length. Any words shorter than three characters will simply be ignored.
