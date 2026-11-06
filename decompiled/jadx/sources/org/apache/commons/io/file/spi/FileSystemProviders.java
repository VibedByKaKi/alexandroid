package org.apache.commons.io.file.spi;

import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class FileSystemProviders {
    private static final FileSystemProviders INSTALLED = new FileSystemProviders(FileSystemProvider.installedProviders());
    private final List<FileSystemProvider> providers;

    private FileSystemProviders(List<FileSystemProvider> list) {
        this.providers = list;
    }

    public static FileSystemProviders installed() {
        return INSTALLED;
    }

    public FileSystemProvider getFileSystemProvider(String str) {
        Objects.requireNonNull(str, "scheme");
        if (str.equalsIgnoreCase("file")) {
            return FileSystems.getDefault().provider();
        }
        List<FileSystemProvider> list = this.providers;
        if (list == null) {
            return null;
        }
        for (FileSystemProvider fileSystemProvider : list) {
            if (fileSystemProvider.getScheme().equalsIgnoreCase(str)) {
                return fileSystemProvider;
            }
        }
        return null;
    }

    public static FileSystemProvider getFileSystemProvider(Path path) {
        Objects.requireNonNull(path, "path");
        return path.getFileSystem().provider();
    }

    public FileSystemProvider getFileSystemProvider(URI uri) {
        Objects.requireNonNull(uri, "uri");
        return getFileSystemProvider(uri.getScheme());
    }

    public FileSystemProvider getFileSystemProvider(URL url) {
        Objects.requireNonNull(url, "url");
        return getFileSystemProvider(url.getProtocol());
    }
}
