package com.facebook.debug.debugoverlay.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/debug/debugoverlay/model/DebugOverlayTag;", "", "name", "", "description", "color", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getDescription", "getColor", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugOverlayTag {
    private final int color;

    @NotNull
    private final String description;

    @NotNull
    private final String name;

    public DebugOverlayTag(@NotNull String str, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.description = str2;
        this.color = i;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
