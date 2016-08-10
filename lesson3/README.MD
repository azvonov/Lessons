Lesson_3
----
##Лекции:

**Video Link** [Webinar Video 3](https://youtu.be/A625Zq_5cR4) 

**Presentation** [Presentation](https://www.dropbox.com/s/6afk3lkk12083ya/)

----
##Домашнее задание:

###Сценарий 1 Salary Calculator

На сайте http://www.paycheckcity.com  в разделе /calculator/salary/
задайте следующие параметры в форме расчета налогов:

CheckDate - 08/31/2016
State - California
GrossPay - 10000
Gross Pay Type - perPeriod
Pay Frequency - monthly

I am exempt from federal Tax = true

Нажмите Calculate button.  

Дождитесь окончания расчета результатов. 
В результирующей таблице, проверьте величину рассчитаного NetPay

(В моем случае она равна $8,387.79)

###Сценарий 2 Hourly Calculator

На сайте: http://www.paycheckcity.com, в разделе /calculator/hourly/, в блоке Rates information, задайте следующие значения:

Pay Rate #1 = 50 
Hours #1 = 160
 
Далее нажмите AddRate и введите в поля слующее:

Pay Rate #2 = 80
Hours #2 = 8

Проверьте, что в поле Gross Pay появилось расчитанное значение 8640

В своей работе используйте @Before и @After методы из пакета TestNg

Настройте тесты так, чтобы браузер открывался один раз для прохождения обоих тестов.

Также, создайте testng.xml и опишите в нем свой сьют.

Добавьте написанные тесты в группы P1 и regression.

Запустите тесты с помощью testng.xml


###Дополнительное задание для тех, кому легко:  
Организуйте тестовые данные с помощью DataProvider. 
Свяжите DataProvider с вашими тестами.
Добавьте еще один набор тестовых данных в ваш DataProvider таким образом, 
чтобы ваши тесты выполнились 2 раза на разных тестовых данных.
