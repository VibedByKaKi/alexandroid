package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.alexa.biloba.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ListItemBasic extends ListItem {
    public ListItemBasic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.mosaic_list_item, this);
    }

    public ListItemBasic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListItemBasic(Context context) {
        this(context, null);
    }
}
