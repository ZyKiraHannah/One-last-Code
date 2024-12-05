
public class TimeConverter {
	public static String convertTo12HourFormat(int hour, int minute) throws TimeException {
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			throw new TimeException("Invalid time format.");
		}
		
		String period = (hour >= 12) ? "PM" : "AM";
		int hour12 = (hour % 12 == 0) ? 12 : hour % 12;
		
		return String.format("%02d:%02d %s", hour12, minute, period);
	}

}
