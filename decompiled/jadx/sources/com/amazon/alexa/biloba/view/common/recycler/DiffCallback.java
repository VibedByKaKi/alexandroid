package com.amazon.alexa.biloba.view.common.recycler;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DiffCallback extends DiffUtil.ItemCallback<BaseRecyclerItem> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NonNull BaseRecyclerItem baseRecyclerItem, @NonNull BaseRecyclerItem baseRecyclerItem2) {
        return baseRecyclerItem.equals(baseRecyclerItem2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NonNull BaseRecyclerItem baseRecyclerItem, @NonNull BaseRecyclerItem baseRecyclerItem2) {
        return baseRecyclerItem.equals(baseRecyclerItem2);
    }
}
