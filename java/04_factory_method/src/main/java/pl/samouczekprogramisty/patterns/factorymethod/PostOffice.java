package pl.samouczekprogramisty.patterns.factorymethod;

public class PostOffice implements DeliveryService {

    @Override
    public void deliver(Parcel parcel) {
        System.out.println(String.format("Parcel %s was delivered by PostOffice", parcel));
    }

}
