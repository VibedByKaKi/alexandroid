package com.mapbox.maps.extension.style.layers.properties.generated;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.maps.MapboxExperimental;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LayerProperty;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public final class RasterColorScale implements LayerProperty {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final RasterColorScale LINEAR = new RasterColorScale("linear");

    @JvmField
    @NotNull
    public static final RasterColorScale LOG = new RasterColorScale("log");

    @NotNull
    private final String value;

    private RasterColorScale(String str) {
        this.value = str;
    }

    @JvmStatic
    @NotNull
    public static final RasterColorScale valueOf(@NotNull String str) {
        return INSTANCE.valueOf(str);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof RasterColorScale) && Intrinsics.areEqual(getValue(), ((RasterColorScale) other).getValue());
    }

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    @NotNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @NotNull
    public String toString() {
        return "RasterColorScale(value=" + getValue() + ')';
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale$Companion;", "", "()V", "LINEAR", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterColorScale;", "LOG", "valueOf", "value", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RasterColorScale valueOf(@NotNull String value) {
            value.getClass();
            if (Intrinsics.areEqual(value, "LINEAR")) {
                return RasterColorScale.LINEAR;
            }
            if (Intrinsics.areEqual(value, "LOG")) {
                return RasterColorScale.LOG;
            }
            Single$$ExternalSyntheticBUOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, "RasterColorScale.valueOf does not support [", value));
            return null;
        }

        private Companion() {
        }
    }
}
