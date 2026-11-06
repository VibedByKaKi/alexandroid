package com.amazon.alexa.voice.handsfree.decider.setup;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.ui.ManagedActivity;
import com.amazon.alexa.voice.handsfree.metrics.MetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface PermissionDelegate {
    void finishStepForPermission(@NonNull ManagedActivity.StepResult stepResult);

    <T extends View> T getViewById(int i);

    boolean hasPermission(String str, String str2);

    void onClickContinueButton();

    void onClickLaterButton();

    void onClickLaterButtonWithConfirmationDialog();

    void onClickLearnMore();

    void setCurrentPage(@NonNull MetricsConstants.PageType pageType);

    void setupContentView(@LayoutRes int i);
}
