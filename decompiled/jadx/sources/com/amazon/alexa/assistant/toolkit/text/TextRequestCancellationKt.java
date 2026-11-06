package com.amazon.alexa.assistant.toolkit.text;

import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.assistant.foundation.textstate.model.TextRequestCancelledException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"isTextRequestCancellation", "", "error", "", "toolkit_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextRequestCancellationKt {
    @InternalAssistantSdkApi
    public static final boolean isTextRequestCancellation(@NotNull Throwable th) {
        th.getClass();
        if (th instanceof TimeoutCancellationException) {
            return false;
        }
        return (th instanceof TextRequestCancelledException) || (th instanceof CancellationException);
    }
}
