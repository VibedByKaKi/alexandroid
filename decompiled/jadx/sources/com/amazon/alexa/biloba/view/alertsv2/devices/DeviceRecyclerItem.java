package com.amazon.alexa.biloba.view.alertsv2.devices;

import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.BR;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceRecyclerItem extends BaseRecyclerItem<DeviceConfigurationViewItemModel> {
    private View.OnClickListener onClickListener;

    public DeviceRecyclerItem(@NonNull DeviceConfigurationViewItemModel deviceConfigurationViewItemModel) {
        super(deviceConfigurationViewItemModel, R.layout.device_item, BR.device);
    }

    public View.OnClickListener getClickListener() {
        return this.onClickListener;
    }

    public String getDeviceIcon() {
        return getData().getDevice().getIcon();
    }

    public String getDeviceName() {
        return getData().getDeviceName();
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
