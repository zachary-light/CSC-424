CREATE DEFINER=`quikvory_root`@`73.252.6.91` FUNCTION `new_user`(e varchar(35), u varchar(35), p varchar(30)) RETURNS int(11)
BEGIN	
	IF NOT EXISTS(
	select email from users
    where email = e
	)
	THEN
		insert into users (email, username, password) values (e, u, p);
        RETURN 1;
    ELSE 
		RETURN 0;
	END IF;
END