CREATE TABLE IF NOT EXISTS empleados (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50),
	apellido VARCHAR(50),
	email VARCHAR(50) UNIQUE,
	sueldo DECIMAL(7,2)
) ENGINE = InnoDB;

truncate table empleados;

insert into empleados (id, nombre, apellido, email, sueldo) values (1, 'Ara', 'Bowes', 'agirone0@accuweather.com', 8565.19);
insert into empleados (id, nombre, apellido, email, sueldo) values (2, 'Belinda', 'Meads', 'bbonicelli1@shop-pro.jp', 3837.11);
insert into empleados (id, nombre, apellido, email, sueldo) values (3, 'Johna', 'Sollner', 'jhuntall2@oakley.com', 9895.61);
insert into empleados (id, nombre, apellido, email, sueldo) values (4, 'Jordan', 'Dykas', 'jaxworthy3@oaic.gov.au', 4445.12);
insert into empleados (id, nombre, apellido, email, sueldo) values (5, 'Jennine', 'Bullock', 'jdraxford4@house.gov', 5953.65);
insert into empleados (id, nombre, apellido, email, sueldo) values (6, 'Fletcher', 'Schreurs', 'fgingell5@accuweather.com', 1960.87);
insert into empleados (id, nombre, apellido, email, sueldo) values (7, 'Barr', 'Beynkn', 'bkynge6@bing.com', 4570.01);
insert into empleados (id, nombre, apellido, email, sueldo) values (8, 'Aliza', 'Kubec', 'anoller7@sciencedaily.com', 8345.97);
insert into empleados (id, nombre, apellido, email, sueldo) values (9, 'Nappie', 'Shortin', 'nryson8@sourceforge.net', 4680.36);
insert into empleados (id, nombre, apellido, email, sueldo) values (10, 'Franchot', 'Phython', 'fskeech9@jigsy.com', 5310.13);
insert into empleados (id, nombre, apellido, email, sueldo) values (11, 'Celina', 'Mattedi', 'ccolquitta@people.com.cn', 8084.38);
insert into empleados (id, nombre, apellido, email, sueldo) values (12, 'Virgina', 'Chat', 'vofferb@wix.com', 1478.66);
insert into empleados (id, nombre, apellido, email, sueldo) values (13, 'Eveline', 'Coverdill', 'ebushellc@homestead.com', 2272.35);
insert into empleados (id, nombre, apellido, email, sueldo) values (14, 'Ossie', 'Gosnay', 'obuttsd@flickr.com', 7536.27);
insert into empleados (id, nombre, apellido, email, sueldo) values (15, 'Lock', 'Sarre', 'lattwoolle@who.int', 9657.82);
insert into empleados (id, nombre, apellido, email, sueldo) values (16, 'Bella', 'Petr', 'bgandersf@google.it', 8016.49);
insert into empleados (id, nombre, apellido, email, sueldo) values (17, 'Pen', 'Phillcock', 'pmaynardg@ihg.com', 1958.86);
insert into empleados (id, nombre, apellido, email, sueldo) values (18, 'Obadias', 'Lanning', 'ochapiroh@prlog.org', 9206.79);
insert into empleados (id, nombre, apellido, email, sueldo) values (19, 'Davita', 'Pavlovsky', 'drosenwasseri@dagondesign.com', 1807.40);
insert into empleados (id, nombre, apellido, email, sueldo) values (20, 'Constanta', 'Killock', 'cmcalisterj@tinyurl.com', 8672.66);
insert into empleados (id, nombre, apellido, email, sueldo) values (21, 'Lev', 'Linny', 'lludlemk@ted.com', 8446.56);
insert into empleados (id, nombre, apellido, email, sueldo) values (22, 'Issiah', 'Heffy', 'ioehmel@nps.gov', 8724.70);
insert into empleados (id, nombre, apellido, email, sueldo) values (23, 'Layton', 'Hearfield', 'lhayersm@wunderground.com', 4649.91);
insert into empleados (id, nombre, apellido, email, sueldo) values (24, 'Madalena', 'Tansly', 'mcarillon@google.pl', 8531.03);
insert into empleados (id, nombre, apellido, email, sueldo) values (25, 'Aliza', 'Skirlin', 'amenereo@soundcloud.com', 7456.26);
insert into empleados (id, nombre, apellido, email, sueldo) values (26, 'Kerk', 'Suttaby', 'keymerp@bloomberg.com', 6552.80);
insert into empleados (id, nombre, apellido, email, sueldo) values (27, 'Cobbie', 'Swiers', 'cagiusq@imageshack.us', 6821.68);
insert into empleados (id, nombre, apellido, email, sueldo) values (28, 'Jacobo', 'Reveland', 'jblewr@cnbc.com', 9228.23);
insert into empleados (id, nombre, apellido, email, sueldo) values (29, 'Russell', 'Ringham', 'rbengoughs@nature.com', 2990.83);
insert into empleados (id, nombre, apellido, email, sueldo) values (30, 'Cecilla', 'O''Shiels', 'ctuppt@virginia.edu', 5739.58);
insert into empleados (id, nombre, apellido, email, sueldo) values (31, 'Conant', 'Lauthian', 'churdu@jiathis.com', 3583.97);
insert into empleados (id, nombre, apellido, email, sueldo) values (32, 'Jerrie', 'Blakes', 'jomohunv@scribd.com', 1677.07);
insert into empleados (id, nombre, apellido, email, sueldo) values (33, 'Barris', 'Sporton', 'bgiovannacciw@webnode.com', 6948.92);
insert into empleados (id, nombre, apellido, email, sueldo) values (34, 'Nevin', 'Sherreard', 'nfinbyx@dailymail.co.uk', 6133.97);
insert into empleados (id, nombre, apellido, email, sueldo) values (35, 'Pepita', 'Bwye', 'pdinsdaley@istockphoto.com', 8175.13);
insert into empleados (id, nombre, apellido, email, sueldo) values (36, 'Menard', 'Gregorin', 'mkirtleyz@cafepress.com', 1767.35);
insert into empleados (id, nombre, apellido, email, sueldo) values (37, 'Honor', 'McEvon', 'hwimpeney10@usnews.com', 8207.41);
insert into empleados (id, nombre, apellido, email, sueldo) values (38, 'Janith', 'Wimes', 'jburde11@cnbc.com', 5655.47);
insert into empleados (id, nombre, apellido, email, sueldo) values (39, 'Eugenio', 'Tesyro', 'ephelip12@sbwire.com', 5209.27);
insert into empleados (id, nombre, apellido, email, sueldo) values (40, 'Aeriela', 'Aim', 'apringley13@nasa.gov', 3993.63);
insert into empleados (id, nombre, apellido, email, sueldo) values (41, 'Peter', 'McCurley', 'psobey14@typepad.com', 7291.95);
insert into empleados (id, nombre, apellido, email, sueldo) values (42, 'Gipsy', 'Whaley', 'ghambly15@ebay.co.uk', 9054.83);
insert into empleados (id, nombre, apellido, email, sueldo) values (43, 'Sarge', 'Higgen', 'schalcroft16@nba.com', 5511.54);
insert into empleados (id, nombre, apellido, email, sueldo) values (44, 'Gertie', 'Russon', 'groper17@foxnews.com', 6300.83);
insert into empleados (id, nombre, apellido, email, sueldo) values (45, 'Amil', 'Galilee', 'aspacey18@samsung.com', 3304.61);
insert into empleados (id, nombre, apellido, email, sueldo) values (46, 'Reidar', 'Eyckelbeck', 'rcrickmer19@de.vu', 3826.71);
insert into empleados (id, nombre, apellido, email, sueldo) values (47, 'Vivianna', 'Aloway', 'vjanuaryst1a@china.com.cn', 2434.80);
insert into empleados (id, nombre, apellido, email, sueldo) values (48, 'Justus', 'Al Hirsi', 'jwykey1b@abc.net.au', 8599.78);
insert into empleados (id, nombre, apellido, email, sueldo) values (49, 'Nyssa', 'Phythean', 'ncarlozzi1c@pen.io', 1662.32);
insert into empleados (id, nombre, apellido, email, sueldo) values (50, 'Elana', 'Bedboro', 'eoldrey1d@webeden.co.uk', 8602.61);

create table if not exists direcciones (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	empleado_id INT REFERENCES empleados(id),
	calle VARCHAR(50),
	ciudad VARCHAR(50),
	pais VARCHAR(50)
) ENGINE = InnoDB;

truncate table direcciones;

insert into direcciones (id, empleado_id, calle, ciudad, pais) values (101, 1, '36 Kennedy Terrace', 'Legok', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (102, 2, '2375 Roxbury Way', 'Hengjiang', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (103, 3, '9343 Annamark Place', 'Amaury', 'Mauritius');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (104, 4, '2687 Mendota Plaza', 'Nice', 'France');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (105, 5, '96 Jenifer Point', 'Daye', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (106, 6, '2744 Hansons Pass', 'Ituiutaba', 'Brazil');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (107, 7, '52987 Hansons Point', 'Cazin', 'Bosnia and Herzegovina');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (108, 8, '77 Becker Court', 'Morani', 'Macedonia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (109, 9, '74 Scott Crossing', 'Delgado', 'El Salvador');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (110, 10, '82 Fordem Parkway', 'Shenshu', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (111, 11, '67834 Milwaukee Pass', 'Qiandeng', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (112, 12, '0 Anderson Plaza', 'Birendranagar', 'Nepal');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (113, 13, '42 Tony Road', 'Novopokrovka', 'Russia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (114, 14, '25283 Grayhawk Pass', 'Panjab', 'Afghanistan');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (115, 15, '0681 Aberg Street', 'Aurora', 'Philippines');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (116, 16, '4 Hudson Road', 'Makale', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (117, 17, '0918 New Castle Road', 'Ipaba', 'Brazil');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (118, 18, '7 Redwing Parkway', 'Quan Phu Nhuan', 'Vietnam');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (119, 19, '6 Helena Parkway', 'Sumuranyar', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (120, 20, '4 Stuart Pass', 'Zielonki', 'Poland');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (121, 21, '62272 Hanson Way', 'San Carlos de Bariloche', 'Argentina');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (122, 22, '2 Jay Terrace', 'Grand Rapids', 'United States');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (123, 23, '1 Weeping Birch Park', 'Kairouan', 'Tunisia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (124, 24, '15101 Maryland Avenue', 'Guangang', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (125, 25, '64796 Surrey Junction', 'Lomba', 'Portugal');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (126, 26, '497 Iowa Street', 'Kopang Satu', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (127, 27, '984 Browning Alley', 'Sokolow Podlaski', 'Poland');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (128, 28, '40 Toban Point', 'Anuling', 'Philippines');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (129, 29, '864 Hudson Way', 'Huangqiao', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (130, 30, '902 Ilene Hill', 'Mirpur Khas', 'Pakistan');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (131, 31, '7 Kipling Alley', 'Zhaoguli', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (132, 32, '761 Gale Drive', 'Alcala', 'Colombia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (133, 33, '38 Anthes Way', 'Novokizhinginsk', 'Russia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (134, 34, '288 High Crossing Crossing', 'Yonezawa', 'Japan');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (135, 35, '14 Nancy Parkway', 'Manlucahoc', 'Philippines');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (136, 36, '79 Dapin Court', 'Ketawang', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (137, 37, '12 High Crossing Plaza', 'Lantian', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (138, 38, '70724 Vernon Junction', 'Barah', 'Sudan');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (139, 39, '37 Esch Street', 'Altunemil', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (140, 40, '0168 Thierer Parkway', 'Srunikrajan', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (141, 41, '80 Talisman Park', 'Tewulike', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (142, 42, '872 Valley Edge Center', 'Ouro Branco', 'Brazil');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (143, 43, '4993 Elka Center', 'Novopokrovskaya', 'Russia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (144, 44, '4524 Fieldstone Park', 'Paulba', 'Philippines');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (145, 45, '898 Arizona Avenue', 'Kasembon', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (146, 46, '9 Scofield Street', 'Seoam', 'Indonesia');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (147, 47, '20 Donald Junction', 'Jiangtun', 'China');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (148, 48, '027 Welch Drive', 'Qurghontepa', 'Uzbekistan');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (149, 49, '45922 Northridge Park', 'Arys', 'Kazakhstan');
insert into direcciones (id, empleado_id, calle, ciudad, pais) values (150, 50, '725 Lillian Terrace', 'Sernancelhe', 'Portugal');

create table if not exists departamentos (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50)
) ENGINE = InnoDB;

truncate table departamentos; 

insert into departamentos (id, nombre) values (1, 'Marketing');
insert into departamentos (id, nombre) values (2, 'Sales');
insert into departamentos (id, nombre) values (3, 'Product Management');
insert into departamentos (id, nombre) values (4, 'Research and Development');
insert into departamentos (id, nombre) values (5, 'Engineering');
insert into departamentos (id, nombre) values (6, 'Accounting');
insert into departamentos (id, nombre) values (7, 'Support');
insert into departamentos (id, nombre) values (8, 'Training');

create table if not exists empleados_departamento (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	empleado_id INT REFERENCES empleados(id) ON DELETE CASCADE,
	departamento_id INT REFERENCES departamentos(id) ON DELETE SET NULL
) ENGINE = InnoDB;

truncate table empleados_departamento;

insert into empleados_departamento (id, empleado_id, departamento_id) values (201, 1, 6);
insert into empleados_departamento (id, empleado_id, departamento_id) values (202, 2, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (203, 3, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (204, 4, 6);
insert into empleados_departamento (id, empleado_id, departamento_id) values (205, 5, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (206, 6, 4);
insert into empleados_departamento (id, empleado_id, departamento_id) values (207, 7, 6);
insert into empleados_departamento (id, empleado_id, departamento_id) values (208, 8, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (209, 9, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (210, 10, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (211, 11, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (212, 12, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (213, 13, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (214, 14, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (215, 15, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (216, 16, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (217, 17, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (218, 18, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (219, 19, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (220, 20, 7);
insert into empleados_departamento (id, empleado_id, departamento_id) values (221, 21, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (222, 22, 6);
insert into empleados_departamento (id, empleado_id, departamento_id) values (223, 23, 7);
insert into empleados_departamento (id, empleado_id, departamento_id) values (224, 24, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (225, 25, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (226, 26, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (227, 27, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (228, 28, 4);
insert into empleados_departamento (id, empleado_id, departamento_id) values (229, 29, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (230, 30, 8);
insert into empleados_departamento (id, empleado_id, departamento_id) values (231, 31, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (232, 32, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (233, 33, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (234, 34, 4);
insert into empleados_departamento (id, empleado_id, departamento_id) values (235, 35, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (236, 36, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (237, 37, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (238, 38, 5);
insert into empleados_departamento (id, empleado_id, departamento_id) values (239, 39, 8);
insert into empleados_departamento (id, empleado_id, departamento_id) values (240, 40, 7);
insert into empleados_departamento (id, empleado_id, departamento_id) values (241, 41, 6);
insert into empleados_departamento (id, empleado_id, departamento_id) values (242, 42, 4);
insert into empleados_departamento (id, empleado_id, departamento_id) values (243, 43, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (244, 44, 8);
insert into empleados_departamento (id, empleado_id, departamento_id) values (245, 45, 1);
insert into empleados_departamento (id, empleado_id, departamento_id) values (246, 46, 7);
insert into empleados_departamento (id, empleado_id, departamento_id) values (247, 47, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (248, 48, 3);
insert into empleados_departamento (id, empleado_id, departamento_id) values (249, 49, 2);
insert into empleados_departamento (id, empleado_id, departamento_id) values (250, 50, 2);

