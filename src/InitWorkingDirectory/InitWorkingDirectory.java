package InitWorkingDirectory;

import java.io.File;
import java.lang.reflect.Field;
import common.CommonFiles;

/**
 * This class only has duty of creating files not folders!
 */
public class InitWorkingDirectory {
    private final String basePath;
    public InitWorkingDirectory(String basePath) {
        this.basePath = basePath;

        try {
            createRequiredFiles();
        } catch (Exception e) {
            Throwable cause = e.getCause();
            throw new RuntimeException("Could not create files: ".concat(cause.getMessage()));
        }
    }

    public void createRequiredFiles() throws IllegalAccessException {
        // We should instantiate it for getting its values...
        CommonFiles cmf = new CommonFiles();

        // Create files for each field
        for (Field field : CommonFiles.class.getDeclaredFields()) {
            field.setAccessible(true);
            createFile(field.get(cmf).toString());
        }
    }

    private void createFile(String name) {
        File file = new File(basePath.concat(name));

        if (file.exists()) return;

        try {
            if (!file.canRead() || !file.canWrite() || !file.mkdirs()) throw new Exception();
            file.createNewFile(); // Create file itself!
        } catch (Exception e) {
            throw new RuntimeException("Could not read/write to destination: ".concat(file.getAbsolutePath()));
        }
    }
}
