package com.amazon.deecomms.notifications.model;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.amazon.deecomms.api.navigation.CommsView;
import com.amazon.deecomms.common.ApplicationManager;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ImageDetailViewPushNotificationAction implements PushNotificationAction {
    private final ApplicationManager applicationManager;
    private String path;

    public ImageDetailViewPushNotificationAction(String str, ApplicationManager applicationManager) {
        this.path = str;
        this.applicationManager = applicationManager;
    }

    @Override // com.amazon.deecomms.notifications.model.PushNotificationAction
    public void doRouteAction() {
        navigateToImageDetailView(this.path.split("/")[3], new Bundle());
    }

    @VisibleForTesting
    public void navigateToImageDetailView(String str, Bundle bundle) {
        bundle.putString(Constants.BUNDLE_IMAGE_DETAIL_VIEW_PARAMETERS, str);
        this.applicationManager.navigateToView(CommsView.ReactNativeImageDetailView, bundle, true);
    }

    @Override // com.amazon.deecomms.notifications.model.PushNotificationAction
    public boolean validatePath() {
        if (this.path.split("/").length < 4) {
            return false;
        }
        return !TextUtils.isEmpty(r2[3]);
    }
}
