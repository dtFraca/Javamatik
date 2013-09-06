package dtfraca.Exo10_FileStream;

import java.io.*;

/**
 * Write a binary file + Using buffer: Demo how to copy an image file
 * <p/>
 * 2013-03-17 - tri
 */
public class A5_BinaryFileCopy {
	public static void main(String[] args) throws IOException {
		File fileImgSource = new File("05_GUI/src/resource/imgBird.png");
		File fileImgTarget = new File("01_ExoJava/src/dtfraca/resource/~CopyDeBird.png");
		File fileImgTargetBuff = new File("01_ExoJava/src/dtfraca/resource/~CopyDeBirdBuffered.png");

		System.out.printf("SOURCE FILE: %s\n\n", fileImgSource.getAbsolutePath());

		System.out.println("=== FileInputStream + FileOutputStream ========================");
		FileInputStream strmSource = null;
		FileOutputStream strmTarget = null;
		try {
			strmSource = new FileInputStream(fileImgSource);
			strmTarget = new FileOutputStream(fileImgTarget);

			int wordValue;

			while ((wordValue = strmSource.read()) != -1) {
				strmTarget.write(wordValue);
			}
		} finally {
			if (strmSource != null) {
				strmSource.close();
			}
			if (strmTarget != null) {
				strmTarget.close();
			}
		}


		System.out.println("=== BufferedInputStream(FileInputStream) + BufferedOutputStream(FileOutputStream)  ========================");
		BufferedInputStream buffSource = null;
		BufferedOutputStream buffTarget = null;
		try {
			buffSource = new BufferedInputStream(new FileInputStream(fileImgSource));
			buffTarget = new BufferedOutputStream(new FileOutputStream(fileImgTargetBuff));

			int wordValue;

			while ((wordValue = buffSource.read()) != -1) {
				buffTarget.write(wordValue);
			}
		} finally {
			if (buffSource != null) {
				buffSource.close();
			}
			if (buffTarget != null) {
				buffTarget.close();
			}
		}

		System.out.println("\n\nFINISHED, Please check:");
		System.out.printf("Binary FileStream..: %s\n", fileImgTarget.getAbsolutePath());
		System.out.printf("Buffer + FileStream: %s\n", fileImgTargetBuff.getAbsolutePath());
	}
}
