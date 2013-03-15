package dtfraca.Exo10_FileStream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * Explore class File giving properties of a File or Directory (Folder)
 *
 * 2013-03-15 - tri
 */
public class A1_FileInfo {
	public static void main(String[] args) {
		//String fileName = A1_FileInfo.class.getName(); // "dtfraca.Exo10_FileStream.A1_FileInfo"
		// /home/tri/Documents/IntelliJProjects/Javamatik/ApprendreJava_PlanExercice.odt
		String currRelativeFilename = ".";

		File fileCurrDir = new File(currRelativeFilename);
		String absProjectPath = fileCurrDir.getAbsoluteFile().getParent(); // /home/tri/Documents/IntelliJProjects/Javamatik
		String absPlanExoFilename = String.format("%s/ApprendreJava_PlanExercice.odt", absProjectPath);
		File fileProjDir = new File(absProjectPath);
		File filePlanExo = new File(absPlanExoFilename);

		SimpleDateFormat dateFmt = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

		System.out.printf("FILE: %s\n", absPlanExoFilename);
		System.out.printf("exists()..........%s\n", filePlanExo.exists());
		System.out.printf("isAbsolute()......%s\n", filePlanExo.isAbsolute());
		System.out.printf("isFile()..........%s\n", filePlanExo.isFile());
		System.out.printf("isDirectory().....%s\n", filePlanExo.isDirectory());
		System.out.printf("canExecute()......%s\n", filePlanExo.canExecute());
		System.out.printf("canRead().........%s\n", filePlanExo.canRead());
		System.out.printf("canWrite()........%s\n", filePlanExo.canWrite());
		System.out.printf("getName().........%s\n", filePlanExo.getName());
		System.out.printf("getPath().........%s\n", filePlanExo.getPath());
		System.out.printf("getAbsolutePath().%s\n", filePlanExo.getAbsolutePath());
		System.out.printf("getParent().......%s\n", filePlanExo.getParent());
		System.out.printf("toURI()...........%s\n", filePlanExo.toURI());
		System.out.printf("length()..........%s\n", filePlanExo.length());
		System.out.printf("lastModified()....%s (datatype long)\n", filePlanExo.lastModified());
		System.out.printf("lastModified()....%s (using SimpleDateFormat)\n", dateFmt.format(filePlanExo.lastModified()));

		System.out.println();
		System.out.printf("DIRECTORY: %s\n", absProjectPath);
		System.out.printf("exists()..........%s\n", fileProjDir.exists());
		System.out.printf("isAbsolute()......%s\n", fileProjDir.isAbsolute());
		System.out.printf("isFile()..........%s\n", fileProjDir.isFile());
		System.out.printf("isDirectory().....%s\n", fileProjDir.isDirectory());
		System.out.printf("canExecute()......%s\n", fileProjDir.canExecute());
		System.out.printf("canRead().........%s\n", fileProjDir.canRead());
		System.out.printf("canWrite()........%s\n", fileProjDir.canWrite());
		System.out.printf("getName().........%s\n", fileProjDir.getName());
		System.out.printf("getPath().........%s\n", fileProjDir.getPath());
		System.out.printf("getAbsolutePath().%s\n", fileProjDir.getAbsolutePath());
		System.out.printf("getParent().......%s\n", fileProjDir.getParent());
		System.out.printf("toURI()...........%s\n", fileProjDir.toURI());
		System.out.printf("length()..........%s\n", fileProjDir.length());
		System.out.printf("lastModified()....%s (datatype long)\n", fileProjDir.lastModified());
		System.out.printf("lastModified()....%s (using SimpleDateFormat)\n", dateFmt.format(fileProjDir.lastModified()));

		// Directory File Content
		System.out.printf("=====DIR CONTENT=====\n");
		String[] dirFiles = fileProjDir.list();
		Arrays.sort(dirFiles);
		for (String fileNameInDir : dirFiles) {
			File file1 = new File(fileNameInDir);

			System.out.printf("\t%-40s (%s) %5d KB\n",
					fileNameInDir,
					(file1.isDirectory() ? "DIR " : "FILE"),
					file1.length() / 1000
					);
		}

	}
}
