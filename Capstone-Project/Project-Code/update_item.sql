CREATE PROCEDURE `update_item` (in uid int, in iid varchar(15), in iname varchar(30), in q int, in p decimal(7, 2), in d varchar(30))
BEGIN
	update inventory
    set item_name = iname, qty=q, price=p, dept=d
    where user_ID = uid and item_ID = iid;
END