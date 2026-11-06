package com.bugsnag.android;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/MessageEvent;", "", "type", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "getType", "()Ljava/lang/String;", "bugsnag-plugin-react-native_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class MessageEvent {

    @Nullable
    private final Object data;

    @NotNull
    private final String type;

    public MessageEvent(@NotNull String str, @Nullable Object obj) {
        str.getClass();
        this.type = str;
        this.data = obj;
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
