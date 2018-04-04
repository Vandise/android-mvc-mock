
public class Main {

	public static void main(String[] args) throws Exception {
		// assumes MainView has loaded then the user clicks the button.
		Router route = new Router("Main", "sendUserName");
		
		// See what activity we're currently in.
		System.out.println(route.getActivity().toString());
		
		Intent intent = route.getActivity().run();
		
		//simulate sendActivity
		Activity activity = new Activity("Greeter", "onCreate", intent);
		
		System.out.println(activity.toString());
		
		// display the new view
		activity.run();
		
	}
	
}
