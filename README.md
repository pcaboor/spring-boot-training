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

mvn -v

mvn spring-boot:run


Couche

Objectif

controller

Réceptionner la requête et fournir la réponse 

service

Exécuter les traitements métiers

repository

Communiquer avec la source de données

model

Contenir les objets métiers


| Annotation      	| Type HTTP 	| Objectif                                                                                                                                       	|
|-----------------	|-----------	|------------------------------------------------------------------------------------------------------------------------------------------------	|
| @GetMapping     	| GET       	| Pour la lecture de données.                                                                                                                    	|
| @PostMapping    	| POST      	| Pour l’envoi de données. Cela sera utilisé par exemple pour créer un nouvel élément.                                                           	|
| @PatchMapping   	| PATCH     	| Pour la mise à jour partielle de l’élément envoyé.                                                                                             	|
| @PutMapping     	| PUT       	| Pour le remplacement complet de l’élément envoyé.                                                                                              	|
| @DeleteMapping  	| DELETE    	| Pour la suppression de l’élément envoyé.                                                                                                       	|
| @RequestMapping 	|           	| Intègre tous les types HTTP. Le type souhaité est indiqué comme attribut de l’annotation. Exemple :@RequestMapping(method = RequestMethod.GET) 	|


Changer de versions de java sdk

```
export JAVA_HOME=$(/usr/libexec/java_home -v <version>)
```

Lister les versions de java sdk

```
/usr/libexec/java_home -V
```
