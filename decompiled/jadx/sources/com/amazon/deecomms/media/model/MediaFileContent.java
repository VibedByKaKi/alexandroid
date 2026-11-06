package com.amazon.deecomms.media.model;

import java.io.File;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MediaFileContent extends MediaContentBase {
    private File file;

    public MediaFileContent(File file) {
        this.file = file;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaFileContent)) {
            return false;
        }
        MediaFileContent mediaFileContent = (MediaFileContent) obj;
        return Objects.equals(this.file, mediaFileContent.file) && Objects.equals(getMediaId(), mediaFileContent.getMediaId()) && Long.valueOf(getClientId()).equals(Long.valueOf(mediaFileContent.getClientId())) && Objects.equals(getContentType(), mediaFileContent.getContentType());
    }

    public File getFile() {
        return this.file;
    }

    public int hashCode() {
        return Objects.hash(this.file);
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String toString() {
        return "MediaFileContent{file = " + this.file.getAbsolutePath() + ", mediaId = " + getMediaId() + ", clientId = " + getClientId() + ", contentType = " + getContentType() + AbstractJsonLexerKt.END_OBJ;
    }

    public MediaFileContent() {
    }
}
