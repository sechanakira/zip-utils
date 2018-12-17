package com.github.sechanakira.zip;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public interface ZipUtils {

    void zipAll(List<File> files, Path dest);
    void zipAll(Path source, Path dest);
}
