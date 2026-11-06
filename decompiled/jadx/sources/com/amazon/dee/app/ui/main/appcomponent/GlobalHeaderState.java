package com.amazon.dee.app.ui.main.appcomponent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableField;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GlobalHeaderState {
    private final ObservableBoolean hasUnreadNotifications = new ObservableBoolean(false);
    private final ObservableField<String> profileImageUrl = new ObservableField<>((Object) null);
    private final ObservableChar profileInitial = new ObservableChar(' ');
    private final ObservableField<String> headerTitle = new ObservableField<>();
    private final ObservableBoolean shouldAnimateNotificationBell = new ObservableBoolean(false);
    private final ObservableBoolean shouldShowHeaderTitle = new ObservableBoolean(true);
    private final ObservableBoolean showPersistentAlexaPlusUpsell = new ObservableBoolean(false);

    @NonNull
    public ObservableBoolean getHasUnreadNotifications() {
        return this.hasUnreadNotifications;
    }

    @NonNull
    public ObservableField<String> getHeaderTitle() {
        return this.headerTitle;
    }

    @NonNull
    public ObservableField<String> getProfileImageUrl() {
        return this.profileImageUrl;
    }

    @NonNull
    public ObservableChar getProfileInitial() {
        return this.profileInitial;
    }

    @NonNull
    public ObservableBoolean getShouldAnimateNotificationBell() {
        return this.shouldAnimateNotificationBell;
    }

    @NonNull
    public ObservableBoolean getShouldShowHeaderTitle() {
        return this.shouldShowHeaderTitle;
    }

    @NonNull
    public ObservableBoolean getShowPersistentAlexaPlusUpsell() {
        return this.showPersistentAlexaPlusUpsell;
    }

    public void resetProfileState() {
        this.profileInitial.set(' ');
        this.profileImageUrl.set(null);
    }

    public void setHasUnreadNotifications(boolean z) {
        this.hasUnreadNotifications.set(z);
    }

    public void setHeaderTitle(String str) {
        this.headerTitle.set(str);
    }

    public void setProfileImageUrl(@Nullable String str) {
        this.profileImageUrl.set(str);
    }

    public void setProfileInitial(char c) {
        this.profileInitial.set(c);
    }

    public void setShouldAnimateNotificationBell(boolean z) {
        this.shouldAnimateNotificationBell.set(z);
    }

    public void setShouldShowHeaderTitle(boolean z) {
        this.shouldShowHeaderTitle.set(z);
    }

    public void setShowPersistentAlexaPlusUpsell(boolean z) {
        this.showPersistentAlexaPlusUpsell.set(z);
    }
}
