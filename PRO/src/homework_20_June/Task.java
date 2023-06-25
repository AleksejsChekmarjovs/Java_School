package homework_20_June;

//Есть коллекция Задач (Task). Каждая Задача имеет идентификатор, дату создания,
// приоритет (HIGH, NORMAL, LOW), статус (OPEN, FIXED), описание.
public class Task implements Comparable<Task> {
    private int id;
    private String date;
    private Priority priority;
    private Status status;
    private String description;


    public Task(int id, String date, Priority priority, Status status, String description) {
        this.id = id;
        this.date = date;
        this.priority = priority;
        this.status = status;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }

    enum Status {
        OPEN, FIXED
    }

    enum Priority {
        HIGHT, NORMAL, LOW
    }
}
