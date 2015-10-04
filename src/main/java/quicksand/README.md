nonc�

L'objet de ce challenge est de d�terminer la profondeur maximale des zones de sable mouvant d'un d�sert. Le d�sert est un rectangle compos� de cases de terre ferme ou de sable mouvant. La profondeur d'une case de sable mouvant est le nombre minimal de d�placements horizontaux et/ou verticaux � effectuer pour acc�der � une case de terre ferme.



Dans l'exemple ci-dessus les cases de terre ferme sont repr�sent�es par des . et les chiffres repr�sentent la profondeur des cases de sable mouvant. La case en rouge a une profondeur de 2 car il faut faire au moins deux d�placements horizontaux et/ou verticaux (par exemple, un vers le haut et un vers la gauche, ou bien 2 vers la gauche) pour atteindre la terre ferme.

La terre ferme n'est pas n�cessairement connexe, il peut y avoir des �les de terre ferme au milieu des sables mouvants. Par ailleurs, sur tout le contour de la carte rectangulaire, il n'y a que de la terre ferme.

Format des donn�es

Entr�e
Ligne 1 : deux entiers H et L compris entre 3 et 40 s�par�s par un espace, indiquant respectivement la hauteur et la largeur de la carte.
Lignes 2 � H+1 : les lignes de la carte repr�sent�es par des cha�nes de L caract�res. Les caract�res de la ligne sont soit . (terre ferme) soit # (sable mouvant).

Sortie
Un entier repr�sentant la profondeur maximale des zones de sable mouvant du d�sert.