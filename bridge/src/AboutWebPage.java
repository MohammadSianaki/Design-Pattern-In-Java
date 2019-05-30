class AboutWebPage implements WebPage {

    private Theme theme;

    public AboutWebPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "About Page in : " + this.theme.getColor();
    }

}
