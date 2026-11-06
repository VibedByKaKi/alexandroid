package com.amazon.comms.calling.sdk;

import android.content.Context;
import com.amazon.comms.calling.dependency.DaggerWrapper;
import com.amazon.deecomms.calling.api.ICallingAPI;
import com.amazon.deecomms.calling.api.INewCallingAPIProvider;
import com.facebook.imageutils.BitmapUtil$$ExternalSyntheticLambda0;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/sdk/NewCallingAPIProviderImpl;", "Lcom/amazon/deecomms/calling/api/INewCallingAPIProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "callingBridgeHandlerRegistry", "Lcom/amazon/comms/calling/sdk/CallingBridgeHandlerRegistry;", "getCallingBridgeHandlerRegistry", "()Lcom/amazon/comms/calling/sdk/CallingBridgeHandlerRegistry;", "callingBridgeHandlerRegistry$delegate", "Lkotlin/Lazy;", "getNewCallingAPI", "Lcom/amazon/deecomms/calling/api/ICallingAPI;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class NewCallingAPIProviderImpl implements INewCallingAPIProvider {

    /* renamed from: callingBridgeHandlerRegistry$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy callingBridgeHandlerRegistry;

    @NotNull
    private final Context context;

    @Inject
    public NewCallingAPIProviderImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.callingBridgeHandlerRegistry = LazyKt.lazy(new BitmapUtil$$ExternalSyntheticLambda0(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallingBridgeHandlerRegistry callingBridgeHandlerRegistry_delegate$lambda$0() {
        return DaggerWrapper.INSTANCE.getComponent().getCallingBridgeHandlerRegistry();
    }

    private final CallingBridgeHandlerRegistry getCallingBridgeHandlerRegistry() {
        return (CallingBridgeHandlerRegistry) this.callingBridgeHandlerRegistry.getValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.amazon.deecomms.calling.api.INewCallingAPIProvider
    @NotNull
    public ICallingAPI getNewCallingAPI() {
        ICallingAPI start = CallingAPI.INSTANCE.start(this.context);
        getCallingBridgeHandlerRegistry().register(start);
        return start;
    }
}
