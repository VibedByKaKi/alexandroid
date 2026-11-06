package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaSupportedLocalesCombinationsListenerV2;", "", "onSupportedLocales", "", "locales", "", "Ljava/util/Locale;", SystemModelI18nConfigTransformer.KEY_LOCALE_COMBINATIONS, "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaSupportedLocalesCombinationsListenerV2 {
    void onSupportedLocales(@Nullable Set<Locale> locales, @Nullable Set<? extends List<Locale>> localeCombinations);
}
