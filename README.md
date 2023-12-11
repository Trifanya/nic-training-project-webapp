# Проект "Система управления задачами".


## Описание проекта.
[ТЗ к проекту](https://disk.yandex.ru/d/QGD1KWpb-_pWhg)

В данном проекте реализована серверная часть системы управления задачами, обеспечивающая следующий функционал:
- Регистрация и аутентификация пользователей.
- Базовые операции для взаимодействия приложением:
  - Просмотр задач, назначенных пользователю или пользователем, с возможностью сортировки по различным критериям, а также фильтрации
 по дате создания, дедлайну, статусу и приоритету.
  - Создание новых задач и их назначение другому пользователю.
  - Изменение статуса и приоритета задач.
  - Удаление выполненных задач.
  - Публикация, редактирование и удаление комментариев к задаче.

## Модель базы данных.
  ![Модель БД для TMS](https://github.com/Trifanya/task-management-system/assets/80362982/b8c4f0a7-8bc1-489e-8b9d-ad9ca3e1908d)


При запуске приложения в базе данных автоматически создадутся необходимые таблицы, которые будут заполнены 
заранее заготовленными данными. Файлы, определяющие структуру и содержимое таблиц, находятся в директории
```resources/db/changelog/changesets```.

## Стек технологий.
- Maven
- Spring Boot
- Spring Security
- Spring MVC
- Spring Data JPA
- Hibernate
- PostgreSQL
- Liquibase
- JUnit 5 и Mockito
- OpenAPI (Swagger UI)
- Docker
- JWT

## Сборка и запуск.
### Запуск приложения в Docker-контейнере.
1. Собрать jar-файл с приложением:
```sh
mvn clean package -DskipTests
```
2. Собрать образ приложения и запустить контейнер с ним:
```sh
docker compose up
```
### Запуск приложения в среде разработки.
1. Создать новую базу данных и подключиться к ней.
2. В файле application.yaml указать необходимую конфигурацию базы данных.
3. Запустить приложение.

## Тестирование.
Работу приложения можно протестировать с помощью инструмента Swagger UI. Для этого после запуска приложения необходимо 
отправить get-запрос по адресу ```host_name:port/swagger-ui/index.html```. После выполнения данного запроса можно будет пользоваться 
интерфейсом Swagger для отправки запросов в приложение.

Для получения доступа к большинству запросов необходимо следовать одному из двух вариантов:
1. Авторизоваться со следующими данными:
  - Логин (один на выбор): i.am.ironman@avg.com, captain.usa@avg.com, thundergod@avg.com, friendly.neighbor@avg.com, huuulk@avg.com, hawk.eye@avg.com
  - Пароль (одинаковый для любого пользователя): Test_passw0rd
2. Зарегистрировать новый аккаунт и авторизоваться с данными этого аккаунта.

При правильно введенных данных и успешной авторизации в ответном запросе придет JWT-токен, который необходимо скопировать и после
нажатия на кнопку **Authorize** в самом верху страницы вставить в поле **Value**. После этого можно будет отправить любой запрос от имени
авторизованного пользователя, не указывая JWT в каждом конкретном запросе.
    
## Контакты.
- Gmail: trifanya.dev@gmail.com
- Telegram: @Trifanya
