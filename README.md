A console application that allows the player to choose from several games.

Before starting, the player is prompted to enter their name.
The player is asked a question and must type the answer in the console.
The game ends if the player answers incorrectly. After three consecutive correct answers, the player wins.
After finishing a game (win or lose), the player can choose another game or exit the application.

The URL is parsed, validated, and saved to the database upon successful validation.
The page can then be analyzed, returning the response code, title, name, and description of the site.
The title, name, and description are extracted from the HTML of the page.
The results of each analysis are saved in a table linked to the URLs table with a one-to-many relationship using a foreign key.
The application follows the MVC structure, with database interactions performed via SQL queries.
Covered by tests, with WebMockServer used for testing.

### Hexlet tests and linter status:
[![Actions Status](https://github.com/LiudmilaKorchikova/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/LiudmilaKorchikova/java-project-61/actions)
### Code climate badge:
[![Maintainability](https://api.codeclimate.com/v1/badges/f23af5e485836e40af70/maintainability)](https://codeclimate.com/github/LiudmilaKorchikova/java-project-61/maintainability)
### Even game record:
https://asciinema.org/a/X6VeMKNK92uiOlAPjydWlGi6v
### Calc game record:
https://asciinema.org/a/mlb3SHS2HIxw432rLscRJI6iT
### GCD game record:
https://asciinema.org/a/LS40xKkqqZW80Te00lsUDmE1E
### Progression game record:
https://asciinema.org/a/Fl5h1mn7kAJE6d9ZTIOWQRlju
### Prime game record
https://asciinema.org/a/jVBFLm70nhbVJo55eQQfJm2rG
