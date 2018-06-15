# mybatis-with-complex-source
Using mybatis in SpringBoot with complex data source .

## how to use 

### add test table in two database

* first of all , we need to design our ER map in two databse : 

    we use mysql workbench to finish the job :
    
    add two scheme , named test1 and test2
    
    ![1.jpg](https://github.com/liumapp/mybatis-with-complex-source/blob/master/pic/1.jpg)
    
    ![2.jpg](https://github.com/liumapp/mybatis-with-complex-source/blob/master/pic/2.jpg) 
    
    in test1 , we have user and shipping_address table 
    
    in test2 , we have order table 
    
* now , we need to export our table sql :

    also use mysql workbench to finish that :

    ![3.jpg](https://github.com/liumapp/mybatis-with-complex-source/blob/master/pic/3.jpg)
    
    ![4.jpg](https://github.com/liumapp/mybatis-with-complex-source/blob/master/pic/4.jpg)    
 
* finaly , create the test database in mysql :

    simply finish the job by running the table.sql :
    
    ![5.jpg](https://github.com/liumapp/mybatis-with-complex-source/blob/master/pic/5.jpg)
    
     