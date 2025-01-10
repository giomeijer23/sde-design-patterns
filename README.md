SDE-Design-Patterns: Galgje

Dit Java-project is een console-applicatie van het klassieke spel Galgje. Het maakt gebruik van verschillende design patterns om de code overzichtelijk, flexibel en efficiënt te houden.
Gebruikte Design Patterns

1. State Pattern
Regelt de verschillende speltoestanden: spelen, gewonnen, of verloren. 
2. Factory Method Pattern
Via de StateFactory worden toestanden zoals PlayingState, WinState, en LoseState op een centrale en onderhoudbare manier aangemaakt. 
3. De WordAdapter zorgt ervoor dat er slechts één instantie wordt gebruikt, wat consistentie garandeert en het geheugen optimaliseert. 
4. Proxy Pattern
De LetterProxy voorkomt dat spelers dezelfde letter meerdere keren raden, wat zorgt voor een betere gebruikerservaring.
Samenwerking

Het project is gehost op GitHub en ingeleverd als zip-bestand. Tijn heeft het State Pattern en een basis voor het spel gemaakt. Gio heeft de Factory, Singleton en Proxy patterns geïmplementeerd. Samen hebben we het project afgerond met een gelijke inzet.
