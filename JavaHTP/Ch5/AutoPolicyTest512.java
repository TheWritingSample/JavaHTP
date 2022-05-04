// April 04 2022
// Demonstrating Strings in switch.

public class AutoPolicyTest512 {
	public static void main(String[] args) {
		// create two AutoPolicy objects
		AutoPolicy511 policy1 = new AutoPolicy511(11111111, "Toyota Camry", "NJ");
		
		AutoPolicy511 policy2 = new AutoPolicy511(22222222, "Ford Fusion", "ME");
		
		// display whether each policy is in a no-fault state
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		
	}
	
	// method that displays whether in AutoPolicy
	// is in a state with no-fault auto insurance
	public static void policyInNoFaultState(AutoPolicy511 policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s;%n%nState %s %s a no-fault state%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
				(Policy.isNoFaultState() ? "is: "is not"));
		
		
	}

}
