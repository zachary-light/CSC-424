CREATE PROCEDURE `find_item` (in uid int, in iid varchar(15))
BEGIN
	select * from inventory where user_ID = uid and item_ID = iid;
END
