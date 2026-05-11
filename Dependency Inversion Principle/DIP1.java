interface VersionControl
{
    public void commit(String msg);
    public void pull();
    public void push(); 
}
class GitVersionControl implements VersionControl
{
    public void commit(String msg)
    {
        System.out.println("Commit Successfully" + msg);
    }
    public void pull()
    {
        System.out.println("Pushed Successfully");
    }
    public void push()
    {
        System.out.println("Pulled Successfully");
    }
}
class DeveloperTeam
{
    private VersionControl versioncontrol;

    public DeveloperTeam(VersionControl vc) 
    {
        this.versioncontrol = vc;
    }
    public void performcommit(String msg)
    {
        versioncontrol.commit(msg);
    }
    public void performpush()
    {
        versioncontrol.push();
    }
    public void performpull()
    {
        versioncontrol.pull();
    }
}
class DIP1
{
    public static void main(String[] args) 
    {
        GitVersionControl gvc = new GitVersionControl();
        DeveloperTeam dt = new DeveloperTeam(gvc);
        dt.performcommit("Initial commit");
        dt.performpush();
        dt.performpull();
    }
}