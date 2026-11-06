package com.amazon.dee.app.services.shortcut.api;

import com.amazon.dee.app.services.shortcut.model.ShortcutAction;
import com.dee.app.metrics.MetricsConstants;
import io.ktor.client.utils.CacheControl;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/api/DefaultShortcutsProvider;", "", MetricsConstants.Method.CACHE_GET, "", "Lcom/amazon/dee/app/services/shortcut/model/ShortcutAction;", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DefaultShortcutsProvider {
    @NotNull
    List<ShortcutAction> get();
}
