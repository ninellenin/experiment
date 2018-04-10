package standalone.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;

class UtilsTest {
	
	String createFile() throws IOException {
		String fileName = "some_file.txt";
		//create file and write some string
		OutputStream file = new FileOutputStream(fileName, false);
		file.write("Hello\n".getBytes());
		file.close();
		
		return fileName;
	}

	@Test
	void testGetFileURIWithExistingFile() {
		try {
			String fileName = createFile();
			//get URI
			URI uri = Utils.getFileURI(fileName);
			//check URI
			assertTrue(uri.isFile() && !uri.isRelative());
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	@Test
	void testGetFileURIWithAbsentFile() {
		String absentFileName = UUID.randomUUID().toString();
		//get URI
		URI uri = Utils.getFileURI(absentFileName);
		//check URI
		assertTrue(uri.isRelative());
	}

	@Test
	void testGetAbsolutePathWithExistingFile() {
		try {
			String fileName = createFile();
			String absolutePath = Utils.getAbsolutePath(fileName);
			Path path = Paths.get(absolutePath);
			
			assertTrue(path.isAbsolute());
		} catch (IOException e) {
			fail(e.toString());
		}
	}

}
