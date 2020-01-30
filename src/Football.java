public class Football extends Sport
{
    int touchdowns, fieldGoals, extraPoints;
    public Football(int score, int touchdowns, int fieldGoals, int extraPoints, int teams, String equipment)
    {
        super(score, teams, equipment);
        this.extraPoints = extraPoints;
        this.fieldGoals = fieldGoals;
        this.touchdowns = touchdowns;
        super.score = (touchdowns*7) + (fieldGoals*3) + extraPoints;
    }
}
