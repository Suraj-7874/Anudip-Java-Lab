ONE TO ONE Relationship table :-
```bash
mysql> create database if not exists Person;

mysql> show databases;
+----------------------------+
| Database                   |
+----------------------------+
| customer                   |
| demodb                     |
| information_schema         |
| mysql            	         |
| passport                   |
| patientdb                  |
| performance_schema         |
| person                     | 
| studentdb                  |
| studentdemo                |
| sys                        |
+----------------------------+


mysql> use person;
Database changed

mysql> create table person(person_id int primary key auto_increment,name varchar(55) not null);


mysql> desc person;
+-------------+----------------+------+-----+----------+---------------------+
| Field   	  | Type           | Null | Key | Default  | Extra               |
+-------------+----------------+------+-----+----------+---------------------+
| person_id   | int            | NO   | PRI | NULL     | auto_increment      |
| name        | varchar(55)    | NO   |     | NULL     |                     |
+-------------+----------------+------+-----+--------- +---------------------+


mysql> insert into person(name) values("Suraj"),("mayur"),("pravin"),("pankaj");

mysql> select * from person;
+-------------+----------+
| person_id   | name     |
+-------------+----------+
|         1   | Suraj    |
|         2   | mayur    |
|         3   | pravin   |
|         4    | pankaj  |
+-------------+----------+

mysql> create table passport (passport_id int primary key,person_id int unique,passport_number varchar(50),
               FOREIGN KEY(person_id) REFERENCES person(person_id)); 

mysql> desc passport;
+-------------------------+----------------+------+-----+----------+---------+
| Field           	      | Type       	   | Null | Key | Default  | Extra   |
+-------------------------+----------------+------+-----+----------+---------+
| passport_id            	| int        	   | NO   | PRI | NULL     |         |
| person_id       	      | int       	   | YES  | UNI | NULL     |         |
| passport_number         | varchar(50)    | YES  |     | NULL     |         |
+-------------------------+----------------+------+-----+----------+---------+

mysql> insert into passport(passport_id,person_id,passport_number) values(101,1,"PASS1"),(102,2,"PASS2"),(103,3,"PASS3"),(104,4,"PASS4");

mysql> select * from passport;
+---------------+--------------+-----------------------+
| passport_id   | person_id    | passport_number       |
+---------------+--------------+-----------------------+
|         101   |         1    | PASS1                 |
|         102   |         2    | PASS2                 |
|         103   |         3    | PASS3                 |
|         104   |         4    | PASS4                 |
+---------------+-------------+-----------------------+



```
ONE TO MANY Relationship :-
```bash
mysql> create database Department_emp;

mysql> use Department_emp;
Database changed.

mysql> CREATE TABLE Department (
    ->     dept_id INT PRIMARY KEY,
    ->     dept_name VARCHAR(100)
    -> );

mysql> CREATE TABLE Employee (
    ->     emp_id INT PRIMARY KEY,
    ->     emp_name VARCHAR(100),
    ->     dept_id INT,
    ->     FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
    -> );

mysql> INSERT INTO Department (dept_id, dept_name) VALUES
    -> (1, 'HR'),
    -> (2, 'IT'),
    -> (3, 'Finance'),
    -> (4, 'Marketing');

mysql> INSERT INTO Employee (emp_id, emp_name, dept_id) VALUES
    -> (101, 'Suraj', 1),   
    -> (102, 'Mayur', 2),       
    -> (103, 'Pankaj', 2),  
    -> (104, 'Pravin', 3),     
    -> (105, 'Om', 4),       
    -> (106, 'Sai', 1);     


mysql> select * from Department;
+---------+-----------+
| dept_id | dept_name |
+---------+-----------+
|       1 | HR        |
|       2 | IT        |
|       3 | Finance   |
|       4 | Marketing |
+---------+-----------+
mysql> select * from Employee;
+--------+----------+---------+
| emp_id | emp_name | dept_id |
+--------+----------+---------+
|    101 | Suraj    |       1 |
|    102 | Mayur    |       2 |
|    103 | Pankaj   |       2 |
|    104 | Pravin   |       3 |
|    105 | Om       |       4 |
|    106 | Sai      |       1 |
+--------+----------+---------+



```
Many-to-Many (M:N) Relationship :-
```bash
mysql> create database Student_course;

mysql> use Student_course;
Database changed

mysql> CREATE TABLE Student (
    ->     student_id INT PRIMARY KEY,
    ->     student_name VARCHAR(100)
    -> );


mysql>
mysql> CREATE TABLE Course (
    ->     course_id INT PRIMARY KEY,
    ->     course_name VARCHAR(100)
    -> );


mysql> CREATE TABLE StudentCourse (
    ->     student_id INT,
    ->     course_id INT,
    ->     PRIMARY KEY (student_id, course_id),
    ->     FOREIGN KEY (student_id) REFERENCES Student(student_id),
    ->     FOREIGN KEY (course_id) REFERENCES Course(course_id)
    -> );


mysql> INSERT INTO Student (student_id, student_name) VALUES
    -> (1, 'Suraj'),
    -> (2, 'Pravin'),
    -> (3, 'Anu'),
    -> (4, 'Mayur');

mysql> INSERT INTO Course (course_id, course_name) VALUES
    -> (101, 'Database Systems'),
    -> (102, 'Web Development'),
    -> (103, 'Java Programming'),
    -> (104, 'Data Structures');

mysql> INSERT INTO StudentCourse (student_id, course_id) VALUES
    -> (1, 101),
    -> (1, 102),
    -> (2, 102),
    -> (2, 103),
    -> (3, 101),
    -> (3, 104),
    -> (4, 103),
    -> (4, 104);

mysql> select * from Student;
+------------+--------------+
| student_id | student_name |
+------------+--------------+
|          1 | Suraj        |
|          2 | Pravin       |
|          3 | Anu          |
|          4 | Mayur       |
+------------+--------------+
4 rows in set (0.00 sec)

mysql> select * from Course;
+-----------+------------------+
| course_id | course_name      |
+-----------+------------------+
|       101 | Database Systems |
|       102 | Web Development  |
|       103 | Java Programming |
|       104 | Data Structures  |
+-----------+------------------+

mysql> select * from StudentCourse;
+------------+-----------+
| student_id | course_id |
+------------+-----------+
|          1 |       101 |
|          3 |       101 |
|          1 |       102 |
|          2 |       102 |
|          2 |       103 |
|          4 |       103 |
|          3 |       104 |
|          4 |       104 |
+------------+-----------+

```

