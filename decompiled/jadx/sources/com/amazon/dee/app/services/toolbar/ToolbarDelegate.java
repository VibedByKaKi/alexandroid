package com.amazon.dee.app.services.toolbar;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/toolbar/ToolbarDelegate;", "", "mountToolbar", "", "view", "Lcom/amazon/dee/app/services/toolbar/ToolbarView;", "unmountToolbar", "setToolbarMounted", "isMounted", "", "onVisibilityChanged", "visibilityInfo", "Lcom/amazon/dee/app/services/toolbar/ToolbarVisibilityInfo;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ToolbarDelegate {
    void mountToolbar(@NotNull ToolbarView view);

    void onVisibilityChanged(@NotNull ToolbarVisibilityInfo visibilityInfo);

    void setToolbarMounted(boolean isMounted);

    void unmountToolbar();
}
