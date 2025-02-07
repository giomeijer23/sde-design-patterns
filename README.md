# SDE-Design-Patterns: Galgje

Dit Java-project is een console-applicatie van het klassieke spel Galgje. Het maakt gebruik van verschillende design patterns om de code overzichtelijk, flexibel en efficiënt te houden.
Gebruikte Design Patterns

## Gebruikte Design Patterns

1. **Singleton Pattern**: De `WordAdapter` class is geïmplementeerd als een Singleton, wat garandeert dat er slechts één instantie van deze class wordt gebruikt voor het controleren van letters in het woord.

2. **Factory Pattern**: De `IHangmanStateFactory` class is verantwoordelijk voor het creëren van verschillende toestanden van het spel, zoals het spelen, winnen, verliezen en beëindigen.

3. **Proxy Pattern**: De `PlayingStateProxy` class beheert de fouten en de geraden letters van de speler. Het voorkomt dubbele pogingen om dezelfde letter te raden en houdt het aantal fouten bij.

4. **State Pattern**: De verschillende toestanden van het spel (spelen, winnen, verliezen) worden beheerd via de `AHangmanState` abstracte klasse en de concrete implementaties zoals `PlayingState`, `WinState`, `LoseState` en `EndState`.

5. **Builder Pattern**: De `HangmanGameBuilder` class wordt gebruikt om het `HangmanContext` object op te bouwen, wat het creëren van complexe objecten vereenvoudigt.

6. **Decorator Pattern**: De `TimestampedConsoleWriter` class voegt een timestamp toe aan elke geschreven regel, wat een voorbeeld is van het Decorator Pattern.

# Samenwerking
Het project is gehost op GitHub en ingeleverd als zip-bestand. Tijn heeft het State Pattern en een basis voor het spel gemaakt. Gio heeft de Factory, Singleton en Proxy patterns geïmplementeerd. Samen hebben we het project afgerond met een gelijke inzet.

Bij de tweede poging hebben we samengewerkt via pair programming. Op basis van de feedback van de docent hebben we gezamenlijk de fouten geanalyseerd en verbeterd.
