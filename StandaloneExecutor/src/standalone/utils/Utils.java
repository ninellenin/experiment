package standalone.utils;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;

public class Utils {
	/*
	 * Returns absolute URI (org.eclipse.emf.common.util.URI) object for relativePath.
	 */
	public static URI getEmfURI(String relativePath) {
		File file = new File(relativePath);
		URI uri =  file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(relativePath);
		
		return uri;
	}

	/*
	 * Returns absolute URI (java.net.URI) object for relativePath.
	 */
	public static java.net.URI getURI(String relativePath) {
		String absolutePath = Utils.getAbsolutePath(relativePath);
		URI emfUri = URI.createFileURI(absolutePath);
		java.net.URI uri = null;
		try {
			uri =  new java.net.URI(emfUri.toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return uri;
	}

	/*
	 * Returns absolute path for input relativePath (on project directory).
	 */
	public static String getAbsolutePath(String relativePath) {
		Path base = Paths.get(System.getProperty("user.dir"));
		
		return base.resolve(relativePath).toString();
	}
}
