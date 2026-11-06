package org.apache.commons.io.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class DirectoryStreamFilter implements DirectoryStream.Filter<Path> {
    private final PathFilter pathFilter;

    public DirectoryStreamFilter(PathFilter pathFilter) {
        Objects.requireNonNull(pathFilter, "pathFilter");
        this.pathFilter = pathFilter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public boolean accept(Path path) throws IOException {
        return this.pathFilter.accept(path, PathUtils.readBasicFileAttributes(path)) == FileVisitResult.CONTINUE;
    }

    public PathFilter getPathFilter() {
        return this.pathFilter;
    }
}
