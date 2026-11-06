package com.google.android.material.color.utilities;

import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda6 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda6(MaterialDynamicColors materialDynamicColors, int i) {
        this.$r8$classId = i;
        this.f$0 = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onTertiary$84;
        ToneDeltaPair lambda$secondaryFixed$119;
        DynamicColor lambda$onPrimaryFixedVariant$115;
        DynamicColor lambda$onPrimaryFixedVariant$116;
        ToneDeltaPair lambda$tertiaryFixedDim$136;
        DynamicColor lambda$onError$96;
        Double lambda$onPrimaryContainer$62;
        DynamicColor lambda$onPrimaryContainer$63;
        ToneDeltaPair lambda$secondaryFixedDim$122;
        ToneDeltaPair lambda$primaryFixed$105;
        ToneDeltaPair lambda$primaryFixedDim$108;
        Double lambda$tertiaryContainer$86;
        ToneDeltaPair lambda$tertiaryContainer$87;
        int i = this.$r8$classId;
        MaterialDynamicColors materialDynamicColors = this.f$0;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (i) {
            case 0:
                lambda$onTertiary$84 = materialDynamicColors.lambda$onTertiary$84(dynamicScheme);
                return lambda$onTertiary$84;
            case 1:
                lambda$secondaryFixed$119 = materialDynamicColors.lambda$secondaryFixed$119(dynamicScheme);
                return lambda$secondaryFixed$119;
            case 2:
                lambda$onPrimaryFixedVariant$115 = materialDynamicColors.lambda$onPrimaryFixedVariant$115(dynamicScheme);
                return lambda$onPrimaryFixedVariant$115;
            case 3:
                lambda$onPrimaryFixedVariant$116 = materialDynamicColors.lambda$onPrimaryFixedVariant$116(dynamicScheme);
                return lambda$onPrimaryFixedVariant$116;
            case 4:
                lambda$tertiaryFixedDim$136 = materialDynamicColors.lambda$tertiaryFixedDim$136(dynamicScheme);
                return lambda$tertiaryFixedDim$136;
            case 5:
                lambda$onError$96 = materialDynamicColors.lambda$onError$96(dynamicScheme);
                return lambda$onError$96;
            case 6:
                lambda$onPrimaryContainer$62 = materialDynamicColors.lambda$onPrimaryContainer$62(dynamicScheme);
                return lambda$onPrimaryContainer$62;
            case 7:
                lambda$onPrimaryContainer$63 = materialDynamicColors.lambda$onPrimaryContainer$63(dynamicScheme);
                return lambda$onPrimaryContainer$63;
            case 8:
                lambda$secondaryFixedDim$122 = materialDynamicColors.lambda$secondaryFixedDim$122(dynamicScheme);
                return lambda$secondaryFixedDim$122;
            case 9:
                lambda$primaryFixed$105 = materialDynamicColors.lambda$primaryFixed$105(dynamicScheme);
                return lambda$primaryFixed$105;
            case 10:
                lambda$primaryFixedDim$108 = materialDynamicColors.lambda$primaryFixedDim$108(dynamicScheme);
                return lambda$primaryFixedDim$108;
            case 11:
                lambda$tertiaryContainer$86 = materialDynamicColors.lambda$tertiaryContainer$86(dynamicScheme);
                return lambda$tertiaryContainer$86;
            case 12:
                lambda$tertiaryContainer$87 = materialDynamicColors.lambda$tertiaryContainer$87(dynamicScheme);
                return lambda$tertiaryContainer$87;
            default:
                return materialDynamicColors.highestSurface(dynamicScheme);
        }
    }
}
