/*
 * Author(s): Stephen Dooley, Niall Grogan
 */
import java.io.Serializable;

public interface Question extends Serializable {

	// Return the question number
	int getQuestionNumber();

	// Return the question text
	String getQuestionDetail();

	// Return the possible answers to select from
	String[] getAnswerOptions();

}
