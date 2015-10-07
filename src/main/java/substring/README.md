
�nonc�

Une cha�ne X est sous-s�quence d'une cha�ne Y si l'on retrouve toutes les lettres de X dans la cha�ne Y dans le bon ordre. Par exemple:
- aab est une sous-s�quence de aacb.
- aab n'est pas une sous-s�quence de aba.

Dans ce challenge, vous devez d�terminer si une cha�ne est une sous-s�quence d'une autre cha�ne.

Format des donn�es

Entr�e
Ligne 1 : la cha�ne de caract�res X
Ligne 2 : la cha�ne de caract�res Y
La longueur de chaque cha�ne ne d�passe pas 1000 caract�res.

Sortie
La cha�ne de caract�res OK si X est une sous-s�quence de Y.
Sinon, la cha�ne de caract�res NOK n o� n repr�sente la longueur (�ventuellement 0) du plus grand pr�fixe de X qui soit sous-s�quence de Y. On entend par pr�fixe de longueur n, la sous-cha�ne �gale aux n premiers caract�res de X.
