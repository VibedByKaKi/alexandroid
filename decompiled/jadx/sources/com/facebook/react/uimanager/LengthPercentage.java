package com.facebook.react.uimanager;

import com.amazon.alexa.presence.utils.MetricsUtil;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/LengthPercentage;", "", "value", "", "type", "Lcom/facebook/react/uimanager/LengthPercentageType;", "<init>", "(FLcom/facebook/react/uimanager/LengthPercentageType;)V", "()V", "getType", "()Lcom/facebook/react/uimanager/LengthPercentageType;", MetricsUtil.MetricsId.RESOLVE, "referenceLength", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LengthPercentage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LengthPercentageType type;
    private final float value;

    public LengthPercentage(float f, @NotNull LengthPercentageType lengthPercentageType) {
        lengthPercentageType.getClass();
        this.value = f;
        this.type = lengthPercentageType;
    }

    /* renamed from: component1, reason: from getter */
    private final float getValue() {
        return this.value;
    }

    public static /* synthetic */ LengthPercentage copy$default(LengthPercentage lengthPercentage, float f, LengthPercentageType lengthPercentageType, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lengthPercentage.value;
        }
        if ((i & 2) != 0) {
            lengthPercentageType = lengthPercentage.type;
        }
        return lengthPercentage.copy(f, lengthPercentageType);
    }

    @JvmStatic
    @Nullable
    public static final LengthPercentage setFromDynamic(@NotNull Dynamic dynamic) {
        return INSTANCE.setFromDynamic(dynamic);
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LengthPercentageType getType() {
        return this.type;
    }

    @NotNull
    public final LengthPercentage copy(float value, @NotNull LengthPercentageType type) {
        type.getClass();
        return new LengthPercentage(value, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LengthPercentage)) {
            return false;
        }
        LengthPercentage lengthPercentage = (LengthPercentage) other;
        return Float.compare(this.value, lengthPercentage.value) == 0 && this.type == lengthPercentage.type;
    }

    @NotNull
    public final LengthPercentageType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (Float.hashCode(this.value) * 31);
    }

    public final float resolve(float referenceLength) {
        LengthPercentageType lengthPercentageType = this.type;
        LengthPercentageType lengthPercentageType2 = LengthPercentageType.PERCENT;
        float f = this.value;
        return lengthPercentageType == lengthPercentageType2 ? (f / 100) * referenceLength : f;
    }

    @NotNull
    public String toString() {
        return "LengthPercentage(value=" + this.value + ", type=" + this.type + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/LengthPercentage$Companion;", "", "<init>", "()V", "setFromDynamic", "Lcom/facebook/react/uimanager/LengthPercentage;", "dynamic", "Lcom/facebook/react/bridge/Dynamic;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final LengthPercentage setFromDynamic(@NotNull Dynamic dynamic) {
            boolean endsWith$default;
            dynamic.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[dynamic.getType().ordinal()];
            if (i == 1) {
                double asDouble = dynamic.asDouble();
                if (asDouble >= 0.0d) {
                    return new LengthPercentage((float) asDouble, LengthPercentageType.POINT);
                }
                return null;
            }
            if (i != 2) {
                FLog.w(ReactConstants.TAG, "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String asString = dynamic.asString();
            if (asString != null) {
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(asString, "%", false, 2, null);
                if (endsWith$default) {
                    try {
                        float parseFloat = Float.parseFloat(asString.substring(0, asString.length() - 1));
                        if (parseFloat >= 0.0f) {
                            return new LengthPercentage(parseFloat, LengthPercentageType.PERCENT);
                        }
                        return null;
                    } catch (NumberFormatException unused) {
                        FLog.w(ReactConstants.TAG, "Invalid percentage format: ".concat(asString));
                        return null;
                    }
                }
            }
            FLog.w(ReactConstants.TAG, "Invalid string value: " + asString);
            return null;
        }

        private Companion() {
        }
    }

    public LengthPercentage() {
        this(0.0f, LengthPercentageType.POINT);
    }
}
