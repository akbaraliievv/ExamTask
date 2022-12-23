import dao.Database;
import model.Phone;
import service.impl.PhoneImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       /* 1)  Жаны проект түзүп, 3 жаны package ачыныз - model, service, dao.
        3) model пакеттин ичине Phone  деген класс болсун, свойствалары - id, model, memory,  yearOfIssue, price.
        4) (id уникалдуу болсун, model (null) пустой болбосун , memory терс санда болбосун, `yearOfIssue`келечек убакыт болбосун, price - терс сан болбосун )
        эгерде ушул талапка жооп бербесе exception карматабыз. Эч качан кодубуз токтоп калбашы керек.
        5) dao пакеттин ичине Database деген класс тузунуз, ичинде 1 свойствасы болот - phones. Бул класс бизге база данных болуп берет.
        6) service пакеттин ичине PhoneService деген interface жана impl деген пакет тузуп коюнуз.
        7) PhoneService_тин ичинде төмөндөгү методдор болсун.
                - String addPhones(Set<Phone> phones);
        - Queue<Phone> getPhonesByModel(String  model);
        - String updatePhone(Long phoneId, Phone phone);
        - String removePhoneById(Long phoneId);
        - Deque<Phone> getAllPhones();
        - List<Phone> sortPhonesByYearOfIssue(); 1 ди басканда ascending, 2 ни басканда descending кылып сорттосун
                - List<Phone> filterPhonesByPrice(int fromThisPrice, int upToThisPrice);
        - List<Phone> findPhonesWithLargeMemoryAndSmallMemory(); найти телефоны с большой памятью и маленькой памятью
        - String deleteAllPhones();
        8) impl пакеттин ичине PhoneImpl деген класс тузунуз, бул класс PhoneService интерфейсин ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(Database).
        9)  PersonServiceImpl ичинде методдор stream аркылуу ишке ашырылсын (эгерде stream менен чыгара албай калсаныз гана стандартуу озунуз билгендей чыгарсаныз болот).
        10) Main класста бардык методдорду чакырып иштетиниз.
        */
        Database database = new Database();
        PhoneImpl phoneees = new PhoneImpl(database);
        Phone phone = new Phone(1L, "Iphone 14 pro Max", 526, LocalDate.of(2022, 05, 5), new BigDecimal(150000));
        Phone phone2 = new Phone(2L, "Samsung A 51", 128, LocalDate.of(2021, 07, 15), new BigDecimal(60000));

        HashSet<Phone> phones = new HashSet<Phone>(Set.of(phone));
        System.out.println(phoneees.addPhones(phones));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        HashSet<Phone> phones1 = new HashSet<Phone>(Set.of(phone2, phone));
        System.out.println(phoneees.addPhones(phones1));


        System.out.println(phoneees.getAllPhones());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(phoneees.updatePhone(1L, new Phone(3L, "Iphone changed", 2,
//                LocalDate.of(2002, 2, 2), new BigDecimal(12300))));
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(phoneees.getAllPhones());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
//        System.out.println(phoneees.getPhonesByModel("Iphone"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(phoneees.removePhoneById(2L));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("______________________________________________________");
        System.out.println(phoneees.getAllPhones());
//        System.out.println(phoneees.findPhonesWithLargeMemoryAndSmallMemory());
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(phoneees.deleteAllPhones());
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(phoneees.filterPhonesByPrice(60,1500000));


    }
}