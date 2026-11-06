package com.amazon.alexa.api.compat;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e\u0018\u00010\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaSupportedLocalesListenerAdapter;", "Lcom/amazon/alexa/api/AlexaSupportedLocalesListener;", "compatListener", "Lcom/amazon/alexa/api/compat/AlexaSupportedLocalesListener;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaSupportedLocalesListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/AlexaSupportedLocalesListener;", "onSupportedLocales", "", "locales", "", "Ljava/util/Locale;", SystemModelI18nConfigTransformer.KEY_LOCALE_COMBINATIONS, "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaSupportedLocalesListenerAdapter implements com.amazon.alexa.api.AlexaSupportedLocalesListener {

    @NotNull
    private final AlexaSupportedLocalesListener compatListener;

    public AlexaSupportedLocalesListenerAdapter(@NotNull AlexaSupportedLocalesListener alexaSupportedLocalesListener) {
        alexaSupportedLocalesListener.getClass();
        this.compatListener = alexaSupportedLocalesListener;
    }

    @NotNull
    public final AlexaSupportedLocalesListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaSupportedLocalesListener
    public void onSupportedLocales(@Nullable Set<Locale> locales, @Nullable Set<List<Locale>> localeCombinations) {
        this.compatListener.onSupportedLocales(locales);
    }
}
