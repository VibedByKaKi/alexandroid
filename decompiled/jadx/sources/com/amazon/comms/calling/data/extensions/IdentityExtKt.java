package com.amazon.comms.calling.data.extensions;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.comms.calling.domain.exceptions.CommsIdNotAvailableException;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import com.amazon.comms.log.CommsLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a?\u0010\b\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a2\u0010\f\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"applyIfCommsIdAvailable", ExifInterface.GPS_DIRECTION_TRUE, "identity", "Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "block", "Lkotlin/Function1;", "", "(Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "applySafelyIfCommsIdAvailable", "log", "Lcom/amazon/comms/log/CommsLogger;", "(Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;Lcom/amazon/comms/log/CommsLogger;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "applyIfHomegroupIdAvailable", "", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class IdentityExtKt {
    public static final <T> T applyIfCommsIdAvailable(@Nullable IdentityServiceProvider identityServiceProvider, @NotNull Function1<? super String, ? extends T> function1) {
        String commsId;
        T invoke;
        function1.getClass();
        if (identityServiceProvider == null || (commsId = identityServiceProvider.getCommsId()) == null || (invoke = function1.invoke(commsId)) == null) {
            throw new CommsIdNotAvailableException("CommsId is not available.");
        }
        return invoke;
    }

    public static final void applyIfHomegroupIdAvailable(@Nullable IdentityServiceProvider identityServiceProvider, @NotNull CommsLogger commsLogger, @NotNull Function1<? super String, Unit> function1) {
        String homegroupId;
        commsLogger.getClass();
        function1.getClass();
        if (identityServiceProvider == null || (homegroupId = identityServiceProvider.getHomegroupId()) == null) {
            commsLogger.e("HomegroupId is not available.");
        } else {
            function1.invoke(homegroupId);
        }
    }

    @Nullable
    public static final <T> T applySafelyIfCommsIdAvailable(@Nullable IdentityServiceProvider identityServiceProvider, @NotNull CommsLogger commsLogger, @NotNull Function1<? super String, ? extends T> function1) {
        String commsId;
        T invoke;
        commsLogger.getClass();
        function1.getClass();
        if (identityServiceProvider != null && (commsId = identityServiceProvider.getCommsId()) != null && (invoke = function1.invoke(commsId)) != null) {
            return invoke;
        }
        commsLogger.w("CommsId is not available.");
        return null;
    }
}
