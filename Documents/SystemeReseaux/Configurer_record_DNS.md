Livrable 3 - Configurer un record DNS avec Cloudflare

30/06/2023

Faites une recherche sur les principes de base des noms de domaine afin de
comprendre ce qu’est un sous-domaine :

Un nom de domaine (souvent appelé simplement domaine) est un nom facilement mémorisable associé à une adresse IP physique sur Internet.
Il s'agit du nom unique qui apparaît après le signe @ dans les adresses e-mail, et après www. dans les adresses Web. Par exemple, le nom de domaine example.com
peut être associé à l'adresse physique 198.102.434.8. "google.com" et "wikipedia.org" sont deux autres exemples de noms de domaine.Le fait d'utiliser un nom de domaine,
plutôt qu'une adresse IP numérique, pour identifier un emplacement sur Internet facilite grandement la mémorisation et la saisie des adresses Web.

Tout le monde peut acheter un nom de domaine. Il suffit de faire appel à un hébergeur de domaine ou à un bureau d'enregistrement de noms de domaine, de trouver un nom qui
n'est utilisé par personne d'autre et de payer les frais annuels modiques qui s'appliquent.

Lorsque vous vous inscrivez aux services Google Cloud, vous indiquez le nom de domaine avec lequel vous souhaitez les utiliser. Ce doit être un domaine dont vous êtes propriétaire,
et nous vous demanderons d'en valider la propriété.

SOUS-DOMAINE :
Un sous-domaine est un domaine appartenant à un domaine plus important. Par exemple, "mail.google.com", "www.google.com" et "docs.google.com" sont tous des sous-domaines
de "google.com". Les propriétaires de domaines peuvent créer des sous-domaines pour attribuer des adresses facilement mémorisables aux pages Web ou aux services au sein de
leur domaine de premier niveau.


- Une explication des différents types d’enregistrement DNS :
Chaque enregistrement DNS a un nom et un type. Les enregistrements sont organisés selon différents types, en fonction des données qu’ils contiennent.
Le type le plus courant est un enregistrement « A » qui mappe un nom à une adresse IPv4. Un autre type courant est un enregistrement « MX » qui mappe un nom à un
serveur de messagerie.

Azure DNS prend en charge tous les types d’enregistrement DNS courants, à savoir : A, AAAA, CAA, CNAME, MX, NS, PTR, SOA, SRV et TXT. Notez que les enregistrements SPF
sont représentés à l’aide d’enregistrements TXT.

Il existe plusieurs types d’enregistrements DNS dont les plus courants sont:

    A : Permet de faire la correspondance entre un nom DNS et une adresse IP (ipv4)
    Exemple:    www.mondomaine.com.   IN   A   1.2.3.4
    Ce qui correspond à:
        Nom/Hôte: www.mondomaine.com
        Type: A
        Valeur/Enregistrement: 1.2.3.4

    AAAA : Permet de faire la correspondance entre un nom DNS et une adresse IP (ipv6)
    Exemple:    blog.domaine.com.    IN     AAAA     2a01:ecb:1:f:2e0:b7ff:fea9:4da8
    Ce qui correspond à:
        Nom/Hôte: blog.domaine.com
        Type: AAAA
        Valeur/Enregistrement: 2a01:ecb:1:f:2e0:b7ff:fea9:4da8

    CNAME : Permet de faire la correspondance entre deux noms DNS
    Exemple:    crm.mondomaine.com.     IN     CNAME     crm.autredomaine.com.
    Ce qui correspond à:
        Nom/Hôte: crm.mondomaine.com
        Type: CNAME
        Valeur/Enregistrement: crm.autredomaine.com

    MX : Permet de configurer les serveurs de mails pour une zone DNS donnée.
    Exemple:    mondomaine.com.    IN    MX  10   domaine.com.
    Ce qui correspond à:
        Nom/Hôte: mondomaine.com
        Type: MX
        Priorité: 10
        Destination: domaine.com
        Le nom DNS doit être du type A et vous ne pouvez pas utiliser une IP ou un CNAME.
        La priorité est l’ordre dans lequel les serveurs de mail seront contactés si il y en a plusieurs.


    TXT : Cet enregistrement permet de stocker une chaîne de 1024 caractères au maximum.
    Exemple: domaine.com. IN TXT google-site-verification=valeur
    Ce qui correspond à:
        Nom/Hôte: mondomaine.com
        Type: TXT
        Valeur/Enregistrement: google-site-verification=valeur

    SRV: Cet enregistrement sert à indiquer quel est le serveur qui gère un service spécifique tel que la messagerie instantanée, SIP, etc
    Exemple: autodiscover.mondomaine.com IN SRV 0 1 443 cpanelemaildiscovery.cpanel.net
    Ce qui correspond à:
        Nom/Hôte: mondomaine.com
        Type: SRV
        Priorité: 0
        Poids: 1
        Port: 443
        Cible: cpanelemaildiscovery.cpanel.net
