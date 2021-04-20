CREATE PROCEDURE `create_item` (in uid int, in iid varchar(15), in iname varchar(30), in q int, in p decimal(7, 2), in d varchar(30))
BEGIN
	insert into iventory (user_ID, item_ID, item_name, qty, price, dept) values (uid, iid, iname, q, p, d);
END
