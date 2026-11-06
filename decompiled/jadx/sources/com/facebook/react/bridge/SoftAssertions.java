package com.facebook.react.bridge;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001f\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\b\u0010\r\u001a\u0004\u0018\u0001H\fH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/SoftAssertions;", "", "<init>", "()V", "assertUnreachable", "", "message", "", "assertCondition", "condition", "", "assertNotNull", ExifInterface.GPS_DIRECTION_TRUE, AlexaEventBundleKeys.INSTANCE, "(Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SoftAssertions {

    @NotNull
    public static final SoftAssertions INSTANCE = new SoftAssertions();

    private SoftAssertions() {
    }

    @JvmStatic
    public static final void assertCondition(boolean condition, @NotNull String message) {
        message.getClass();
        if (condition) {
            return;
        }
        ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new AssertionException(message));
    }

    @JvmStatic
    @Nullable
    public static final <T> T assertNotNull(@Nullable T instance) {
        if (instance == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new AssertionException("Expected object to not be null!"));
        }
        return instance;
    }

    @JvmStatic
    public static final void assertUnreachable(@NotNull String message) {
        message.getClass();
        ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new AssertionException(message));
    }
}
