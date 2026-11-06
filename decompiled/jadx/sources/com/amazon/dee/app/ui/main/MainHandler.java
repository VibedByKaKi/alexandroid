package com.amazon.dee.app.ui.main;

import android.view.KeyEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MainHandler {
    void onAddDeviceButtonClicked();

    void onAlexaLogoClicked();

    void onBackClicked();

    void onBottomBarAttachButtonClicked();

    void onBottomBarLiveModeIngressClicked();

    void onBottomBarTalkIngressClicked();

    void onBottomBarTypeIngressClicked();

    void onHeaderClicked();

    void onHelpAndFeedbackClicked();

    void onMenuClicked();

    boolean onMenuKeyEvent(int i, KeyEvent keyEvent);

    void onNotificationButtonClicked();

    void onProfileButtonClicked();

    void onTabChannelsDeviceClicked();

    void onTabChannelsHomeClicked();

    void onTabNavMenuClicked();

    void recordLatencyMetric(String str);
}
