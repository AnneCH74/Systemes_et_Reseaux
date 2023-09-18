# Systemes_et_Reseaux

Objectifs pédagogiques
● Comprendre comment se connecter à un serveur distant avec SSH
● Comprendre comment effectuer une mise en production “classique” sans conteneurisation
● Comprendre les limites d’une mise en production “classique”
● Comprendre l’utilité de la conteneurisation avec l’outil Docker
● Comprendre comment effectuer une mise en production de conteneur
● Comprendre les notions de CI/CD et développer une pipeline pour l’automatisation de la
mise en production


SSH :

SSH, ou Secure Shell, est un protocole cryptographique utilisé pour opérer des
services réseau de manière sécurisée. Il a été inventé par Tatu Ylönen en 1995, en
réponse à un piratage de mot de passe dans le réseau de son université.
SSH fonctionne en mode client-serveur. Le serveur SSH écoute sur un port
spécifique, généralement le port 22, pour les connexions entrantes. Une fois la
connexion établie, l'authentification est réalisée, soit par mot de passe, soit par clés
publiques/privées. Après une authentification réussie, un shell sécurisé ou une session
de commande est établie, permettant l'exécution de commandes à distance.
Pour ce faire, SSH utilise des mécanismes d’encryption symétriques et
asymétriques. Ne vous inquiétez pas, SSH le fait automatiquement pour vous quand
vous essayez de vous connecter à un serveur via SSH. Mais il est intéressant de
comprendre le concept.

SSH est un acronyme pour Secure Shell. Il s'agit d'un terme générique qui fait référence aux versions du protocole SSH, par exemple SSH-1 et SSH-2, et autres comme OpenSSH. Bien qu'il se réfère souvent à une version de SSH, il s'agit, à proprement parler, d'une suite composée d'utilitaires réseau, basés sur le protocole SSH.

Les protocoles SSH définissent des normes pour l'exploitation sécurisée des services réseau d'hôtes non approuvés à travers des réseaux non sécurisés. Les communications entre un client et un serveur utilisant SSH sont cryptées et sont donc idéales pour une utilisation sur les réseaux non sécurisés.

À l'origine, le mot shell dans SSH faisait référence à un programme de traitement des commandes Unix. Au fil du temps, le terme a été de plus en plus utilisé pour les interfaces utilisateur des serveurs, qui rendent l'interactivité plus conviviale avec ces derniers. Un autre exemple de shell utilisé couramment est l'interpréteur de commandes de Windows (cmd.exe), qui permet d'accéder aux outils du système d'exploitation Windows. SSH n'est pas un shell en soit, comme le shell Unix Bourne ou le shell C. Au lieu de cela, il crée un canal pour exécuter un shell sur un ordinateur à distance.

SSH gère plus de la moitié des serveurs Internet dans le monde, sur site et dans le Cloud. SSH est utilisé pour sécuriser, configurer, gérer, maintenir et exploiter les serveurs réseau, les routeurs, les pare-feux, les switchs, les systèmes d'exploitation et les applications. Les protocoles SSH incluent l'authentification, le cryptage et l'intégralité des données. SSH est si populaire qu'il est souvent utilisé comme verbe, comme Google qui utilise le terme SSH-ant.



1) Quels sont les protocoles qui ont été remplacés par SSH ?
Rlogin, rcp, rsh, telnet (port 23) et FTP (port 21).


2) Quels sont les différents modes d'utilisation de SSH (notamment au niveau de la sécurité) ?
Accès distant sur les stations Linux, Unix et Windows.
Transfert de ports TCP d'une machine vers une autre (en créant un tunnel).
Sécurisation d'une connexion qui ne l'est pas initialement (par exemple : protocole de récupérations de courrier électronique).
Effectuer des sauts entre consoles SSH, c-a-d ouvrir une console sur un serveur, puis, de là, en ouvrir une autre sur un autre serveur.


3) Comment est établie une connection SSH entre un client et un serveur avec la méthode la plus sécurisée (faites un schéma) ?
Le serveur SSH écoute sur un port spécifique, généralement le port 22, pour les connexions entrantes. Une fois la connexion établie, l'authentification est réalisée, soit par mot de passe, soit par clés
publiques/privées. Après une authentification réussie, un shell sécurisé ou une session de commande est établie, permettant l'exécution de commandes à distance. Pour ce faire, SSH utilise des mécanismes d’encryption symétriques et asymétriques.


SSH CLIENT : "HELLO!" ---->Clé publique qui crypte les données envoyées par le SSH CLIENT : "y6uW$i"------> Clé privée qui décrypte les données :"HELLO !"-------> SSH SERVER



Connexion SSH de ma machine à celle de mon binôme :
https://doc.ubuntu-fr.org/ssh


SCP : Secure Copy
SFTP : SSH File Transfert Protocol
SSHFS : SSH File System


Connexion à un serveur distant (ici anne@51.15.241.199) :

1) Se positionner sur sa bécane (ici utilisateur@utilisateur-hp...) => aller à la racine de mes dossiers utilisateur /home/utilisateur
$ cd .ssh
$ ls
$ ssh-copy-id -i ~/.ssh/id_rsa.pub anne@51.15.241.199
Renseigner le password
$ ssh anne@51.15.241.199




