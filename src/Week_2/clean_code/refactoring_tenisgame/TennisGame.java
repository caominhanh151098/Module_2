package Week_2.clean_code.refactoring_tenisgame;

public class TennisGame {

    public static String getScore(int m_score1, int m_score2) {
        String result = "";
        int tempScore;
        if (m_score1 == m_score2) {
            result = getResultDraw(m_score1);
        } else {
            final int SCORE_WIN = 4;
            if (m_score1 >= SCORE_WIN || m_score2 >= SCORE_WIN) {
                result = getScoreWin(m_score1, m_score2);
            } else {
                    tempScore = m_score1;
                    result += getScore(tempScore);
                    result += "-";
                    tempScore = m_score2;
                    result += getScore(tempScore);
            }
        }
        return result;
    }

    private static String getResultDraw(int m_score1) {
        String result;
        switch (m_score1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    private static String getScoreWin(int m_score1, int m_score2) {
        String result;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1)
            result = "Advantage player1";
        else if (minusResult == -1)
            result = "Advantage player2";
        else if (minusResult >= 2)
            result = "Win for player1";
        else result = "Win for player2";
        return result;
    }

    private static String getScore(int tempScore) {
        switch (tempScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "";
    }
}