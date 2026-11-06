package com.amazon.deecomms.sharing.payload.parse;

import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Target {
    private ActionApplication actionApplication;
    private EntryData entryData;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Target target = (Target) obj;
            if (Objects.equals(this.entryData, target.entryData) && Objects.equals(this.actionApplication, target.actionApplication)) {
                return true;
            }
        }
        return false;
    }

    public ActionApplication getActionApplication() {
        return this.actionApplication;
    }

    public EntryData getEntryData() {
        return this.entryData;
    }

    public int hashCode() {
        return Objects.hash(this.entryData, this.actionApplication);
    }

    public void setActionApplication(ActionApplication actionApplication) {
        this.actionApplication = actionApplication;
    }

    public void setEntryData(EntryData entryData) {
        this.entryData = entryData;
    }

    public String toString() {
        return "Target{entryData=" + this.entryData + ", actionApplication=" + this.actionApplication + AbstractJsonLexerKt.END_OBJ;
    }
}
