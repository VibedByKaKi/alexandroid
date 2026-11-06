package com.amazon.alexa.assistant.capability.system.model;

import com.amazon.alexa.assistant.foundation.model.SystemLocale;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/system/model/LocaleListener;", "", "onPrimaryLocaleChanged", "", "primary", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "onSecondaryLocalesChanged", "secondary", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LocaleListener {
    void onPrimaryLocaleChanged(@NotNull SystemLocale primary);

    void onSecondaryLocalesChanged(@NotNull List<? extends SystemLocale> secondary);
}
