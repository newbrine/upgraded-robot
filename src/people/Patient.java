package people;

import sql.Build;

public class Patient implements People {
	@Override
	public void add(String name, int id, String bloodtype) {
		Build.readCommand("INSERT INTO Patient VALUES ('" + name + "', " + Integer.toString(id) + ", '" + bloodtype + "')");
	}

	@Override
	public void remove(int id) {
		Build.readCommand("DELETE Patient WHERE Id=" + id);
	}
}
