package io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import user.User;

import java.io.*;

public class WritePeople {
    private File myFile;
    private User myUser;
    private Gson gson;
    private FileWriter myWriter;

    public WritePeople(File myFile, User myUser) {
        this.myFile = myFile;
        this.myUser = myUser;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            this.myWriter = new FileWriter(myFile);
        } catch (IOException e) {
            throw new RuntimeException("Cannot init FileWriter object");
        }
    }

    public void write() {
        gson.toJson(myUser, myWriter);


    }
}
