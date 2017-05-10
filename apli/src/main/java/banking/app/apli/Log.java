package banking.app.apli;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Log {
	protected static String defaultLogFile = "C:\\msglog.txt";

	public static void write(String s) throws IOException {
		write(defaultLogFile, s);
	}

	public static void write(String f, String s) throws IOException {
		TimeZone tz = TimeZone.getTimeZone("EST");
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss ");
		df.setTimeZone(tz);
		String currentTime = df.format(now);

		FileWriter aWriter = new FileWriter(f, true);
		aWriter.write(currentTime + " " + s + "\n");
		aWriter.flush();
		aWriter.close();
	}
}
