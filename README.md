# Задача 1. Ответьте письменно на вопросы:
1)  ### *Почему использование тестовых заглушек может быть полезным при написании модульных тестов?*

      ####  Ответ: Использование тестовых заглушек позволяет изолировать проверяемый код от внешних зависимостей избежать нежелательных изменений данных в процессе, а также создавать ситуации, которые сложно воспроизвести в реальном окружении, что и помогает ускорить процесс тестирования

2)	### *Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?*

       #### Ответ: Если нужно проверить, что метод был вызван с определенными аргументами можно использовать заглушку типа Mock она позволяет создавать имитирующие объекты и проверять вызваны ли методы с определенными аргументами.

3)	### *Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?*

      #### Ответ: Для таких целей достаточно будет воспользоваться stub заглушкой

4)	### *Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?*

      #### Ответ: Для таких целей существуют Fake заглушки, они заменяют функциональность вызываемого компонента альтернативной реализацией, и позволяют имитировать тяжеловесные зависимости такие как базы данных


# Задание 2.

 #### У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

 #### Для перехода к классу тестирования-> [BookServiceTest](src/test/java/BookServiceTest.java)