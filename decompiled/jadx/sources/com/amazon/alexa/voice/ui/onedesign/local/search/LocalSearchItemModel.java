package com.amazon.alexa.voice.ui.onedesign.local.search;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface LocalSearchItemModel {
    boolean displayProviderInfo();

    CharSequence getAccessRestriction();

    CharSequence getAddress();

    @NonNull
    List<CharSequence> getCategories();

    String getDataSource();

    @NonNull
    CharSequence getDistanceUnit();

    float getDistanceValue();

    List<CharSequence> getEVChargers();

    String getImageUrl();

    float getRating();

    int getReviewCount();

    CharSequence getSpendiness();

    String getStarRatingUrl();

    @NonNull
    Object getTag();

    @NonNull
    CharSequence getTitle();
}
