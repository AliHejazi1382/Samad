package io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import user.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;


public class ReadPeople {
    private Gson gson;
    private FileReader reader;
    private File myFile;
    private Type listType;

    ReadPeople(File myFile) {
        this.myFile = myFile;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.listType = new TypeToken<ArrayList<User>>(){}.getType();

        try {
            reader = new FileReader(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Cannot init FileReader object");
        }
    }

    public List<User> readUser() {
        return gson.fromJson(reader, listType); // finish? yes
    }
}
