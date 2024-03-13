# Application d'inversion de dépendance avec injection de dépendance

## Description

Cette application met en œuvre le principe de l'inversion de dépendance en utilisant l'injection de dépendance. Elle permet de personnaliser un bot en injectant des objets correspondant à ses attributs.

## Lancement

### Construction de l'image Docker

Pour lancer l'application, vous devez d'abord construire l'image Docker en utilisant le Dockerfile fourni. Exécutez la commande suivante dans le répertoire contenant le Dockerfile :

```bash
docker build -f Dockerfile -t java_inversion_injection_dependancy_image:1.0 .
```

### Création du conteneur Docker

Après avoir construit l'image Docker, vous pouvez créer un conteneur pour héberger l'application. Exécutez la commande suivante :

```bash
docker run -d --name "java_injection_inversion_depandancy" -p 8234:80 java_inversion_injection_dependancy_image:1.0
```

### Lancement de l'application

Une fois le conteneur en cours d'exécution, vous devez accéder à ce dernier pour lancer l'application. Vous pouvez le faire en exécutant la commande suivante :

```bash
docker exec -it java_injection_inversion_depandancy /bin/bash
```

Ensuite, naviguez vers le répertoire contenant l'application. Dans notre cas, cela devrait être `/usr/src/app`.

Enfin, lancez l'application en utilisant la commande suivante :

```bash
java src/Main
```