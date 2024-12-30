package software.ulpgc.kata3.apps.windows;

import software.ulpgc.kata3.apps.windows.io.CustomBarchartLoader;
import software.ulpgc.kata3.apps.windows.view.MainFrame;
import software.ulpgc.kata3.architecture.control.ToggleStatisticCommand;
import software.ulpgc.kata3.architecture.io.MovieLoader;
import software.ulpgc.kata3.architecture.io.SQLiteMovieReader;
import software.ulpgc.kata3.architecture.model.Movie;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File sqliteFile = new File("C:\\Users\\Usuario\\Desktop\\Tercero\\1º Semestre\\IS2\\kata4\\sqlite.sqlite");
        new MovieLoader(new File("title.basics.tsv"), sqliteFile).execute();
        List<Movie> movies = new SQLiteMovieReader(sqliteFile).read();


        MainFrame mainFrame = new MainFrame();
        mainFrame.put("next", new ToggleStatisticCommand(new CustomBarchartLoader(), mainFrame.getBarchartDisplay()));
        mainFrame.setVisible(true);
    }
}
