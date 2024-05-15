# springboot-cassandra-crud
 Spring Boot Cassandra CRUD 
# Step#1: Download & Install Apache Cassandra
# Step #2: Create Keyspace
CREATE KEYSPACE boot with replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};
commands:
describe boot;
use boot;
if you need to alter the keyspace
alter keyspace boot with replication = {'class': 'SimpleStrategy', 'replication_factor': 2};
# Step #3: Create Table
Inside the keyspace create table
CREATE TABLE account( id int, accountnum int, name text, balance float, primary key (id)));
insert into account(id, accountnum, name,balance) values (1,12384, 'len', 70090) ;
# Step #4: Update application.properties file & create configuration class for cassandra DB

# Step #5: Create model, repo, controller class files.
