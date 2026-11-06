package com.amazon.alexa.biloba.view.recent.models;

import androidx.databinding.library.baseAdapters.BR;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ActivityMessage extends BaseRecyclerItem {
    public ActivityMessage(String str) {
        super(str, R.layout.recent_activity_message, BR.activityMessage);
    }

    public String getText() {
        return (String) getData();
    }
}
