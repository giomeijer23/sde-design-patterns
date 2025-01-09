# sde-design-patterns

Dit java project is een console programma van het spel galgje.

Dit project gebruikt meerdere design patterns:
1. De State design pattern om te controleren of het spel wordt gespeeld, of het overwonnen is of dat de speler heeft verloren. (behavioural design pattern)
2. Het project gebruikt het Adapter Design Pattern via de WordAdapter om woord- en lettercontrole los te koppelen van de spel-logica, wat zorgt voor flexibiliteit en herbruikbaarheid. (structural design patterns)
3. Het Factory Method Design Pattern via de StateFactory om toestanden zoals PlayingState, WinState, en LoseState op een gecentraliseerde manier te creëren, wat de code flexibeler en gemakkelijker te onderhouden maakt. (creational design patterns)
4. Het project gebruikt het Singleton Design Pattern via de WordAdapter om ervoor te zorgen dat er slechts één instantie van deze klasse wordt gebruikt, wat het geheugenverbruik optimaliseert en consistentie garandeert bij het controleren van letters in woorden.
5. Het project gebruikt het Proxy Design Pattern via de LetterProxy om te voorkomen dat spelers dezelfde letter meerdere keren raden. Dit zorgt voor een betere gebruikerservaring en voorkomt onnodige foutmeldingen.

