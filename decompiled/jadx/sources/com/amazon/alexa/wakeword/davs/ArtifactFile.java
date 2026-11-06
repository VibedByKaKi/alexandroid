package com.amazon.alexa.wakeword.davs;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.validation.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ArtifactFile {
    private final File artifactFile;

    public ArtifactFile(File file) {
        Preconditions.notNull(file, "the file is null");
        this.artifactFile = file;
    }

    @VisibleForTesting
    public FileInputStream createInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public File getArtifactFile() {
        return this.artifactFile;
    }

    public InputStream getArtifactInputStream() throws FileNotFoundException {
        return createInputStream(this.artifactFile);
    }

    public String getPath() {
        return this.artifactFile.getAbsolutePath();
    }
}
