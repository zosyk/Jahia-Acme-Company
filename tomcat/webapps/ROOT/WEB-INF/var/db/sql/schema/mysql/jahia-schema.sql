
    drop table if exists jahia_contenthistory;

    drop table if exists jahia_db_test;

    drop table if exists jahia_nodetypes_provider;

    create table jahia_contenthistory (
        id varchar(32) not null,
        entry_action varchar(255),
        entry_date bigint,
        message varchar(255),
        entry_path longtext,
        property_name varchar(50),
        user_key varchar(255),
        uuid varchar(36),
        primary key (id)
    ) ENGINE=InnoDB;

    create table jahia_db_test (
        testfield varchar(255) not null,
        primary key (testfield)
    ) ENGINE=InnoDB;

    create table jahia_nodetypes_provider (
        id integer not null auto_increment,
        cndFile longtext not null,
        filename varchar(255) not null,
        primary key (id)
    ) ENGINE=InnoDB;

    create index jahia_nodetypes_provider_ix1 on jahia_nodetypes_provider (filename);
