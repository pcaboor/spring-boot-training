# spring-boot-training


Nous retrouvons les fichiers liés à Maven (pom.xml, mvnw et mvnw.cmd).

Nos sources sont organisées suivant le schéma standard :

src/main/java : contient les packages et les classes Java ;

src/main/resources : contient les fichiers ressources, tels que les fichiers de propriétés ou des templates (HTML, par exemple) ;

src/test/java : contient les classes Java de test.

Comme tout projet Java/Maven, on retrouve également la JRE et les Maven Dependencies.



De ces différents besoins, une architecture en couches a émergé, avec un rôle pour chaque couche :

couche Controller : gestion des interactions entre l’utilisateur de l’application et l’application ;

couche Service : implémentation des traitements métiers spécifiques à l’application ;

couche Repository : interaction avec les sources de données externes ;

couche Model : implémentation des objets métiers qui seront manipulés par les autres couches.

