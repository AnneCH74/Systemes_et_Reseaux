# Systemes_et_Reseaux

Mise en production d'applications sans conteneurisation

Objectifs de l’activité
Découvrir la méthode de mise en production d’un site web de manière non
conteneurisées et comprendre les limites de cette approches
Compétences
● Installer des packages sur Ubuntu
● Configuration de Nginx pour du reverse proxy
● Configuration d’un serveur web PHP afin que votre site web soit accessible
depuis l'extérieur


1 — Mise en situation
Vous venez d’être embauché dans l’entreprise TechFlow, une entreprise spécialisée
dans le développement d’applications web. Elle a su s’imposer comme une référence
dans le milieu par la qualité de leurs projets. Pour le développement de leur application,
ils utilisent le langage de programmation PHP de manière native (ps: c’est un exemple
pour l’exercice, dans le monde pro, une personne raisonnable ne fait pas ça ;) ).
Pour le déploiement de leur application, ils utilisent un serveur Ubuntu et sur lequel ils
utilisent PHP-FPM et Nginx pour pouvoir exposer leurs applications.


PHP-FPM (de l'anglais FastCGI Process Manager, littéralement "gestionnaire de processus FastCGI") est une interface SAPI permettant la communication entre un serveur Web et PHP, basée sur le protocole FastCGI.
PHP-FPM fut initialement écrit par Andrei Nigmatulin en 20041. Il constitue ainsi une alternative au serveur PHP avec des options pour les sites subissant de fortes charges. Contrairement au serveur PHP, il est fourni avec son propre daemon.
Il est livré avec PHP, depuis la version 5.3.3

PHP-FPM signifie PHP FastCGI Process Manager. Il s’agit d’une alternative à la façon dont PHP traite les requêtes par défaut, à savoir via mod_php. Au lieu de cela PHP-FPM s’exécute en tant que processus séparé qui communique avec le serveur web via le protocole FastCGI.

PHP-FPM offre un certain nombre d’avantages par rapport de mod_php. Tout d’abord, il est plus efficace dans la gestion de la mémoire et des ressources CPU, car il ne démarre les processus que lorsque c’est nécessaire et les réutilise ensuite pour de multiples requêtes puis les réutilise pour de multiples requêtes. Cela permet d’améliorer l’évolutivité et les performances, en particulier pour les grands sites web à fort trafic.
En outre, PHP-FPM offre une plus grande flexibilité dans la gestion des processus PHP. Par exemple, il est possible d’appliquer des paramètres spécifiques à différents groupes de processus, ce qui permet d’optimiser les performances des processus PHP. ce qui permet d’optimiser les performances et la stabilité du site web.



NGINX Open Source4 ou NGINX (également orthographié Nginx ou nginx) est un logiciel libre de serveur Web (ou HTTP) ainsi qu'un proxy inverse écrit par Igor Sysoev, dont le développement a débuté en 2002 pour les besoins d'un site russe à très fort trafic (Rambler).
NGINX est un système asynchrone par opposition aux serveurs synchrones où chaque requête est traitée par un processus dédié. Au lieu d'exploiter une architecture parallèle et un multiplexage temporel des tâches par le système d'exploitation, NGINX utilise les changements d'état pour gérer plusieurs connexions en même temps ; le traitement de chaque requête est découpé en de nombreuses mini-tâches et permet ainsi de réaliser un multiplexage efficace entre les connexions. Afin de tirer parti des ordinateurs multiprocesseurs, plusieurs processus peuvent être démarrés. Ce choix d'architecture entraine des performances très élevées, ainsi qu'une charge et une consommation de mémoire très inférieures à celles des serveurs HTTP classiques comme Apache. 

Nginx a été conçu conçu pour répondre au problème C10K où le but est d'être capable de répondre à plus de 10 000 reqêtes simultanées. Nginx est du coup plus performant lors d'un traffic important avec un système de worker. Là ou apache crée un processus par connexion, nginx lance une série de workers qui vont chacun être capable de gérer de multiples connexions d'une manière non bloquante.


* Schéma de l’interaction entre PHP-FPM, Nginx et votre code source quand un utilisateur souhaite accéder à la page d'accueil du site web :

User (web browser) envoie une requête http --> Serveur Nginx envoie la requête --> Application PHP-FPM traite la requête et envoie le résultat au serveur Nginx --> Nginx envoie la réponse à l'user










