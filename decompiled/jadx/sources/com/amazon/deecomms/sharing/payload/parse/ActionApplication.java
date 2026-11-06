package com.amazon.deecomms.sharing.payload.parse;

import com.amazon.deecomms.sharing.payload.parse.enums.OperatingSystem;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ActionApplication {
    private OperatingSystem operatingSystem;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.operatingSystem == ((ActionApplication) obj).operatingSystem;
    }

    public OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    public int hashCode() {
        return Objects.hash(this.operatingSystem);
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return "ActionApplication{operatingSystem=" + this.operatingSystem + AbstractJsonLexerKt.END_OBJ;
    }
}
