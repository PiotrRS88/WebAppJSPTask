## Aplikacja webowa pobierająca dane z zewnętrznej bazy danych.
Użytkownik wybiera z rozwijanej listy nazwę kolumny z zewnętrznej bazy danych. Po wybraniu zostaje wykonane zapytanie do bazy danych, zwracające unikalne lub powtarzające się krotki (w zależności od zaznaczenia w checkboxie). Wynik jest prezentowany bez konieczności przeładowania strony.

### Użyte technologie:
Java 8, Spring Boot, JavaScript, jpa, Thymeleaf, Bootstrap, jQuery, AJAX, Postgresql, Flyway do migracji bazy danych, jUnit 5

### Uruchomienie aplikacji
1. Przygotowanie bazy danych:
    - konfiguracja w aplikacji (plik application.properties)
    - flyway uruchamia się automatycznie przy starcie aplikacji.
2. Uruchomienie:
    - mvn spring-boot run lub poprzez konfigurację uruchomieniową dla Spring Boot
    - localhost:8080
 
