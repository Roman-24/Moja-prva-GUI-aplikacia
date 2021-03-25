package fiit.oop.People;

import fiit.oop.Core.Order;
import fiit.oop.Storage.Storage;

import java.util.ArrayList;

public class Tailor extends Worker{

    Storage storage;

    public Tailor(String name, String surname, int id, String pass, ArrayList<Order> orders, Storage storage) {
        super(name, surname, id, pass, orders);
        this.setPosition("Tailor");
        this.storage = storage;
    }

    public void prepareTheCloth(Order suit){

        if(suit.getCondition() == 0){
            storage.getCloth().setQuantity(storage.getCloth().getQuantity() - 200);
            suit.setCondition(suit.getCondition()+1);
        }

    }

    public void makeRoughVersion(Order suit){

        if(suit.getCondition() == 1){
            storage.getCloth().setQuantity(storage.getCloth().getQuantity() - 100);
            storage.getButtons().setQuantity(storage.getButtons().getQuantity() - 6);
            suit.setCondition(suit.getCondition()+1);
        }
    }

    public void earsTopSuit(Order suit){

        if(suit.getCondition() == 2){
            storage.getCloth().setQuantity(storage.getCloth().getQuantity() - 150);
            storage.getButtons().setQuantity(storage.getButtons().getQuantity() - 8);
            suit.setCondition(suit.getCondition()+1);
        }
    }

    public void earsBottomSuit(Order suit){

        if(suit.getCondition() == 3){
            storage.getCloth().setQuantity(storage.getCloth().getQuantity() - 80);
            storage.getButtons().setQuantity(storage.getButtons().getQuantity() - 2);
            suit.setCondition(suit.getCondition()+1);
        }
    }

    public void finalizeSuit(Order suit){

        if(suit.getCondition() == 4){
            storage.getCloth().setQuantity(storage.getCloth().getQuantity() - 20);
            storage.getButtons().setQuantity(storage.getButtons().getQuantity() - 2);
            suit.setCondition(suit.getCondition()+1);
        }
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}