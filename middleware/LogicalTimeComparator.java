package middleware;

import java.util.Comparator;

public class LogicalTimeComparator implements Comparator<Message> {
	
	public int compare (Message a, Message b) {
		if (a.getTimestamp() < b.getTimestamp() ) {
			return -1;
		} else if (a.getTimestamp() > b.getTimestamp() ) {
			return 1;
		}
		return 0;
	}

}
