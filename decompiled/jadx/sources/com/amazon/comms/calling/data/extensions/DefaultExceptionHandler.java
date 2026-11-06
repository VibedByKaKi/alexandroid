package com.amazon.comms.calling.data.extensions;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.log.CommsLogger;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/data/extensions/DefaultExceptionHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "kotlin.jvm.PlatformType", "Lcom/amazon/comms/log/CommsLogger;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public class DefaultExceptionHandler extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private final CommsLogger LOG;

    public DefaultExceptionHandler() {
        super(CoroutineExceptionHandler.INSTANCE);
        this.LOG = CommsLogger.getLogger(Constants.LOG_TAG, "DefaultExceptionHandler");
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        context.getClass();
        exception.getClass();
        this.LOG.e(exception.getMessage());
    }
}
