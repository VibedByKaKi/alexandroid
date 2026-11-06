package com.amazon.alexa.assistant.capability.system.model;

import com.amazon.alexa.assistant.foundation.model.SystemLocaleSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/system/model/SystemSettingDelegate;", "", "localesUpdated", "", "systemLocaleSetting", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "timeZoneUpdated", "timeZone", "", "error", "Lcom/amazon/alexa/assistant/capability/system/model/SystemCapabilityError;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SystemSettingDelegate {
    void error(@NotNull SystemCapabilityError error);

    void localesUpdated(@NotNull SystemLocaleSetting systemLocaleSetting);

    void timeZoneUpdated(@NotNull String timeZone);
}
