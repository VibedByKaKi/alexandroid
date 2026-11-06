package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.assets.ReactFontManager;
import com.here.sdk.search.PlaceCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J4\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/text/ReactTypefaceUtils;", "", "<init>", "()V", "parseFontWeight", "", "fontWeightString", "", "parseFontStyle", "fontStyleString", "parseFontVariant", "fontVariantArray", "Lcom/facebook/react/bridge/ReadableArray;", "applyStyles", "Landroid/graphics/Typeface;", "typeface", "style", "weight", "fontFamilyName", "assetManager", "Landroid/content/res/AssetManager;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactTypefaceUtils {

    @NotNull
    public static final ReactTypefaceUtils INSTANCE = new ReactTypefaceUtils();

    private ReactTypefaceUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Typeface applyStyles(@Nullable Typeface typeface, int style, int weight, @Nullable String fontFamilyName, @NotNull AssetManager assetManager) {
        assetManager.getClass();
        ReactFontManager.TypefaceStyle typefaceStyle = new ReactFontManager.TypefaceStyle(style, weight);
        if (fontFamilyName != null) {
            return com.facebook.react.common.assets.ReactFontManager.INSTANCE.getInstance().getTypeface(fontFamilyName, typefaceStyle, assetManager);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typefaceStyle.apply(typeface);
    }

    @JvmStatic
    public static final int parseFontStyle(@Nullable String fontStyleString) {
        if (Intrinsics.areEqual(fontStyleString, "italic")) {
            return 2;
        }
        return Intrinsics.areEqual(fontStyleString, BaseTemplateProvider.NON_INVITATION_KEY) ? 0 : -1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @JvmStatic
    @Nullable
    public static final String parseFontVariant(@Nullable ReadableArray fontVariantArray) {
        if (fontVariantArray == null || fontVariantArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = fontVariantArray.size();
        for (int i = 0; i < size; i++) {
            String string = fontVariantArray.getString(i);
            if (string != null) {
                switch (string.hashCode()) {
                    case -1983120972:
                        if (string.equals("stylistic-thirteen")) {
                            arrayList.add("'ss13'");
                            break;
                        } else {
                            break;
                        }
                    case -1933522176:
                        if (string.equals("stylistic-fifteen")) {
                            arrayList.add("'ss15'");
                            break;
                        } else {
                            break;
                        }
                    case -1534462052:
                        if (string.equals("stylistic-eighteen")) {
                            arrayList.add("'ss18'");
                            break;
                        } else {
                            break;
                        }
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            arrayList.add("'pnum'");
                            break;
                        } else {
                            break;
                        }
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            arrayList.add("'lnum'");
                            break;
                        } else {
                            break;
                        }
                    case -899039099:
                        if (string.equals("historical-ligatures")) {
                            arrayList.add("'hlig'");
                            break;
                        } else {
                            break;
                        }
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            arrayList.add("'tnum'");
                            break;
                        } else {
                            break;
                        }
                    case -672279417:
                        if (string.equals("discretionary-ligatures")) {
                            arrayList.add("'dlig'");
                            break;
                        } else {
                            break;
                        }
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            arrayList.add("'onum'");
                            break;
                        } else {
                            break;
                        }
                    case 249095901:
                        if (string.equals("no-contextual")) {
                            arrayList.add("'calt' off");
                            break;
                        } else {
                            break;
                        }
                    case 273808209:
                        if (string.equals("contextual")) {
                            arrayList.add("'calt'");
                            break;
                        } else {
                            break;
                        }
                    case 289909490:
                        if (string.equals("no-common-ligatures")) {
                            arrayList.add("'liga' off");
                            arrayList.add("'clig' off");
                            break;
                        } else {
                            break;
                        }
                    case 296506098:
                        if (string.equals("stylistic-eight")) {
                            arrayList.add("'ss08'");
                            break;
                        } else {
                            break;
                        }
                    case 309330544:
                        if (string.equals("stylistic-seven")) {
                            arrayList.add("'ss07'");
                            break;
                        } else {
                            break;
                        }
                    case 310339585:
                        if (string.equals("stylistic-three")) {
                            arrayList.add("'ss03'");
                            break;
                        } else {
                            break;
                        }
                    case 604478526:
                        if (string.equals("stylistic-eleven")) {
                            arrayList.add("'ss11'");
                            break;
                        } else {
                            break;
                        }
                    case 915975441:
                        if (string.equals("no-historical-ligatures")) {
                            arrayList.add("'hlig' off");
                            break;
                        } else {
                            break;
                        }
                    case 979426287:
                        if (string.equals("stylistic-five")) {
                            arrayList.add("'ss05'");
                            break;
                        } else {
                            break;
                        }
                    case 979432035:
                        if (string.equals("stylistic-four")) {
                            arrayList.add("'ss04'");
                            break;
                        } else {
                            break;
                        }
                    case 979664367:
                        if (string.equals("stylistic-nine")) {
                            arrayList.add("'ss09'");
                            break;
                        } else {
                            break;
                        }
                    case 1001434505:
                        if (string.equals("stylistic-one")) {
                            arrayList.add("'ss01'");
                            break;
                        } else {
                            break;
                        }
                    case 1001438213:
                        if (string.equals("stylistic-six")) {
                            arrayList.add("'ss06'");
                            break;
                        } else {
                            break;
                        }
                    case 1001439040:
                        if (string.equals("stylistic-ten")) {
                            arrayList.add("'ss10'");
                            break;
                        } else {
                            break;
                        }
                    case 1001439599:
                        if (string.equals("stylistic-two")) {
                            arrayList.add("'ss02'");
                            break;
                        } else {
                            break;
                        }
                    case 1030714463:
                        if (string.equals("stylistic-sixteen")) {
                            arrayList.add("'ss16'");
                            break;
                        } else {
                            break;
                        }
                    case 1044065430:
                        if (string.equals("stylistic-twelve")) {
                            arrayList.add("'ss12'");
                            break;
                        } else {
                            break;
                        }
                    case 1044067310:
                        if (string.equals("stylistic-twenty")) {
                            arrayList.add("'ss20'");
                            break;
                        } else {
                            break;
                        }
                    case 1082592379:
                        if (string.equals("no-discretionary-ligatures")) {
                            arrayList.add("'dlig' off");
                            break;
                        } else {
                            break;
                        }
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            arrayList.add("'smcp'");
                            break;
                        } else {
                            break;
                        }
                    case 1223989350:
                        if (string.equals("common-ligatures")) {
                            arrayList.add("'liga'");
                            arrayList.add("'clig'");
                            break;
                        } else {
                            break;
                        }
                    case 1463562569:
                        if (string.equals("stylistic-nineteen")) {
                            arrayList.add("'ss19'");
                            break;
                        } else {
                            break;
                        }
                    case 1648446397:
                        if (string.equals("stylistic-fourteen")) {
                            arrayList.add("'ss14'");
                            break;
                        } else {
                            break;
                        }
                    case 2097122634:
                        if (string.equals("stylistic-seventeen")) {
                            arrayList.add("'ss17'");
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    @JvmStatic
    public static final int parseFontWeight(@Nullable String fontWeightString) {
        if (fontWeightString == null) {
            return -1;
        }
        switch (fontWeightString.hashCode()) {
            case -1039745817:
                return !fontWeightString.equals(BaseTemplateProvider.NON_INVITATION_KEY) ? -1 : 400;
            case 48625:
                return !fontWeightString.equals(PlaceCategory.EAT_AND_DRINK) ? -1 : 100;
            case 49586:
                return !fontWeightString.equals("200") ? -1 : 200;
            case 50547:
                return !fontWeightString.equals(PlaceCategory.SIGHTS_AND_MUSEUMS) ? -1 : 300;
            case 51508:
                return !fontWeightString.equals(PlaceCategory.TRANSPORT) ? -1 : 400;
            case 52469:
                return !fontWeightString.equals(PlaceCategory.ACCOMMODATION) ? -1 : 500;
            case 53430:
                return !fontWeightString.equals(PlaceCategory.SHOPPING) ? -1 : 600;
            case 54391:
                return !fontWeightString.equals(PlaceCategory.BUSINESS_AND_SERVICES) ? -1 : 700;
            case 55352:
                return !fontWeightString.equals(PlaceCategory.FACILITIES) ? -1 : 800;
            case 56313:
                return !fontWeightString.equals(PlaceCategory.AREAS_AND_BUILDINGS) ? -1 : 900;
            case 3029637:
                return !fontWeightString.equals("bold") ? -1 : 700;
            default:
                return -1;
        }
    }
}
