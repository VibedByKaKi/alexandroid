package com.amazon.alexa.voice.ui.onedesign.space;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.amazon.alexa.voice.ui.onedesign.widget.BindableViewHolder;
import com.amazon.alexa.vox.ui.onedesign.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EmptySpaceViewHolder extends BindableViewHolder {
    public EmptySpaceViewHolder(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
    }

    public EmptySpaceViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this(layoutInflater, R.layout.voice_ui_od_empty_space_header_content, viewGroup);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.BindableViewHolder
    public void bind(Object obj) {
    }
}
