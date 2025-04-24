package ex03.Enum;

enum Day { 
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
		THURSDAY, FRIDAY, STATUDAY
}

public class EnumTest {
	
		Day day;
		
		public EnumTest(Day day) {
			this.day = day;
		}
		
		public void tellItLinkedItIs() {
			switch (day) {
				case MONDAY :
					System.out.println("Mondays ar bad.");
					break;
				case FRIDAY :
					System.out.println("FRIDAY ar better.");
					break;
				case STATUDAY :
					System.out.println("STATUDAY ar best.");
					break;
					
				default:
					System.out.println("Midweek days are so-so");
					break;
		
			} // switch end
		}
		
		public static void main(String[] args) {
			EnumTest firstDay = new EnumTest(Day.MONDAY);
			firstDay.tellItLinkedItIs();
			
			EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
			thirdDay.tellItLinkedItIs();
			
			EnumTest sixthDay = new EnumTest(Day.STATUDAY);
			sixthDay.tellItLinkedItIs();
		}
}













