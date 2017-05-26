package ua.vtkachenko.proselyte.origin.behavioral.template;

public class WebSiteRunner {
    public static void main(String[] args) {
//        WelcomePage welcomePage = new WelcomePage();
//        NewsPage newsPage = new NewsPage();
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();


        welcomePage.showPage();

        System.out.println("========================");
        newsPage.showPage();
    }
}
