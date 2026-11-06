package com.amazon.alexa.redesign.api;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0003H&¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/api/Header;", "", "convertToOffline", "", "convertToOnline", "rerenderLeftHeader", "isTWAEnabledFromEB", "", "offlineMode", "getHeight", "", "setOutageAlert", "bannerText", "", "updateYourProfile", "onDestroy", "startHomeModesSubscriptions", "isFirstLoad", "stopHomeModesSubscriptions", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface Header {
    void convertToOffline();

    void convertToOnline();

    int getHeight();

    void onDestroy();

    void rerenderLeftHeader(boolean isTWAEnabledFromEB, boolean offlineMode);

    void setOutageAlert(@Nullable String bannerText);

    void startHomeModesSubscriptions(boolean isFirstLoad);

    void stopHomeModesSubscriptions();

    void updateYourProfile();
}
