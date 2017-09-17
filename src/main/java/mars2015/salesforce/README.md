L'une des missions d'un d�veloppeur SalesForce est de qualifier sa base de donn�es afin de permettre aux commerciaux de travailler avec des informations pertinentes.
Dans ce challenge, vous devez valider les enregistrements issus d'une extraction de la base. Pour �tre valide, un enregistrement doit satisfaire 3 crit�res : il ne doit pas correspondre � un doublon, la format de son t�l�phone doit �tre valide et il doit appartenir � votre zone. Les fa�ons d'�valuer les crit�res sont les suivantes :
- Deux lignes sont consid�r�es comme des doublons si elles ont les m�mes nom, pr�nom et soci�t�.
- Un num�ro de t�l�phone est valide s'il a le format suivant +X-YYYYYYYYYYY o� X est une suite de 1 � 3 chiffres et YYYYYYYYYYY est une suite de 9 � 11 chiffres. Pour qu'un num�ro soit valide il doit aussi contenir le caract�re + avant X et - entre X et Y.
- Votre zone est un ensemble de pays. L'enregistrement correspond � votre zone si son pays est inclus dans votre liste de pays.


Format des donn�es

Entr�e

Ligne 1 : un entier N compris entre 5 et 500 repr�sentant le nombre de lignes dans l'extraction.
Ligne 2 : La liste des pays appartenant � votre zone repr�sent�e par une s�rie de cha�nes de caract�res en minuscules non accentu�es. Les cha�nes sont s�par�es par des ; (point-virgule).
Ligne 3 � N+2 : le nom, pr�nom, soci�t�, t�l�phone et pays du client s�par�s par des ; (point-virgule). Les informations sont compos�es par : des lettres minuscules non accentu�es, des chiffres et les caract�res - et +. 

Sortie

3 nombres entiers X Y Z s�par�s par des espaces.
X est un entier repr�sentant le nombre de doublons
Y est un entier repr�sentant le nombre d'enregistrements incluant un format de t�l�phone erron� 
Z est un entier repr�sentant le nombre d'enregistrements situ�s hors de votre zone.

Si une ligne appara�t k fois alors elle compte pour k-1 doublons.

Un enregistrement avec � la fois un t�l�phone erron� et un pays en dehors de votre zone doit �tre comptabilis� pour d�terminer Y et Z. Par contre, si un enregistrement existe en doublon alors la ou les occurrences suivantes de l'enregistrement doivent �tre ignor�es et ne doivent pas �tre prises en compte pour d�terminer Y et Z.