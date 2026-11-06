package com.amazon.alexa.api.compat.alerts;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/alerts/AlertsListenerAdapter;", "Lcom/amazon/alexa/api/AlertsListener;", "compatListener", "Lcom/amazon/alexa/api/compat/alerts/AlertsListener;", "<init>", "(Lcom/amazon/alexa/api/compat/alerts/AlertsListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/alerts/AlertsListener;", "onAlertStarted", "", "id", "", "type", "Lcom/amazon/alexa/api/AlertType;", "onAlertFinished", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertsListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsListenerAdapter.kt\ncom/amazon/alexa/api/compat/alerts/AlertsListenerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
/* loaded from: classes16.dex */
public final class AlertsListenerAdapter implements com.amazon.alexa.api.AlertsListener {

    @NotNull
    private final AlertsListener compatListener;

    public AlertsListenerAdapter(@NotNull AlertsListener alertsListener) {
        alertsListener.getClass();
        this.compatListener = alertsListener;
    }

    @NotNull
    public final AlertsListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlertsListener
    public void onAlertFinished(@Nullable String id, @Nullable com.amazon.alexa.api.AlertType type) {
        this.compatListener.onAlertFinished(id, type != null ? AlertType.INSTANCE.convertToCompat(type) : null);
    }

    @Override // com.amazon.alexa.api.AlertsListener
    public void onAlertStarted(@Nullable String id, @Nullable com.amazon.alexa.api.AlertType type) {
        this.compatListener.onAlertStarted(id, type != null ? AlertType.INSTANCE.convertToCompat(type) : null);
    }
}
