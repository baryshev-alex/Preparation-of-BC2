package PatternAbstractFactory.webSite;

import PatternAbstractFactory.Developer;
import PatternAbstractFactory.ProjectManager;
import PatternAbstractFactory.ProjectTeamFactory;
import PatternAbstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDev() {
        return new PhpDev();
    }

    @Override
    public Developer getLead() {
        return null;
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPm() {
        return new PMWebSite();
    }
}
