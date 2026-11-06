package com.amazon.alexa.voice.ui.onedesign.shopping.item;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ShoppingItemContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        ShoppingItemModel getShoppingItem();

        void openLink();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void openLinkUrl(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void linkClicked();

        void start();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void setAvailabilityText(CharSequence charSequence);

        void setImageUrl(String str);

        void setLegalText(CharSequence charSequence);

        void setLinkText(CharSequence charSequence);

        void setName(CharSequence charSequence);

        void setPriceInfoText(CharSequence charSequence);

        void setPriceText(CharSequence charSequence);

        void setPrimeAvailable(boolean z);

        void setRating(float f);

        void setReviewCountText(CharSequence charSequence);

        void setShippedAndSoldByText(@Nullable CharSequence charSequence);

        void setUnitPriceText(@Nullable CharSequence charSequence);
    }
}
