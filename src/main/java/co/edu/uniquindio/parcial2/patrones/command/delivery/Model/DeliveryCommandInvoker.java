package co.edu.uniquindio.parcial2.patrones.command.delivery.Model;

import co.edu.uniquindio.parcial2.patrones.command.service.Command;

import java.util.LinkedList;
import java.util.Queue;

public class DeliveryCommandInvoker {
        private Queue<Command> commandQueue = new LinkedList<>();

        public void addCommand(Command command) {
            commandQueue.offer(command);
        }

        public void executeCommands() {
            while (!commandQueue.isEmpty()) {
                Command command = commandQueue.poll();
                command.execute();
            }
        }
}
