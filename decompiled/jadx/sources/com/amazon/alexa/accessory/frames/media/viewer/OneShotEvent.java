package com.amazon.alexa.accessory.frames.media.viewer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class OneShotEvent<T> {

    @NonNull
    private final T content;
    private boolean handled;

    public OneShotEvent(@NonNull T t) {
        this.content = t;
    }

    @Nullable
    public T getContentIfNotHandled() {
        if (this.handled) {
            return null;
        }
        this.handled = true;
        return this.content;
    }

    @NonNull
    public T peekContent() {
        return this.content;
    }
}
