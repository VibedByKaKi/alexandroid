package com.amazon.alexa.redesign;

import com.amazon.alexa.redesign.entity.DismissIdentifier;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/DismissedCardDataStore;", "", "putDismissedCardIds", "", "dismissIdentifier", "Lcom/amazon/alexa/redesign/entity/DismissIdentifier;", "key", "", "getDismissedCardIds", "", "deleteDismissedCardIds", "clearDismissedCardDataStore", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface DismissedCardDataStore {
    void clearDismissedCardDataStore();

    void deleteDismissedCardIds(@NotNull DismissIdentifier dismissIdentifier, @NotNull String key);

    @NotNull
    List<DismissIdentifier> getDismissedCardIds(@NotNull String key);

    void putDismissedCardIds(@NotNull DismissIdentifier dismissIdentifier, @NotNull String key);
}
