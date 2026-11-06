package com.amazon.alexa.cards.implementation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.cards.api.CardState;
import com.amazon.alexa.cards.api.CardStateController;
import com.amazon.alexa.cards.api.CardStateListener;
import com.amazon.alexa.cards.api.ExtendedCardStateController;
import com.amazon.alexa.cards.api.NavigationDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/cards/implementation/DefaultCardStateController;", "Lcom/amazon/alexa/cards/api/CardStateController;", "Lcom/amazon/alexa/cards/api/ExtendedCardStateController;", "<init>", "()V", "cardStateListeners", "", "Lcom/amazon/alexa/cards/api/CardStateListener;", "navigationDelegate", "Lcom/amazon/alexa/cards/api/NavigationDelegate;", "currentCardState", "Lcom/amazon/alexa/cards/api/CardState;", "registerListener", "", "cardStateListener", "unregisterListener", "updateCardState", "cardState", "updateNavigationDelegate", "delegate", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCardStateController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardStateController.kt\ncom/amazon/alexa/cards/implementation/DefaultCardStateController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1863#2,2:42\n*S KotlinDebug\n*F\n+ 1 DefaultCardStateController.kt\ncom/amazon/alexa/cards/implementation/DefaultCardStateController\n*L\n32#1:42,2\n*E\n"})
/* loaded from: classes17.dex */
public final class DefaultCardStateController implements CardStateController, ExtendedCardStateController {
    public static final int $stable = 8;

    @NotNull
    private final List<CardStateListener> cardStateListeners = new ArrayList();

    @Nullable
    private CardState currentCardState;

    @Nullable
    private NavigationDelegate navigationDelegate;

    @Override // com.amazon.alexa.cards.api.CardStateController
    @Nullable
    /* renamed from: navigationDelegate, reason: from getter */
    public NavigationDelegate getNavigationDelegate() {
        return this.navigationDelegate;
    }

    @Override // com.amazon.alexa.cards.api.CardStateController
    public void registerListener(@NotNull CardStateListener cardStateListener) {
        cardStateListener.getClass();
        this.cardStateListeners.add(cardStateListener);
    }

    @Override // com.amazon.alexa.cards.api.CardStateController
    public void unregisterListener(@NotNull CardStateListener cardStateListener) {
        cardStateListener.getClass();
        this.cardStateListeners.remove(cardStateListener);
    }

    @Override // com.amazon.alexa.cards.api.ExtendedCardStateController
    public void updateCardState(@NotNull CardState cardState) {
        cardState.getClass();
        if (Intrinsics.areEqual(cardState, this.currentCardState)) {
            return;
        }
        this.currentCardState = cardState;
        Iterator<T> it2 = this.cardStateListeners.iterator();
        while (it2.hasNext()) {
            ((CardStateListener) it2.next()).onCardStateChanged(cardState);
        }
    }

    @Override // com.amazon.alexa.cards.api.ExtendedCardStateController
    public void updateNavigationDelegate(@NotNull NavigationDelegate delegate) {
        delegate.getClass();
        this.navigationDelegate = delegate;
    }
}
