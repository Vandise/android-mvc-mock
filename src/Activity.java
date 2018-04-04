
public class Activity {
	
	private Intent intent;
	private String activityName;
	private String action;
	
	public Activity(String activityName, String action, Intent intent) {
		this.activityName = activityName;
		this.action = action;
		this.intent = intent;
	}
	
	public Intent run() throws Exception {
		return (Intent) this.getClass().getMethod(this.action).invoke(this);
	}
	
	public void onCreate() {
		if (null != this.intent) {
			View.render(this.intent.getData());
		}
	}
	
	public String toString() {
		return "ActivityName: " + this.activityName + " Action: " + this.action;
	}
	
	public Intent sendUserName() {
		// Intent(current object, the next activity to run)
		Intent intent = new Intent(this.activityName, "HelloActivity");
		
		intent.setData("Hello World");
		// startActivity(intent)
		// Create a new activity object and runs the default method, onCreate()
		return intent;
	}
}
