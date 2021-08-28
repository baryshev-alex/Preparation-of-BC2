package PatternAbstractFactory.webSite;

import PatternAbstractFactory.ProjectManager;

public class PMWebSite implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage Web Site");
    }
}
