package diploma.domain.football;

import lombok.Data;


@Data
public class FootballMatch {

    private long id;
    private String date;
    private String  event;
    private String region;
    private String league;
    private WinCoef winCoef;
    private WinOrDrawCoef winOrDrawCoef;
    private TotalCoef totalCoef;
    private TeamTotalCoef teamTotalCoef;

    @Data
    public static class TeamTotalCoef {

        private double iTotalHome;
        private double iTotalAway;
        private double overHome;
        private double overAway;
        private double underHome;
        private double underAway;
    }
}
