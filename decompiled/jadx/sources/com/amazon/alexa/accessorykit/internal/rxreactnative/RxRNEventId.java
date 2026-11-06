package com.amazon.alexa.accessorykit.internal.rxreactnative;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class RxRNEventId {
    private static final String ON_COMPLETE_KEY = "onComplete";
    private static final String ON_DISPOSE_KEY = "onDispose";
    private static final String ON_ERROR_KEY = "onError";
    private static final String ON_NEXT_KEY = "onNext";
    private final String onCompleteEventId;
    private final String onDisposeEventId;
    private final String onErrorEventId;
    private final String onNextEventId;

    public RxRNEventId(String str, String str2, String str3, String str4) {
        Preconditions.notNull(str, ON_NEXT_KEY);
        Preconditions.notNull(str2, ON_ERROR_KEY);
        Preconditions.notNull(str3, ON_COMPLETE_KEY);
        Preconditions.notNull(str4, ON_DISPOSE_KEY);
        this.onNextEventId = str;
        this.onErrorEventId = str2;
        this.onCompleteEventId = str3;
        this.onDisposeEventId = str4;
    }

    public static RxRNEventId from(ReadableMap readableMap) {
        return new RxRNEventId(readableMap.getString(ON_NEXT_KEY), readableMap.getString(ON_ERROR_KEY), readableMap.getString(ON_COMPLETE_KEY), readableMap.getString(ON_DISPOSE_KEY));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RxRNEventId.class != obj.getClass()) {
            return false;
        }
        RxRNEventId rxRNEventId = (RxRNEventId) obj;
        if (this.onNextEventId.equals(rxRNEventId.onNextEventId) && this.onErrorEventId.equals(rxRNEventId.onErrorEventId) && this.onCompleteEventId.equals(rxRNEventId.onCompleteEventId)) {
            return this.onDisposeEventId.equals(rxRNEventId.onDisposeEventId);
        }
        return false;
    }

    public String getOnCompleteEventId() {
        return this.onCompleteEventId;
    }

    public String getOnDisposeEventId() {
        return this.onDisposeEventId;
    }

    public String getOnErrorEventId() {
        return this.onErrorEventId;
    }

    public String getOnNextEventId() {
        return this.onNextEventId;
    }

    public int hashCode() {
        return this.onDisposeEventId.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.onNextEventId.hashCode() * 31, 31, this.onErrorEventId), 31, this.onCompleteEventId);
    }
}
