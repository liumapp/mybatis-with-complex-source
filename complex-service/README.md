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

    <insert id="insert" useGeneratedKeys="true" keyProperty="id" parameterType="com.liumapp.demo.mybatis.complex.api.db.testa.domain.User">    
    
    
# multy database source config

now , let's have a simple look about our project config file : application.yml

the spring datasource config is :

    url: jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&autoReconnect=true
    username: root
    password: adminadmin
    driver-class-name: com.mysql.jdbc.Driver
    max-idle: 10
    max-wait: 10000
    max-active: 10
    min-idle: 5
    initial-size: 5
    validation-query: SELECT 1
    test-on-borrow: false
    test-while-idle: true
    time-between-eviction-runs-millis: 5000
    min-evictable-idle-time-millis: 60000

of course , there are two of them , but we need to do is understanding a simple one .  

### url

plz pay attention to two point: 

* rewriteBatchedStatements=true 

   this make JDBC send one or more multi-row INSERT statements
   
   like this :
   
        INSERT INTO jdbc (`name`) VALUES ('Line 1: Lorem ipsum ...'),('Line 2: Lorem ipsum ...')

    if you set it false , jdbc will send sql like this : 
    
        INSERT INTO jdbc (`name`) VALUES ('Line 1: Lorem ipsum ...')
        INSERT INTO jdbc (`name`) VALUES ('Line 2: Lorem ipsum ...')

* autoReconnect=true

    

    