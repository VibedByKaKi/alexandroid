package com.amazon.alexa.wakeword.davs;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.utils.validation.Assertions;
import com.amazon.alexa.utils.validation.Preconditions;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ArtifactNameFactory {

    @VisibleForTesting
    static final String DELIMITER = ".";

    @VisibleForTesting
    static final String EXT = "bin";

    private ArtifactNameFactory() {
        throw new UnsupportedOperationException("don't instantiate");
    }

    public static String getArtifactFilename(ArtifactInfo artifactInfo, String str) {
        Preconditions.notNull(artifactInfo, "artifactInfo is null");
        Preconditions.notNull(str, "artifactId is null");
        return getArtifactsDirectory(artifactInfo) + File.separator + getFilename(str);
    }

    private static String getArtifactsDirectory(ArtifactInfo artifactInfo) {
        String artifactType = artifactInfo.getArtifactType();
        Assertions.notEmpty(artifactType, "artifact type is empty");
        return artifactType;
    }

    private static String getFilename(String str) {
        return BitVector$$ExternalSyntheticOutline0.m(str, ".bin");
    }
}
