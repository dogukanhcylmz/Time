
public class Time implements Comparable<Time> {

	private int seconds;
	private int minutes;
	private int hours;

	public Time() {
		this.seconds = 0;
		this.minutes = 0;
		this.hours = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
		this.adjust();
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Time add(Time t) {
		Time newTime = new Time();
		newTime.setHours(this.hours + t.hours);
		newTime.setMinutes(this.minutes + t.minutes);
		newTime.setSeconds(this.seconds + t.seconds);
		newTime.adjust();
		return newTime;
	}

	private void adjust() {
		if (this.seconds > 59) {
			this.minutes = this.minutes + (int) this.seconds / 60;
			this.seconds = this.seconds % 60;
		}
		if (this.minutes > 59) {
			this.hours = this.hours + (int) this.minutes / 60;
			this.minutes = this.minutes % 60;
		}
		if (this.hours > 23) {
			this.hours %= 24;
		}
		if (this.seconds < 0) {
			this.seconds = 0;
		}
		if (this.minutes < 0) {
			this.minutes = 0;
		}
		if (this.hours < 0) {
			this.hours = 0;
		}
	}

	public String toString() {
		String output = "";
		if (this.hours >= 0 && this.hours < 10) {
			output += "0" + this.hours;
		} else {
			output += this.hours;
		}
		if (this.minutes >= 0 && this.minutes < 10) {
			output += ":0" + this.minutes;
		} else {
			output += ":" + this.minutes;
		}
		if (this.seconds >= 0 && this.seconds < 10) {
			output += ":0" + this.seconds;
		} else {
			output += ":" + this.seconds;
		}
		return output;
	}

	@Override
	public int compareTo(Time o) {
		int wholeTime = this.hours * 3600 + this.minutes * 60 + this.seconds;
		int oWholeTime = o.hours * 3600 + o.minutes * 60 + o.seconds;
		if (wholeTime > oWholeTime) {
			return 1;
		} else if (wholeTime == oWholeTime) {
			return 0;
		} else {
			return -1;
		}

	}

}
