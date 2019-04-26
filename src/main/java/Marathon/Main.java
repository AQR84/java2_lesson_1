package Marathon;

import Marathon.Members.Cat;
import Marathon.Members.Dog;
import Marathon.Members.Human;
import Marathon.Members.Team;
import Marathon.obstacles.Course;
import Marathon.obstacles.Cross;
import Marathon.obstacles.Wall;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(new Cross(300), new Wall(2), new Wall(1), new Cross(120)); // Создаем полосу препятствий
        Team team = new Team("Dream team", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Джон")); // Создаем команду
        team.showTeamInfo(); //информация о команде до полосы
        course.showDoIT(team); // Просим команду пройти полосу
        team.showResults(course); // Показываем результаты
        team.showTeamInfo(); //информация о команде после полосы

    }
}