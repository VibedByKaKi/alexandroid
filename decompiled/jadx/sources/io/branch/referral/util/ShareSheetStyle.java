package io.branch.referral.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import io.branch.referral.SharingHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ShareSheetStyle {
    final Context context_;
    private final String messageBody_;
    private final String messageTitle_;
    private boolean setFullWidthStyle_;
    private int styleResourceID_ = -1;
    private int dialogThemeResourceID_ = -1;
    private int dividerHeight_ = -1;
    private int iconSize_ = 50;
    private String sharingTitle_ = null;
    private View sharingTitleView_ = null;
    private List<String> includeInShareSheet = new ArrayList();
    private List<String> excludeFromShareSheet = new ArrayList();
    private Drawable moreOptionIcon_ = null;
    private String moreOptionText_ = null;
    private Drawable copyUrlIcon_ = null;
    private String copyURlText_ = null;
    private String urlCopiedMessage_ = null;
    private final ArrayList<SharingHelper.SHARE_WITH> preferredOptions_ = new ArrayList<>();
    private String defaultURL_ = null;

    public ShareSheetStyle(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        this.context_ = context;
        this.messageTitle_ = str;
        this.messageBody_ = str2;
    }

    private Drawable getDrawable(@NonNull Context context, @DrawableRes int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    public ShareSheetStyle addPreferredSharingOption(SharingHelper.SHARE_WITH share_with) {
        this.preferredOptions_.add(share_with);
        return this;
    }

    public ShareSheetStyle excludeFromShareSheet(@NonNull String[] strArr) {
        this.excludeFromShareSheet.addAll(Arrays.asList(strArr));
        return this;
    }

    public String getCopyURlText() {
        return this.copyURlText_;
    }

    public Drawable getCopyUrlIcon() {
        return this.copyUrlIcon_;
    }

    public String getDefaultURL() {
        return this.defaultURL_;
    }

    public int getDialogThemeResourceID() {
        return this.dialogThemeResourceID_;
    }

    public int getDividerHeight() {
        return this.dividerHeight_;
    }

    public List<String> getExcludedFromShareSheet() {
        return this.excludeFromShareSheet;
    }

    public int getIconSize() {
        return this.iconSize_;
    }

    public List<String> getIncludedInShareSheet() {
        return this.includeInShareSheet;
    }

    public boolean getIsFullWidthStyle() {
        return this.setFullWidthStyle_;
    }

    public String getMessageBody() {
        return this.messageBody_;
    }

    public String getMessageTitle() {
        return this.messageTitle_;
    }

    public Drawable getMoreOptionIcon() {
        return this.moreOptionIcon_;
    }

    public String getMoreOptionText() {
        return this.moreOptionText_;
    }

    public ArrayList<SharingHelper.SHARE_WITH> getPreferredOptions() {
        return this.preferredOptions_;
    }

    public String getSharingTitle() {
        return this.sharingTitle_;
    }

    public View getSharingTitleView() {
        return this.sharingTitleView_;
    }

    public int getStyleResourceID() {
        return this.styleResourceID_;
    }

    public String getUrlCopiedMessage() {
        return this.urlCopiedMessage_;
    }

    public ShareSheetStyle includeInShareSheet(@NonNull String[] strArr) {
        this.includeInShareSheet.addAll(Arrays.asList(strArr));
        return this;
    }

    public ShareSheetStyle setAsFullWidthStyle(boolean z) {
        this.setFullWidthStyle_ = z;
        return this;
    }

    public ShareSheetStyle setCopyUrlStyle(@DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        this.copyUrlIcon_ = getDrawable(this.context_, i);
        this.copyURlText_ = this.context_.getResources().getString(i2);
        this.urlCopiedMessage_ = this.context_.getResources().getString(i3);
        return this;
    }

    public ShareSheetStyle setDefaultURL(String str) {
        this.defaultURL_ = str;
        return this;
    }

    public ShareSheetStyle setDialogThemeResourceID(@StyleRes int i) {
        this.dialogThemeResourceID_ = i;
        return this;
    }

    public ShareSheetStyle setDividerHeight(int i) {
        this.dividerHeight_ = i;
        return this;
    }

    public ShareSheetStyle setIconSize(int i) {
        this.iconSize_ = i;
        return this;
    }

    public ShareSheetStyle setMoreOptionStyle(@DrawableRes int i, @StringRes int i2) {
        this.moreOptionIcon_ = getDrawable(this.context_, i);
        this.moreOptionText_ = this.context_.getResources().getString(i2);
        return this;
    }

    public ShareSheetStyle setSharingTitle(String str) {
        this.sharingTitle_ = str;
        return this;
    }

    public ShareSheetStyle setStyleResourceID(@StyleRes int i) {
        this.styleResourceID_ = i;
        return this;
    }

    public ShareSheetStyle setSharingTitle(View view) {
        this.sharingTitleView_ = view;
        return this;
    }

    public ShareSheetStyle excludeFromShareSheet(@NonNull String str) {
        this.excludeFromShareSheet.add(str);
        return this;
    }

    public ShareSheetStyle includeInShareSheet(@NonNull String str) {
        this.includeInShareSheet.add(str);
        return this;
    }

    public ShareSheetStyle excludeFromShareSheet(@NonNull List<String> list) {
        this.excludeFromShareSheet.addAll(list);
        return this;
    }

    public ShareSheetStyle includeInShareSheet(@NonNull List<String> list) {
        this.includeInShareSheet.addAll(list);
        return this;
    }

    public ShareSheetStyle setMoreOptionStyle(Drawable drawable, String str) {
        this.moreOptionIcon_ = drawable;
        this.moreOptionText_ = str;
        return this;
    }

    public ShareSheetStyle setCopyUrlStyle(Drawable drawable, String str, String str2) {
        this.copyUrlIcon_ = drawable;
        this.copyURlText_ = str;
        this.urlCopiedMessage_ = str2;
        return this;
    }
}
