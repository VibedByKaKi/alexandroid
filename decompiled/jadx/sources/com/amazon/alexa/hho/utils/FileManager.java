package com.amazon.alexa.hho.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class FileManager {
    public void createDirectoryIfNeeded(@NonNull String str) {
        File createFileObject = createFileObject(str);
        if (createFileObject.exists() && createFileObject.isDirectory()) {
            return;
        }
        createFileObject.delete();
        createFileObject.mkdirs();
    }

    @NonNull
    public File createFileObject(@NonNull String str) {
        return new File(str);
    }

    @NonNull
    public OutputStream createFileOutputStream(@NonNull String str) throws FileNotFoundException {
        return new FileOutputStream(str);
    }

    public void deleteDirectory(@NonNull String str) {
        File createFileObject = createFileObject(str);
        File[] listFiles = createFileObject.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        createFileObject.delete();
    }

    public void deleteFile(@NonNull String str) {
        if (fileExistsAtPath(str)) {
            createFileObject(str).delete();
        }
    }

    @Nullable
    public File[] directoryFiles(@NonNull String str) {
        return createFileObject(str).listFiles();
    }

    public boolean fileExistsAtPath(@NonNull String str) {
        File createFileObject = createFileObject(str);
        return createFileObject.exists() && createFileObject.isFile();
    }

    public void moveFile(@NonNull String str, @NonNull String str2) {
        if (fileExistsAtPath(str)) {
            if (fileExistsAtPath(str2)) {
                deleteFile(str2);
            }
            createFileObject(str).renameTo(createFileObject(str2));
        }
    }

    public void touchFile(@NonNull String str) {
        createFileObject(str).setLastModified(new Date().getTime());
    }

    public void writeToFile(@NonNull String str, @NonNull byte[] bArr) throws IOException {
        OutputStream outputStream;
        try {
            outputStream = createFileOutputStream(str);
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            IOUtils.closeQuietly(outputStream);
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(outputStream);
            throw th;
        }
    }
}
