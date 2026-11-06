package com.amazon.alexa.accessory.speechapi.util;

import android.os.Looper;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/util/Preconditions;", "", "()V", "checkMainThread", "", "checkNotNull", "object", "variableName", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Preconditions {

    @NotNull
    public static final Preconditions INSTANCE = new Preconditions();

    private Preconditions() {
    }

    public final void checkMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Current thread must be a main thread");
        Log.e("Throwing ", illegalStateException.toString());
        throw illegalStateException;
    }

    public final void checkNotNull(@Nullable Object object, @NotNull String variableName) {
        variableName.getClass();
        if (object != null) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        NullPointerException nullPointerException = new NullPointerException(String.format(Locale.US, "%s must not be null", Arrays.copyOf(new Object[]{variableName}, 1)));
        Log.e("Throwing ", nullPointerException.toString());
        throw nullPointerException;
    }
}
