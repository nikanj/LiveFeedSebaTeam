# --- First database schema

# --- !Ups

--
-- Table structure for table `professor`
--

CREATE TABLE prof (
  ID_prof 		bigint NOT NULL,
  ProfName		varchar(45),
  Password 		varchar(45),
  constraint pk_prof primary key (ID_prof)
);


--
-- Table structure for table `stats`
--

CREATE TABLE stats (
  ID_stats 		bigint DEFAULT NULL,
  Speed_count		bigint DEFAULT NULL,
  Pause_count 		bigint DEFAULT NULL,
  Volume_count		bigint DEFAULT NULL,
  constraint pk_stats primary key (ID_stats)
);

--
-- Table structure for table `course`
--

CREATE TABLE course (
  ID_prof 			bigint NOT NULL,
  Course_Id         bigint DEFAULT NULL,
  CourseName 		varchar(200) DEFAULT NULL,
  CourseDesc		varchar(200) DEFAULT NULL,
  constraint pk_course primary key (Course_Id)
);
alter table course add constraint fk_course_prof foreign key (ID_prof) references prof (ID_prof) on delete restrict on update restrict;
create index ix_course_prof on course (ID_prof);

--
--Table structure for table 'lecture'
--

CREATE TABLE lecture(
Course_Id			bigint NOT NULL,
ID_stats			bigint NOT NULL,
Lecture_number		bigint NOT NULL,
constraint pk_lecture primary key (Lecture_number)
);
alter table lecture add constraint fk_lecture_course foreign key (Course_Id) references course (Course_Id) on delete restrict on update restrict;
alter table lecture add constraint fk_lecture_stats foreign key (ID_stats) references stats (ID_stats) on delete restrict on update restrict;
create index ix_lecture_course on lecture (Course_Id);

--
-- Table structure for table `question`
--

CREATE TABLE question (
  ID_prof 			bigint NOT NULL,
  ID_question 		bigint NOT NULL,
  Question 			varchar(45) DEFAULT NULL,
  Course_Id 		bigint NOT NULL,
  constraint pk_question primary key (ID_question)
  );

alter table question add constraint fk_question_prof foreign key (ID_prof) references prof (ID_prof) on delete restrict on update restrict;
alter table question add constraint fk_question_course foreign key (Course_Id) references course (Course_Id) on delete restrict on update restrict;
create index ix_question_prof on question (ID_prof);
create index ix_question_course on question (Course_Id);

--
-- Table structure for table `answer`
--

CREATE TABLE answer (
	ID_question  bigint NOT NULL,
  	Answer	     varchar(45),
  	Answer_ID    bigint NOT NULL,
  	constraint pk_answer primary key (Answer_ID)
);

alter table answer add constraint fk_answer_question foreign key (ID_question) references question (ID_question) on delete restrict on update restrict;
create index ix_answer_question on answer (ID_question);



create sequence prof_seq start with 1000;
create sequence question_seq start with 1000;
create sequence answer_seq start with 1000;
create sequence course_seq start with 1000;
create sequence stats_seq start with 1000;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists prof;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists prof_seq;

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists question;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists question_seq;

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists answer;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists answer_seq;

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists course;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists course_seq;

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists stats;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists stats_seq;