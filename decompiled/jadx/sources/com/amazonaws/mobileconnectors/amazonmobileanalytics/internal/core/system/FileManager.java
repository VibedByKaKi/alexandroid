package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface FileManager {
    File createDirectory(String str);

    File createFile(File file) throws IOException;

    File createFile(String str) throws IOException;

    boolean deleteFile(File file);

    boolean deleteFile(String str);

    File getDirectory(String str);

    Set<File> listFilesInDirectory(File file);

    Set<File> listFilesInDirectory(String str);

    InputStream newInputStream(File file) throws FileNotFoundException;

    InputStream newInputStream(String str) throws FileNotFoundException;

    OutputStream newOutputStream(File file, boolean z) throws FileNotFoundException;

    OutputStream newOutputStream(String str, boolean z) throws FileNotFoundException;
}
