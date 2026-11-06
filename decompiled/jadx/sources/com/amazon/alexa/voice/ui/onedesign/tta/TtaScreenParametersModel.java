package com.amazon.alexa.voice.ui.onedesign.tta;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.annotation.UiModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface TtaScreenParametersModel extends Parcelable {
    boolean getGeoLocationInfoEnabled();

    @Nullable
    String getHintText();
}
