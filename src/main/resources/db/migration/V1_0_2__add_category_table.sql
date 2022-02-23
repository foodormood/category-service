CREATE TABLE category(
    id uuid primary key not null default gen_random_uuid(),
    name varchar(255),
    name_en varchar(255),
    sort_order int4
)