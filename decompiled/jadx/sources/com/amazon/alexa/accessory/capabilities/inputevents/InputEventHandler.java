package com.amazon.alexa.accessory.capabilities.inputevents;

import com.amazon.alexa.accessory.protocol.Input;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface InputEventHandler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onResult(Result result);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Result {
        SUCCESS,
        UNSUPPORTED,
        DISCARDED,
        UNKNOWN
    }

    void handleEvent(Input.IssueInputEvent issueInputEvent, Callback callback);
}
