package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import android.content.SharedPreferences;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/SharedPreferencesInFlightSessionStore;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSessionStore;", "prefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "markStarted", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSession;", MetricsConstants.Method.CACHE_CLEAR, LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "take", "removeAll", "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SharedPreferencesInFlightSessionStore implements InFlightSessionStore {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String KEY_CAPTURE_DEVICE = "com.amazon.anf.conversation.inFlight.captureDevice";

    @Deprecated
    @NotNull
    public static final String KEY_SESSION_ID = "com.amazon.anf.conversation.inFlight.sessionId";

    @Deprecated
    @NotNull
    public static final String KEY_STARTED_AT = "com.amazon.anf.conversation.inFlight.startedAt";

    @NotNull
    private final SharedPreferences prefs;

    public SharedPreferencesInFlightSessionStore(@NotNull SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
    }

    private final void removeAll() {
        this.prefs.edit().remove(KEY_SESSION_ID).remove(KEY_STARTED_AT).remove(KEY_CAPTURE_DEVICE).apply();
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore
    public void clear(@NotNull String sessionId) {
        sessionId.getClass();
        if (Intrinsics.areEqual(this.prefs.getString(KEY_SESSION_ID, null), sessionId)) {
            removeAll();
        }
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore
    public void markStarted(@NotNull InFlightSession session) {
        session.getClass();
        this.prefs.edit().putString(KEY_SESSION_ID, session.getSessionId()).putLong(KEY_STARTED_AT, session.getStartedAtEpochMs()).putString(KEY_CAPTURE_DEVICE, session.getCaptureDeviceType()).apply();
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore
    @Nullable
    public InFlightSession take() {
        String string = this.prefs.getString(KEY_SESSION_ID, null);
        if (string == null) {
            return null;
        }
        InFlightSession inFlightSession = new InFlightSession(string, this.prefs.getLong(KEY_STARTED_AT, 0L), this.prefs.getString(KEY_CAPTURE_DEVICE, null));
        removeAll();
        return inFlightSession;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/SharedPreferencesInFlightSessionStore$Companion;", "", "<init>", "()V", "KEY_SESSION_ID", "", "KEY_STARTED_AT", "KEY_CAPTURE_DEVICE", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
