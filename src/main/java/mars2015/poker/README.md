Enonc�

Dans ce challenge, l'objectif est de d�terminer la somme qu'a un joueur � la fin d'une partie de mars2015.poker. Le joueur dispose d'une somme initiale. � chaque tour, le joueur mise un montant X. Puis il gagne un montant Y pouvant �tre positif ou nul. Le bilan pour chaque tour est donc -X+Y.

Votre code doit renvoyer le montant restant au joueur � la fin de la partie.

Format des donn�es

Entr�e
Ligne 1 : un entier entre 1 000 et 10 000 repr�sentant la somme dont le joueur dispose au d�part.
Ligne 2 : un entier N entre 10 et 45 repr�sentant le nombre de tours jou�s.
Lignes 3 � N+2 : deux entiers positifs ou nuls s�par�s par un espace repr�sentant X et Y tels que d�finis dans l'�nonc�.

La s�rie des mises et des montants remport�s fait que le joueur ne sera jamais ruin� et aura toujours un montant restant positif ou nul.


Sortie
Un entier indiquant la somme restante au joueur � la fin de la partie.