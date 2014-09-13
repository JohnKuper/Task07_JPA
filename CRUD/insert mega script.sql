insert into cars(name,model,modification,color)
values('Audi','R5','400hs','Красный'),
	  ('BMW','X3','250hs','Белый'),
	  ('Lada','Priora','90hs','Черный'),
	  ('Lada','Granta','150hs','Синий'),
      ('Lamborghini','Diablo SV','900hs','Металлик');

insert into customers(name,surname,patronymic,passport_series,passport_number,birthdate)
values('Игорь','Ежов','Владимирович','5705','032667', cast('1970-04-16' as datetime)),
	  ('Олег','Шашков','Михайлович','5522','035878', cast('1975-07-25' as datetime)),
	  ('Никифор','Швечиков','Евлампиевич','5533','034378', cast('1985-04-22' as datetime)),
	  ('Юлия','Сильвестрова','Михеевна','4422','235998', cast('1986-01-01' as datetime)),
	  ('Яна','Осинова','Якововна','5589','712260', cast('1972-02-27' as datetime));

insert into merchants(name,surname,patronymic)
values('Михаил','Захаров','Олегович'),
	  ('Алексей','Иванов','Петрович'),
	  ('Семен','Воронцов','Дмитриевич');


insert into store(id_car,count,price,testdrive_avaible)
values(1,10,4000000,1),(2,5,2500000,1),(3,5,400000,1),(3,2,900000,0);

insert into sales(id_car,id_customer,id_merchant,price)
values(1,1,1,5000000.99),(2,2,2,4550000.25),(3,1,1,150000.55);
