# mybatis-generator

because we have two database , named test1 and test2 . 

so we need two mybatis generator config file named generatorTest1.xml and generatorTest2.xml

here is how to use them to generate mybatis domain and mapppers file .
 
## generate test1 

* update pom.xml , config the configurationFile :

      ${project.basedir}/src/main/resources/generatorTest1.xml
      
* run 

        mvn mybatis-generator:generate      

## generate test2

* update pom.xml , config the configurationFile :

      ${project.basedir}/src/main/resources/generatorTest2.xml
      
* run 

        mvn mybatis-generator:generate      
