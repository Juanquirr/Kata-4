package software.ulpgc.kata3.architecture.io;

import software.ulpgc.kata3.architecture.model.Barchart;

public interface BarchartLoader {
    Barchart loadBarchart(int id);
}
