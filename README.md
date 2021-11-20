# DSL CSV

## Conception

Le langage est conçu avec un typage faible afin que l'utilisateur ait le moins de question de types à se poser.

### Métamodèle

Le métamodèle du langage est relativement simple. La taille du graphe est due au nombre de méthodes primitives définies.

## Implémentation

### Dépendances

* La bibliothèque `dslcsv` (qui elle-même requiert `common-langs3`) est requise pour l'interpréteur. Ces deux bibliothèques sont fournies au format JAR dans le dossier `fr.irisa.dslcsv/external-jars`.

### Interpréteur

TODO

Le typage faible a amené à de nombreux problèmes de typage difficilement solubles. Ainsi, un sous ensemble assez restreint a été implémenté.

* L'évaluation de constantes
    * Entiers
    * Chaînes de caractères
    * Vecteurs de type arbitraire
* Méthodes essentielles
    * 


### Fichiers écrits

TODO


