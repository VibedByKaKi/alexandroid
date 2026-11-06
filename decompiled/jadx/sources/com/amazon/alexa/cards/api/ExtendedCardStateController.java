package com.amazon.alexa.cards.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/cards/api/ExtendedCardStateController;", "", "updateCardState", "", "cardState", "Lcom/amazon/alexa/cards/api/CardState;", "updateNavigationDelegate", "navigationDelegate", "Lcom/amazon/alexa/cards/api/NavigationDelegate;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ExtendedCardStateController {
    void updateCardState(@NotNull CardState cardState);

    void updateNavigationDelegate(@NotNull NavigationDelegate navigationDelegate);
}
