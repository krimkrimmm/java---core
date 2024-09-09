package lab3.service;
import lab3.entities.Worker;
import java.util.ArrayList;
import java.util.List;
public class WorkerService {
    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void increaseSalary(String id, double amount) {
        for (Worker worker : workers) {
            if (worker.getId().equals(id)) {
                worker.setSalary(worker.getSalary() + amount);
                break;
            }
        }
    }

    public void decreaseSalary(String id, double amount) {
        for (Worker worker : workers) {
            if (worker.getId().equals(id)) {
                worker.setSalary(worker.getSalary() - amount);
                break;
            }
        }
    }

    public void displayWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}




