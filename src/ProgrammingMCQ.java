/*
 * Author(s): Stephen Dooley, Niall Grogan
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//Functionally identical to Maths MCQ except with an expired due date
public class ProgrammingMCQ implements Assessment {

    private int numQuestions = 2;
    private int numAnswerOptions = 4;
    //Expired due date
    private String closingDate = "21/12/2015";
    private List<Question> questionList = new ArrayList<>(2);
    private int[] selectedAnswers = {0,0};
    private int[] answers = {1,4};
    private String studentid;

    public ProgrammingMCQ(String username) {
        studentid = username;
        String[] qs1Answers = {"Great","Hard","Useful","Java"};
        MathsQuestions qs1 = new MathsQuestions(1,"Polymorphism is ______",qs1Answers);
        String[] qs2Answers = {"Abstract","Concrete","Fluid","Great"};
        MathsQuestions qs2 = new MathsQuestions(2,"An abstract class is _____",qs2Answers);
        questionList.add(qs1);
        questionList.add(qs2);
    }

    public int[] getAnswers() {
        return answers;
    }

    public String getInformation() {
        return "This is a Programming Assessment" +
                "\nNumber of questions: " + Integer.toString(numQuestions) +
                "\nClosing Date: " + closingDate;
    }

    // Return the final date / time for submission of completed assessment
    public Date getClosingDate() {
        Date d = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            d = sdf.parse(closingDate);
        }
        catch (Exception e) {e.printStackTrace();}
        return d;
    }

    // Return a list of all questions and answer options
    public List<Question> getQuestions() {
        return questionList;
    }

    // Return one question only with answer options
    public Question getQuestion(int questionNumber) throws
            InvalidQuestionNumber {

        switch (questionNumber) {
            case 1: return questionList.get(0);
            case 2: return questionList.get(1);
            default: throw new InvalidQuestionNumber();
        }
    }

    // Answer a particular question
    public void selectAnswer(int questionNumber, int optionNumber) throws
            InvalidQuestionNumber, InvalidOptionNumber {
        if(questionNumber <= numQuestions & questionNumber > 0) {
            if (optionNumber <= numAnswerOptions & optionNumber > 0) {
                selectedAnswers[questionNumber-1] = optionNumber;
            }
            else {throw new InvalidOptionNumber();}
        }
        else {throw new InvalidQuestionNumber();}
    }

    // Return selected answer or zero if none selected yet
    public int getSelectedAnswer(int questionNumber) {
        return selectedAnswers[questionNumber-1];
    }

    // Return studentid associated with this assessment object
    // This will be preset on the server before object is downloaded
    public String getAssociatedID() {
        return studentid;
    }
}

