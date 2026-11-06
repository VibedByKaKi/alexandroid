package com.amazon.tarazed.registry.component;

import com.amazon.tarazed.signaling.TarazedEventHandler;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/registry/component/AppEventHandlerProvider;", "Lcom/amazon/tarazed/registry/component/TarazedComponent;", "eventHandlers", "", "Lcom/amazon/tarazed/signaling/TarazedEventHandler;", "getEventHandlers", "()Ljava/util/List;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AppEventHandlerProvider extends TarazedComponent {
    @NotNull
    List<TarazedEventHandler<?>> getEventHandlers();
}
