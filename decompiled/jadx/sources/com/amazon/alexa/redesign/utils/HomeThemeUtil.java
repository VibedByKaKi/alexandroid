package com.amazon.alexa.redesign.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.redesign.R;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/utils/HomeThemeUtil;", "", "<init>", "()V", "returnMosaicColor", "", "imageTheme", "", "context", "Landroid/content/Context;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HomeThemeUtil {
    public static final int $stable = 0;

    @NotNull
    public static final HomeThemeUtil INSTANCE = new HomeThemeUtil();

    private HomeThemeUtil() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final int returnMosaicColor(@NotNull String imageTheme, @NotNull Context context) {
        imageTheme.getClass();
        context.getClass();
        switch (imageTheme.hashCode()) {
            case -2088499965:
                if (imageTheme.equals("card_border_violet")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderViolet);
                }
                break;
            case -2006395656:
                if (imageTheme.equals("card_border_yellow")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderYellow);
                }
                break;
            case -1881910884:
                if (imageTheme.equals("card_background_blue")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundBlue);
                }
                break;
            case -1881869211:
                if (imageTheme.equals("card_background_cyan")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundCyan);
                }
                break;
            case -1881756763:
                if (imageTheme.equals("card_background_gray")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundGray);
                }
                break;
            case -1656172843:
                if (imageTheme.equals("action10")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction10);
                }
                break;
            case -1656172812:
                if (imageTheme.equals("action20")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction20);
                }
                break;
            case -1656172781:
                if (imageTheme.equals("action30")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction30);
                }
                break;
            case -1656172750:
                if (imageTheme.equals("action40")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction40);
                }
                break;
            case -1656172719:
                if (imageTheme.equals("action50")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction50);
                }
                break;
            case -1656172688:
                if (imageTheme.equals("action60")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction60);
                }
                break;
            case -1609496982:
                if (imageTheme.equals("icon_background_violet")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundViolet);
                }
                break;
            case -1527392673:
                if (imageTheme.equals("icon_background_yellow")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundYellow);
                }
                break;
            case -1428304346:
                if (imageTheme.equals("neutral10")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicNeutral10);
                }
                break;
            case -1428304315:
                if (imageTheme.equals("neutral20")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicNeutral20);
                }
                break;
            case -1428304284:
                if (imageTheme.equals("neutral30")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicNeutral30);
                }
                break;
            case -1428304253:
                if (imageTheme.equals("neutral40")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicNeutral40);
                }
                break;
            case -1428304222:
                if (imageTheme.equals("neutral50")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicNeutral50);
                }
                break;
            case -1428304191:
                if (imageTheme.equals("neutral60")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicNeutral60);
                }
                break;
            case -1332194002:
                if (imageTheme.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicBackground);
                }
                break;
            case -1274501406:
                if (imageTheme.equals("fill10")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicFill10);
                }
                break;
            case -1274501375:
                if (imageTheme.equals("fill20")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicFill20);
                }
                break;
            case -1274501344:
                if (imageTheme.equals("fill30")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicFill30);
                }
                break;
            case -1274501313:
                if (imageTheme.equals("fill40")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicFill40);
                }
                break;
            case -1274501282:
                if (imageTheme.equals("fill50")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicFill50);
                }
                break;
            case -1274501251:
                if (imageTheme.equals("fill60")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicFill60);
                }
                break;
            case -1194063784:
                if (imageTheme.equals("icon10")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon10);
                }
                break;
            case -1194063753:
                if (imageTheme.equals("icon20")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon20);
                }
                break;
            case -1194063722:
                if (imageTheme.equals("icon30")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon30);
                }
                break;
            case -1194063691:
                if (imageTheme.equals("icon40")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon40);
                }
                break;
            case -1194063660:
                if (imageTheme.equals("icon50")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon50);
                }
                break;
            case -1194063629:
                if (imageTheme.equals("icon60")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon60);
                }
                break;
            case -1194063598:
                if (imageTheme.equals("icon70")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon70);
                }
                break;
            case -1194063567:
                if (imageTheme.equals("icon80")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon80);
                }
                break;
            case -1194063536:
                if (imageTheme.equals("icon90")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon90);
                }
                break;
            case -1169070321:
                if (imageTheme.equals("card_background_red")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundRed);
                }
                break;
            case -896797768:
                if (imageTheme.equals("icon_background_green")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundGreen);
                }
                break;
            case -773702145:
                if (imageTheme.equals("card_border_green")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderGreen);
                }
                break;
            case -215447930:
                if (imageTheme.equals("icon_background_red")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundRed);
                }
                break;
            case 234515777:
                if (imageTheme.equals("card_background_violet")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundViolet);
                }
                break;
            case 251982302:
                if (imageTheme.equals("card_border_blue")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderBlue);
                }
                break;
            case 252023975:
                if (imageTheme.equals("card_border_cyan")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderCyan);
                }
                break;
            case 252136423:
                if (imageTheme.equals("card_border_gray")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderGray);
                }
                break;
            case 316620086:
                if (imageTheme.equals("card_background_yellow")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundYellow);
                }
                break;
            case 977974925:
                if (imageTheme.equals("card_border_red")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBorderRed);
                }
                break;
            case 1318691217:
                if (imageTheme.equals("status10")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicStatus10);
                }
                break;
            case 1318691248:
                if (imageTheme.equals("status20")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicStatus20);
                }
                break;
            case 1318691279:
                if (imageTheme.equals("status30")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicStatus30);
                }
                break;
            case 1318691310:
                if (imageTheme.equals("status40")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicStatus40);
                }
                break;
            case 1318691341:
                if (imageTheme.equals("status50")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicStatus50);
                }
                break;
            case 1318691372:
                if (imageTheme.equals("status60")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicStatus60);
                }
                break;
            case 1638728408:
                if (imageTheme.equals("icon100")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon100);
                }
                break;
            case 1638728439:
                if (imageTheme.equals("icon110")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon110);
                }
                break;
            case 1638728470:
                if (imageTheme.equals("icon120")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon120);
                }
                break;
            case 1638728501:
                if (imageTheme.equals("icon130")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon130);
                }
                break;
            case 1638728532:
                if (imageTheme.equals("icon140")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon140);
                }
                break;
            case 1638728563:
                if (imageTheme.equals("icon150")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon150);
                }
                break;
            case 1638728594:
                if (imageTheme.equals("icon160")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon160);
                }
                break;
            case 1638728625:
                if (imageTheme.equals("icon170")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon170);
                }
                break;
            case 1638728656:
                if (imageTheme.equals("icon180")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIcon180);
                }
                break;
            case 1795085825:
                if (imageTheme.equals("card_background_green")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicCardBackgroundGreen);
                }
                break;
            case 1910579461:
                if (imageTheme.equals("icon_background_blue")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundBlue);
                }
                break;
            case 1910621134:
                if (imageTheme.equals("icon_background_cyan")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundCyan);
                }
                break;
            case 1910733582:
                if (imageTheme.equals("icon_background_gray")) {
                    return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicIconBackgroundGray);
                }
                break;
        }
        return ThemeUtil.getColorFromAttribute(context, R.attr.mosaicAction30);
    }
}
