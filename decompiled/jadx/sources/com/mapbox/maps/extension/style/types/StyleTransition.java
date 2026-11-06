package com.mapbox.maps.extension.style.types;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.bindgen.Value;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@LayersDsl
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/style/types/StyleTransition;", "", "builder", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "(Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;)V", "delay", "", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "duration", "getDuration", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toValue", "Lcom/mapbox/bindgen/Value;", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class StyleTransition {

    @Nullable
    private final Long delay;

    @Nullable
    private final Long duration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @LayersDsl
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "()V", "<set-?>", "", "delay", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "duration", "getDuration", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private Long delay;

        @Nullable
        private Long duration;

        @NotNull
        public final StyleTransition build() {
            return new StyleTransition(this, null);
        }

        @NotNull
        public final Builder delay(long delay) {
            this.delay = Long.valueOf(delay);
            return this;
        }

        @NotNull
        public final Builder duration(long duration) {
            this.duration = Long.valueOf(duration);
            return this;
        }

        @Nullable
        public final Long getDelay() {
            return this.delay;
        }

        @Nullable
        public final Long getDuration() {
            return this.duration;
        }
    }

    private StyleTransition(Builder builder) {
        this.duration = builder.getDuration();
        this.delay = builder.getDelay();
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof StyleTransition)) {
            return false;
        }
        StyleTransition styleTransition = (StyleTransition) other;
        return Intrinsics.areEqual(this.delay, styleTransition.delay) && Intrinsics.areEqual(this.duration, styleTransition.duration);
    }

    @Nullable
    public final Long getDelay() {
        return this.delay;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        Long l = this.duration;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.delay;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public final Value toValue() {
        HashMap hashMap = new HashMap();
        hashMap.put("delay", new Value(0L));
        hashMap.put("duration", new Value(0L));
        Long l = this.delay;
        if (l != null) {
            hashMap.put("delay", new Value(l.longValue()));
        }
        Long l2 = this.duration;
        if (l2 != null) {
            hashMap.put("duration", new Value(l2.longValue()));
        }
        return new Value((HashMap<String, Value>) hashMap);
    }

    public /* synthetic */ StyleTransition(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
