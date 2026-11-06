package org.apache.http.pool;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class PoolStats implements Serializable {
    private static final long serialVersionUID = -2807686144795228544L;
    private final int available;
    private final int leased;
    private final int max;
    private final int pending;

    public PoolStats(int i, int i2, int i3, int i4) {
        this.leased = i;
        this.pending = i2;
        this.available = i3;
        this.max = i4;
    }

    public int getAvailable() {
        return this.available;
    }

    public int getLeased() {
        return this.leased;
    }

    public int getMax() {
        return this.max;
    }

    public int getPending() {
        return this.pending;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[leased: ");
        sb.append(this.leased);
        sb.append("; pending: ");
        sb.append(this.pending);
        sb.append("; available: ");
        sb.append(this.available);
        sb.append("; max: ");
        return a$$ExternalSyntheticOutline0.m(sb, this.max, MarkdownConstants.RIGHT_BRACKET);
    }
}
