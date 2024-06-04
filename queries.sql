--Part 1
-- id (int PK), employer (varchar[255]), name (varchar[255]), skills (varchar[255])

--Part 2
--SQL TASK: In queries.sql under “Part 2”, write a query to list the names of the employers in St. Louis City.
--Do NOT specify an ordering for the query results.
select name from employer
where location = "St. Louis City";

--Part 3

DROP TABLE job;

--Part 4
select * from skill
inner join job_skills on skill.id = job_skills.skills_id
where job_skills.jobs_id is not null
order by name asc;