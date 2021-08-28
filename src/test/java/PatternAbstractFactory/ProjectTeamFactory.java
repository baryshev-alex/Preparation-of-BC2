package PatternAbstractFactory;

public interface ProjectTeamFactory {
    Developer getDev();
    Developer getLead();
    Tester getTester();
    ProjectManager getPm();
}
