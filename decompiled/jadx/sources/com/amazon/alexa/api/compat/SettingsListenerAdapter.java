package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.SettingsListener;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/SettingsListenerAdapter;", "Lcom/amazon/alexa/api/SettingsListener;", "modelListener", "Lcom/amazon/alexa/api/compat/model/SettingsListener;", "<init>", "(Lcom/amazon/alexa/api/compat/model/SettingsListener;)V", "onSettingsUpdated", "", "settings", "", "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SettingsListenerAdapter implements SettingsListener {

    @NotNull
    private final com.amazon.alexa.api.compat.model.SettingsListener modelListener;

    public SettingsListenerAdapter(@NotNull com.amazon.alexa.api.compat.model.SettingsListener settingsListener) {
        settingsListener.getClass();
        this.modelListener = settingsListener;
    }

    @Override // com.amazon.alexa.api.SettingsListener
    public void onSettingsUpdated(@NotNull Map<String, String> settings) {
        settings.getClass();
        this.modelListener.onSettingsUpdated(settings);
    }
}
