# Zork — a text adventure in Java

L2 double degree in mathematics and computer science (Université Sorbonne Paris Nord, Institut Galilée),
object-oriented programming, November 2023.

The course's French version of *Zork* (Michael Kölling's classic teaching game, translated by Marc Champesme):
the player walks between rooms of the Paris 13 campus with commands typed in the terminal (`aller nord`,
`aide`, `quitter`), parsed by `AnalyseurSyntaxique` into `Commande`s.

The exercise was to extend it. My additions here: **`ObjetZork`** (an object with a name, a description, a
weight and whether it can be carried) and rooms that hold objects (`Piece`), the first step towards picking
objects up and carrying them.

```sh
javac *.java && java Zorkfr
```

The other classes are the skeleton given with the subject (their `@author` tags say so).
