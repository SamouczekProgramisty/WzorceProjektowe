package pl.samouczekprogramisty.patterns.factorymethod;

public class Pigeon implements DeliveryService {

    @Override
    public void deliver(Parcel parcel) {
        System.out.println(String.format("Parcel %s was delivered by Pigeon", parcel));
    }

}
