package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason;", "", "<init>", "()V", "NoWritePermissions", "NetworkError", "NotEnoughStorageError", MetricsConstants.Error.UNKNOWN_ERROR, "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$NetworkError;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$NoWritePermissions;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$NotEnoughStorageError;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$UnknownError;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UserFragmentInteractionFailedReason {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$NetworkError;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkError extends UserFragmentInteractionFailedReason {
        public static final int $stable = 0;

        @NotNull
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$NoWritePermissions;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoWritePermissions extends UserFragmentInteractionFailedReason {
        public static final int $stable = 0;

        @NotNull
        public static final NoWritePermissions INSTANCE = new NoWritePermissions();

        private NoWritePermissions() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$NotEnoughStorageError;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotEnoughStorageError extends UserFragmentInteractionFailedReason {
        public static final int $stable = 0;

        @NotNull
        public static final NotEnoughStorageError INSTANCE = new NotEnoughStorageError();

        private NotEnoughStorageError() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason$UnknownError;", "Lcom/amazon/alexa/ra/core/data/model/UserFragmentInteractionFailedReason;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownError extends UserFragmentInteractionFailedReason {
        public static final int $stable = 0;

        @NotNull
        public static final UnknownError INSTANCE = new UnknownError();

        private UnknownError() {
            super(null);
        }
    }

    public /* synthetic */ UserFragmentInteractionFailedReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserFragmentInteractionFailedReason() {
    }
}
