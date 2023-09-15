Memo SYSTEMES_ET_RESEAUX

Itération 1 : 29/06/2023

Modèle OSI

I - Le réseau, c'est quoi ?

- Quels sont les différents types de réseaux informatiques ? Pour chaque type de
réseau, donner un exemple concret :

Un réseau est un ensemble de machines informatiques reliées entre elles pour échanger des données.
Pour ce faire, elles ont besoin d’être connectées entre-elles, mais également de se comprendre via un protocole réseau.

1) Le pan (Personal Area Network) :
Le PAN permet d’échanger des données entre des appareils proches (généralement dans la même pièce). Pour ce faire, il existe 2 techniques de transmission physique, l’USB et le FireWire. Il est également possible de relier deux appareils via le WPAN (réseau personnel sans fil) avec des technologiques comme l’USB sans fil, le Bluetooth ou le Z-Wave.
Il est également possible de relier un réseau PAN vers d’autres réseaux plus grands.


2) Le lan (Local Area Network) :
Si vous avez besoin de relier plusieurs ordinateurs sur un réseau, vous créez un LAN ou réseau local. Pour ce faire,
nous utilisons le plus souvent le protocole Ethernet.

Pour connecter plus de 2 ordinateurs ensemble, il est nécessaire d’ajouter d’autres éléments, comme un hub ou un commutateur réseau.
Ces éléments agissent comme des noeuds de distribution ou des éléments de couplage.

Le LAN permet de transmettre une grande quantité de données rapidement. Celui-ci vous permet de partager des serveurs de fichiers,
imprimantes ou encore des applications.

Il est également possible de se connecter via le WLAN (Wireless Local Area Network) ou réseau local sans fil (Wifi).

Bien que les deux solutions soient possibles, l’Ethernet offre plus de sécurité et un débit de données plus important.


3) Le man (Metropolitan Area Network) :
Le MAN permet de relier plusieurs LAN proches. Celui-ci permet d’échanger très rapidement des données entre différentes branches d’une société par exemple.
En utilisant la fibre optique et des routeurs assez puissants, l’échange de données est plus rapide que via l’internet


4) Le wan (Wide Area Network) :
Le WAN permet de relier différentes machines très éloignées (à l’échelle d’un continent). Pour ce faire, le WAN se base sur les technologies des adresses IP,
de SDH ou encore des ATM.

Les WAN sont souvent gérés par nos fournisseurs de services Internet.


5) Le gan (Global Area Network) :
Basiquement, internet est un GAN, un réseau mondial permettant d'échanger des informations entre différents appareils. Mais internet n’est pas le seul GAN.
De nombreuses entreprises utilisent un GAN pour relier différents WAN ensemble. Les GAN utilisent des câbles sous marins et des transmissions par satellite.


6) Les différents réseaux informatiques le VPN :
VPN = Virtual Private Network = Réseau Privé Virtuel (RPV) ou Réseau Virtuel Privé (RVP)

Un VPN est un réseau de communication virtuel utilisant un réseau physique, mais éloigné de l’utilisateur. Cela permet de garantir une confidentialité des données échangées
sur un serveur public comme internet. Sachant que seules les données ne sont pas visibles que par les autres utilisateurs du réseau, l’on parle de Tunneling entre les deux utilisateurs.

Ces sigles sont généralement utilisés par des informaticiens réseau, cependant, il est important de comprendre comment fonctionne l’échange de données au sein de son entreprise.


- Quels sont les principaux équipements physiques d’un réseau LAN?
Le LAN constitue le premier réseau d’une entreprise. Il permet aux appareils de communiquer entre eux. C’est grâce à ce réseau qu’un salarié accédera par exemple, depuis son ordinateur, aux fichiers stockés sur un serveur commun connecté lui aussi au LAN, ou encore pour imprimer via l’imprimante du bureau. Mais encore faut-il relier tous ces terminaux informatiques ou IP entre eux.

Cette interconnexion s’effectue principalement par le biais de deux technologies, l’Ethernet ou le réseau WiFi. On parlera alors de LAN Ethernet ou de LAN WiFi. Toutefois, ces deux LAN peuvent cohabiter ou ne former qu’un seul et même réseau local. Dans le cas de l’Ethernet, un ordinateur ou un téléphone IP est relié au LAN par le biais d’un câble standard Ethernet branché sur le port adapté du terminal, et une prise réseau (ou directement à un routeur et/ou un commutateur).

Routeurs et switchs sont des équipements réseau. Ce sont eux qui acheminent les informations ou paquets IP échangés sur les réseaux locaux, de leur source jusqu’à leur destinataire. Ceux-ci peuvent être situés sur le LAN ou en dehors. Les données devront alors sortir du réseau local, au travers d’une liaison privée, ou sur Internet grâce à un abonnement auprès d’un opérateur.


- Qu’est ce que la commande ping ? A quoi sert-elle ?
Le ping = Packet INternet Groper

C'est une composante du protocole de connexion Internet TCP/IP. Sa mission principale consiste à vérifier les connexions établies entre un ou plusieurs hôtes distants. Autrement dit, il s'agit d'un outil d'administration qui permet de diagnostiquer l'accessibilité d'une machine à travers un réseau.

Le PING désigne également le nom d'une commande qui permet de mesurer le temps (en millisecondes) mis par des paquets de données pour effectuer l'aller-retour entre un ordinateur et le réseau internet via une commande simple (on parle aussi de round-trip time pour évoquer ce temps de requête-réponse). Plus il se rapproche de 0, meilleure est la connexion du réseau. Avec le packet-loss, le PING fait partie des deux composants qui permettent de déterminer la qualité d'une connexion sur un réseau, et en particulier au réseau internet.

Développé par l'Américain Mike Muuss dans les années 1980, le PING s'adapte aux différents environnements : Unix, Windows, Mac OS, etc.


Essayer par vous même : Dans votre terminal, taper les différentes lignes de
commandes suivantes; pour chaque commande lancée, faites défiler 5 lignes et faites CTRL+C.
Lisez les statistiques de la commande et expliquez ce qu’il s’est passé.

1) ping google.com

utilisateur@utilisateur-HP-ProDesk-600-G3-SFF:~/Downloads$ ping google.com
PING google.com (142.250.179.110) 56(84) bytes of data.
64 bytes from par21s20-in-f14.1e100.net (142.250.179.110): icmp_seq=1 ttl=117 time=12.1 ms
64 bytes from par21s20-in-f14.1e100.net (142.250.179.110): icmp_seq=2 ttl=117 time=12.3 ms
64 bytes from par21s20-in-f14.1e100.net (142.250.179.110): icmp_seq=3 ttl=117 time=12.2 ms
64 bytes from par21s20-in-f14.1e100.net (142.250.179.110): icmp_seq=4 ttl=117 time=12.2 ms
64 bytes from par21s20-in-f14.1e100.net (142.250.179.110): icmp_seq=5 ttl=117 time=12.2 ms
^C
--- google.com ping statistics ---
5 packets transmitted, 5 received, 0% packet loss, time 4007ms
rtt min/avg/max/mdev = 12.067/12.178/12.266/0.064 ms

-> Il y a eu 5 paquets de données transmis, 5 aller-retour entre mon ordi et le réseau Internet. Il n'y a eu aucune perte de données.
Le temps d'exécution est de 4007ms.

2) ping 192.0.2.255

utilisateur@utilisateur-HP-ProDesk-600-G3-SFF:~/Downloads$ ping 192.0.2.255
PING 192.0.2.255 (192.0.2.255) 56(84) bytes of data.

-> Il n'y a pas eu d'envois de données

3) ping 172.217.20.174

utilisateur@utilisateur-HP-ProDesk-600-G3-SFF:~/Downloads$ ping 172.217.20.174
PING 172.217.20.174 (172.217.20.174) 56(84) bytes of data.
64 bytes from 172.217.20.174: icmp_seq=1 ttl=117 time=12.0 ms
64 bytes from 172.217.20.174: icmp_seq=2 ttl=117 time=12.2 ms
64 bytes from 172.217.20.174: icmp_seq=3 ttl=117 time=12.1 ms
64 bytes from 172.217.20.174: icmp_seq=4 ttl=117 time=11.9 ms
64 bytes from 172.217.20.174: icmp_seq=5 ttl=117 time=11.9 ms
^C
--- 172.217.20.174 ping statistics ---
5 packets transmitted, 5 received, 0% packet loss, time 4005ms
rtt min/avg/max/mdev = 11.923/12.025/12.180/0.096 ms

-> Il y a eu 5 paquets de données transmis, 5 aller-retour entre mon ordi et le réseau Internet. Il n'y a eu aucune perte de données.
Le temps d'exécution est de 4005ms.




