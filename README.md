# spring-api
created with java 8 .

#here is the mysql code 
create database Quiz;
USE Quiz;

CREATE TABLE question (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question_title VARCHAR(255),
    option1 VARCHAR(255),
      option2 VARCHAR(255),
        option3 VARCHAR(255),
          option4 VARCHAR(255),
    right_answer VARCHAR(255),
    category varchar(100)
);



INSERT INTO question (question_title, option1, option2, option3, option4, right_answer, category)
VALUES
-- Java Questions
('What is Java?', 'A. Object-Oriented Language', 'B. Procedural Language', 'C. Functional Language', 'D. Scripting Language', 'A. Object-Oriented Language', 'Java'),
('What is a class in Java?', 'A. Data Type', 'B. Object', 'C. Method', 'D. Blueprint for Objects', 'D. Blueprint for Objects', 'Java'),
('What is a thread in Java?', 'A. A type of loop', 'B. A lightweight process', 'C. A data structure', 'D. A function', 'B. A lightweight process', 'Java'),
-- Add more Java questions as needed

-- Python Questions
('What is Python?', 'A. Compiled Language', 'B. Interpreted Language', 'C. Assembly Language', 'D. Machine Language', 'B. Interpreted Language', 'Python'),
('What is a list in Python?', 'A. A sequence of characters', 'B. A collection of elements', 'C. A file in Python', 'D. A loop', 'B. A collection of elements', 'Python'),
('What is the purpose of a constructor in Python?', 'A. To initialize an object', 'B. To destroy an object', 'C. To perform mathematical operations', 'D. To create a loop', 'A. To initialize an object', 'Python'),
-- Add more Python questions as needed
('What is Django in Python?', 'A. A programming language', 'B. A web framework', 'C. A database', 'D. A GUI library', 'B. A web framework', 'Python');

select * from question;
