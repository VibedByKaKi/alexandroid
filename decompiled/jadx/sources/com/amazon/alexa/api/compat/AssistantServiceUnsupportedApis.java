package com.amazon.alexa.api.compat;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.ConversationUiApiV2;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/AssistantServiceUnsupportedApis;", "", "<init>", "()V", Constants.LOG_TAG, "", "CONVERSATION_UI_PROXY_NAME", "logUnsupported", "", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY, MetricsConstants.NativeFetch.METHOD, "conversationUi", "Lcom/amazon/alexa/api/compat/model/ConversationUiApiV2;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AssistantServiceUnsupportedApis {

    @NotNull
    public static final String CONVERSATION_UI_PROXY_NAME = "AssistantServiceNoOpConversationUi";

    @NotNull
    public static final AssistantServiceUnsupportedApis INSTANCE = new AssistantServiceUnsupportedApis();

    @NotNull
    public static final String TAG = "AssistantServiceNoOpApi";

    private AssistantServiceUnsupportedApis() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object conversationUi$lambda$0(Object obj, Method method, Object[] objArr) {
        if (Intrinsics.areEqual(method.getDeclaringClass(), Object.class)) {
            String name = method.getName();
            if (Intrinsics.areEqual(name, "equals")) {
                return Boolean.valueOf(obj == (objArr != null ? ArraysKt.firstOrNull(objArr) : null));
            }
            return Intrinsics.areEqual(name, "hashCode") ? Integer.valueOf(System.identityHashCode(obj)) : CONVERSATION_UI_PROXY_NAME;
        }
        AssistantServiceUnsupportedApis assistantServiceUnsupportedApis = INSTANCE;
        String name2 = method.getName();
        name2.getClass();
        assistantServiceUnsupportedApis.logUnsupported("ConversationUiApiV2", name2);
        if (Intrinsics.areEqual(method.getReturnType(), Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        return null;
    }

    @NotNull
    public final ConversationUiApiV2 conversationUi() {
        Object newProxyInstance = Proxy.newProxyInstance(ConversationUiApiV2.class.getClassLoader(), new Class[]{ConversationUiApiV2.class}, new AssistantServiceUnsupportedApis$$ExternalSyntheticLambda0());
        newProxyInstance.getClass();
        return (ConversationUiApiV2) newProxyInstance;
    }

    public final void logUnsupported(@NotNull String api, @NotNull String method) {
        api.getClass();
        method.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(api);
        sb.append(".");
        sb.append(method);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(" is not supported over AssistantService IPC; ignoring", TAG, sb);
    }
}
