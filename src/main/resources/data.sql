DROP TABLE tbl_user IF EXISTS
CREATE TABLE tbl_user(id INTEGER(11) PRIMARY KEY auto_increment, firstName VARCHAR(100), lastName VARCHAR(100), sex VARCHAR(1),  dni INTEGER(11), email VARCHAR(100))
INSERT INTO tbl_user(firstName, lastName, sex, dni, email) VALUES ('Ed', 'Huerta','M', 41673416,'ed.huerta@edhm.com'),('Lei', 'Mess','M', 64785423,'le.mess@edhm.com'),('El', 'Plin','F',46485194,'el.pli@plin.com'),('Net', 'Flixen','F', 48158415,'net.flixen@nettin.com'),('In', 'Nes','M' ,64948451,'in.nes@nessin.com'), ('Mel', 'Yim','M',49563784,'melyim@detten.com'),('Ten', 'Flin','M', 46454648,'ten.fin@netten.com'),('Tel', 'Tim','M',91534682,'teltim@detten.com'),('Lonn', 'LLin','M', 46491468,'lonn.llin@netten.com')
	
	
	
	
	
	
