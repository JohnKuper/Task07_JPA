insert into cars(name,model,modification,color)
values('Audi','R5','400hs','Красный'),('BMW','X3','250hs','Белый'),('Lada','Priora','90hs','Черный');

insert into customers(name,surname,patronic,passport_series,passport_number,birthdate)
values('Игорь','Ежов','Владимирович','5705','032667', cast('1970-04-16' as datetime)),
	  ('Олег','Шашков','Михайлович','5522','035878', cast('1975-07-25' as datetime));

insert into merchants(name,surname,patronic)
values('Михаил','Захаров','Олегович'),('Алексей','Иванов','Петрович');

insert into store(id_car,count,price,testdrive_avaible)
values(1,10,4000000,1),(2,5,2500000,1),(3,5,400000,1),(3,2,900000,0);

insert into sales(id_car,id_customer,id_merchant,price)
values(1,1,1,50000.99)
