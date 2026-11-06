package com.amazon.alexa.voice.ui.onedesign.shopping;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.annotation.UiModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface ProductModel extends Parcelable {
    long getAvailableDate();

    @NonNull
    String getImageUrl();

    @NonNull
    String getLinkUrl();

    @NonNull
    CharSequence getName();

    CharSequence getPrice();

    boolean getPrimeAvailable();

    float getRating();

    int getReviewCount();

    @Nullable
    CharSequence getShippedAndSoldBy();

    @Nullable
    CharSequence getUnitPriceText();
}
