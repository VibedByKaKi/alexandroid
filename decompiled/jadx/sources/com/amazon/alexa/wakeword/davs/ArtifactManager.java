package com.amazon.alexa.wakeword.davs;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.validation.Preconditions;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ArtifactManager {
    private static final String TAG = "ArtifactManager";
    private final Context context;

    public ArtifactManager(Context context) {
        Preconditions.notNull(context, "context is null");
        this.context = context;
    }

    @VisibleForTesting
    public File getArtifactFile(String str) {
        Preconditions.isFalse(TextUtils.isEmpty(str), "file name is empty");
        return new File(this.context.getFilesDir(), str);
    }

    public synchronized boolean hasArtifact(String str) {
        return getArtifactFile(str).exists();
    }

    public synchronized ArtifactFile readArtifact(String str) throws ArtifactDownloadException {
        File artifactFile;
        artifactFile = getArtifactFile(str);
        if (!artifactFile.exists()) {
            throw ArtifactDownloadException.create(ArtifactDownloadFailure.ARTIFACT_FILE_NOT_FOUND);
        }
        return new ArtifactFile(artifactFile);
    }

    public synchronized boolean removeArtifact(String str) {
        return getArtifactFile(str).delete();
    }

    public synchronized ArtifactFile writeArtifact(String str, byte[] bArr) throws IOException {
        File artifactFile;
        try {
            Preconditions.notNull(bArr, "artifactBytes is null");
            artifactFile = getArtifactFile(str);
            if (!artifactFile.getParentFile().exists() && !artifactFile.getParentFile().mkdirs()) {
                throw new IOException("failed to create artifacts directory");
            }
            if (!artifactFile.exists() && !artifactFile.createNewFile()) {
                throw new IOException("failed to create wake word artifact");
            }
            writeByteArrayToFile(artifactFile, bArr);
        } catch (Throwable th) {
            throw th;
        }
        return new ArtifactFile(artifactFile);
    }

    @VisibleForTesting
    public void writeByteArrayToFile(File file, byte[] bArr) throws IOException {
        FileUtils.writeByteArrayToFile(file, bArr);
    }
}
