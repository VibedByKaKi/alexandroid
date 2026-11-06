package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceOutput;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_SurfaceOutput_Event extends SurfaceOutput.Event {
    private final int eventCode;
    private final SurfaceOutput surfaceOutput;

    public AutoValue_SurfaceOutput_Event(int i, SurfaceOutput surfaceOutput) {
        this.eventCode = i;
        if (surfaceOutput != null) {
            this.surfaceOutput = surfaceOutput;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null surfaceOutput");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutput.Event) {
            SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
            if (this.eventCode == event.getEventCode() && this.surfaceOutput.equals(event.getSurfaceOutput())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public int getEventCode() {
        return this.eventCode;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    @NonNull
    public SurfaceOutput getSurfaceOutput() {
        return this.surfaceOutput;
    }

    public int hashCode() {
        return this.surfaceOutput.hashCode() ^ ((this.eventCode ^ 1000003) * 1000003);
    }

    public String toString() {
        return "Event{eventCode=" + this.eventCode + ", surfaceOutput=" + this.surfaceOutput + StringSubstitutor.DEFAULT_VAR_END;
    }
}
