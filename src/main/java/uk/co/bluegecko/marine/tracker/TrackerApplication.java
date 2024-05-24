package uk.co.bluegecko.marine.tracker;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.bluegecko.marine.shared.application.AbstractApplication;

@SpringBootApplication
public class TrackerApplication extends AbstractApplication {

	public static void main(String[] args) {
		run(TrackerApplication.class, args);
	}

}