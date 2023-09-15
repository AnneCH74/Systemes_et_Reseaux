SERVICE DNS

DNS : Domain Name System (Système de Noms de Domaine)

Ce service permet de faire la correspondance entre des noms et des adresses IP. On peut le voir comme une sorte d’annuaire. Ce service repose
sur un protocole également appelé DNS.

Il existe 2 types de nommage pour une machine :

    le nom de domaine ;

    le nom d’hôte, couramment appelé “hostname”.

Le nom d’hôte est utilisé pour identifier une machine.

Le nom de domaine sert plutôt à identifier un service sur une machine, c’est-à-dire une fonctionnalité, comme un site web ou le stockage de
fichiers, par exemple.

Le serveur DNS permet d’associer une adresse IP à un nom d’hôte ou à un nom de domaine, ou aux deux en même temps. Une même machine peut
également être associée à plusieurs noms d’hôte ou noms de domaine.



Objectifs de l’activité :
Découvrir le concept de service DNS et savoir l’implémenter dans une architecture.

30/06/2023

Livrable 1 : 

- Quel est l’ordre des actions (Requête/Réponse DNS, ping) effectuées pour réaliser lorsque, depuis le PC10, j’utilise la commande ping PC11 ?
Attention : le PC10 ne connaît pas l’adresse IP de PC11.

1) PC 10 fait un ping vers PC11
2) Le ping passe par le Switch
3) Puis il passe par le serveur DNS où il récupère l'adresse IP du PC11 pour savoir où il doit se rendre
4) Le ping repart vers le Switch
5) Le switch l'envoie à destination du PC11


Livrable 2 - Déployez et configurez un serveur DNS sur Cisco Packet Tracer


