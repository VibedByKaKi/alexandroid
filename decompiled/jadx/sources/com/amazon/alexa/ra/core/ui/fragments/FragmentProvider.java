package com.amazon.alexa.ra.core.ui.fragments;

import com.amazon.alexa.ra.core.data.fragments.CardContext;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/FragmentProvider;", "", "view", "Lcom/amazon/alexa/ra/core/ui/fragments/FragmentView;", "getView", "()Lcom/amazon/alexa/ra/core/ui/fragments/FragmentView;", CardContext.ACTIONS, "Lcom/amazon/alexa/ra/core/ui/fragments/FragmentActions;", "getActions", "()Lcom/amazon/alexa/ra/core/ui/fragments/FragmentActions;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FragmentProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static FragmentActions getActions(@NotNull FragmentProvider fragmentProvider) {
            return FragmentProvider.super.getActions();
        }
    }

    @Nullable
    default FragmentActions getActions() {
        return null;
    }

    @NotNull
    FragmentView getView();
}
