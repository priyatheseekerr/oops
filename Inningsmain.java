import java.util.Scanner;

public class Inningsmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inning details of team: ");
        Innings[] obj = new Innings[2];
        String name;
        long run;
        for (int i = 0; i < 2; i++) {
            name = sc.next();
            run = sc.nextLong();
            obj[i] = new Innings();
            obj[i].setBattingTeam(name);
            obj[i].setRuns(run);
        }
        if (obj[0].sort(obj[1])) {
            System.out.println("Innings 1 detail: " + " \n" + "Batting team:" + obj[0].getBattingTeam()
                    + "\n Runs Scored: " + obj[0].getRuns());
            System.out.println("Innings 2 detail: " + " \n" + "Batting team:" + obj[1].getBattingTeam()
                    + "\n Runs Scored: " + obj[1].getRuns());
        } else if (obj[1].sort(obj[0])) {
            System.out.println("Innings 1 detail: " + " \n" + "Batting team:" + obj[1].getBattingTeam()
                    + "\n Runs Scored: " + obj[1].getRuns());
            System.out.println("Innings 2 detail: " + " \n" + "Batting team:" + obj[0].getBattingTeam()
                    + "\n Runs Scored: " + obj[0].getRuns());
        } else {
            System.out.println("Both teams are equal");
        }
        sc.close();

    }
}

class Innings {
    private String TeamName;
    private long run;

    Innings() {

    }

    Innings(String TeamName, long run) {
        this.TeamName = TeamName;
        this.run = run;
    }

    public void setBattingTeam(String TeamName) {
        this.TeamName = TeamName;
    }

    public String getBattingTeam() {
        return TeamName;
    }

    public void setRuns(long run) {
        this.run = run;
    }

    public long getRuns() {
        return run;
    }

    public boolean sort(Innings obj) {

        return this.run > obj.run;
    }
}
