CREATE TABLE IF NOT EXISTS public.numerisante_user (
	user_id varchar(255) NOT NULL,
	user_status varchar(255) NOT NULL,
	user_email_id varchar(255) NOT NULL,
	
	created_at timestamp NULL,
	updated_at timestamp NULL,
	is_deleted bool NULL,
	CONSTRAINT numerisante_user_pkey PRIMARY KEY (user_id)
);