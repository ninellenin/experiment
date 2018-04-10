package standalone.utils;

import java.io.File;

import org.eclipse.emf.common.util.URI;

public class Utils {
	public static URI getFileURI(String relativePath) {
		File file = new File(relativePath);
		return file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(relativePath);
	}

	public static String getAbsolutePath(String relativePath) {
		return Utils.getFileURI(relativePath).path();
	}
}
