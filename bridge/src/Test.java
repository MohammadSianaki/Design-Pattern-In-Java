class Test {
    public static void main(String[] args) {
        Theme darkTheme = new DarkTheme();
        WebPage about = new AboutWebPage(darkTheme);
        WebPage projects = new ProjectsWebPage(darkTheme);

        System.out.println(about.getContent());
        System.out.println(projects.getContent());
    }
}
