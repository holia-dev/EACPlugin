# EACPlugin-Latest
EACPlugin Source code (by Holia)

## Build

Pour Build EACPlugin voici les etapes a suivre :

#### Etape 1 : Eclipse

Créer un projet Eclipse (Java Project) et importer le fichier JAR de Spigot (disponible sur getbukkit.org)

#### Etape 2 : Mettre les different fichier

Telecharger la source de EACPlugin-Latest et mettez les fichier de EACPlugin en sorte pour avoir la hierarchie si dessous :
``
Eclipse-Workspace/
  MonPlugin/
    .project
    .classpath
    bin/
    src/
      plugin.yml
      fr/
        empireac/
          plugin/
            Main.java
            AncienMain.java
            events/
              InventoryClick.java
              PlayersJoin.java
              
``

#### Etape 3 : Eclipse 

Une fois fait, redemarrer Eclipse IDE et ouvrer votre JavaProject (dans la hierarchie j'ai mis MonPlugin, Libre a vous de choissir le nom.

Puis Exporter le tout en JAR

Et EACPlugin et build !!!

### FAQ

- Q | Eclipse bug quand je veut build le projet.
- R | Il est possible que vous ne possedez pas de JDK. Un JDK (Java Developement Kit) permet de developper en Java. Si vous l'avez pas aller ici : [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#jdk17-windows), Et assurez vous d'avoir egalement Java en derniere versions. Le site de Java : [Java](https://java.com). Si vous avez toujours des problemes, merci de contacter "Holia#3033" sur Discord, ou bien faite une Issue Github.

- Q | Si je veut utiliser EACPlugin pour mon serveur Minecraft, est-ce que j'ai le droit ?
- R | Oui, si vous souhaitez l'utiliser il n'y a aucun soucis, veuillez juste a faire un Github Fork de EACPlugin (ou vous ferrez vos modifications dessus), et vous deverez OBLIGATOIREMENT laissez les commentaires qui montre que le plugin a été créer par l'Empire AC et par Holia-DEV (ou Holia#3033), et il faut aussi respecter ce que dit la licence MIT (Licence de EACPlugin).

- Q | EACPlugin marche-t-il pour Minecraft Bedrock Edition ?
- R | EACPlugin est un plugin Java, il ne marche que sur la version Java de Minecraft, sur Bedrock il n'y a pas de "Plugin", il y a des "Addons", ce sont des sortes de Plugin pour Minecraft Bedrock. Les Addons ne fonctionne que avec une version speciale de Minecraft Bedrock : PocketMine. Autrement dis, il n'y a pas réelement de Plugin sur Bedrock.
