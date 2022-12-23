package dao;

import model.Phone;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Phone>phoness;
  public    List<Phone>phones = new ArrayList<>();

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Database{" +
                "phoness=" + phoness +
                ", phones=" + phones +
                '}';
    }
}
