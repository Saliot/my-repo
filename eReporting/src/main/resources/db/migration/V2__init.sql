-----------------------------------------------------------------------------------------------------------------------------------------
--REFERENCE TABLES
-----------------------------------------------------------------------------------------------------------------------------------------

--COUNTRY
INSERT INTO er_country (countrykey,countrycode,countrydescription,regulatoryarea) 
VALUES (1, 'DZ', 'Algeria','1');
INSERT INTO er_country (countrykey,countrycode,countrydescription,regulatoryarea) 
VALUES (2, 'FN', 'Benin','1');
INSERT INTO er_country (countrykey,countrycode,countrydescription,regulatoryarea) 
VALUES (3, 'BF', 'Burkina Faso','1');
INSERT INTO er_country (countrykey,countrycode,countrydescription,regulatoryarea) 
VALUES (4, 'CM', 'Cameroon','1');
INSERT INTO er_country (countrykey,countrycode,countrydescription,regulatoryarea) 
VALUES (5, 'ML', 'Mali','1');
INSERT INTO er_country (countrykey,countrycode,countrydescription,regulatoryarea) 
VALUES (6, 'SN', 'Senegal','1');


--COMPANY
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'BNA', 'Banque National Algérie',1,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'FBK', 'FransaBank',1,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'SGB', 'Société Générale Burkina',3,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'CBI', 'Coris Bank International',3,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'BOA', 'Bank of Africa',3,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'BNDA', 'Banque Nationale de Developpment Agricole',5,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'BDMSA', 'Banque De Développement Du Mali SA',5,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'BIM', 'Banque Internationale pour le Mali',5,'1',NULL);
INSERT INTO er_company (companykey,companycode,companydescription,countrykey,enabled,validuntil) 
VALUES (NULL, 'ECO', 'Ecobank',5,'1',NULL);

--SCROLLING
INSERT INTO er_scrolling (scrollingkey,scrollingcode,scrollingdescription,creationdate, updatedate,userkey) 
VALUES (NULL, 'TEST', 'TEST DESCRIPTION', CURRENT_DATE(), CURRENT_DATE(), '1');

INSERT INTO er_scrolling (scrollingkey,scrollingcode,scrollingdescription,creationdate, updatedate,userkey) 
VALUES (NULL, 'TEST2', 'TEST DESCRIPTION 2', CURRENT_DATE(), CURRENT_DATE(), '1');

INSERT INTO er_scrolling (scrollingkey,scrollingcode,scrollingdescription,creationdate, updatedate,userkey) 
VALUES (NULL, 'TEST3', 'TEST DESCRIPTION 3', CURRENT_DATE(), CURRENT_DATE(), '1');

INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,1,'100000','200000','+');
INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,1,'200000','300000','+');
INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,1,'300000','400000','+');

INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,2,'120000','220000','+');
INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,2,'220000','320000','+');
INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,2,'320000','420000','+');

INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,3,'130000','230000','+');
INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,3,'230000','330000','+');
INSERT INTO er_scrollingchapter (scrollingchapterkey,scrollingkey,chapterinferior,chaptersuperior, operator) 
VALUES (NULL,3,'330000','430000','+');

--MENU
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`,`menuitemparentkey`) 
VALUES (NULL, 'Regulatory Reporting', '#', 'fa fa-file-pdf-o', '1','1', NULL);
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`, `menuitemparentkey`) 
VALUES (NULL, 'Custom Reporting', '#', 'fa fa-file', '2','1', NULL);
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`, `menuitemparentkey`) 
VALUES (NULL, 'Configuration', '#', 'fa fa-cubes', '3','1', NULL);
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`, `menuitemparentkey`) 
VALUES (NULL, 'Administration', '#', 'fa fa-cogs','4', '1', NULL);
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`, `menuitemparentkey`) 
VALUES (NULL, 'User Management', '#',NULL, '1','0', 4);
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`, `menuitemparentkey`) 
VALUES (NULL, 'User Profiles', '#',NULL, '2','0', 4);
INSERT INTO `ereporting`.`er_menuitem` (`menuitemkey`, `menuitemdescription`, `menuitempath`, `menuitemicon`, `menuitemorder`,`isVisible`, `menuitemparentkey`) 
VALUES (NULL, 'Personal SetUp', '#', 'fa fa-user', '5','1', NULL);


--FORM
INSERT INTO er_form (formKey, formCode, formDescription, formDescription_FR) 
VALUES (NULL,'REGIST','Registration','Enregistrement');

INSERT INTO er_form (formKey, formCode, formDescription, formDescription_FR) 
VALUES (NULL,'LOGIN','Login','Connexion');


--FORMFIELD
INSERT INTO er_formfield (formFieldKey,formFieldCode,formFieldDescription,formFieldDescription_FR) 
VALUES (NULL,'FIRSTNAME','First Name','Prénom');

INSERT INTO er_formfield (formFieldKey,formFieldCode,formFieldDescription,formFieldDescription_FR) 
VALUES (NULL,'LASTNAME','Last Name','Nom');

INSERT INTO er_formfield (formFieldKey,formFieldCode,formFieldDescription,formFieldDescription_FR) 
VALUES (NULL,'EMAIL','Email','Email');