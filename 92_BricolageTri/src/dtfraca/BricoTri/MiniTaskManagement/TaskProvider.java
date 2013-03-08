package dtfraca.BricoTri.MiniTaskManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Helper method to get a list of Task objects
 */
public class TaskProvider {
	private static int current = 0;

	public static List<TaskItem> createInitialModel() {
		ArrayList<TaskItem> list = new ArrayList<TaskItem>();
		list.add(createTodo("SWT", "Learn Widgets"));
		list.add(createTodo("JFace", "Especially Viewers!"));
		list.add(createTodo("DI", "@Inject looks interesting"));
		list.add(createTodo("OSGi", "Services"));
		list.add(createTodo("Compatibility Layer", "Run Eclipse 3.x"));
		return list;
	}

	private static TaskItem createTodo(String summary, String description) {
		return new TaskItem(current++, summary, description, false, new Date());
	}
}
