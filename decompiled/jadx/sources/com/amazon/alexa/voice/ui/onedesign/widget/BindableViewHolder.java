package com.amazon.alexa.voice.ui.onedesign.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BindableViewHolder<T> extends RecyclerView.ViewHolder {
    public BindableViewHolder(View view) {
        super(view);
    }

    public abstract void bind(T t);
}
