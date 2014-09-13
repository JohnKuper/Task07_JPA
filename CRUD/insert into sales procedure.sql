DELIMITER $$
 DROP PROCEDURE IF EXISTS fillDataBaseSales$$
 CREATE PROCEDURE fillDataBaseSales()
	BEGIN
		DECLARE step INT;
		DECLARE carRnd INT;
		DECLARE customerRnd INT;
		DECLARE merchantRnd INT;
		DECLARE priceRnd DECIMAL(11,2);

		set step = 1;

		WHILE step  <= 50 DO

			set carRnd = ROUND(RAND()*4)+1;
			set customerRnd = ROUND(RAND()*4)+1 ;
			set merchantRnd = ROUND(RAND()*2)+1;
			set priceRnd = ROUND(RAND()*1000000.50);


			insert into sales(id_car,id_customer,id_merchant,price)
			values(carRnd,customerRnd,merchantRnd,priceRnd);



			set step = step + 1;
		END WHILE;
	END$$
DELIMITER ;   

call fillDataBaseSales(); 