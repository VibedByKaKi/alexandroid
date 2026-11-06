package com.amazon.clouddrive.cdasdk;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ProgressUpdate {
    private final long bytesComplete;
    private final long bytesTotal;

    @Generated
    public ProgressUpdate(long j, long j2) {
        this.bytesComplete = j;
        this.bytesTotal = j2;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProgressUpdate)) {
            return false;
        }
        ProgressUpdate progressUpdate = (ProgressUpdate) obj;
        return getBytesComplete() == progressUpdate.getBytesComplete() && getBytesTotal() == progressUpdate.getBytesTotal();
    }

    @Generated
    public long getBytesComplete() {
        return this.bytesComplete;
    }

    @Generated
    public long getBytesTotal() {
        return this.bytesTotal;
    }

    @Generated
    public int hashCode() {
        long bytesComplete = getBytesComplete();
        int i = ((int) (bytesComplete ^ (bytesComplete >>> 32))) + 59;
        long bytesTotal = getBytesTotal();
        return (i * 59) + ((int) ((bytesTotal >>> 32) ^ bytesTotal));
    }

    @Generated
    public String toString() {
        return "ProgressUpdate(bytesComplete=" + getBytesComplete() + ", bytesTotal=" + getBytesTotal() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
