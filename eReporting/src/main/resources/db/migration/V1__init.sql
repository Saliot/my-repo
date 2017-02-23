-----------------------------------------------------------------------------------------------------------------------------------------
--REFERENCE TABLES
-----------------------------------------------------------------------------------------------------------------------------------------
--COUNTRY
CREATE TABLE er_country (
	countrykey BIGINT(20) NOT NULL AUTO_INCREMENT,
	countrycode VARCHAR(10) NULL DEFAULT NULL,
	countrydescription VARCHAR(255) NULL DEFAULT NULL,
	regulatoryarea INT(1) DEFAULT NULL,
	PRIMARY KEY (countryKey),
  UNIQUE KEY UK_COUNTRY (countrycode)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


--COMPANY
CREATE TABLE er_company (
	companykey BIGINT(20) NOT NULL AUTO_INCREMENT,
	companycode VARCHAR(10) NULL DEFAULT NULL,
	companydescription VARCHAR(255) NULL DEFAULT NULL,
	countrykey BIGINT(20) NOT NULL,
	enabled varchar(1) NOT NULL,
  validuntil DATE,
	PRIMARY KEY (companykey),
	CONSTRAINT FK_COMPANY_COUNTRY FOREIGN KEY (countrykey) REFERENCES er_country (countrykey)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

-----------------------------------------------------------------------------------------------------------------------------------------
--SECURITY TABLES
-----------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE er_user (
  userkey bigint(20) NOT NULL AUTO_INCREMENT, 
  lastname varchar(255) NOT NULL,
  firstname varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  companykey BIGINT(20) NOT NULL,
  password varchar(255) NOT NULL,
  enabled varchar(1) NOT NULL,
  validuntil date,
  lastpasswordresetdate date NOT NULL,
  creationdate date NOT NULL,
  updatedate date NOT NULL,
  PRIMARY KEY (userkey),
  UNIQUE KEY UK_USER_EMAIL (email),
  CONSTRAINT FK_USER_COMPANY FOREIGN KEY (companykey) REFERENCES er_company (companykey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-----------------------------------------------------------------------------------------------------------------------------------------
--OTHERS TABLES
-----------------------------------------------------------------------------------------------------------------------------------------
--Create tables of the schema
CREATE TABLE er_scrolling (
  scrollingkey BIGINT(20) NOT NULL AUTO_INCREMENT, 
  scrollingcode VARCHAR(10) NOT NULL,
  scrollingdescription VARCHAR(255) NOT NULL,	
  creationdate DATE NOT NULL,
  updatedate DATE NOT NULL,
  userkey INT(11) NOT NULL,
  PRIMARY KEY (scrollingkey),
  UNIQUE KEY UK_SCROLLING (scrollingcode)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE er_scrollingchapter (
  scrollingchapterkey INT(11) NOT NULL AUTO_INCREMENT,
  scrollingkey BIGINT(20) DEFAULT NULL,
  chapterinferior VARCHAR(10) NOT NULL,
  chaptersuperior VARCHAR(10) NOT NULL,
  operator VARCHAR(1) NOT NULL,
  PRIMARY KEY (scrollingchapterkey),
  CONSTRAINT FK_SCROLLING FOREIGN KEY (scrollingkey) REFERENCES er_scrolling (scrollingkey)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE er_menuitem (
  menuitemkey BIGINT(20) NOT NULL AUTO_INCREMENT,
  menuitemdescription VARCHAR(30) NOT NULL,
  menuitempath VARCHAR(255),
  menuitemicon VARCHAR(255),
  menuitemorder INT(11),
  menuitemparentkey BIGINT(20),
  PRIMARY KEY (menuitemkey),
  CONSTRAINT FK_ER_MENUITEM FOREIGN KEY (menuitemparentkey) REFERENCES er_menuitem (menuitemkey)
 
) ENGINE=InnoDB DEFAULT CHARSET=latin1;