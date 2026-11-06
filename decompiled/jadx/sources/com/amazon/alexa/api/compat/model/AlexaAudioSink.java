package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaAudioSink;", "Ljava/io/OutputStream;", "<init>", "()V", "nativeHandle", "", "getNativeHandle$annotations", "getNativeHandle", "()Ljava/lang/Object;", "setNativeHandle", "(Ljava/lang/Object;)V", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AlexaAudioSink extends OutputStream {
    public static final int $stable = 8;

    @Nullable
    private Object nativeHandle;

    @Nullable
    public final Object getNativeHandle() {
        return this.nativeHandle;
    }

    public final void setNativeHandle(@Nullable Object obj) {
        this.nativeHandle = obj;
    }

    public static /* synthetic */ void getNativeHandle$annotations() {
    }
}
