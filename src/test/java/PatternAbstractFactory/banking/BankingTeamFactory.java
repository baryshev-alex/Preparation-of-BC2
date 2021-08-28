package PatternAbstractFactory.banking;

import PatternAbstractFactory.Developer;
import PatternAbstractFactory.ProjectManager;
import PatternAbstractFactory.ProjectTeamFactory;
import PatternAbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDev() {
        return new JavaDev();
    }
    @Override
    public Developer getLead() {
        return new SeniorJavaDev();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPm() {
        return new BankingPM();
    }
}
