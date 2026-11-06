package com.amazon.alexa.voice.ui.provider;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.provider.vox.CardMode;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CardFactoryWithMode {
    @Deprecated
    ViewController buildCard(@Nullable String str, CardMode cardMode);

    ViewController buildCard(@Nullable String str, CardMode cardMode, int i);
}
