package com.amazon.alexa.ra.core.ui.fragments;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e*¤\u0001\u0010\u0000\"O\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00012O\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0001¨\u0006\u000f"}, d2 = {"ShareHandler", "Lkotlin/Function3;", "", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "Lkotlin/ParameterName;", "name", "fragments", "", "responseText", "Landroid/content/Context;", "context", "", "toCardsAuthProvider", "Lcom/amazon/alexa/ra/cards/auth/AuthTokenProvider;", "Lcom/amazon/alexa/ra/core/ui/fragments/AuthTokenProvider;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FragmentProviderKt {
    @NotNull
    public static final com.amazon.alexa.ra.cards.auth.AuthTokenProvider toCardsAuthProvider(@NotNull final AuthTokenProvider authTokenProvider) {
        authTokenProvider.getClass();
        return new com.amazon.alexa.ra.cards.auth.AuthTokenProvider() { // from class: com.amazon.alexa.ra.core.ui.fragments.FragmentProviderKt$toCardsAuthProvider$1
            @Override // com.amazon.alexa.ra.cards.auth.AuthTokenProvider
            public String getAuthTokenForUrl(String url, List<? extends Map<String, String>> authorities) {
                url.getClass();
                return AuthTokenProvider.this.getAuthTokenForUrl(url, authorities);
            }

            @Override // com.amazon.alexa.ra.cards.auth.AuthTokenProvider
            public StateFlow<Boolean> getTokenAvailable() {
                return AuthTokenProvider.this.getTokenAvailable();
            }
        };
    }
}
