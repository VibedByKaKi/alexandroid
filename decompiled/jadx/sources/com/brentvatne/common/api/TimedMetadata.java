package com.brentvatne.common.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/brentvatne/common/api/TimedMetadata;", "", "_identifier", "", "_value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "identifier", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimedMetadata {

    @Nullable
    private String identifier;

    @Nullable
    private String value;

    public /* synthetic */ TimedMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setIdentifier(@Nullable String str) {
        this.identifier = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public TimedMetadata(@Nullable String str, @Nullable String str2) {
        this.identifier = str;
        this.value = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimedMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
