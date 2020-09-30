class PostOffice:
    def deliver(self, parcel):
        print(f"Parcel {parcel} was delivered by PostOffice")


class Courier:
    def deliver(self, parcel):
        print(f"Parcel {parcel} was delivered by Courier")


class Pigeon:
    def deliver(self, parcel):
        print(f"Parcel {parcel} was delivered by Pigeon")


class OrderLifecycle:
    def process_order(self, order_id):
        parcel = self.prepare_parcel(order_id)
        delivery_service = self.delivery_service()
        delivery_service.deliver(parcel)

    def prepare_parcel(self, order_id):
        parcel = f"[sampro:{order_id}]"
        print(f"Parcel {parcel} was prepared")
        return parcel

    def delivery_service(self):
        return PostOffice()


class PigeonOrderLifecycle(OrderLifecycle):
    def delivery_service(self):
        return Pigeon()

class CourierOrderLifecycle(OrderLifecycle):
    def delivery_service(self):
        return Courier()

class OrderLifecycle2:
    def __init__(self, delivery_service_factory=PostOffice):
        self.delivery_service_factory = delivery_service_factory

    def process_order(self, order_id):
        parcel = self.prepare_parcel(order_id)
        delivery_service = self.delivery_service_factory()
        delivery_service.deliver(parcel)

    def prepare_parcel(self, order_id):
        parcel = f"[sampro:{order_id}]"
        print(f"Parcel {parcel} was prepared")
        return parcel

if __name__ == "__main__":
    courier_order = CourierOrderLifecycle()
    pigeon_order = PigeonOrderLifecycle()
    post_office_order = OrderLifecycle()

    post_office_order.process_order("order_1")
    courier_order.process_order("order_2")
    pigeon_order.process_order("order_3")

    courier_order = OrderLifecycle2(delivery_service_factory=Courier)
    pigeon_order = OrderLifecycle2(delivery_service_factory=Pigeon)
    post_office_order = OrderLifecycle2()

    post_office_order.process_order("order_1")
    courier_order.process_order("order_2")
    pigeon_order.process_order("order_3")
