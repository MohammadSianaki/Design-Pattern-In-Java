class MarketingManager extends HiringManager {
    @Override
    Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
