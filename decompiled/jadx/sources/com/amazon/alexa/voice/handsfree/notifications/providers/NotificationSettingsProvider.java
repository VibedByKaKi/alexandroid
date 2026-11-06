package com.amazon.alexa.voice.handsfree.notifications.providers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.api.SettingsProvider;
import com.amazon.alexa.handsfree.settings.quicksettings.AlexaQuickSettingTileStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationSettingsProvider implements SettingsProvider {
    private final AlexaQuickSettingTileStore mAlexaQuickSettingTileStore;

    public NotificationSettingsProvider(@NonNull Context context) {
        this(new AlexaQuickSettingTileStore(context));
    }

    @Override // com.amazon.alexa.handsfree.notification.api.SettingsProvider
    public boolean hasInteractedWithQsTile() {
        return this.mAlexaQuickSettingTileStore.hasInteractedWithQsTile();
    }

    @Override // com.amazon.alexa.handsfree.notification.api.SettingsProvider
    public boolean isQsTileInMainMenu() {
        return this.mAlexaQuickSettingTileStore.isQsTileInMainMenu();
    }

    @VisibleForTesting
    public NotificationSettingsProvider(@NonNull AlexaQuickSettingTileStore alexaQuickSettingTileStore) {
        this.mAlexaQuickSettingTileStore = alexaQuickSettingTileStore;
    }
}
