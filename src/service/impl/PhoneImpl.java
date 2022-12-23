package service.impl;

import dao.Database;
import model.Phone;
import service.PhoneService;

import java.util.*;

public class PhoneImpl implements PhoneService {
    private Database database;

    public Database getPhoness() {
        return database;
    }
    public PhoneImpl(Database database) {
        this.database = database;
    }

    public void setPhoness(Database phoness) {
        this.database= phoness;
    }

    @Override
    public String addPhones(Set<Phone> phones) {
        List<Phone> newPhones = phones.stream().toList();
            for (Phone newPhone : newPhones) {
            }
        this.database.getPhones().addAll(newPhones);
    return "Successfully added phones";
    }

    @Override
    public Queue<Phone> getPhonesByModel(String model) {
        List<Phone> list = database.getPhones().stream()
                .filter(x -> x.getModel().contains(model)).toList();
        return new LinkedList<>(list);
    }

    @Override
    public String updatePhone(Long phoneId, Phone phone) {
        database.setPhones(database.getPhones().stream().map(x -> x.getId() == phoneId ? x = phone : x).toList());
        return "Phone added successfully";
    }


    @Override
    public String removePhoneById(Long phoneId) {
        List<Phone> list = database.getPhones().stream().filter(x -> x.getId() != phoneId).toList();
        database.setPhones(list);
        return "Phone removed successfully";
    }

    @Override
    public Deque<Phone> getAllPhones() {
        return new LinkedList<>(database.getPhones());
    }

    @Override
    public List<Phone> sortPhonesByYearOfIssue() {
        return null;
    }

    @Override
    public List<Phone> filterPhonesByPrice(int fromThisPrice, int upToThisPrice) {
         return database.getPhones().stream()
                .filter(x -> (x.getPrice().intValue() >= fromThisPrice && x.getPrice().intValue() <= upToThisPrice)).toList();
    }

    @Override
    public List<Phone> findPhonesWithLargeMemoryAndSmallMemory() {
        return null;}

    @Override
    public String deleteAllPhones() {
        database.setPhones(new ArrayList<>());
        return "Phones deleted successfully.";
    }
}
