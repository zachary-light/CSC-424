CREATE PROCEDURE `delete_item` (in uid int, in iid varchar(15))
BEGIN
	delete from inventory where user_ID = uid and item_ID = iid;
END
