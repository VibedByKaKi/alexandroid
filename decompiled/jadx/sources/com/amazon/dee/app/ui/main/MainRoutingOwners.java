package com.amazon.dee.app.ui.main;

import androidx.annotation.MainThread;
import com.amazon.dee.app.dependencies.ApplicationScope;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/dee/app/ui/main/MainRoutingOwners;", "", "<init>", "()V", "liveViewModels", "", "Lcom/amazon/dee/app/ui/main/MainViewModel;", "claim", "", "viewModel", "owns", "", "release", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class MainRoutingOwners {

    @NotNull
    private final List<MainViewModel> liveViewModels = new ArrayList();

    @Inject
    public MainRoutingOwners() {
    }

    @MainThread
    public final void claim(@NotNull MainViewModel viewModel) {
        viewModel.getClass();
        this.liveViewModels.add(viewModel);
    }

    @MainThread
    public final boolean owns(@NotNull MainViewModel viewModel) {
        viewModel.getClass();
        return CollectionsKt.lastOrNull((List) this.liveViewModels) == viewModel;
    }

    @MainThread
    @Nullable
    public final MainViewModel release(@NotNull MainViewModel viewModel) {
        viewModel.getClass();
        this.liveViewModels.remove(viewModel);
        return (MainViewModel) CollectionsKt.lastOrNull((List) this.liveViewModels);
    }
}
