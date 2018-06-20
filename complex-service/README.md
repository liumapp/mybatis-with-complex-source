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

## update xml file 

because we need mybatis return id after insert success . so , we need update mappers file end with ".xml"

found all your insert node , and add content below :

    useGeneratedKeys="true" keyProperty="userId"
  
it will looks like : 

    <insert id="insertSelective" parameterType="com.liumapp.demo.mybatis.complex.api.db.testa.domain.User">    
    