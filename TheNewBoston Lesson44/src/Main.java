import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		
		for(WhatName people : WhatName.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());
	
	
	System.out.println("\n ANd now for the ranfge of constants!!!\n");
	
	
	for(WhatName people : EnumSet.range(WhatName.pam, WhatName.ricardo))
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());
	
	
	}
}
