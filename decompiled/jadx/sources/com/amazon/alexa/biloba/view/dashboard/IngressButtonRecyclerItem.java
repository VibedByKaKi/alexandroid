package com.amazon.alexa.biloba.view.dashboard;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import com.amazon.alexa.biloba.BR;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class IngressButtonRecyclerItem extends BaseRecyclerItem<IngressButtonViewItemModel> {
    private static final String TAG = "IngressButtonRecyclerItem";
    private View.OnClickListener onClickListener;

    public IngressButtonRecyclerItem(@NonNull IngressButtonViewItemModel ingressButtonViewItemModel) {
        super(ingressButtonViewItemModel, R.layout.ingress_button_item, BR.ingressButton);
    }

    public void clickOnClickListener(View view) {
        View.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        LogUtils.e(TAG, "Clicked on ingress button click listener for button: " + getTitle());
    }

    public String getAlertText() {
        return getData().getAlertText();
    }

    public LiveData<Boolean> getAlertVisible() {
        return getData().getAlertVisible();
    }

    public Drawable getIcon() {
        return getData().getIcon();
    }

    public View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public String getTitle() {
        return getData().getTitle();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
