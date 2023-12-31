package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNames {

	public static void main(String[] args) throws IOException {
		Files.lines(Path.of("c:\\imaginnovate3\\names.txt"))
			 .distinct()
		     .filter(s -> s.length() >= 4)
		     .sorted()
			 .forEach(System.out::println);

	}

}
