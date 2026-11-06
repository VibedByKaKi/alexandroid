package com.amazon.alexa.accessory.transport;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.SizedSource;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class TransportData {
    private final SizedSource source;
    private final int stream;

    public TransportData(SizedSource sizedSource, int i) {
        Preconditions.notNull(sizedSource, "source");
        this.source = sizedSource;
        this.stream = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransportData.class != obj.getClass()) {
            return false;
        }
        TransportData transportData = (TransportData) obj;
        if (this.stream != transportData.stream) {
            return false;
        }
        return this.source.equals(transportData.source);
    }

    public SizedSource getSource() {
        return this.source;
    }

    public int getStream() {
        return this.stream;
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.stream;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TransportData{source=");
        sb.append(this.source);
        sb.append(", stream=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.stream, AbstractJsonLexerKt.END_OBJ);
    }
}
