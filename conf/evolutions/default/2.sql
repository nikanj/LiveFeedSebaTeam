# --- Sample dataset

# --- !Ups

Insert into prof (ID_prof, ProfName, Password) values (1,'bruegge', 'test1');
Insert into prof (ID_prof, ProfName, Password) values (2,'jacobson', 'test2');
Insert into stats (ID_stats, Speed_count, Pause_count, Volume_count) values (1,0,0,0);
--Insert into course (ID_prof, Course_Id, CourseName) values (1,0,NULL);
# --- !Downs

delete from prof;