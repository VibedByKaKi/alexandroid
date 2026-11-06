package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class GuaranteedConfigurationsUtil {
    private GuaranteedConfigurationsUtil() {
    }

    @NonNull
    public static List<SurfaceCombination> generateSupportedCombinationList(int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (i == 0 || i == 1 || i == 3) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (i == 1 || i == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (z) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (z2 && i == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
        }
        if (i == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> get10BitSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m, arrayList, m);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        m2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m2, arrayList, m2);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m3, configType2, configSize);
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m4, configType2, configSize);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m4);
        m5.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination m6 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize3, m5, arrayList, m5);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m6, configType, configSize3);
        SurfaceCombination m7 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m6, arrayList, m6);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m7, configType, configSize3);
        m7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3));
        arrayList.add(m7);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        m.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m, arrayList, m);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m2, configType2, configSize2);
        arrayList.add(m2);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getConcurrentSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m, arrayList, m);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m2, arrayList, m2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.s720p;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m3, configType3, configSize);
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m4, configType3, configSize);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m5, configType, configSize);
        SurfaceCombination m6 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m5);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m6, configType2, configSize);
        SurfaceCombination m7 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m6);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m7, configType, configSize);
        SurfaceCombination m8 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m7);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m8, configType2, configSize);
        arrayList.add(m8);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        m.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m, arrayList, m);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m2, configType2, configSize2);
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m2);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m3, configType, configSize);
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(SurfaceConfig.ConfigType.JPEG, configSize2, m3, arrayList, m3);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.VGA;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m4, configType, configSize);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m4, arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m5, configType2, configSize);
        m5.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(m5);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m, arrayList, m);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m2, arrayList, m2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m3, configType2, configSize);
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m4, configType2, configSize);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m5, configType, configSize2);
        SurfaceCombination m6 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m5);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m6, configType3, configSize2);
        SurfaceCombination m7 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m6);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, m7, configType3, configSize2);
        m7.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(m7);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize3, surfaceCombination, arrayList, surfaceCombination);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m, configType, configSize2);
        ErrorUtils$$ExternalSyntheticOutline0.m(SurfaceConfig.ConfigType.JPEG, configSize3, m, configType3, configSize3);
        arrayList.add(m);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        m.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m, arrayList, m);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m2, configType2, configSize2);
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m2);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m3, configType, configSize2);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m3, arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m4, configType2, configSize2);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m4, arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m5, configType2, configSize);
        m5.addSurfaceConfig(SurfaceConfig.create(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(m5);
        return arrayList;
    }

    @NonNull
    @RequiresApi(api = 33)
    public static List<SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m, arrayList, m);
        m2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m2, arrayList, m2);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m3, configType3, configSize2);
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m4, configType2, configSize2);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize, m5, configType2, configSize2);
        SurfaceCombination m6 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m5);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize3, m6, configType, configSize);
        SurfaceCombination m7 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m6);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m7, configType, configSize);
        SurfaceCombination m8 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m7);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize3, m8, configType2, configSize);
        SurfaceCombination m9 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m8);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m9, configType2, configSize);
        arrayList.add(m9);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m, configType, configSize);
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m2, configType, configSize);
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m2);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m3, configType2, configSize2);
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m3, arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize2, m4, configType3, configSize2);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m4, arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m5, configType3, configSize2);
        SurfaceCombination m6 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m5, arrayList, m5);
        m6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize, m6, configType, configSize);
        SurfaceCombination m7 = ErrorUtils$$ExternalSyntheticOutline0.m(arrayList, m6);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize2, m7, configType4, configSize);
        m7.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(m7);
        return arrayList;
    }

    @NonNull
    @RequiresApi(api = 33)
    public static List<SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize, 4L));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize, 4L));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination9);
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination10);
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        arrayList.add(surfaceCombination11);
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination12);
        SurfaceCombination surfaceCombination13 = new SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination13);
        SurfaceCombination surfaceCombination14 = new SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination14);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getUltraHdrSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.JPEG_R;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        ErrorUtils$$ExternalSyntheticOutline0.m(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, m, configType, configSize);
        arrayList.add(m);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination m = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m, configType2, configSize2);
        SurfaceCombination m2 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m, arrayList, m);
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
        ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize, m2, configType2, configSize2);
        SurfaceCombination m3 = ErrorUtils$$ExternalSyntheticOutline0.m(configType2, configSize3, m2, arrayList, m2);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m3, configType2, configSize2);
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination m4 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize4, m3, arrayList, m3);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m4, configType2, configSize2);
        SurfaceCombination m5 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize4, m4, arrayList, m4);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize, m5, configType2, configSize2);
        SurfaceCombination m6 = ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize4, m5, arrayList, m5);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m6, configType2, configSize2);
        SurfaceCombination m7 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize4, m6, arrayList, m6);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m7, configType2, configSize2);
        SurfaceCombination m8 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize4, m7, arrayList, m7);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize, m8, configType2, configSize2);
        SurfaceCombination m9 = ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize4, m8, arrayList, m8);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType, configSize, m9, configType2, configSize2);
        SurfaceCombination m10 = ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize4, m9, arrayList, m9);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType3, configSize, m10, configType2, configSize2);
        SurfaceCombination m11 = ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize4, m10, arrayList, m10);
        ErrorUtils$$ExternalSyntheticOutline0.m(configType4, configSize, m11, configType2, configSize2);
        m11.addSurfaceConfig(SurfaceConfig.create(configType4, configSize4));
        arrayList.add(m11);
        return arrayList;
    }
}
