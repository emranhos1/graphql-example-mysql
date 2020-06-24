# graphql-example-mysql
1. Create a schema in MySQL named `graphql-example-mysql`
2. Modify  `spring:jpa:hibernate:ddl-auto: update` to `ddl-auto: create` for the first time in `Application.yml`
3. Build it and run it
4. After run it will create all relevant tables for this project.
5. Modify `spring:jpa:hibernate:ddl-auto: create` to `ddl-auto: update` and run it again.

## There will be a problem for patient table foreign key, what to do about it
1. After Run this project Go to `MySQL` and update `patient` table
2. `UPDATE PATIENT SET GENDER_CODE = '1', NATIONALITY_CODE = '2' WHERE PATIENT_NO = '1';`
3. `UPDATE PATIENT SET GENDER_CODE = '2', NATIONALITY_CODE = '1' WHERE PATIENT_NO = '2';`
4. `UPDATE PATIENT SET GENDER_CODE = '3', NATIONALITY_CODE = '3' WHERE PATIENT_NO = '3';`
5. `UPDATE PATIENT SET GENDER_CODE = '4', NATIONALITY_CODE = '4' WHERE PATIENT_NO = '4';`

## From Postman you need to Query some Graphql query
1. There is a `graphql-example-mysql.postman_collection.json` file in root directory in this project
2. Import this file in postman
3. Here are all relevent Query for this `graphql-example-mysql` project
