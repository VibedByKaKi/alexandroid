package org.apache.commons.net.io;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.EventObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CopyStreamEvent extends EventObject {
    public static final long UNKNOWN_STREAM_SIZE = -1;
    private static final long serialVersionUID = -964927635655051867L;
    private final int bytesTransferred;
    private final long streamSize;
    private final long totalBytesTransferred;

    public CopyStreamEvent(Object obj, long j, int i, long j2) {
        super(obj);
        this.bytesTransferred = i;
        this.totalBytesTransferred = j;
        this.streamSize = j2;
    }

    public int getBytesTransferred() {
        return this.bytesTransferred;
    }

    public long getStreamSize() {
        return this.streamSize;
    }

    public long getTotalBytesTransferred() {
        return this.totalBytesTransferred;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[source=");
        sb.append(((EventObject) this).source);
        sb.append(", total=");
        sb.append(this.totalBytesTransferred);
        sb.append(", bytes=");
        sb.append(this.bytesTransferred);
        sb.append(", size=");
        return a$$ExternalSyntheticOutline0.m(this.streamSize, MarkdownConstants.RIGHT_BRACKET, sb);
    }
}
