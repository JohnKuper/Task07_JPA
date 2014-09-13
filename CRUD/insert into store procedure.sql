DELIMITER $$
 DROP PROCEDURE IF EXISTS fillDataBaseStore$$
 CREATE PROCEDURE fillDataBaseStore()
	BEGIN
		DECLARE step INT;
		DECLARE carRnd INT;
		DECLARE countRnd INT;
		DECLARE priceRnd DECIMAL(11,2);
		DECLARE testDriveRnd Bit;

		set step = 1;

		WHILE step  <= 50 DO

			set carRnd = ROUND(RAND()*4)+1;
			set countRnd = ROUND(RAND()*9)+1 ;
			set priceRnd = ROUND(RAND()*1000000.50);
			set testDriveRnd = ROUND(RAND()*1);


			insert into store(id_car,count,price,testdrive_avaible)
			values(carRnd,countRnd,priceRnd,testDriveRnd);



			set step = step + 1;
		END WHILE;
	END$$
DELIMITER ;  

call fillDataBaseStore(); 