package com.amazon.alexa.apl.extension;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.amazon.alexa.accessoryclient.common.util.MetricsConstants;
import com.amazon.apl.android.ExtensionCommandDefinition;
import com.amazon.apl.android.ExtensionEventHandler;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import com.amazon.apl.android.providers.IExtension;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002+,B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002JH\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010#2\b\u0010*\u001a\u0004\u0018\u00010#H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\b\u0012\u00060\u000fR\u00020\u00000\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/amazon/alexa/apl/extension/WebFlowExtension;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "Lcom/amazon/apl/android/dependencies/IExtensionEventCallback;", "Lcom/amazon/apl/android/providers/IExtension;", "mExtensionEventHandler", "Lcom/amazon/alexa/apl/extension/IExtensionEventHandler;", "mContext", "Landroid/content/Context;", "(Lcom/amazon/alexa/apl/extension/IExtensionEventHandler;Landroid/content/Context;)V", "browserPackageName", "", "mCustomTabsClient", "Landroidx/browser/customtabs/CustomTabsClient;", "pendingWebFlows", "Ljava/util/Queue;", "Lcom/amazon/alexa/apl/extension/WebFlowExtension$WebFlow;", "getCallback", "getCommandDefinitions", "", "Lcom/amazon/apl/android/ExtensionCommandDefinition;", "getCustomTabsBrowserPackageName", "getEventHandlers", "Lcom/amazon/apl/android/ExtensionEventHandler;", "getUri", "onCustomTabsServiceConnected", "", "componentName", "Landroid/content/ComponentName;", "customTabsClient", "onDestroy", "onExtensionEvent", "extensionEventName", "extensionEventUri", "eventSourceObject", "", "", "extensionEventProperties", "extensionEventCallbackResult", "Lcom/amazon/apl/android/dependencies/IExtensionEventCallback$IExtensionEventCallbackResult;", MetricsConstants.CLIENT_CONNECTION_ON_SERVICE_DISCONNECTED, "startWebFlow", "eventUrl", "eventFlowId", "Companion", "WebFlow", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WebFlowExtension extends CustomTabsServiceConnection implements IExtensionEventCallback, IExtension {

    @NotNull
    private static final String FLOW_END_EVENT = "OnFlowEnd";

    @NotNull
    private static final String HTTPS_SCHEME = "https";

    @NotNull
    private static final String PROPERTY_FLOW_ID = "flowId";

    @NotNull
    private static final String PROPERTY_URL = "url";

    @NotNull
    private static final String START_FLOW_COMMAND = "StartFlow";

    @NotNull
    public static final String URI = "aplext:webflow:10";

    @Nullable
    private String browserPackageName;

    @NotNull
    private Context mContext;

    @Nullable
    private CustomTabsClient mCustomTabsClient;

    @NotNull
    private IExtensionEventHandler mExtensionEventHandler;

    @NotNull
    private final Queue<WebFlow> pendingWebFlows;
    private static final String TAG = "WebFlowExtension";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/apl/extension/WebFlowExtension$WebFlow;", "Landroidx/browser/customtabs/CustomTabsCallback;", "mUri", "Landroid/net/Uri;", "mFlowId", "", "(Lcom/amazon/alexa/apl/extension/WebFlowExtension;Landroid/net/Uri;Ljava/lang/String;)V", "flowIdMap", "", "", "launch", "", "onNavigationEvent", "navigationEvent", "", "extras", "Landroid/os/Bundle;", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class WebFlow extends CustomTabsCallback {

        @NotNull
        private final Map<String, Object> flowIdMap;

        @Nullable
        private final String mFlowId;

        @NotNull
        private final Uri mUri;
        final /* synthetic */ WebFlowExtension this$0;

        public WebFlow(@NotNull WebFlowExtension webFlowExtension, @Nullable Uri uri, String str) {
            uri.getClass();
            this.this$0 = webFlowExtension;
            this.mUri = uri;
            this.mFlowId = str;
            this.flowIdMap = new HashMap();
        }

        public final void launch() {
            CustomTabsClient customTabsClient = this.this$0.mCustomTabsClient;
            CustomTabsSession newSession = customTabsClient != null ? customTabsClient.newSession(this) : null;
            if (newSession != null) {
                String str = this.mFlowId;
                if (str != null && str.length() > 0) {
                    this.flowIdMap.put(WebFlowExtension.PROPERTY_FLOW_ID, this.mFlowId);
                }
                new CustomTabsIntent.Builder(newSession).build().launchUrl(this.this$0.mContext, this.mUri);
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int navigationEvent, @Nullable Bundle extras) {
            if (navigationEvent == 6) {
                try {
                    this.this$0.mExtensionEventHandler.invokeExtensionEventHandler(WebFlowExtension.URI, WebFlowExtension.FLOW_END_EVENT, this.flowIdMap, false);
                } catch (IllegalStateException e) {
                    Log.e(WebFlowExtension.TAG, "Error invoking extension event handler.", e);
                }
                this.this$0.onDestroy();
            }
        }
    }

    @Inject
    public WebFlowExtension(@NotNull IExtensionEventHandler iExtensionEventHandler, @NotNull Context context) {
        iExtensionEventHandler.getClass();
        context.getClass();
        this.mExtensionEventHandler = iExtensionEventHandler;
        this.mContext = context;
        this.pendingWebFlows = new LinkedList();
        this.browserPackageName = getCustomTabsBrowserPackageName();
    }

    private final String getCustomTabsBrowserPackageName() {
        PackageManager packageManager = this.mContext.getPackageManager();
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("https", "", null));
        data.getClass();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 0);
        queryIntentActivities.getClass();
        Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
        while (it2.hasNext()) {
            String str = it2.next().activityInfo.packageName;
            Intent intent = new Intent().setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage(str);
            intent.getClass();
            if (packageManager.resolveService(intent, 0) != null) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDestroy() {
        if (this.mCustomTabsClient != null) {
            this.mCustomTabsClient = null;
            this.pendingWebFlows.clear();
            this.mContext.unbindService(this);
        }
    }

    private final void startWebFlow(Object eventUrl, Object eventFlowId) {
        if (this.mCustomTabsClient == null) {
            CustomTabsClient.bindCustomTabsService(this.mContext, this.browserPackageName, this);
        }
        Uri parse = Uri.parse((String) eventUrl);
        String str = eventFlowId instanceof String ? (String) eventFlowId : null;
        if (!Intrinsics.areEqual(parse.getScheme(), "https")) {
            parse.getScheme();
            return;
        }
        WebFlow webFlow = new WebFlow(this, parse, str);
        synchronized (this) {
            try {
                if (this.mCustomTabsClient != null) {
                    webFlow.launch();
                    Unit unit = Unit.INSTANCE;
                } else {
                    this.pendingWebFlows.add(webFlow);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NotNull
    public List<ExtensionCommandDefinition> getCommandDefinitions() {
        return CollectionsKt.listOf(new ExtensionCommandDefinition(getUri(), START_FLOW_COMMAND).allowFastMode(true).property("url", null, true).property(PROPERTY_FLOW_ID, null, false));
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NotNull
    public List<ExtensionEventHandler> getEventHandlers() {
        return CollectionsKt.listOf(new ExtensionEventHandler(getUri(), FLOW_END_EVENT));
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NotNull
    public String getUri() {
        return URI;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull CustomTabsClient customTabsClient) {
        componentName.getClass();
        customTabsClient.getClass();
        this.mCustomTabsClient = customTabsClient;
        customTabsClient.getClass();
        customTabsClient.warmup(0L);
        synchronized (this) {
            WebFlow poll = this.pendingWebFlows.poll();
            if (poll != null) {
                poll.launch();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.amazon.apl.android.dependencies.IExtensionEventCallback
    public void onExtensionEvent(@NotNull String extensionEventName, @NotNull String extensionEventUri, @NotNull Map<String, ? extends Object> eventSourceObject, @NotNull Map<String, ? extends Object> extensionEventProperties, @NotNull IExtensionEventCallback.IExtensionEventCallbackResult extensionEventCallbackResult) {
        extensionEventName.getClass();
        extensionEventUri.getClass();
        eventSourceObject.getClass();
        extensionEventProperties.getClass();
        extensionEventCallbackResult.getClass();
        if (extensionEventName.length() == 0) {
            return;
        }
        if (extensionEventUri.length() == 0 || !Intrinsics.areEqual(extensionEventUri, getUri())) {
            getUri();
        } else if (this.browserPackageName != null && Intrinsics.areEqual(extensionEventName, START_FLOW_COMMAND)) {
            startWebFlow(extensionEventProperties.get("url"), extensionEventProperties.get(PROPERTY_FLOW_ID));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName componentName) {
        onDestroy();
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NotNull
    public IExtensionEventCallback getCallback() {
        return this;
    }
}
