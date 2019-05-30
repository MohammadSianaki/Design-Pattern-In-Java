class ProjectsWebPage implements WebPage {

    private Theme theme;

    public ProjectsWebPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Projects Page in " + this.theme.getColor();
    }
}
