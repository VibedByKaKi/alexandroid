package com.amazon.alexa.ra.core.features.dictation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/AudioCaptureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "Lcom/amazon/alexa/ra/core/features/dictation/AudioCaptureError;", "message", "", "cause", "", "<init>", "(Lcom/amazon/alexa/ra/core/features/dictation/AudioCaptureError;Ljava/lang/String;Ljava/lang/Throwable;)V", "getReason", "()Lcom/amazon/alexa/ra/core/features/dictation/AudioCaptureError;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AudioCaptureException extends Exception {
    public static final int $stable = 0;

    @NotNull
    private final AudioCaptureError reason;

    public /* synthetic */ AudioCaptureException(AudioCaptureError audioCaptureError, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioCaptureError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @NotNull
    public final AudioCaptureError getReason() {
        return this.reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCaptureException(@NotNull AudioCaptureError audioCaptureError, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        audioCaptureError.getClass();
        this.reason = audioCaptureError;
    }
}
