package com.amazon.alexa.voice.ui.onedesign.rv;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RvAdapter extends RvArrayAdapter<Object, RvViewHolder> {
    private static final String TAG = "RvAdapter";
    protected final RvActionHandler actionHandler;
    private final Map<Class<? extends RvViewHolder>, RvActionHandler> actionHandlerByViewHolderClass;
    private final RvDataProvider dataProvider;

    public RvAdapter(List<Object> list) {
        super(list);
        this.actionHandlerByViewHolderClass = new HashMap();
        this.actionHandler = new RvAdapter$$ExternalSyntheticLambda0(this, 0);
        this.dataProvider = new RvDataProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, int i2, Object obj, View view, Bundle bundle) {
        int itemViewType = getItemViewType(i2);
        Class<? extends RvViewHolder> viewHolderClassByViewType = this.rvItemsSpecs.getViewHolderClassByViewType(itemViewType);
        if (viewHolderClassByViewType == null) {
            ErrorUtils$$ExternalSyntheticOutline0.m(itemViewType, "Couldn't find view-holder class for view-type: ", TAG);
            return;
        }
        RvActionHandler rvActionHandler = this.actionHandlerByViewHolderClass.get(viewHolderClassByViewType);
        if (rvActionHandler != null) {
            rvActionHandler.handle(i, i2, obj, view, bundle);
            return;
        }
        Log.e(TAG, "Couldn't find action handler for view-holder: " + viewHolderClassByViewType);
    }

    public final RvAdapter addActionHandler(Class<? extends RvViewHolder> cls, RvActionHandler rvActionHandler) {
        this.actionHandlerByViewHolderClass.put(cls, rvActionHandler);
        return this;
    }

    public RvDataProvider getDataProvider() {
        return this.dataProvider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.rvItemsSpecs.getViewTypeByItem(this.items.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RvViewHolder rvViewHolder, int i) {
        rvViewHolder.bind(this.items.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RvViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        try {
            return this.rvItemsSpecs.getViewHolderClassByViewType(i).getConstructor(LayoutInflater.class, ViewGroup.class, RvActionHandler.class, RvDataProvider.class).newInstance(from, viewGroup, this.actionHandler, this.dataProvider);
        } catch (Exception e) {
            Log.e(TAG, "Error while creating ViewHolder.", e);
            return new DefaultViewHolder(from, viewGroup, this.actionHandler, this.dataProvider);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RvViewHolder rvViewHolder) {
        super.onViewAttachedToWindow((RvAdapter) rvViewHolder);
        rvViewHolder.onViewAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RvViewHolder rvViewHolder) {
        super.onViewDetachedFromWindow((RvAdapter) rvViewHolder);
        rvViewHolder.onViewDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RvViewHolder rvViewHolder) {
        super.onViewRecycled((RvAdapter) rvViewHolder);
        rvViewHolder.onViewRecycled();
    }

    public RvAdapter() {
        this(new ArrayList());
    }
}
