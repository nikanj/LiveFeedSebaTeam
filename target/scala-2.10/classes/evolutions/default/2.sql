# --- Sample dataset

# --- !Ups

Insert into prof (ID_prof, ProfName, Password) values (1,'bruegge', 'test1');
Insert into prof (ID_prof, ProfName, Password) values (2,'jacobson', 'test2');
Insert into stats (ID_stats, Speed_slow, Speed_ok, Speed_fast, Pause, Volume_high, Volume_ok, Volume_low) values(1, 0, 0, 0, 0, 0 ,0 ,0);

# --- !Downs

delete from prof;