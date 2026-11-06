package com.mapbox.maps.extension.style.layers.properties.generated;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LayerProperty;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class LineElevationReference implements LayerProperty {

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final LineElevationReference NONE = new LineElevationReference("none");

    @JvmField
    @NotNull
    public static final LineElevationReference SEA = new LineElevationReference("sea");

    @JvmField
    @NotNull
    public static final LineElevationReference GROUND = new LineElevationReference("ground");

    @JvmField
    @NotNull
    public static final LineElevationReference HD_ROAD_MARKUP = new LineElevationReference("hd-road-markup");

    private LineElevationReference(String str) {
        this.value = str;
    }

    @JvmStatic
    @NotNull
    public static final LineElevationReference valueOf(@NotNull String str) {
        return INSTANCE.valueOf(str);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof LineElevationReference) && Intrinsics.areEqual(getValue(), ((LineElevationReference) other).getValue());
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
        return "LineElevationReference(value=" + getValue() + ')';
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference$Companion;", "", "()V", "GROUND", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "HD_ROAD_MARKUP", "NONE", "SEA", "valueOf", "value", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        @NotNull
        public final LineElevationReference valueOf(@NotNull String value) {
            value.getClass();
            switch (value.hashCode()) {
                case 81967:
                    if (value.equals("SEA")) {
                        return LineElevationReference.SEA;
                    }
                    break;
                case 2402104:
                    if (value.equals("NONE")) {
                        return LineElevationReference.NONE;
                    }
                    break;
                case 902142308:
                    if (value.equals("HD_ROAD_MARKUP")) {
                        return LineElevationReference.HD_ROAD_MARKUP;
                    }
                    break;
                case 2110836103:
                    if (value.equals("GROUND")) {
                        return LineElevationReference.GROUND;
                    }
                    break;
            }
            Single$$ExternalSyntheticBUOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, "LineElevationReference.valueOf does not support [", value));
            return null;
        }

        private Companion() {
        }
    }
}
