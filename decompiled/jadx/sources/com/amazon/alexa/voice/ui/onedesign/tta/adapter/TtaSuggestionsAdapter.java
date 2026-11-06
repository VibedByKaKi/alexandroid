package com.amazon.alexa.voice.ui.onedesign.tta.adapter;

import com.amazon.alexa.voice.ui.onedesign.rv.RvAdapter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtaSuggestionsAdapter extends RvAdapter {
    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvArrayAdapter
    public void clear() {
        super.clear(true);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvArrayAdapter
    public void setItems(List<Object> list) {
        super.setItems(list, true);
    }
}
