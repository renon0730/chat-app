create table if not exists rooms (
  id        serial      not null,
  name      varchar(128)  not null,
  primary key (id)
);