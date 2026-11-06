package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/GUIEvent;", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "interactionType", "", "<init>", "(Ljava/lang/String;)V", "getInteractionType", "()Ljava/lang/String;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GUIEvent extends SessionMetric {

    @SerializedName("interaction_type")
    @NotNull
    private final String interactionType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIEvent(@NotNull String str) {
        super(SessionMetricType.GUI_EVENT);
        str.getClass();
        this.interactionType = str;
    }

    @NotNull
    public final String getInteractionType() {
        return this.interactionType;
    }

    public /* synthetic */ GUIEvent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GUIEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
