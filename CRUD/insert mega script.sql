insert into cars(name,model,modification)
values('Audi','R5','400hs'),('BMW','X3','250hs'),('Lada','Priora','90hs');

insert into customers(name,surname,patronic,passport_series,passport_number,birthdate)
values('Игорь','Ежов','Владимирович','5705','032667', cast('1970-04-16' as datetime)),
	  ('Олег','Шашков','Михайлович','5522','035878', cast('1975-07-25' as datetime));

insert into merchants(name,surname,patronic)
values('Михаил','Захаров','Олегович'),('Алексей','Иванов','Петрович');

insert into store(id_car,count,price,testdrive_avaible)
values(1,10,4000000,1),(2,5,2500000,1)

