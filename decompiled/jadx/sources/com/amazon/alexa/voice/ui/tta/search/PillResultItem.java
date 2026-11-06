package com.amazon.alexa.voice.ui.tta.search;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface PillResultItem extends ResultItem {
    @Nullable
    String getItemRoute();

    String getItemText();

    boolean isFromSimba();
}
