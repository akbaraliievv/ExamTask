package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Phone {
    private Long id;
    private String model;
    private int memory;
    private LocalDate yearOfIssue;
    private BigDecimal price;

    public Phone(Long id, String model, int memory, LocalDate yearOfIssue, BigDecimal price) {
        this.id = id;
        this.model = model;
        this.memory = memory;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }
    private void getInfo(long id,String model,int memory,LocalDate yearOfIssue, BigDecimal price){
        try{
            if(id < 0) throw new Exception("Write your ID");
            else this.id = id;

            if(model.isEmpty()) throw new Exception("Write your Model");
            else this.model = model;

            if(memory < 0) throw new Exception("Memory should not be minus");
            else this.memory = memory;

            if(LocalDate.now().isBefore(yearOfIssue)) throw new Exception("Year of issue can't be in the future.");
            else this.yearOfIssue = yearOfIssue;

            if(price.intValue() < 0) throw new Exception("Price should not be minus");
            else this.price = price;

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nPhone" +
                "\nid=" + id +
                "\nmodel='" + model +
                "\nmemory=" + memory +
                "\nyearOfIssue=" + yearOfIssue +
                "\nprice=" + price +"";
    }
}
