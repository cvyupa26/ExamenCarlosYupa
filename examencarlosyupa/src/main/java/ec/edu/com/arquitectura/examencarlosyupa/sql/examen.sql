/*==============================================================*/
/* Table: OFI_EDIFICIO                                          */
/*==============================================================*/
create table OFI_EDIFICIO
(
   COD_EDIFICIO         varchar(8) not null,
   COD_SEDE             varchar(8) not null,
   NOMBRE               varchar(128) not null,
   PISOS                numeric(2,0) not null,
   SUPERFICIE           numeric(7,2),
   VERSION              int not null comment 'Número de versión del registro.',
   primary key (COD_EDIFICIO, COD_SEDE)
);
 
/*==============================================================*/
/* Table: OFI_INSTITUCION                                       */
/*==============================================================*/
create table OFI_INSTITUCION
(
   COD_INSTITUCION      numeric(3,0) not null,
   RUC                  varchar(13) not null,
   RAZON_SOCIAL         varchar(250) not null,
   VERSION              int not null comment 'Número de versión del registro.',
   primary key (COD_INSTITUCION)
);
 
/*==============================================================*/
/* Table: OFI_SEDE                                              */
/*==============================================================*/
create table OFI_SEDE
(
   COD_SEDE             varchar(8) not null,
   COD_INSTITUCION      numeric(3,0),
   NOMBRE               varchar(100) not null,
   DIRECCION            varchar(200),
   ES_PRINCIPAL         boolean not null,
   FECHA_CREACION       date not null,
   VERSION              int not null comment 'Número de versión del registro.',
   primary key (COD_SEDE)
);
 
/*==============================================================*/
/* Table: SEG_PERFIL                                            */
/*==============================================================*/
create table SEG_PERFIL
(
   COD_PERFIL           varchar(8) not null comment 'Código identificador único de un perfil.',
   NOMBRE               varchar(100) not null comment 'Normbre del Perfil.',
   VERSION              int not null comment 'Número de versión del registro.',
   primary key (COD_PERFIL)
);
 
/*==============================================================*/
/* Table: SEG_USUARIO                                           */
/*==============================================================*/
create table SEG_USUARIO
(
   COD_USUARIO          int not null auto_increment comment 'Código identificador del usuario.',
   MAIL                 varchar(128) not null comment 'Correo electrónico principal del usuario.',
   CLAVE                varchar(64) not null comment 'Clave encriptada del usuario.',
   NOMBRE               varchar(128) not null comment 'Nombre real del usuario.',
   INTENTOS_FALLIDOS    numeric(8) not null comment 'Número de teléfono móvil del usuario',
   SUELDO               numeric(8,2) not null,
   FECHA_NACIMIENTO     date not null,
   VERSION              int not null comment 'Número de versión del registro.',
   primary key (COD_USUARIO)
);
 
alter table SEG_USUARIO comment 'Almacena la información de los usuarios del sistema.';
 
/*==============================================================*/
/* Index: IDX_USUARIO_MAIL                                      */
/*==============================================================*/
create unique index IDX_USUARIO_MAIL on SEG_USUARIO
(
   MAIL
);
 
/*==============================================================*/
/* Table: SEG_USUARIO_PERFIL                                    */
/*==============================================================*/
create table SEG_USUARIO_PERFIL
(
   COD_USUARIO          int not null comment 'Código identificador del usuario.',
   COD_PERFIL           varchar(8) not null comment 'Código identificador del perfil.',
   ES_ACTIVO            boolean not null default NULL,
   VERSION              int not null comment 'Número de versión del registro.',
   primary key (COD_USUARIO, COD_PERFIL)
);
 
alter table SEG_USUARIO_PERFIL comment 'Almacena los diferentes perfiles que puede tener un usuario.';
 
alter table OFI_EDIFICIO add constraint FK_EDIFICIO_A_SEDE foreign key (COD_SEDE)
      references OFI_SEDE (COD_SEDE) on delete restrict on update restrict;
 
alter table OFI_SEDE add constraint FK_SEDE_A_INSTITUCION foreign key (COD_INSTITUCION)
      references OFI_INSTITUCION (COD_INSTITUCION) on delete restrict on update restrict;
 
alter table SEG_USUARIO_PERFIL add constraint FK_REFERENCE_4 foreign key (COD_USUARIO)
      references SEG_USUARIO (COD_USUARIO) on delete restrict on update restrict;
 
alter table SEG_USUARIO_PERFIL add constraint FK_USUPERF_A_PERFIL foreign key (COD_PERFIL)
      references SEG_PERFIL (COD_PERFIL) on delete restrict on update restrict;