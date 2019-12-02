package agoeden;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class BaseFile {

	static int totalKeyCount = 0;

	public static void main(String[] args) throws IOException, InterruptedException {
		File inputFile = new File("Labs/agoeden/test.txt");
		String[] fileStringArr = getFileString(inputFile).split(" ");

		ExecutorService eService = Executors.newFixedThreadPool(3);
		eService.execute(()-> {
			incrementKeyCount(findKeyCount("the", Arrays.copyOfRange(fileStringArr, 0 , fileStringArr.length / 3)));
		});
		eService.execute(()-> {
			incrementKeyCount(findKeyCount("the", Arrays.copyOfRange(fileStringArr, fileStringArr.length / 3, (fileStringArr.length / 3) * 2)));
		});
		eService.execute(()-> {
			incrementKeyCount(findKeyCount("the", Arrays.copyOfRange(fileStringArr, (fileStringArr.length/3) * 2, fileStringArr.length)));
		});

		eService.shutdown();
		boolean finished = eService.awaitTermination(1, TimeUnit.MINUTES);


		if (finished) {
			System.out.println(totalKeyCount);
		}
	}

	public static void incrementKeyCount(int input) {
		totalKeyCount += input;
	}

	public static String getFileString(File inputFile) throws IOException {
		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines(inputFile.toPath())) {
			stream.forEach(line -> {
				contentBuilder.append(line);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}

	public static int findKeyCount(String key, String[] input) {
		int count = 0;
		for (String word : input) {
			if (word.toLowerCase().equals(key)){
				count++;
			}
		}
		return count;
	}
}
