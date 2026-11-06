package org.java_websocket.protocols;

import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Protocol implements IProtocol {
    private final String providedProtocol;
    private static final Pattern patternSpace = Pattern.compile(" ");
    private static final Pattern patternComma = Pattern.compile(",");

    public Protocol(String str) {
        if (str != null) {
            this.providedProtocol = str;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    @Override // org.java_websocket.protocols.IProtocol
    public boolean acceptProvidedProtocol(String str) {
        if ("".equals(this.providedProtocol)) {
            return true;
        }
        for (String str2 : patternComma.split(patternSpace.matcher(str).replaceAll(""))) {
            if (this.providedProtocol.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.protocols.IProtocol
    public IProtocol copyInstance() {
        return new Protocol(getProvidedProtocol());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.providedProtocol.equals(((Protocol) obj).providedProtocol);
    }

    @Override // org.java_websocket.protocols.IProtocol
    public String getProvidedProtocol() {
        return this.providedProtocol;
    }

    public int hashCode() {
        return this.providedProtocol.hashCode();
    }

    @Override // org.java_websocket.protocols.IProtocol
    public String toString() {
        return getProvidedProtocol();
    }
}
