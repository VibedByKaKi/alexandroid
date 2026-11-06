package com.typesafe.config;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ConfigMemorySize {
    private final long bytes;

    private ConfigMemorySize(long j) {
        if (j >= 0) {
            this.bytes = j;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Attempt to construct ConfigMemorySize with negative number: "));
            throw null;
        }
    }

    public static ConfigMemorySize ofBytes(long j) {
        return new ConfigMemorySize(j);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ConfigMemorySize) && ((ConfigMemorySize) obj).bytes == this.bytes;
    }

    public int hashCode() {
        return Long.valueOf(this.bytes).hashCode();
    }

    public long toBytes() {
        return this.bytes;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.bytes, MarkdownConstants.RIGHT_PARENTHESIS, new StringBuilder("ConfigMemorySize("));
    }
}
