package pl.samouczekprogramisty.patterns.factorymethod;

public class Courier implements DeliveryService {

    @Override
    public void deliver(Parcel parcel) {
        System.out.println(String.format("Parcel %s was delivered by Courier", parcel));
    }

}
