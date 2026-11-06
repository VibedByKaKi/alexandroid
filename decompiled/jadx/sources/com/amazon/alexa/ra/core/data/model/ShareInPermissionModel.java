package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.DrawableRes;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jo\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006."}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ShareInPermissionModel;", "", "mainImage", "", "mainImageContentDescription", "", "title", "description", "learnMoreUrl", "settingSteps", "isSecondAttempt", "", "secondAttemptDescription", "leftActionButton", "Lcom/amazon/alexa/ra/core/data/model/ActionItem;", "rightActionButton", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/amazon/alexa/ra/core/data/model/ActionItem;Lcom/amazon/alexa/ra/core/data/model/ActionItem;)V", "getMainImage", "()I", "getMainImageContentDescription", "()Ljava/lang/String;", "getTitle", "getDescription", "getLearnMoreUrl", "getSettingSteps", "()Z", "getSecondAttemptDescription", "getLeftActionButton", "()Lcom/amazon/alexa/ra/core/data/model/ActionItem;", "getRightActionButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ShareInPermissionModel {
    public static final int $stable = 0;

    @NotNull
    private final String description;
    private final boolean isSecondAttempt;

    @NotNull
    private final String learnMoreUrl;

    @NotNull
    private final ActionItem leftActionButton;
    private final int mainImage;

    @Nullable
    private final String mainImageContentDescription;

    @NotNull
    private final ActionItem rightActionButton;

    @NotNull
    private final String secondAttemptDescription;

    @NotNull
    private final String settingSteps;

    @NotNull
    private final String title;

    public /* synthetic */ ShareInPermissionModel(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, ActionItem actionItem, ActionItem actionItem2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? false : z, (i2 & 128) == 0 ? str6 : "", (i2 & 256) != 0 ? new ActionItem(null, null, null, false, null, false, false, false, null, null, null, 2047, null) : actionItem, (i2 & 512) != 0 ? new ActionItem(null, null, null, false, null, false, false, false, null, null, null, 2047, null) : actionItem2);
    }

    public static /* synthetic */ ShareInPermissionModel copy$default(ShareInPermissionModel shareInPermissionModel, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, ActionItem actionItem, ActionItem actionItem2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shareInPermissionModel.mainImage;
        }
        if ((i2 & 2) != 0) {
            str = shareInPermissionModel.mainImageContentDescription;
        }
        if ((i2 & 4) != 0) {
            str2 = shareInPermissionModel.title;
        }
        if ((i2 & 8) != 0) {
            str3 = shareInPermissionModel.description;
        }
        if ((i2 & 16) != 0) {
            str4 = shareInPermissionModel.learnMoreUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = shareInPermissionModel.settingSteps;
        }
        if ((i2 & 64) != 0) {
            z = shareInPermissionModel.isSecondAttempt;
        }
        if ((i2 & 128) != 0) {
            str6 = shareInPermissionModel.secondAttemptDescription;
        }
        if ((i2 & 256) != 0) {
            actionItem = shareInPermissionModel.leftActionButton;
        }
        if ((i2 & 512) != 0) {
            actionItem2 = shareInPermissionModel.rightActionButton;
        }
        ActionItem actionItem3 = actionItem;
        ActionItem actionItem4 = actionItem2;
        boolean z2 = z;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return shareInPermissionModel.copy(i, str, str2, str3, str8, str9, z2, str7, actionItem3, actionItem4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMainImage() {
        return this.mainImage;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ActionItem getRightActionButton() {
        return this.rightActionButton;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMainImageContentDescription() {
        return this.mainImageContentDescription;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSettingSteps() {
        return this.settingSteps;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSecondAttempt() {
        return this.isSecondAttempt;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getSecondAttemptDescription() {
        return this.secondAttemptDescription;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ActionItem getLeftActionButton() {
        return this.leftActionButton;
    }

    @NotNull
    public final ShareInPermissionModel copy(@DrawableRes int mainImage, @Nullable String mainImageContentDescription, @NotNull String title, @NotNull String description, @NotNull String learnMoreUrl, @NotNull String settingSteps, boolean isSecondAttempt, @NotNull String secondAttemptDescription, @NotNull ActionItem leftActionButton, @NotNull ActionItem rightActionButton) {
        Automotive$$ExternalSyntheticOutline0.m(title, description, learnMoreUrl, settingSteps, secondAttemptDescription);
        leftActionButton.getClass();
        rightActionButton.getClass();
        return new ShareInPermissionModel(mainImage, mainImageContentDescription, title, description, learnMoreUrl, settingSteps, isSecondAttempt, secondAttemptDescription, leftActionButton, rightActionButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareInPermissionModel)) {
            return false;
        }
        ShareInPermissionModel shareInPermissionModel = (ShareInPermissionModel) other;
        return this.mainImage == shareInPermissionModel.mainImage && Intrinsics.areEqual(this.mainImageContentDescription, shareInPermissionModel.mainImageContentDescription) && Intrinsics.areEqual(this.title, shareInPermissionModel.title) && Intrinsics.areEqual(this.description, shareInPermissionModel.description) && Intrinsics.areEqual(this.learnMoreUrl, shareInPermissionModel.learnMoreUrl) && Intrinsics.areEqual(this.settingSteps, shareInPermissionModel.settingSteps) && this.isSecondAttempt == shareInPermissionModel.isSecondAttempt && Intrinsics.areEqual(this.secondAttemptDescription, shareInPermissionModel.secondAttemptDescription) && Intrinsics.areEqual(this.leftActionButton, shareInPermissionModel.leftActionButton) && Intrinsics.areEqual(this.rightActionButton, shareInPermissionModel.rightActionButton);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    @NotNull
    public final ActionItem getLeftActionButton() {
        return this.leftActionButton;
    }

    public final int getMainImage() {
        return this.mainImage;
    }

    @Nullable
    public final String getMainImageContentDescription() {
        return this.mainImageContentDescription;
    }

    @NotNull
    public final ActionItem getRightActionButton() {
        return this.rightActionButton;
    }

    @NotNull
    public final String getSecondAttemptDescription() {
        return this.secondAttemptDescription;
    }

    @NotNull
    public final String getSettingSteps() {
        return this.settingSteps;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.mainImage) * 31;
        String str = this.mainImageContentDescription;
        return this.rightActionButton.hashCode() + ((this.leftActionButton.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.isSecondAttempt, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.description), 31, this.learnMoreUrl), 31, this.settingSteps), 31), 31, this.secondAttemptDescription)) * 31);
    }

    public final boolean isSecondAttempt() {
        return this.isSecondAttempt;
    }

    @NotNull
    public String toString() {
        int i = this.mainImage;
        String str = this.mainImageContentDescription;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.learnMoreUrl;
        String str5 = this.settingSteps;
        boolean z = this.isSecondAttempt;
        String str6 = this.secondAttemptDescription;
        ActionItem actionItem = this.leftActionButton;
        ActionItem actionItem2 = this.rightActionButton;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(i, "ShareInPermissionModel(mainImage=", ", mainImageContentDescription=", str, ", title=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str2, ", description=", str3, ", learnMoreUrl=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str4, ", settingSteps=", str5, ", isSecondAttempt=");
        m.append(z);
        m.append(", secondAttemptDescription=");
        m.append(str6);
        m.append(", leftActionButton=");
        m.append(actionItem);
        m.append(", rightActionButton=");
        m.append(actionItem2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public ShareInPermissionModel(@DrawableRes int i, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, @NotNull ActionItem actionItem, @NotNull ActionItem actionItem2) {
        Automotive$$ExternalSyntheticOutline0.m(str2, str3, str4, str5, str6);
        actionItem.getClass();
        actionItem2.getClass();
        this.mainImage = i;
        this.mainImageContentDescription = str;
        this.title = str2;
        this.description = str3;
        this.learnMoreUrl = str4;
        this.settingSteps = str5;
        this.isSecondAttempt = z;
        this.secondAttemptDescription = str6;
        this.leftActionButton = actionItem;
        this.rightActionButton = actionItem2;
    }
}
