package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract;
import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.NewUserPrimerContract;
import com.amazon.alexa.voice.ui.onedesign.ftue.metrics.VoxUiMetricEventName;
import com.amazon.alexa.voice.ui.onedesign.util.JSONUtils;
import com.amazon.alexa.voice.ui.onedesign.util.Resources;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class NewUserPrimerPresenter extends HandsfreePrimerPresenter implements NewUserPrimerContract.Presenter {
    private static final String TAG = "NewUserPrimerPresenter";
    private final Context context;
    private final NewUserPrimerContract.Interactor interactor;
    private boolean isContinueEnabled;
    private final MetricsBridge metricsBridge;
    private boolean shouldDisplayAlertDialog;
    private final HandsfreePrimerContract.View view;
    private final JSONObject viewProperties;

    public NewUserPrimerPresenter(@NonNull HandsfreePrimerContract.View view, @NonNull NewUserPrimerContract.Interactor interactor, @NonNull Resources resources, @NonNull MetricsBridge metricsBridge, @Nullable JSONObject jSONObject, @NonNull Context context) {
        super(interactor, resources, metricsBridge);
        this.interactor = interactor;
        this.view = view;
        this.metricsBridge = metricsBridge;
        this.viewProperties = jSONObject;
        this.context = context;
        boolean z = false;
        if (jSONObject != null && jSONObject.optBoolean(HandsFreeConstants.SHOW_CONTINUE, false)) {
            z = true;
        }
        this.isContinueEnabled = z;
    }

    private String getAllowButtonText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, HandsFreeConstants.PRIMARY_BUTTON_LABEL, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_button_allow));
    }

    private String getContinueButtonText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, HandsFreeConstants.PRIMARY_BUTTON_LABEL, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_button_continue));
    }

    private String getGeoLocationInfoText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, HandsFreeConstants.BODY_TEXT_3, resources.getString(R.string.voice_ui_od_permissions_primer_location_permissions_learn_more));
    }

    private String getHandsFreeSettingsText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, HandsFreeConstants.BODY_TEXT_2, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_handsfree_settings_info));
    }

    private String getLaterButtonText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, HandsFreeConstants.SECONDARY_BUTTON_LABEL, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_button_later));
    }

    private String getRationaleText(Resources resources, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        JSONObject jSONObject = this.viewProperties;
        return isEmpty ? JSONUtils.optionalString(jSONObject, HandsFreeConstants.BODY_TEXT_3, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_rationale_geoloc)) : JSONUtils.optionalString(jSONObject, HandsFreeConstants.BODY_TEXT_3, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_rationale, str));
    }

    private String getTitleText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, "title", resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_title));
    }

    private String getUsageText(Resources resources) {
        return JSONUtils.optionalString(this.viewProperties, HandsFreeConstants.BODY_TEXT_1, resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_usage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAlert$0(DialogInterface dialogInterface, int i) {
        this.metricsBridge.reportEvent(VoxUiMetricEventName.HANDSFREE_ALERT_CONTINUE);
        this.interactor.deferPrimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAlert$1(DialogInterface dialogInterface, int i) {
        this.metricsBridge.reportEvent(VoxUiMetricEventName.HANDSFREE_ALERT_CANCELLED);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerPresenter, com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Presenter
    public void laterClicked() {
        if (this.shouldDisplayAlertDialog) {
            showAlert();
        } else {
            super.laterClicked();
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.NewUserPrimerContract.Presenter
    public void permissionsResultReceived() {
        this.interactor.permissionsResultReceived();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.NewUserPrimerContract.Presenter
    public void showAlert() {
        JSONObject jSONObject = this.viewProperties;
        if (jSONObject == null) {
            Log.e(TAG, "Cannot show alert if viewProperties are not initialized");
            return;
        }
        try {
            String string = jSONObject.getString(HandsFreeConstants.ALERT_TITLE);
            String string2 = this.viewProperties.getString(HandsFreeConstants.ALERT_DESCRIPTION);
            String string3 = this.viewProperties.getString(HandsFreeConstants.ALERT_PRIMARY_BUTTON_LABEL);
            String string4 = this.viewProperties.getString(HandsFreeConstants.ALERT_SECONDARY_BUTTON_LABEL);
            final int i = 0;
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.context).setTitle(string).setMessage(string2).setPositiveButton(string3, new DialogInterface.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.NewUserPrimerPresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ NewUserPrimerPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = i;
                    NewUserPrimerPresenter newUserPrimerPresenter = this.f$0;
                    switch (i3) {
                        case 0:
                            newUserPrimerPresenter.lambda$showAlert$0(dialogInterface, i2);
                            break;
                        default:
                            newUserPrimerPresenter.lambda$showAlert$1(dialogInterface, i2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            positiveButton.setNegativeButton(string4, new DialogInterface.OnClickListener(this) { // from class: com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.NewUserPrimerPresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ NewUserPrimerPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    int i3 = i2;
                    NewUserPrimerPresenter newUserPrimerPresenter = this.f$0;
                    switch (i3) {
                        case 0:
                            newUserPrimerPresenter.lambda$showAlert$0(dialogInterface, i22);
                            break;
                        default:
                            newUserPrimerPresenter.lambda$showAlert$1(dialogInterface, i22);
                            break;
                    }
                }
            }).show();
        } catch (JSONException e) {
            Log.e(TAG, "Error in showing alert | " + e);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Presenter
    public void start() {
        Resources resources = getResources();
        JSONObject jSONObject = this.viewProperties;
        boolean z = jSONObject != null && jSONObject.optBoolean(HandsFreeConstants.WW_DISABLE_NEW_SIGNUPS, false);
        this.view.floodBackgroundToStatusBar();
        this.view.setTitle(getTitleText(resources));
        HandsfreePrimerContract.View view = this.view;
        if (z) {
            view.setUsage(resources.getString(R.string.voice_ui_od_handsfree_ftue_new_user_usage_ww_disabled), null);
            this.view.showHandsfreeSettingsInfo(false);
            this.view.setRationale("", "");
            try {
                if (this.viewProperties.getBoolean(NewUserPrimerController.EXTRA_GEOLOCATION_INFORMATION_KEY)) {
                    this.view.setGeoLocationInfo(getGeoLocationInfoText(resources));
                }
            } catch (JSONException e) {
                Log.e(TAG, "Issue obtaining legal geolocation info boolean key: " + e);
            } catch (Exception e2) {
                Log.e(TAG, "Other exception: " + e2);
            }
        } else {
            view.setUsage(getUsageText(resources), null);
            this.view.setHandsfreeSettingsInfo(getHandsFreeSettingsText(resources));
            String string = resources.getString(R.string.voice_ui_od_handsfree_ftue_learn_more);
            try {
                boolean z2 = this.viewProperties.getBoolean(NewUserPrimerController.EXTRA_GEOLOCATION_INFORMATION_KEY);
                HandsfreePrimerContract.View view2 = this.view;
                if (z2) {
                    view2.setRationale(getRationaleText(resources, ""), "");
                    this.view.setGeoLocationInfo(getGeoLocationInfoText(resources));
                } else {
                    view2.setRationale(getRationaleText(resources, string), string);
                }
            } catch (JSONException e3) {
                Log.e(TAG, "Issue obtaining legal geolocation info boolean key: " + e3);
            } catch (Exception e4) {
                Log.e(TAG, "Other exception: " + e4);
            }
        }
        boolean z3 = this.isContinueEnabled;
        HandsfreePrimerContract.View view3 = this.view;
        if (z3) {
            view3.setAllowButtonText(getContinueButtonText(resources));
            this.view.removeLaterButton();
        } else {
            view3.setAllowButtonText(getAllowButtonText(resources));
            this.view.setLaterButtonText(getLaterButtonText(resources));
        }
        JSONObject jSONObject2 = this.viewProperties;
        this.shouldDisplayAlertDialog = jSONObject2 != null && jSONObject2.optBoolean(HandsFreeConstants.SHOW_ALERT, false);
        boolean optBoolean = this.viewProperties.optBoolean(HandsFreeConstants.IN_BOTTOM_SHEET);
        HandsfreePrimerContract.View view4 = this.view;
        if (optBoolean) {
            view4.shrinkTopMargin();
        } else {
            view4.setStatusBarHeightAsTopPadding();
        }
        this.metricsBridge.reportEvent(VoxUiMetricEventName.HANDSFREE_FTUE_SHOWN);
    }
}
