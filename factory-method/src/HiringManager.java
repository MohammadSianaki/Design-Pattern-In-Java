public abstract class HiringManager {

    //Factory Method
    abstract Interviewer makeInterviewer();

    public void takeInterview() {
        this.makeInterviewer().askQuestion();
    }
}
