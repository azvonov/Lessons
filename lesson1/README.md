Lesson 1 – Selenium IDE
----
## Lecture

**Video Link** [Webinar Video 1](https://youtu.be/AdEqPyhN8fg)

----
## Homework

### Preconditions:
Для успешного прохождения задания вам необходимо установить: 

1. [Oracle JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. [Firefox и плагин к нему Selenium IDE](https://addons.mozilla.org/en-US/firefox/addon/selenium-ide/)
3. [Maven](https://maven.apache.org/download.cgi) [Руководство по установке Maven](http://www.apache-maven.ru/install.html)


### С помощью Selenium IDE необходимо создать тестовый набор (suit).
Далее, в созданный тестовый набор необходимо добавить и записать 2 тестовых сценария приведенных ниже.
Убедившись что ваш suit запускается и проходит без ошибок, вам необходимо экспортировать каждый из тестов и сам suit 
в формате Java + TestNg.

#### Дополнительное задание для тех кому задание далось легко: 

* Создайте новый проект в среде разработки [IntelijIdea](https://www.jetbrains.com/idea/download/). 
* Добавьте в него экспортированный из Selenium IDE код.
* Запустите тесты из среды разработки.

---
## Тест 1 – Депозитный калькулятор

[http://finance.liga.net/finmarket/calculators.htm](http://finance.liga.net/finmarket/calculators.htm)
```
Инпуты:
Введите сумму вклада – 500 000
Срок депозита (месяцев) – 12
Процентная ставка – 25
Выберите тип выплаты процентов – Выплата процентов в конце срока
``` 
Нажать кнопку `Рассчитать`
 
Ожидаем:
```
Сумма процентов, начисленных за один период
125000.00
```
## Тест 2 – Кредитный калькулятор

[http://finance.liga.net/finmarket/calculators.htm](http://finance.liga.net/finmarket/calculators.htm)
``` 
Инпуты
Введите сумму кредита – 1 000 000
Срок кредитования (месяцев) – 36
Процентная ставка – 12
Укажите тип выплаты процентов – Классиченский
```
Нажать кнопку `Рассчитать`
 
Ожидаем:
```
Ежемесячный платеж по кредиту
первый месяц
37777.78
```
