package homework1_ex4;

public class TimeCalculator {

	public TimeCalculator() {
		// TODO Auto-generated constructor stub
	}

	public int[] timeCalulator(float distance, float speed) {
		float time = distance / speed;
		if (speed == 0) {
			throw new IllegalArgumentException("Argument 'speed' can't be Zero.");
		}
		return timeConvertor(time);
	}

	private static int[] timeConvertor(float distanceTime) {
		int[] time_data = new int[2];
		float hours = distanceTime;
		float minutes = ((distanceTime - (int) hours) * 60);

		time_data[0] = (int) hours;
		time_data[1] = (int) minutes;

		return time_data;
	}
}
