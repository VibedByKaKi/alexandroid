package com.amazon.deecomms.calling.incallexperiences.effects.contracts;

import androidx.annotation.Nullable;
import com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model.EffectIcon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface EffectsMenuPresenterContract {
    boolean areEffectsAvailable();

    boolean isEffectsMenuOpen();

    void onEffectButtonTapped(@Nullable EffectIcon effectIcon);

    void onEffectsAvailable();

    void onEffectsNotAvailable();

    void onMenuButtonTapped();

    boolean shouldShowMenuButton();

    void tearDownMenu();
}
