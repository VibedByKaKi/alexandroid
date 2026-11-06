package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlertType;
import com.amazon.alexa.api.AlertsListener;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlertsListenerAdapterV2;", "Lcom/amazon/alexa/api/AlertsListener;", "modelListener", "Lcom/amazon/alexa/api/compat/model/AlertsListener;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlertsListener;)V", "onAlertStarted", "", "id", "", "type", "Lcom/amazon/alexa/api/AlertType;", "onAlertFinished", "fromVoxSdk", "Lcom/amazon/alexa/api/compat/model/AlertType;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertsListenerAdapterV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsListenerAdapterV2.kt\ncom/amazon/alexa/api/compat/AlertsListenerAdapterV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
/* loaded from: classes16.dex */
public final class AlertsListenerAdapterV2 implements AlertsListener {

    @NotNull
    private final com.amazon.alexa.api.compat.model.AlertsListener modelListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertType.values().length];
            try {
                iArr[AlertType.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertType.TIMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertType.REMINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AlertsListenerAdapterV2(@NotNull com.amazon.alexa.api.compat.model.AlertsListener alertsListener) {
        alertsListener.getClass();
        this.modelListener = alertsListener;
    }

    private final com.amazon.alexa.api.compat.model.AlertType fromVoxSdk(AlertType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return com.amazon.alexa.api.compat.model.AlertType.ALARM;
        }
        if (i == 2) {
            return com.amazon.alexa.api.compat.model.AlertType.TIMER;
        }
        if (i == 3) {
            return com.amazon.alexa.api.compat.model.AlertType.REMINDER;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // com.amazon.alexa.api.AlertsListener
    public void onAlertFinished(@Nullable String id, @Nullable AlertType type) {
        this.modelListener.onAlertFinished(id, type != null ? fromVoxSdk(type) : null);
    }

    @Override // com.amazon.alexa.api.AlertsListener
    public void onAlertStarted(@Nullable String id, @Nullable AlertType type) {
        this.modelListener.onAlertStarted(id, type != null ? fromVoxSdk(type) : null);
    }
}
