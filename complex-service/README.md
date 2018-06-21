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
    max-idle: 100
    max-wait: 10000
    max-active: 100
    min-idle: 10
    initial-size: 10
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
   
    autoReconnect still throws the exception so you can choose to do something about the situation if you like.    
    
    Alternatively, investigate setting the MySQL server variable "wait_timeout" to some high value rather than the default of 8 hours.
    
### max-idle & max-active

* max-idle

    (int) The maximum number of connections that should be kept in the pool at all times.
     
    Default value is maxActive:100 Idle connections are checked periodically (if enabled) and connections that been idle for longer than minEvictableIdleTimeMillis will be released. (also see testWhileIdle)

* max-active

    (int) The maximum number of active connections that can be allocated from this pool at the same time. The default value is 100

say you have 100 max Active connections and say you set maxIdle to 80.
 
Assuming there are no requests going to the database, only 80 connections will be tested (via the validationquery) and will stay active. 

The other 20 will be closed. So at any point you can only have 80 idle connections.

### max-wait

The maximum number of milliseconds that the pool will wait (when there are no available connections) for a connection to be returned before throwing an exception

### initial-size

the number of connections of the pool

if you are using tomcat , you need to set :

        spring.datasource.tomcat.initial-size=x

### validation-query

### test-on-borrow & test-while-idle

### time-between-eviction-runs-millis & min-evictable-idle-time-millis


    