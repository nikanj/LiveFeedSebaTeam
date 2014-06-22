# --- Sample dataset

# --- !Ups

Insert into prof (ID_prof, ProfName, Password) values (1,'bruegge', 'test1');
Insert into prof (ID_prof, ProfName, Password) values (2,'jacobson', 'test2');
Insert into stats (ID_stats, Speed_Ok, Speed_Low, Speed_High, Volume_Ok, Volume_Low, Volume_High, Pause_count) values (1, 12, 15, 20, 16, 18, 21, 22);
Insert into course (ID_prof, CourseName) values (1,'pattern');
Insert into course (ID_prof, CourseName) values (1,'software');
Insert into question (ID_question, ID_prof, Question, Course_Id) values (1, 1, 'test', 1);
Insert into question (ID_question, ID_prof, Question, Course_Id) values (2, 1, 'test', 1);
Insert into question (ID_question, ID_prof, Question, Course_Id) values (3, 1, 'test', 1);
Insert into question (ID_question, ID_prof, Question, Course_Id) values (4, 1, 'test', 1);
# --- !Downs