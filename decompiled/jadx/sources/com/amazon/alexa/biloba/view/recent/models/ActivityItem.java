package com.amazon.alexa.biloba.view.recent.models;

import android.text.TextUtils;
import androidx.databinding.library.baseAdapters.BR;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.generated.models.Activity;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ActivityItem extends BaseRecyclerItem<Activity> {
    public ActivityItem(Activity activity) {
        super(activity, R.layout.recent_activity_item, BR.activityItem);
    }

    public String getIconAltText() {
        return getData().getIconAltText();
    }

    public String getIconUrl() {
        return getData().getIconUrl();
    }

    public String getPrimaryText() {
        return getData().getTitle();
    }

    public String getSecondaryText() {
        return TextUtils.isEmpty(getData().getDeviceName()) ? getData().getLocalizedDateTime().getTime() : String.format("%1$s - %2$s", getData().getLocalizedDateTime().getTime(), getData().getDeviceName());
    }
}
