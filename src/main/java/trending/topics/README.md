�nonc�

Les trending topics sont des hashtags fr�quents sur Twitter. Dans ce challenge on va consid�rer qu'il se cr�e un trending topic si un hashtag appara�t au minimum 40 fois dans une fen�tre de 60 minutes.

Le but de ce challenge est de d�terminer s'il existe un trending topic dans un flux de hashtags. On consid�re qu'il s'�coule une minute entre deux hashtags du flux et donc qu'une fen�tre de 60 minutes contient 60 tags.

Format des donn�es

Entr�e
Ligne 1 : un entier N compris entre 1 et 1000 correspondant au nombre de hashtags du flux.
Lignes 2 � N+1 : un hashtag Twitter. Un hashtag est compos� de lettres minuscules non accentu�es pr�c�d�es par le symbole #.

Sortie
Une chaine de caract�res (commen�ant par le symbole #) correspondant au premier (chronologiquement) trending topic s'il y en a un, sinon la cha�ne Pas de trending topic