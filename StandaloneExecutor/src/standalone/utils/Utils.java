package standalone.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;

public class Utils {
	/*
	 * Returns absolute URI (org.eclipse.emf.common.util.URI) object for relativePath.
	 */
	public static URI getFileURI(String relativePath) {
		File file = new File(relativePath);
		URI uri =  file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(relativePath);
		return uri;
	}

	public static String getAbsolutePath(String relativePath) {
		Path base = Paths.get(System.getProperty("user.dir"));
		
		return base.resolve(relativePath).toString();
	}
}
