package agoeden;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

public class BaseFile {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		File inputFile = new File("");
		File toFile = new File("");
		String fromFileName, toFileName;
		boolean abort = false;

		while (!abort) {
			try {
				System.out.print("Enter the old file name (must be in src folder): ");
				fromFileName = input.nextLine();
				inputFile = new File(String.format("Labs/agoeden/%s.txt", fromFileName));
				if (!inputFile.exists())
					throw new FileException(String.format("Could not find file \"%s\".", inputFile.getName()));

				if (!inputFile.canRead())
					throw new FileException(String.format("Could not read file \"%s\".", inputFile.getName()));

				abort = true;
			} catch (FileException exception) {
				System.out.println(exception.getMessage());
				System.out.print("Would you like to abort or try again? (abort y/n): ");
				abort = input.nextLine().contains("y") ? true : false;
			}
		}

		abort = false;

		while (!abort) {
			try {
				System.out.print("Enter the new file name: ");
				toFileName = input.nextLine();
				toFile = new File(String.format("Labs/agoeden/%s.txt", toFileName));
				if (toFile.exists())
					throw new FileException(String.format(
							"File \"%1$s\" already exists, would you like to overwrite \"%1$s\" or enter a new name? (overwrite y/n): ",
							toFile.getName()));
				abort = true;
			} catch (FileException exception) {
				System.out.print(exception.getMessage());
				abort = input.nextLine().contains("y") ? true : false;
			}
		}

		copyFile(inputFile, toFile);

		input.close();
	}

	public static void copyFile(File inputFile, File toFile) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));
		try (Stream<String> linesStream = Files.lines(inputFile.toPath())) {
			linesStream.forEach(line -> {
				try {
					if (line.equals("")) {
						writer.newLine();
						writer.newLine();
					} else
						writer.write(line);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		writer.close();
	}
}
