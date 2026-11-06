package com.amazon.apl.devtools.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ViewState {
    EMPTY("empty"),
    INFLATED(INFLATED_TEXT),
    LOADED(LOADED_TEXT),
    READY(READY_TEXT),
    FAILED(FAILED_TEXT);

    private static final String EMPTY_TEXT = "empty";
    private static final String FAILED_TEXT = "failed";
    private static final String INFLATED_TEXT = "inflated";
    private static final String LOADED_TEXT = "loaded";
    private static final String READY_TEXT = "ready";
    private final String mViewStateText;

    ViewState(String str) {
        this.mViewStateText = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.mViewStateText;
    }
}
