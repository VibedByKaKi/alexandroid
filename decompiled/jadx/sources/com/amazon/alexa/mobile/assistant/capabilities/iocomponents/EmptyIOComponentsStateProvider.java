package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.model.IOComponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/EmptyIOComponentsStateProvider;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/IOComponentsStateProvider;", "<init>", "()V", "createAllIOComponents", "", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/model/IOComponent;", "createActiveIOComponents", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class EmptyIOComponentsStateProvider implements IOComponentsStateProvider {

    @NotNull
    public static final EmptyIOComponentsStateProvider INSTANCE = new EmptyIOComponentsStateProvider();

    private EmptyIOComponentsStateProvider() {
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.IOComponentsStateProvider
    @NotNull
    public Set<IOComponent> createActiveIOComponents() {
        return SetsKt.emptySet();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.IOComponentsStateProvider
    @NotNull
    public Set<IOComponent> createAllIOComponents() {
        return SetsKt.emptySet();
    }
}
