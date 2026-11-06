package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.shortcut.AlexaShortcutManager;
import com.amazon.dee.app.services.shortcut.ShortcutMetrics;
import com.amazon.dee.app.services.shortcut.api.ShortcutManagerApi;
import com.amazon.dee.app.services.shortcut.api.ShortcutMetricsApi;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/dependencies/ShortcutModule;", "", "<init>", "()V", "bindShortcutManager", "Lcom/amazon/dee/app/services/shortcut/api/ShortcutManagerApi;", "manager", "Lcom/amazon/dee/app/services/shortcut/AlexaShortcutManager;", "bindShortcutMetrics", "Lcom/amazon/dee/app/services/shortcut/api/ShortcutMetricsApi;", "metrics", "Lcom/amazon/dee/app/services/shortcut/ShortcutMetrics;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Module
/* loaded from: classes3.dex */
public abstract class ShortcutModule {
    @Binds
    @ApplicationScope
    @NotNull
    public abstract ShortcutManagerApi bindShortcutManager(@NotNull AlexaShortcutManager manager);

    @Binds
    @ApplicationScope
    @NotNull
    public abstract ShortcutMetricsApi bindShortcutMetrics(@NotNull ShortcutMetrics metrics);
}
