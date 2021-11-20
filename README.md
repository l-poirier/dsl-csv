# DSL CSV

## Conception

Le langage est conçu avec un typage faible afin que l'utilisateur ait le moins de question de types à se poser.

### Métamodèle

Le métamodèle du langage est relativement simple. La taille du graphe est due au nombre de méthodes primitives définies.

Le diagramme est accessible dans le [dossier de documentation](doc/dslCsv%20class%20diagram.svg).

## Modèle

Au delà des types simples (String et Integer), le langage manipule deux autres types principaux :

* `File` représentant des données en deux dimensions
* `Vector` représentant des données à une seule dimension

## Implémentation

### Dépendances

* La bibliothèque `dslcsv` (qui elle-même requiert `common-langs3`) est requise pour l'interpréteur. Ces deux bibliothèques sont fournies au format JAR dans le dossier `fr.irisa.dslcsv/external-jars`.

### Interpréteur

Le typage faible a amené à de nombreux problèmes de typage difficilement solubles. Ainsi, un sous ensemble assez restreint a été implémenté.

* Évaluation de constantes
    * Entiers
    * Chaînes de caractères
    * Vecteurs de type arbitraire
* Assignation (enregistre le résultat de l'opérande de droite avec l'étiquette du membre de gauche)
* Variables (retourne la valeur enregistrée à la dernière assignation)
* Évaluation d'expressions (Logique bit-à-bit, opérations sur entiers, comparaisons d'entiers et de flottants)
* Méthodes essentielles
    * `Acquire` chargement d'un fichier en mémoire avec un séparateur donné et un booléen (y a-t-il une colonne d'identifiants ?)
    * `Save` (partiel) enregistre un fichier paramètres :
        * Nom de fichier
	* Fichier à enregisrer
	* Séparateur
	* Doit-on enregistrer les en-têtes ? (non implémenté)
	* Doit-on enregistrer la colonne id si elle existe ? (non implémenté)
    * `Select` sélectionne certaines colonnes d'un fichier (ne fonctionne pas correctement)
    * `Print` affiche en console un élément (les fichiers sont affichés avec des tabulations et retours à la ligne)


* La classe `InterpretationContext` représente le contexte d'interprétation (garde une trace des sorties standard et variables)

### Fichiers écrits

TODO

* `fr.irisa.dslcsv/src/fr/irisa/generator/TypeException.java` Compilateurs et interpréteurs
    * `TypeException.java` Exception de type détectée à la compilation
    * `ASTtoBash.xtend` Compilateur d'AST vers Bash
    * `ASTtoInterpretation.xtend` Interpréteur
    * `ASTtoPP.xtend` Pretty-printer
    * `DslCsvGenerator.xtend` Generator de XText (événements à l'enregistrement)




