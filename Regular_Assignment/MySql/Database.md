```bash
mysql> create database if not exists Person;

mysql> show databases;
+----------------------------+
| Database                        |
+----------------------------+
| customer                         |
| demodb                           |
| information_schema   |
| mysql            	    |
| passport                         |
| patientdb                       |
| performance_schema |
| person                            |
| studentdb                      |
| studentdemo                |
| sys                                   |
+----------------------------+


mysql> use person;
Database changed

mysql> create table person(person_id int primary key auto_increment,name varchar(55) not null);


mysql> desc person;
+-------------+----------------+------+-----+----------+---------------------+
| Field   	  | Type               | Null | Key | Default | Extra                     |
+-------------+----------------+------+-----+----------+---------------------+
| person_id | int                   | NO   | PRI | NULL    | auto_increment |
| name         | varchar(55)  | NO   |        | NULL    |                                |
+-------------+----------------+------+------+---------+---------------------+


mysql> insert into person(name) values("Suraj"),("mayur"),("pravin"),("pankaj");

mysql> select * from person;
+-------------+----------+
| person_id | name     |
+-------------+----------+
|         1         | Suraj      |
|         2         | mayur    |
|         3         | pravin    |
|         4         | pankaj   |
+-------------+----------+

mysql> create table passport (passport_id int primary key,person_id int unique,passport_number varchar(50),
               FOREIGN KEY(person_id) REFERENCES person(person_id));

mysql> desc passport;
+-------------------------+----------------+------+-----+----------+--------+
| Field           	| Type       	       | Null | Key | Default | Extra |
+-------------------------+----------------+------+-----+----------+--------+
| passport_id     	| int        	       | NO   | PRI | NULL    |             |
| person_id       	| int       	       | YES  | UNI| NULL    |             |
| passport_number    | varchar(50) | YES  |         | NULL    |             |
+-------------------------+----------------+------+-----+----------+--------+

mysql> insert into passport(passport_id,person_id,passport_number) values(101,1,"PASS1"),(102,2,"PASS2"),(103,3,"PASS3"),(104,4,"PASS4");

mysql> select * from passport;
+---------------+--------------+-----------------------+
| passport_id | person_id | passport_number |
+---------------+--------------+-----------------------+
|         101       |         1          | PASS1                       |
|         102       |         2          | PASS2                       |
|         103       |         3          | PASS3                       |
|         104       |         4          | PASS4                       |
+---------------+-------------+-----------------------+



```
