import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class TraverseTree extends SimpleFileVisitor<Path>{

public void traverse(String path,int depth) throws IOException	{
	
	Files.walkFileTree(Paths.get(path),new HashSet(),depth,new FileVisitor<Path>() {

		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			// TODO Auto-generated method stub
			System.out.println("preVisitDirectory: "+dir);
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			// TODO Auto-generated method stub
	
			System.out.println("visitFile: "+file);
			return FileVisitResult.CONTINUE;
			
		}

		@Override
		public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
			// TODO Auto-generated method stub
			System.out.println("visitFileFailed: "+file);
			return FileVisitResult.CONTINUE;
		}
		 @Override
         public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                 throws IOException {
             System.out.println("postVisitDirectory: " + dir);
             return FileVisitResult.CONTINUE;
         }
     });
}
}
