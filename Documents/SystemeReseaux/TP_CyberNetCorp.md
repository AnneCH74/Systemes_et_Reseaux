SYSTEMES_ET_RESEAUX

Itération 1 : 29/06/2023

TP : Création d’un réseau entre un PC et un serveur


Quelles sont les machines / types de machines qui vont intervenir dans ce réseau ?
- Ordinateur personnel du client (M.Silvermoon)
- Serveur de stockage situé dans les locaux du client


    Concentrateur (hub) 
    Commutateur (switch) 
    Routeur 
    Pont (bridge)
    Passerelle (gateway)
    Modem 
    Répéteur
    Point d’accès



Quel type de support de communication choisir ?(câble cuivre, fibre optique, Sans-fil...)
LAN

Il faut choisir la fibre optique ou à défaut les câbles en cuivre. Ils ont une meilleure portée que le sans-fil.


Comment les machines sont identifiées au sein d’un réseau ?
- Qu’est ce qu’une interface réseau ?
    La partie qui assure la connexion entre un terminal utilisateur et un réseau public ou privé.
    Une interface réseau est constituée de composants (matériels et logiciels) dont la fonction principale est de rendre
     l'ordinateur capable de communiquer par le biais d'une ou de plusieurs technologies de mise en réseau.
- Qu’est ce qu’une adresse MAC ?
    Une adresse MAC (Media Access Control) est un identifiant physique stocké dans une carte réseau ou une 
     interface réseau similaire. Elle est unique au monde. Toutes les cartes réseau ont une adresse MAC,
    même celles contenues dans les PC et autres appareils connectés.
- Qu’est ce qu’une adresse IP ? Comment peut-on la paramétrer ?
  Une adresse IP est un numéro d'identification unique attribué de façon permanente ou provisoire à chaque 
  périphérique faisant partie d'un même réseau informatique utilisant l'Internet Protocol.
   L'adresse IP est à l'origine du système d'acheminement des paquets de données sur Internet.

   Paramétrage : https://doc.ubuntu-fr.org/tutoriel/comment_configurer_son_reseau_local


- Comment tester la bonne configuration et la communication entre deux machines (Dans la
  vraie vie et pas sur Cisco Packet Tracer)?

On peut tester la bonne configuration grâce à la commande PING : https://kb.netgear.com/fr/22329/Tester-les-connexions-%C3%A0-l-aide-de-commandes-Ping-1479991133922?language=fr
https://maxinews.fr/tester-la-configuration-des-adresses-ip-du-reseau/



LIVRABLE 2 - Création d'un réseau entre un PC et un serveur

Une description du parcours effectué par le paquet de test :
Le paquet de test part de l'expéditeur (ici PC du client) et va vers le destinataire (ici le serveur).
Une fois le paquet réceptionné par le destinataire, il envoie à l'expéditeur un accusé de réception à l'expéditeur.


LIVRABLE 3 - 

TP - Ajout d'un PC au réseau

- Ajouter une carte réseau supplémentaire à votre serveur. Quel est le problème avec cette solution ?
    Petit rappel : Une carte réseau (ou Network Interface Card en anglais) est en fait un périphérique informatique.
    Elle fait le lien entre votre ordinateur dans lequel elle est installée et le réseau auquel il se connecte. La carte réseau est donc un circuit électronique imprimé qui se branche directement sur la carte mère.

    Le problème avec cette solution est que si d'autres pc doivent petre raccordés (employés donc pc en +) 
    il faudra ajouter une nouvelle carte réseau. Cela signifie qu'il y aurait beaucoup de câbles.

- Ajouter un équipement d’interconnexion à votre réseau. Mais quel équipement choisir pour effectuer cette interconnexion.
Il faut ajouter un switch pour relier les deux pc au serveur.


LIVRABLE4 - Connexion avec une autre entreprise

- Une fois cela fait, effectuez différents tests (Realtime et Simulation) suivant :
    Entre un PC d’OrionTech et le serveur de stockage de StarLit Publishing. Que remarquez-vous ?

Le paquet de test ne veut pas partir du PC d'Orion Tech (expéditeur) -> flèche rouge d'erreur

➔ Soit l’adresse réseau suivante : 192.168.1.0
◆ Quel est son masque ?
Son masque est "8"

◆ Combien d'adresses IP peut-on attribuer dans ce réseau. Attention, il y a
un piège : faite une recherche sur l’adresse IP de broadcast
L'adresse de broadcast est une adresse IP qui termine en . 255 dans des réseaux de classe A, B ou C, 
cette adresse est celle qui permet de faire de la diffusion à toutes les machines du réseau. 
Ainsi, quand on veut envoyer une information à toutes les machines, on utilise cette adresse.

(256 x 256) - (2+1) = 65533 adresses IP attribuables


Soit les adresses ip suivantes : 192.168.1.1/24 et 192.168.24.3/24
◆ Sont-elles sur le même réseau ?
Non elles ne sont pas sur le même réseau.

◆ Quelles sont les adresses réseaux respectives ?
La 1ère : 192.168.1.0
La seconde : 192.168.24.0


- Une fois cela fait, votre réseau devrait être fonctionnel. Pour tester, effectuer une simulation entre
un PC d’Orion Tech et le serveur de stockage de StarLit Publishing. Décrivez le chemin de votre
message :
Le message part du PC Orion Tech A, il transite par le Switch d'Orion puis par le routeur, ensuite par le Switch de
Starlit et arrive au serveur de Starlit. Un accusé-réception fait le chemin inverse pour arriver au PC Orion Tech A.


LIVRABLE 5 - Lien avec les modèles théoriques : OSI et TCP/IP

Modèle OSI

Faites une recherche sur le modèle OSI et lister ces différentes couches. 
Pour chaque couche, faites une courte description de ce qu’elle représente et donnez un élément qui peut être associé
à cette couche.


Le modèle OSI (Open Systems Interconnection) est un cadre conceptuel qui définit comment les systèmes réseau
communiquent et envoient des données d'un expéditeur à un destinataire. Il a été établi en 1984 pour créer une norme
pour la conception des réseaux et la fabrication des équipements.
Le modèle est utilisé pour décrire chaque composant de la communication de données pour pouvoir établir des règles
et des normes pour les applications et l'infrastructure du réseau.
Le modèle OSI contient sept couches qui s'empilent conceptuellement de bas en haut.
Ces couches sont les suivantes :

    Physique
    Liaison des données
    Réseau
    Transport
    Session
    Présentation
    Application

Chaque couche a une fonction spécifique et communique et travaille avec les couches inférieure et supérieure. 


Couche 7 (couche la plus élevée de la pile) – La couche d'application

La couche 7 est connue de la plupart des gens car elle communique directement avec l'utilisateur.

Une application qui s'exécute sur un appareil peut communiquer avec d'autres couches OSI, mais l'interface fonctionne
sur la couche 7.

Par exemple, un client de messagerie qui transfère des messages entre le client et le serveur fonctionne sur 
la couche 7. Lorsqu'un message est reçu sur le logiciel client, c'est la couche application qui le présente à
l'utilisateur.

Les protocoles d'application comprennent le SMTP (Simple Mail Transfer Protocol) et le HTTP, qui est le protocole
de communication entre les navigateurs et les serveurs Web.


Couche 6 – La couche de présentation

Nous avons mentionné que la couche application affiche les informations aux utilisateurs, mais la couche présentation
du modèle OSI est celle qui prépare les données pour qu'elles puissent être affichées à l'utilisateur.

Il est courant que deux applications différentes utilisent l’encodage.

Par exemple, la communication avec un serveur Web via HTTPS utilise des informations chiffrées. La couche de
présentation est responsable de l’encodage et du décodage des informations afin qu'elles puissent être affichées
en clair.

La couche de présentation est également responsable de la compression et de la décompression des données lorsqu'elles
passent d'un appareil à un autre.


Couche 5 – La couche session

Pour communiquer entre deux appareils, une application doit d'abord créer une session, qui est unique à l'utilisateur
et l'identifie sur le serveur distant.

La session doit être ouverte suffisamment longtemps pour que les données soient transférées, mais elle doit être
fermée une fois le transfert terminé. Lorsque de gros volumes de données sont transférés, la session est chargée de
s'assurer que le fichier est transféré dans son intégralité et que la retransmission est établie si les données sont
incomplètes.

Par exemple, si 10 Mo de données sont transférés et que seuls 5 Mo sont complets, la couche session s'assure que seuls
5 Mo sont retransmis. Ce transfert rend la communication sur un réseau plus efficace au lieu de gaspiller des
ressources et de retransférer l'intégralité du fichier.


Couche 4 – La couche de transport

La couche transport est chargée de prendre les données et de les décomposer en petits morceaux.

Lorsque des données sont transférées sur un réseau, elles ne sont pas transférées en un seul paquet.

Pour rendre les transferts plus efficaces et plus rapides, la couche transport divise les données en segments
plus petits. Ces petits segments contiennent des informations d'en-tête qui peuvent être réassemblées sur le
périphérique cible.

Les données segmentées sont également dotées d'un contrôle d'erreur qui indique à la couche session de rétablir
une connexion si les paquets ne sont pas entièrement transférés au destinataire cible.


Couche 3 – La couche réseau

La couche réseau est chargée de décomposer les données sur l'appareil de l'expéditeur et de les réassembler sur
l'appareil du destinataire lorsque la transmission s'effectue sur deux réseaux différents.

Lorsque l'on communique au sein d'un même réseau, la couche réseau est inutile, mais la plupart des utilisateurs se
connectent à d'autres réseaux, tels que les réseaux dans le cloud.

Lorsque les données traversent différents réseaux, la couche réseau est chargée de créer de petits paquets de données
acheminés vers leur destination, puis reconstruits sur l'appareil du destinataire.

Couche 2 – La couche de liaison de données

La couche réseau facilite la communication entre différents réseaux, mais la couche liaison de données est responsable
du transfert des informations sur le même réseau.

La couche liaison de données transforme les paquets reçus de la couche réseau en trames. Tout comme la couche réseau,
*la couche liaison de données est responsable du contrôle des erreurs et du flux pour garantir la réussite de la
transmission.


Couche 1 – La couche physique

Comme son nom l'indique, la couche physique est responsable de l'équipement qui facilite le transfert des données,
comme les câbles et les routeurs installés sur le réseau.

Cette couche est l'un des aspects de la transmission réseau où les normes sont essentielles. Sans normes, la
transmission entre les appareils de différents fabricants est impossible.


- En quoi ce modèle est important?
Le modèle OSI permet aux fabricants de créer leurs propres protocoles et normes d'équipement tout en permettant
l'interconnexion avec d'autres fabricants.

Un autre avantage du modèle OSI qu’il est facile à dépanner. Lorsqu'un composant du réseau tombe en panne ou
qu'une application ne communique pas avec le réseau, le modèle OSI aide les administrateurs à déterminer la couche
et le composant défaillants.


Modèle TCP/IP

- Qu’est ce que TCP et IP ?
TCP/IP désigne communément une architecture réseau, mais cet acronyme désigne en fait 2 protocoles étroitement
liés : un protocole de transport, TCP (Transmission Control Protocol) qu’on utilise « par-dessus » un protocole
réseau, IP (Internet Protocol). Ce qu’on entend par « modèle TCPIP », c’est en fait une architecture réseau en
4 couches dans laquelle les protocoles TCP et IP jouent un rôle prédominant, car ils en constituent l’implémentation
la plus courante. Par abus de langage, TCP/IP peut donc désigner deux choses : le modèle TCP/IP et la suite de
deux protocoles TCP et IP.

- Décrivez les couches qui le composent
Il y a 4 couches qui le compose :
* La couche hôte réseau :
  Cette couche est assez « étrange ». En effet, elle semble « regrouper » les couches physique et liaison de données
  du modèle OSI. En fait, cette couche n’a pas vraiment été spécifiée ; la seule contrainte de cette couche,
 c’est de permettre un hôte d’envoyer des paquets IP sur le réseau. L’implémentation de cette couche est laissée
 libre. De manière plus concrète, cette implémentation est typique de la technologie utilisée sur le réseau local.
 Par exemple, beaucoup de réseaux locaux utilisent Ethernet ; Ethernet est une implémentation de la couche hôte-réseau.

* La couche internet :
  Cette couche est la clé de voûte de l’architecture. Cette couche réalise l’interconnexion des réseaux (hétérogènes)
 distants sans connexion. Son rôle est de permettre l’injection de paquets dans n’importe quel réseau et
 l’acheminement des ces paquets indépendamment les uns des autres jusqu’à destination. Comme aucune connexion n’est
 établie au préalable, les paquets peuvent arriver dans le désordre ; le contrôle de l’ordre de remise est
  éventuellement la tâche des couches supérieures.

  Du fait du rôle imminent de cette couche dans l’acheminement des paquets, le point critique de cette couche est
  le routage. C’est en ce sens que l’on peut se permettre de comparer cette couche avec la couche réseau du modèle OSI.
  La couche internet possède une implémentation officielle : le protocole IP (Internet Protocol).
  Remarquons que le nom de la couche (« internet ») est écrit avec un i minuscule, pour la simple et bonne raison
   que le mot internet est pris ici au sens large (littéralement, « interconnexion de réseaux »), même si l’Internet
  (avec un grand I) utilise cette couche.

* La couche transport :
  Son rôle est le même que celui de la couche transport du modèle OSI : permettre à des entités paires de soutenir
  une conversation.
  Officiellement, cette couche n’a que deux implémentations : le protocole TCP (Transmission Control Protocol)
  et le protocole UDP (User Datagram Protocol). TCP est un protocole fiable, orienté connexion, qui permet
  l’acheminement sans erreur de paquets issus d’une machine d’un internet à une autre machine du même internet.
  Son rôle est de fragmenter le message à transmettre de manière à pouvoir le faire passer sur la couche internet.
  A l’inverse, sur la machine destination, TCP replace dans l’ordre les fragments transmis sur la couche internet pour reconstruire le message initial. TCP s’occupe également du contrôle de flux de la connexion.

   UDP est en revanche un protocole plus simple que TCP : il est non fiable et sans connexion. Son utilisation
   présuppose que l’on n’a pas besoin ni du contrôle de flux, ni de la conservation de l’ordre de remise des paquets.
   Par exemple, on l’utilise lorsque la couche application se charge de la remise en ordre des messages. On se
  souvient que dans le modèle OSI, plusieurs couches ont à charge la vérification de l’ordre de remise des messages.
  C’est là un avantage du modèle TCP/IP sur le modèle OSI, mais nous y reviendrons plus tard. Une autre utilisation
   d’UDP : la transmission de la voix. En effet, l’inversion de 2 phonèmes ne gêne en rien la compréhension du message
  final. De manière plus générale, UDP intervient lorsque le temps de remise des paquets est prédominant.


* La couche application :
  Contrairement au modèle OSI, c’est la couche immédiatement supérieure à la couche transport, tout simplement parce
  que les couches présentation et session sont apparues inutiles. On s’est en effet aperçu avec l’usage que les
  logiciels réseau n’utilisent que très rarement ces 2 couches, et finalement, le modèle OSI dépouillé de ces 2
  couches ressemble fortement au modèle TCP/IP.

  Cette couche contient tous les protocoles de haut niveau, comme par exemple Telnet, TFTP (trivial File Transfer
  Protocol), SMTP (Simple Mail Transfer Protocol), HTTP (HyperText Transfer Protocol). Le point important pour cette
   couche est le choix du protocole de transport à utiliser. Par exemple, TFTP (surtout utilisé sur réseaux locaux)
  utilisera UDP, car on part du principe que les liaisons physiques sont suffisamment fiables et les temps de
   transmission suffisamment courts pour qu’il n’y ait pas d’inversion de paquets à l’arrivée. Ce choix rend TFTP 
  plus rapide que le protocole FTP qui utilise TCP. A l’inverse, SMTP utilise TCP, car pour la remise du courrier
   électronique, on veut que tous les messages parviennent intégralement et sans erreurs.


- Faites le lien avec le modèle OSI :
  Tout d’abord, les points communs. Les modèles OSI et TCP/IP sont tous les deux fondés sur le concept de pile de
   protocoles indépendants. Ensuite, les fonctionnalités des couches sont globalement les mêmes.

   Au niveau des différences, on peut remarquer la chose suivante : le modèle OSI faisait clairement la différence
   entre 3 concepts principaux, alors que ce n’est plus tout à fait le cas pour le modèle TCP/IP. Ces 3 concepts sont
   les concepts de services, interfaces et protocoles. En effet, TCP/IP fait peu la distinction entre ces concepts, et
   ce malgré les efforts des concepteurs pour se rapprocher de l’OSI. Cela est dû au fait que pour le modèle TCP/IP,
  ce sont les protocoles qui sont d’abord apparus. Le modèle ne fait finalement que donner une justification théorique
  aux protocoles, sans les rendre véritablement indépendants les uns des autres.

  Enfin, la dernière grande différence est liée au mode de connexion. Certes, les modes orienté connexion et sans
   connexion sont disponibles dans les deux modèles mais pas à la même couche : pour le modèle OSI, ils ne sont
  disponibles qu’au niveau de la couche réseau (au niveau de la couche transport, seul le mode orienté connexion
   n’est disponible), alors qu’ils ne sont disponibles qu’au niveau de la couche transport pour le modèle TCP/IP
  (la couche internet n’offre que le mode sans connexion). Le modèle TCP/IP a donc cet avantage par rapport au modèle
  OSI : les applications (qui utilisent directement la couche transport) ont véritablement le choix entre les deux
  modes de connexion.



- Reprenez le dernier réseau que vous avez effectué, et pour chaque équipement, associez-lui une couche du modèle OSI:
STARLIT PUBLISHING
* PC Directeur = couche 7
* PC Employé = couche 7
* Serveur = couche 5
* Switch = couches 4, 2

Routeur = couche 1

ORION TECH
* PC A = couche 7
* PC B = couche 7
* Switch = couches 4, 2





