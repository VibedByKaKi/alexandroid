package com.amazon.apl.android.primitive;

import androidx.annotation.Nullable;
import com.amazon.apl.android.primitive.AutoValue_Filters_Filter;
import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.android.utils.ColorUtils;
import com.amazon.apl.enums.APLEnum;
import com.amazon.apl.enums.BlendMode;
import com.amazon.apl.enums.FilterProperty;
import com.amazon.apl.enums.FilterType;
import com.amazon.apl.enums.GradientProperty;
import com.amazon.apl.enums.GradientType;
import com.amazon.apl.enums.NoiseFilterKind;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class Filters implements IterableProperty<Filter> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.primitive.Filters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$FilterType;

        static {
            int[] iArr = new int[FilterType.values().length];
            $SwitchMap$com$amazon$apl$enums$FilterType = iArr;
            try {
                iArr[FilterType.kFilterTypeBlend.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeBlur.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeColor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeNoise.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeGradient.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeSaturate.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeGrayscale.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$FilterType[FilterType.kFilterTypeExtension.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class Filter {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract Builder amount(float f);

            public abstract Builder blendMode(BlendMode blendMode);

            public abstract Filter build();

            public abstract Builder color(int i);

            public abstract Builder destination(Integer num);

            public abstract Builder extensionParams(Map<String, Object> map);

            public abstract Builder extensionURI(String str);

            public abstract Builder filterType(FilterType filterType);

            public abstract Builder gradient(Gradient gradient);

            public abstract Builder name(String str);

            public abstract Builder noiseKind(NoiseFilterKind noiseFilterKind);

            public abstract Builder noiseSigma(float f);

            public abstract Builder noiseUseColor(boolean z);

            public abstract Builder radius(float f);

            public abstract Builder source(Integer num);
        }

        public static Builder builder() {
            return new AutoValue_Filters_Filter.Builder().radius(-1.0f).color(-1).noiseUseColor(false).noiseSigma(-1.0f).amount(-1.0f);
        }

        public abstract float amount();

        @Nullable
        public abstract BlendMode blendMode();

        public abstract int color();

        @Nullable
        public abstract Integer destination();

        @Nullable
        public abstract Map<String, Object> extensionParams();

        @Nullable
        public abstract String extensionURI();

        public abstract FilterType filterType();

        @Nullable
        public abstract Gradient gradient();

        @Nullable
        public abstract String name();

        @Nullable
        public abstract NoiseFilterKind noiseKind();

        public abstract float noiseSigma();

        public abstract boolean noiseUseColor();

        public abstract float radius();

        @Nullable
        public abstract Integer source();
    }

    public static Filters create(BoundObject boundObject, APLEnum aPLEnum, IMetricsTransform iMetricsTransform) {
        return (Filters) IterableProperty.create(new FilterGetter(boundObject, aPLEnum, iMetricsTransform, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nGetBooleanAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nGetColorAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetFilterTypeAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGetFloatAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long[] nGetGradientColorRangeAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGetGradientFloatAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float[] nGetGradientInputRangeAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetGradientTypeAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetIntAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Map<String, Object> nGetMapAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nGetObjectAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nGetStringAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nHasPropertyAt(long j, int i, int i2, int i3);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FilterGetter extends ArrayGetter<Filters, Filter> {
        private final IMetricsTransform mTransform;

        private FilterGetter(BoundObject boundObject, APLEnum aPLEnum, IMetricsTransform iMetricsTransform) {
            super(boundObject, aPLEnum);
            this.mTransform = iMetricsTransform;
        }

        private boolean getBooleanAt(FilterProperty filterProperty, int i) {
            return Filters.nGetBooleanAt(getNativeHandle(), getIndex(), filterProperty.getIndex(), i);
        }

        private long getColorAt(int i) {
            return Filters.nGetColorAt(getNativeHandle(), getIndex(), i);
        }

        private float getFloatAt(FilterProperty filterProperty, int i) {
            return Filters.nGetFloatAt(getNativeHandle(), getIndex(), filterProperty.getIndex(), i);
        }

        private int getIntAt(FilterProperty filterProperty, int i) {
            return Filters.nGetIntAt(getNativeHandle(), getIndex(), filterProperty.getIndex(), i);
        }

        private Map<String, Object> getMapAt(FilterProperty filterProperty, int i) {
            return Filters.nGetMapAt(getNativeHandle(), getIndex(), filterProperty.getIndex(), i);
        }

        private <T> T getObjectAt(FilterProperty filterProperty, int i) {
            return (T) Filters.nGetObjectAt(getNativeHandle(), getIndex(), filterProperty.getIndex(), i);
        }

        private String getStringAt(FilterProperty filterProperty, int i) {
            return Filters.nGetStringAt(getNativeHandle(), getIndex(), filterProperty.getIndex(), i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public Filters builder() {
            return new AutoValue_Filters(new ArrayList(size()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public Filter get(int i) {
            FilterType valueOf = FilterType.valueOf(Filters.nGetFilterTypeAt(getNativeHandle(), getIndex(), i));
            Filter.Builder filterType = Filter.builder().filterType(valueOf);
            switch (AnonymousClass1.$SwitchMap$com$amazon$apl$enums$FilterType[valueOf.ordinal()]) {
                case 1:
                    filterType.source(Integer.valueOf(getIntAt(FilterProperty.kFilterPropertySource, i))).destination(Integer.valueOf(getIntAt(FilterProperty.kFilterPropertyDestination, i))).blendMode(BlendMode.valueOf(getIntAt(FilterProperty.kFilterPropertyMode, i)));
                    break;
                case 2:
                    filterType.source(Integer.valueOf(getIntAt(FilterProperty.kFilterPropertySource, i))).radius(this.mTransform.toViewhost(getFloatAt(FilterProperty.kFilterPropertyRadius, i)));
                    break;
                case 3:
                    filterType.color(ColorUtils.toARGB(getColorAt(i)));
                    break;
                case 4:
                    filterType.source(Integer.valueOf(getIntAt(FilterProperty.kFilterPropertySource, i))).noiseKind(NoiseFilterKind.valueOf(getIntAt(FilterProperty.kFilterPropertyKind, i))).noiseUseColor(getBooleanAt(FilterProperty.kFilterPropertyUseColor, i)).noiseSigma(getFloatAt(FilterProperty.kFilterPropertySigma, i));
                    break;
                case 5:
                    filterType.gradient(Filters.nHasPropertyAt(getNativeHandle(), getIndex(), FilterProperty.kFilterPropertyGradient.getIndex(), i) ? Gradient.builder().type(GradientType.valueOf(Filters.nGetGradientTypeAt(getNativeHandle(), getIndex(), i))).angle(Filters.nGetGradientFloatAt(getNativeHandle(), getIndex(), GradientProperty.kGradientPropertyAngle.getIndex(), i)).inputRange(Filters.nGetGradientInputRangeAt(getNativeHandle(), getIndex(), i)).colorRange(Gradient.convertColorRange(Filters.nGetGradientColorRangeAt(getNativeHandle(), getIndex(), i))).build() : Gradient.builder().type(GradientType.LINEAR).angle(90.0f).inputRange(new float[]{0.0f, 1.0f}).colorRange(new int[]{0, 0}).build());
                    break;
                case 6:
                case 7:
                    filterType.source(Integer.valueOf(getIntAt(FilterProperty.kFilterPropertySource, i))).amount(getFloatAt(FilterProperty.kFilterPropertyAmount, i));
                    break;
                case 8:
                    filterType.extensionURI(getStringAt(FilterProperty.kFilterPropertyExtensionURI, i)).name(getStringAt(FilterProperty.kFilterPropertyName, i)).source((Integer) getObjectAt(FilterProperty.kFilterPropertySource, i)).destination((Integer) getObjectAt(FilterProperty.kFilterPropertyDestination, i)).extensionParams(getMapAt(FilterProperty.kFilterPropertyExtension, i));
                    break;
            }
            return filterType.build();
        }

        public /* synthetic */ FilterGetter(BoundObject boundObject, APLEnum aPLEnum, IMetricsTransform iMetricsTransform, AnonymousClass1 anonymousClass1) {
            this(boundObject, aPLEnum, iMetricsTransform);
        }
    }

    public static Filters create() {
        return new AutoValue_Filters(new ArrayList());
    }
}
