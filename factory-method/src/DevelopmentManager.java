class DevelopmentManager extends HiringManager {
    @Override
    Interviewer makeInterviewer() {
        return new Developer();
    }

}
