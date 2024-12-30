package software.ulpgc.kata3.architecture.io;

import software.ulpgc.kata3.architecture.model.Movie;

import java.util.List;

public interface MovieWriter {
    void write(List<Movie> movies);
}
