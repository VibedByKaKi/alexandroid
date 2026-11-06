package com.amazon.alexa.assistant.capability.text;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, d2 = {"isDroppedUnsent", "", "", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputTextCapabilityAgentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDroppedUnsent(Throwable th) {
        return (th instanceof CancellationException) && !(th instanceof TimeoutCancellationException);
    }
}
