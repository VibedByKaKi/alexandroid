package com.amazon.alexa.api.compat.metrics;

import com.amazon.alexa.api.AlexaUserPerceivedLatencyListener;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/metrics/UserPerceivedLatencyListenerAdapter;", "Lcom/amazon/alexa/api/AlexaUserPerceivedLatencyListener;", "compatListener", "Lcom/amazon/alexa/api/compat/metrics/UserPerceivedLatencyListener;", "<init>", "(Lcom/amazon/alexa/api/compat/metrics/UserPerceivedLatencyListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/metrics/UserPerceivedLatencyListener;", "onLatencyData", "", "dialogTurnId", "", "data", "Lcom/amazon/alexa/api/UserPerceivedLatencyData;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserPerceivedLatencyListenerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPerceivedLatencyListenerAdapter.kt\ncom/amazon/alexa/api/compat/metrics/UserPerceivedLatencyListenerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
/* loaded from: classes16.dex */
public final class UserPerceivedLatencyListenerAdapter implements AlexaUserPerceivedLatencyListener {

    @NotNull
    private final UserPerceivedLatencyListener compatListener;

    public UserPerceivedLatencyListenerAdapter(@NotNull UserPerceivedLatencyListener userPerceivedLatencyListener) {
        userPerceivedLatencyListener.getClass();
        this.compatListener = userPerceivedLatencyListener;
    }

    @NotNull
    public final UserPerceivedLatencyListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaUserPerceivedLatencyListener
    public void onLatencyData(@Nullable String dialogTurnId, @Nullable com.amazon.alexa.api.UserPerceivedLatencyData data) {
        this.compatListener.onLatencyData(dialogTurnId, data != null ? UserPerceivedLatencyData.INSTANCE.convertToCompat(data) : null);
    }
}
