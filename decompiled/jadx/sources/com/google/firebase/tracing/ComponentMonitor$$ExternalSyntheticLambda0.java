package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersion;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ComponentMonitor$$ExternalSyntheticLambda0 implements ComponentFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ComponentMonitor$$ExternalSyntheticLambda0(String str, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$processRegistrar$0;
        LibraryVersion lambda$fromContext$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$processRegistrar$0 = ComponentMonitor.lambda$processRegistrar$0(this.f$0, (Component) this.f$1, componentContainer);
                return lambda$processRegistrar$0;
            default:
                lambda$fromContext$0 = LibraryVersionComponent.lambda$fromContext$0(this.f$0, (LibraryVersionComponent.VersionExtractor) this.f$1, componentContainer);
                return lambda$fromContext$0;
        }
    }
}
