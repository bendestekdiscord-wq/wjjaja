package com.evrensel.plugin;

import java.io.*;
import java.util.Enumeration;
import java.util.jar.*;

public class JarTransformer {
    public void transformAll(File folder) {
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".jar"));
        if (files == null) return;

        for (File file : files) {
            if (file.getName().equals("ViaPlugins.jar")) continue;
            processJar(file);
        }
    }

    private void processJar(File file) {
        // JAR dosyasını okuma ve yeniden yazma işlemleri burada yapılır
        System.out.println("Donusturuluyor: " + file.getName());
    }
}
