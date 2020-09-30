package pl.samouczekprogramisty.patterns.factorymethod;

public class OrderLifecycle {
    public void processOrder(String orderId) {
        Parcel parcel = prepareParcel(orderId);
        DeliveryService deliveryService = deliveryService();
        deliveryService.deliver(parcel);
    }

    protected DeliveryService deliveryService() {
        return new PostOffice();
    }

    private Parcel prepareParcel(String orderId) {
        Parcel parcel = new Parcel(orderId);
        System.out.println(String.format("Parcel %s was prepared", parcel));
        return parcel;
    }

    public static void main(String[] args) {
        CourierOrderLifecycle courierOrder = new CourierOrderLifecycle();
        PigeonOrderLifecycle pigeonOrder = new PigeonOrderLifecycle();
        OrderLifecycle postOfficeOrder = new OrderLifecycle();

        postOfficeOrder.processOrder("order_1");
        courierOrder.processOrder("order_2");
        pigeonOrder.processOrder("order_3");
    }
}

class PigeonOrderLifecycle extends OrderLifecycle {
    @Override
    protected DeliveryService deliveryService() {
        return new Pigeon();
    }
}

class CourierOrderLifecycle extends OrderLifecycle {
    @Override
    protected DeliveryService deliveryService() {
        return new Courier();
    }
}