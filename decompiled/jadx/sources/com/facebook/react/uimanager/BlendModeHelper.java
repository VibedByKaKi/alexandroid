package com.facebook.react.uimanager;

import android.annotation.TargetApi;
import android.graphics.BlendMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.facebook.react.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/BlendModeHelper;", "", "<init>", "()V", "parseMixBlendMode", "Landroid/graphics/BlendMode;", ViewProps.MIX_BLEND_MODE, "", "needsIsolatedLayer", "", "view", "Landroid/view/ViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@TargetApi(29)
@SourceDebugExtension({"SMAP\nBlendModeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlendModeHelper.kt\ncom/facebook/react/uimanager/BlendModeHelper\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,52:1\n1255#2,2:53\n*S KotlinDebug\n*F\n+ 1 BlendModeHelper.kt\ncom/facebook/react/uimanager/BlendModeHelper\n*L\n50#1:53,2\n*E\n"})
/* loaded from: classes6.dex */
public final class BlendModeHelper {

    @NotNull
    public static final BlendModeHelper INSTANCE = new BlendModeHelper();

    private BlendModeHelper() {
    }

    @JvmStatic
    public static final boolean needsIsolatedLayer(@NotNull ViewGroup view) {
        view.getClass();
        Iterator<View> it2 = ViewGroupKt.getChildren(view).iterator();
        while (it2.hasNext()) {
            if (it2.next().getTag(R.id.mix_blend_mode) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @Nullable
    public static final BlendMode parseMixBlendMode(@Nullable String mixBlendMode) {
        if (mixBlendMode == null) {
            return null;
        }
        switch (mixBlendMode.hashCode()) {
            case -2120744511:
                if (mixBlendMode.equals("luminosity")) {
                    return BlendMode.LUMINOSITY;
                }
                break;
            case -1427739212:
                if (mixBlendMode.equals("hard-light")) {
                    return BlendMode.HARD_LIGHT;
                }
                break;
            case -1338968417:
                if (mixBlendMode.equals("darken")) {
                    return BlendMode.DARKEN;
                }
                break;
            case -1247677005:
                if (mixBlendMode.equals("soft-light")) {
                    return BlendMode.SOFT_LIGHT;
                }
                break;
            case -1091287984:
                if (mixBlendMode.equals("overlay")) {
                    return BlendMode.OVERLAY;
                }
                break;
            case -1039745817:
                if (mixBlendMode.equals(BaseTemplateProvider.NON_INVITATION_KEY)) {
                    return null;
                }
                break;
            case -907689876:
                if (mixBlendMode.equals("screen")) {
                    return BlendMode.SCREEN;
                }
                break;
            case -230491182:
                if (mixBlendMode.equals("saturation")) {
                    return BlendMode.SATURATION;
                }
                break;
            case -120580883:
                if (mixBlendMode.equals("color-dodge")) {
                    return BlendMode.COLOR_DODGE;
                }
                break;
            case 103672:
                if (mixBlendMode.equals("hue")) {
                    return BlendMode.HUE;
                }
                break;
            case 94842723:
                if (mixBlendMode.equals("color")) {
                    return BlendMode.COLOR;
                }
                break;
            case 170546239:
                if (mixBlendMode.equals("lighten")) {
                    return BlendMode.LIGHTEN;
                }
                break;
            case 653829668:
                if (mixBlendMode.equals("multiply")) {
                    return BlendMode.MULTIPLY;
                }
                break;
            case 1242982905:
                if (mixBlendMode.equals("color-burn")) {
                    return BlendMode.COLOR_BURN;
                }
                break;
            case 1686617550:
                if (mixBlendMode.equals("exclusion")) {
                    return BlendMode.EXCLUSION;
                }
                break;
            case 1728361789:
                if (mixBlendMode.equals("difference")) {
                    return BlendMode.DIFFERENCE;
                }
                break;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid mix-blend-mode name: ".concat(mixBlendMode));
        return null;
    }
}
