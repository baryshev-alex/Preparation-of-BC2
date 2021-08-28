package PatternAbstractFactory;

import PatternAbstractFactory.banking.BankingTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer teamLead = projectTeamFactory.getLead();
        Developer developer = projectTeamFactory.getDev();
        Tester qa = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getPm();

        System.out.println("==== Creating Bank System ====");
        teamLead.POReviewCode();
        developer.writeCode();
        qa.testingCode();
        pm.manageProject();
    }
}
