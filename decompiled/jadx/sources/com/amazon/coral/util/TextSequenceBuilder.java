package com.amazon.coral.util;

import java.util.LinkedList;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TextSequenceBuilder {
    private final List<CharSequence> segments = new LinkedList();

    public TextSequenceBuilder append(CharSequence charSequence) {
        if (charSequence == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (charSequence.length() > 0) {
            this.segments.add(charSequence);
        }
        return this;
    }

    public TextSequence toTextSequence() {
        List<CharSequence> list = this.segments;
        return TextSequence.newInstance((CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }
}
