drop table if exists CABECERA_RESERVA;

drop table if exists CLIENTE;

drop table if exists DETALLE_RESERVA;

drop table if exists EMPRESA;

drop table if exists HOTEL;

drop table if exists PAIS;

drop table if exists PAQUETE;

drop table if exists TIPO_PAQUETE;

/*==============================================================*/
/* Table: CABECERA_RESERVA                                      */
/*==============================================================*/
create table CABECERA_RESERVA
(
   CRE_ID               int not null,
   HOT_ID               int,
   CRE_FECHA            date,
   CRE_NUMERO           int,
   CRE_OBSERVACION      varchar(4000),
   CRE_ESTADO           char(1),
   CRE_FECHA_ESTADO     date,
   CRE_FECHA_INGRESO    date,
   CRE_FECHA_SALIDA     date,
   CRE_NUM_ADULTOS      int,
   CRE_NUM_NINIOS       int,
   CRE_NUM_TERCERA_EDAD int,
   primary key (CRE_ID)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   EMP_ID               int,
   CLI_ID               int,
   CLI_NOMBRES          varchar(100),
   CLI_APELLIDOS        varchar(100),
   CLI_TIPO_DOCUMENTO   char(1),
   CLI_NUMERO_DOCUMENTO varchar(20),
   CLI_EMAIL            varchar(20)
);

/*==============================================================*/
/* Table: DETALLE_RESERVA                                       */
/*==============================================================*/
create table DETALLE_RESERVA
(
   DRE_ID               int not null,
   PAQ_ID               int,
   CRE_ID               int,
   DRE_VALOR            float,
   DRE_CANTIDAD         int,
   primary key (DRE_ID)
);

/*==============================================================*/
/* Table: EMPRESA                                               */
/*==============================================================*/
create table EMPRESA
(
   EMP_ID               int not null,
   EMP_RAZON_SOCIAL     varchar(100),
   EMP_NOMBRE_FAMTASIA  varchar(100),
   EMP_RUC              varchar(13),
   EMP_DIRECCION        varchar(4000),
   EMP_TELEFONO         varchar(20),
   primary key (EMP_ID)
);

/*==============================================================*/
/* Table: HOTEL                                                 */
/*==============================================================*/
create table HOTEL
(
   HOT_ID               int not null,
   EMP_ID               int,
   PAI_ID               int,
   HOT_DESCRIPCION      varchar(100),
   primary key (HOT_ID)
);

/*==============================================================*/
/* Table: PAIS                                                  */
/*==============================================================*/
create table PAIS
(
   PAI_ID               int not null,
   PAI_DESCRIPCION      varchar(100),
   primary key (PAI_ID)
);

/*==============================================================*/
/* Table: PAQUETE                                               */
/*==============================================================*/
create table PAQUETE
(
   PAQ_ID               int not null,
   TPA_ID               int,
   HOT_ID               int,
   PAQ_DESCRIPCION      varchar(100),
   PAQ_VALOR            float,
   PAQ_ESTADO           char(1),
   PAQ_FECHA            date,
   primary key (PAQ_ID)
);

/*==============================================================*/
/* Table: TIPO_PAQUETE                                          */
/*==============================================================*/
create table TIPO_PAQUETE
(
   TPA_ID               int not null,
   TPA_DESCRIPCION      varchar(100),
   primary key (TPA_ID)
);

alter table CABECERA_RESERVA add constraint FK_RELATIONSHIP_5 foreign key (HOT_ID)
      references HOTEL (HOT_ID) on delete restrict on update restrict;

alter table CABECERA_RESERVA add constraint FK_RELATIONSHIP_6 foreign key ()
      references CLIENTE on delete restrict on update restrict;

alter table CLIENTE add constraint FK_RELATIONSHIP_1 foreign key (EMP_ID)
      references EMPRESA (EMP_ID) on delete restrict on update restrict;

alter table DETALLE_RESERVA add constraint FK_RELATIONSHIP_7 foreign key (CRE_ID)
      references CABECERA_RESERVA (CRE_ID) on delete restrict on update restrict;

alter table DETALLE_RESERVA add constraint FK_RELATIONSHIP_8 foreign key (PAQ_ID)
      references PAQUETE (PAQ_ID) on delete restrict on update restrict;

alter table HOTEL add constraint FK_RELATIONSHIP_2 foreign key (PAI_ID)
      references PAIS (PAI_ID) on delete restrict on update restrict;

alter table HOTEL add constraint FK_RELATIONSHIP_4 foreign key (EMP_ID)
      references EMPRESA (EMP_ID) on delete restrict on update restrict;

alter table PAQUETE add constraint FK_RELATIONSHIP_3 foreign key (HOT_ID)
      references HOTEL (HOT_ID) on delete restrict on update restrict;

alter table PAQUETE add constraint FK_RELATIONSHIP_9 foreign key (TPA_ID)
      references TIPO_PAQUETE (TPA_ID) on delete restrict on update restrict;
