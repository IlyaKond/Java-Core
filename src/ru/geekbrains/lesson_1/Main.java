package ru.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
	Team team1 = new Team("Корешки-кресломешки", "Сережа, Ваня, Андрей, Леонид",4);
    Course course1= new Course(5);
    Team team2 = new Team("Малыши-простыши", "Илья, Женя, Матвей,",3);
    Course course2= new Course(8);
    team1.infoTeam();
    Team[] teams=new Team[3];
    team1.putMeInArray(teams,3);
    }
}
