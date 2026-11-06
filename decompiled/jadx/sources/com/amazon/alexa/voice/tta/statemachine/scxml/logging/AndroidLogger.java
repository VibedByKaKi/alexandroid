package com.amazon.alexa.voice.tta.statemachine.scxml.logging;

import android.util.Log;
import com.amazon.scxml.logging.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/scxml/logging/AndroidLogger;", "Lcom/amazon/scxml/logging/Logger;", "<init>", "()V", "e", "", "tag", "", "message", "w", "v", "d", "i", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AndroidLogger implements Logger {
    @Override // com.amazon.scxml.logging.Logger
    public void d(@Nullable String tag, @NotNull String message) {
        message.getClass();
    }

    @Override // com.amazon.scxml.logging.Logger
    public void e(@Nullable String tag, @NotNull String message) {
        message.getClass();
        Log.e(tag, message);
    }

    @Override // com.amazon.scxml.logging.Logger
    public void i(@Nullable String tag, @NotNull String message) {
        message.getClass();
        Log.i(tag, message);
    }

    @Override // com.amazon.scxml.logging.Logger
    public void v(@Nullable String tag, @NotNull String message) {
        message.getClass();
    }

    @Override // com.amazon.scxml.logging.Logger
    public void w(@Nullable String tag, @NotNull String message) {
        message.getClass();
        Log.w(tag, message);
    }
}
