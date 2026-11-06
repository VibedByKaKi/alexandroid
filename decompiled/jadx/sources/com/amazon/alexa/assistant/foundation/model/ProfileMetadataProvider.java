package com.amazon.alexa.assistant.foundation.model;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/ProfileMetadataProvider;", "", "currentProfileFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/foundation/model/Profile;", "getCurrentProfileFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "allProfilesMapping", "", "", "getAllProfilesMapping", "()Ljava/util/Map;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfileMetadataProvider {
    @NotNull
    Map<String, String> getAllProfilesMapping();

    @NotNull
    StateFlow<Profile> getCurrentProfileFlow();
}
