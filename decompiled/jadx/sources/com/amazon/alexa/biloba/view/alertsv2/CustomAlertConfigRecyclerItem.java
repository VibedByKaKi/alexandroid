package com.amazon.alexa.biloba.view.alertsv2;

import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.BR;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.AlertUtils;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CustomAlertConfigRecyclerItem extends BaseRecyclerItem<CustomAlertConfigurationViewItemModel> {
    private static final String TAG = "CustomAlertConfigRecyclerItem";
    private View.OnClickListener onClickListener;

    public CustomAlertConfigRecyclerItem(@NonNull CustomAlertConfigurationViewItemModel customAlertConfigurationViewItemModel) {
        super(customAlertConfigurationViewItemModel, R.layout.custom_alert_item, BR.alertV2);
    }

    public void clickOnClickListener(View view) {
        View.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        LogUtils.e(TAG, "Clicked on edit without click listener for alert: " + getTitle());
    }

    public View.OnClickListener getClickListener() {
        return this.onClickListener;
    }

    public String getSubtitle() {
        if (AlertUtils.hasDeregisteredDevice(getData().getAlertConfiguration())) {
            return null;
        }
        return getData().getSubtitle();
    }

    public String getTitle() {
        return getData().getTitle();
    }

    public boolean isDeregistered() {
        return AlertUtils.hasDeregisteredDevice(getData().getAlertConfiguration());
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
