package com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch;

import com.google.common.base.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ControllerUpdate {
    private final Event mEvent;
    private final String mMessage;
    private final Throwable mThrowable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Event {
        DISCOVERY_STARTED,
        WORKFLOW_STARTED,
        WORKFLOW_UPDATE,
        WORKFLOW_SUCCESS,
        WORKFLOW_FAILURE,
        DISCOVERY_STOPPED,
        BACKING_OFF,
        TERMINATED
    }

    public ControllerUpdate(Event event) {
        this.mEvent = event;
        this.mMessage = "";
        this.mThrowable = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ControllerUpdate controllerUpdate = (ControllerUpdate) obj;
            if (this.mEvent == controllerUpdate.mEvent && Objects.equal(this.mMessage, controllerUpdate.mMessage) && Objects.equal(this.mThrowable, controllerUpdate.mThrowable)) {
                return true;
            }
        }
        return false;
    }

    public Event getEvent() {
        return this.mEvent;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public int hashCode() {
        return Objects.hashCode(this.mEvent, this.mMessage, this.mThrowable);
    }

    public String toString() {
        return "Update{mEvent=" + this.mEvent + ", mMessage='" + this.mMessage + "', mThrowable=" + this.mThrowable + AbstractJsonLexerKt.END_OBJ;
    }

    public ControllerUpdate(Event event, String str) {
        this.mEvent = event;
        this.mMessage = str;
        this.mThrowable = null;
    }

    public ControllerUpdate(Event event, String str, Throwable th) {
        this.mEvent = event;
        this.mMessage = str;
        this.mThrowable = th;
    }
}
