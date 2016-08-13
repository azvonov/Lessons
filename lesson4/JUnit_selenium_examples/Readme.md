Lesson 4
----
## Lecture

**Video Link** 

**Presentation** 

----
## Homework

### 1. Parametrized

Взяв за основу домашнее задание №3,  добавьте к имеющемуся сценарию дополнительные наборы тестовых данных. 
Организуйте тест в формате JUnit Parametrized.   
```
--DataSet1--
CheckDate - 12/31/2016
State - Alaska
GrossPay - 1999
Gross Pay Type - perPeriod
Pay Frequency - Weekly
I am exempt from federal Tax = false

NetPay result = $1,422.37
```
--DataSet2--
```
CheckDate - 12/31/2017
State - Hawaii
GrossPay - 75000
Gross Pay Type - Annually
Pay Frequency - Annual
I am exempt from federal Tax = false

NetPay result = $49,701.43
```
### 1. Matchers
Проверку значения NetPay организуйте с помощь Hamcrest matchers
Используйте матчер CloseTo c трешхолдом  $5

Результат закомитьте как апдейт в репозиторий к уже созданной домашней работе  №3
