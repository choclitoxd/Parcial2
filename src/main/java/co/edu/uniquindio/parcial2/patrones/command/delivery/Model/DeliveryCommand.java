package co.edu.uniquindio.parcial2.patrones.command.delivery.Model;

import co.edu.uniquindio.parcial2.patrones.command.service.Command;

public class DeliveryCommand implements Command {
        private DeliveryOrder order;
        private DeliveryService deliveryService;

        public DeliveryCommand(DeliveryOrder order, DeliveryService deliveryService) {
            this.order = order;
            this.deliveryService = deliveryService;
        }

        @Override
        public void execute() {
            deliveryService.processDelivery(order);
        }

}
