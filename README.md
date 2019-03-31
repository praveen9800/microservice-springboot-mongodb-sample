# Spring boot microservice with MongoDB a NoSQL database

MongoDB is a No SQL database. It is an open-source, cross-platform, document-oriented database and stores data as documents. It provides high performance, high availability, and automatic scaling. Here we will see how to create a simple spring boot microservice project with MongoDB as a database. 


## Dependency

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

## Configuring MongoDB through Spring

```
spring.data.mongodb.database=sb_account
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017

```

The above configurations are needed for spring boot microservice application to interact with MongoDB. Here sb_account is the database. The default port for MongoDB is 27017.


```
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class AccountModel {

	private int accNo;
	private String accName;
	private double amount;
	private String currency;

	public AccountModel() {

	}

```
In MongoDB, tables are called as collection. MongoDB creates database and collection automatically when you insert some documents programatically. All we need to do this, annotate the entity class as shown above. Here the collection (table) name is accounts. For more information about MongoDB, please refer the below link.

```
https://www.mongodb.com/what-is-mongodb
```

## Overview

The sample microservice is a Account Creation service (Banking) which will take accNo, accName, amount and currency as inputs and creates a new customer account and stores in MongoDB database. Remember we need not create database and collection manually in the database. Simply by calling this microservice, everything will be created automatically and stores data in flexible, JSON-like documents.

![Image of Workflow](https://github.com/praveen9800/microservice-springboot-mongodb-sample/blob/master/accountservice_mongo.png)


## To test the sample

### URI to test the POST service

```
http://localhost:8012/sb/add
```

### Sample Request

```
{
  "accNo" : 101,
  "accName" : "AAAAA",
  "amount" : 2000,
  "currency" : "INR"
}
```
### Sample Response

```
Account added successfully
```

## Document stored in MongoDB


![Image of Output](https://github.com/praveen9800/microservice-springboot-mongodb-sample/blob/master/mongodb_output.png)


Here we can see the account data are stored as JSON-like document. ObjectId is the unique key automatically created by MongoDB when a new document is inserted.