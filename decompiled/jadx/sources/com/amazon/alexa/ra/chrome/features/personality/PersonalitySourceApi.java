package com.amazon.alexa.ra.chrome.features.personality;

import com.amazon.alexa.ra.chrome.model.PersonalityInfo;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/chrome/features/personality/PersonalitySourceApi;", "", "getPersonality", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/ra/chrome/model/PersonalityInfo;", "start", "", "stop", MetricsConstants.Method.CACHE_CLEAR, "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PersonalitySourceApi {
    void clear();

    @NotNull
    StateFlow<PersonalityInfo> getPersonality();

    void start();

    void stop();
}
