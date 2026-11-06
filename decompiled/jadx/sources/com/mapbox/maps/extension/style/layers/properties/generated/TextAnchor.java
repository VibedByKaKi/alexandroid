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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LayerProperty;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class TextAnchor implements LayerProperty {

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final TextAnchor CENTER = new TextAnchor("center");

    @JvmField
    @NotNull
    public static final TextAnchor LEFT = new TextAnchor("left");

    @JvmField
    @NotNull
    public static final TextAnchor RIGHT = new TextAnchor("right");

    @JvmField
    @NotNull
    public static final TextAnchor TOP = new TextAnchor("top");

    @JvmField
    @NotNull
    public static final TextAnchor BOTTOM = new TextAnchor("bottom");

    @JvmField
    @NotNull
    public static final TextAnchor TOP_LEFT = new TextAnchor("top-left");

    @JvmField
    @NotNull
    public static final TextAnchor TOP_RIGHT = new TextAnchor("top-right");

    @JvmField
    @NotNull
    public static final TextAnchor BOTTOM_LEFT = new TextAnchor("bottom-left");

    @JvmField
    @NotNull
    public static final TextAnchor BOTTOM_RIGHT = new TextAnchor("bottom-right");

    private TextAnchor(String str) {
        this.value = str;
    }

    @JvmStatic
    @NotNull
    public static final TextAnchor valueOf(@NotNull String str) {
        return INSTANCE.valueOf(str);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof TextAnchor) && Intrinsics.areEqual(getValue(), ((TextAnchor) other).getValue());
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
        return "TextAnchor(value=" + getValue() + ')';
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor$Companion;", "", "()V", "BOTTOM", "Lcom/mapbox/maps/extension/style/layers/properties/generated/TextAnchor;", "BOTTOM_LEFT", "BOTTOM_RIGHT", "CENTER", "LEFT", "RIGHT", "TOP", "TOP_LEFT", "TOP_RIGHT", "valueOf", "value", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        @NotNull
        public final TextAnchor valueOf(@NotNull String value) {
            value.getClass();
            switch (value.hashCode()) {
                case -475662734:
                    if (value.equals("TOP_RIGHT")) {
                        return TextAnchor.TOP_RIGHT;
                    }
                    break;
                case -154073903:
                    if (value.equals("TOP_LEFT")) {
                        return TextAnchor.TOP_LEFT;
                    }
                    break;
                case 83253:
                    if (value.equals("TOP")) {
                        return TextAnchor.TOP;
                    }
                    break;
                case 2332679:
                    if (value.equals("LEFT")) {
                        return TextAnchor.LEFT;
                    }
                    break;
                case 77974012:
                    if (value.equals("RIGHT")) {
                        return TextAnchor.RIGHT;
                    }
                    break;
                case 1533816552:
                    if (value.equals("BOTTOM_RIGHT")) {
                        return TextAnchor.BOTTOM_RIGHT;
                    }
                    break;
                case 1573315995:
                    if (value.equals("BOTTOM_LEFT")) {
                        return TextAnchor.BOTTOM_LEFT;
                    }
                    break;
                case 1965067819:
                    if (value.equals("BOTTOM")) {
                        return TextAnchor.BOTTOM;
                    }
                    break;
                case 1984282709:
                    if (value.equals("CENTER")) {
                        return TextAnchor.CENTER;
                    }
                    break;
            }
            Single$$ExternalSyntheticBUOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, "TextAnchor.valueOf does not support [", value));
            return null;
        }

        private Companion() {
        }
    }
}
