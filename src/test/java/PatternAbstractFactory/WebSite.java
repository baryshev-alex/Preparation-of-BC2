package PatternAbstractFactory;

import PatternAbstractFactory.webSite.WebSiteTeamFactory;

public class WebSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDev();
        Tester qa = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getPm();

        System.out.println(".com ===== WebSite ===== .com");
        developer.writeCode();
        qa.testingCode();
        pm.manageProject();
    }
}
