package dtfraca.BricoTri.MiniTaskManagement;

import java.util.List;


public class TaskProviderTest {

	/**
	 * Test the TaskProvider class
	 */
	public static void main(String[] args) {
		List<TaskItem> myTodoList = TaskProvider.createInitialModel();

		if (myTodoList.size() == 5)
			System.out.println("***** CORRECT Item Count: " + myTodoList.size() + " *****");
		else {
			throw new RuntimeException();
		}

		// Test Block Comment: Ctrl-Shift-/ (Uncomment Ctrl-Shift-\)
	}

}
