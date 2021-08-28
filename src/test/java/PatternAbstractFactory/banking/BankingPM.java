package PatternAbstractFactory.banking;

import PatternAbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM - Manage Banking Project");
    }
}
