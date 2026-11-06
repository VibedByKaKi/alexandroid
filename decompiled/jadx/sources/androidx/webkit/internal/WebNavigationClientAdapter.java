package androidx.webkit.internal;

import androidx.webkit.WebNavigationClient;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WebNavigationClientAdapter implements WebViewNavigationClientBoundaryInterface {
    WebNavigationClient mWebNavigationClient;

    public WebNavigationClientAdapter(WebNavigationClient webNavigationClient) {
        this.mWebNavigationClient = webNavigationClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onFirstContentfulPaint$6(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onNavigationCompleted$2(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws Exception {
        return new NavigationAdapter(webViewNavigationBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onNavigationRedirected$1(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws Exception {
        return new NavigationAdapter(webViewNavigationBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onNavigationStarted$0(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) throws Exception {
        return new NavigationAdapter(webViewNavigationBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onPageDOMContentLoadedEventFired$5(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onPageDeleted$3(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onPageLoadEventFired$4(WebViewPageBoundaryInterface webViewPageBoundaryInterface) throws Exception {
        return new PageImpl(webViewPageBoundaryInterface);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"};
    }

    public WebNavigationClient getWebNavigationClient() {
        return this.mWebNavigationClient;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onFirstContentfulPaint(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onFirstContentfulPaint((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda0(webViewPageBoundaryInterface, 0)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationCompleted(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewNavigationBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onNavigationCompleted((NavigationAdapter) webViewNavigationBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda1(webViewNavigationBoundaryInterface, 2)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationRedirected(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewNavigationBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onNavigationRedirected((NavigationAdapter) webViewNavigationBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda1(webViewNavigationBoundaryInterface, 1)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationStarted(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewNavigationBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onNavigationStarted((NavigationAdapter) webViewNavigationBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda1(webViewNavigationBoundaryInterface, 0)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onPageDomContentLoadedEventFired((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda0(webViewPageBoundaryInterface, 3)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDeleted(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onPageDeleted((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda0(webViewPageBoundaryInterface, 1)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageLoadEventFired(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewPageBoundaryInterface.class, invocationHandler);
        this.mWebNavigationClient.onPageLoadEventFired((PageImpl) webViewPageBoundaryInterface.getOrCreatePeer(new WebNavigationClientAdapter$$ExternalSyntheticLambda0(webViewPageBoundaryInterface, 2)));
    }
}
