package com.amazon.alexa.ra.core.ui.fragments;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¢\u0006\u0002\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/FragmentView;", "", "Render", "", "modifier", "Landroidx/compose/ui/Modifier;", "fragmentData", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "config", "Lcom/amazon/alexa/ra/core/ui/fragments/FragmentRendererConfig;", "(Landroidx/compose/ui/Modifier;Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;Lcom/amazon/alexa/ra/core/ui/fragments/FragmentRendererConfig;Landroidx/compose/runtime/Composer;I)V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FragmentView {
    @Composable
    void Render(@NotNull Modifier modifier, @NotNull FragmentData fragmentData, @NotNull FragmentRendererConfig fragmentRendererConfig, @Nullable Composer composer, int i);
}
