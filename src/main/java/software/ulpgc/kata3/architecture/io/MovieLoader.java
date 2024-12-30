package software.ulpgc.kata3.architecture.io;

import software.ulpgc.kata3.architecture.model.Movie;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MovieLoader {
    private final File fileToRead;
    private final File fileToWrite;

    public MovieLoader(File fileToRead, File fileToWrite) {
        this.fileToRead = fileToRead;
        this.fileToWrite = fileToWrite;
    }


    public void execute() throws IOException {
        List<Movie> read = new TsvFileMovieReader(fileToRead).read();
        new SQLiteMovieWriter(fileToWrite).write(read);
    }
}
