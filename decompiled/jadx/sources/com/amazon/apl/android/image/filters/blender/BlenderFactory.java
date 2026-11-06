package com.amazon.apl.android.image.filters.blender;

import com.amazon.apl.enums.BlendMode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BlenderFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.image.filters.blender.BlenderFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$BlendMode;

        static {
            int[] iArr = new int[BlendMode.values().length];
            $SwitchMap$com$amazon$apl$enums$BlendMode = iArr;
            try {
                iArr[BlendMode.kBlendModeHue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeLuminosity.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeColor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$BlendMode[BlendMode.kBlendModeSaturation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Blender getBlender(BlendMode blendMode) {
        return new CanvasBlender(blendMode);
    }
}
