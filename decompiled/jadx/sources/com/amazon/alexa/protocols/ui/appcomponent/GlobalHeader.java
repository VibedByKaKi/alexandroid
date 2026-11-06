package com.amazon.alexa.protocols.ui.appcomponent;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface GlobalHeader {
    public static final int BACKGROUND_OFFWHITE = 1;
    public static final int BACKGROUND_WHITE = 0;
    public static final int BUILD_TYPE_BETA = 1;
    public static final int BUILD_TYPE_DEV = 0;
    public static final int BUILD_TYPE_PROD = 2;
    public static final int TYPE_BACK_BUTTON = 1;
    public static final int TYPE_DOWN_BUTTON = 2;
    public static final int TYPE_MORE_MENU = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BuildType {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Builder {
        @NonNull
        GlobalHeader build();

        @NonNull
        Builder hasPremiumBenefits(boolean z);

        @NonNull
        Builder withHeaderButtonBackground(int i);

        @NonNull
        Builder withNotificationIngress();

        @NonNull
        Builder withPersistentAlexaPlusUpsell();

        @NonNull
        Builder withProfileIngress();

        @NonNull
        Builder withQuickAdd();

        @NonNull
        Builder withRightButtonAs(int i);

        @NonNull
        Builder withTitle();

        @NonNull
        Builder withTransparentBackground();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonType {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconBackground {
    }

    int getBuildType();

    default int getIconBackground() {
        return 1;
    }

    @Nullable
    default View getMockView(@NonNull Context context) {
        return null;
    }

    int getRightButtonType();

    @NonNull
    View getView();

    boolean hasNotificationIngress();

    default boolean hasPersistentAlexaPlusUpsell() {
        return false;
    }

    boolean hasPremiumBenefits();

    boolean hasProfileIngress();

    boolean hasQuickAdd();

    boolean hasTitle();

    boolean hasTransparentBackground();
}
