package lesson5;

public class Human {
    public static void main(String[] args){
        // Массив из 5 сотрудников
        employee[] empArray = new employee[5]; // Объявление массива объектов
        empArray[0] = new employee("Ivanov Ivan", "Engineer", "ivivan@mail.com", "+79252227890", 45000, 41); // потом для каждой ячейки массива задаем объект
        empArray[1] = new employee("Petrov Petr", "Developer", "petr@mail.ru", "+79998888888", 130000, 33);
        empArray[2] = new employee("Sidorov Sidor", "Devops", "sid@mail.ru", "+79200345678", 100000, 29);
        empArray[3] = new employee("Fedorov Fedor", "Project Manager", "fed@mail.com", "+7985987654", 150000, 45);
        empArray[4] = new employee("Ignatov Ignat", "Tester", "ign@google.com", "+79873423127", 85000, 30);

        // Вывод информации о сотрудниках старше 40 лет с помощью цикла
        for (employee i: empArray) {
            if (i.getAge() > 40) i.printInfo();
        }
    }
}