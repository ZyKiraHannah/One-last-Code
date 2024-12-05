import java.util.Scanner;
public class ClockTimeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter hour (0-23): ");
			int hour = scanner.nextInt();
			
			System.out.println("Enter minute (0-59): ");
			int minute = scanner.nextInt();
			
			String time12Hour = TimeConverter.convertTo12HourFormat(hour, minute);
			System.out.println("Converted time (12-hour format): " + time12Hour);
			
		} catch (TimeException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter numbers only.");
		} finally {
			scanner.close();
		}
		
		
	}

}
