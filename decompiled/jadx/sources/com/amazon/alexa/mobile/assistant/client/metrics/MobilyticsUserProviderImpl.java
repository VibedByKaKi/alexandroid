package com.amazon.alexa.mobile.assistant.client.metrics;

import com.amazon.alexa.assistant.AssistantBuilder$$ExternalSyntheticLambda15;
import com.amazon.alexa.client.metrics.mobilytics.MobilyticsUserImpl;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/metrics/MobilyticsUserProviderImpl;", "Lcom/amazon/alexa/mobilytics/identity/MobilyticsUserProvider;", "userIdentityProvider", "Lcom/amazon/alexa/mobile/assistant/client/metrics/UserIdentityProvider;", "<init>", "(Lcom/amazon/alexa/mobile/assistant/client/metrics/UserIdentityProvider;)V", "listeners", "", "Lcom/amazon/alexa/mobilytics/identity/MobilyticsUserProvider$Listener;", "userChangedListener", "Lkotlin/Function0;", "", "user", "Lcom/amazon/alexa/mobilytics/identity/MobilyticsUser;", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "notifyUserChanged", "shutdown", "metrics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMobilyticsUserProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobilyticsUserProviderImpl.kt\ncom/amazon/alexa/mobile/assistant/client/metrics/MobilyticsUserProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1863#2,2:94\n*S KotlinDebug\n*F\n+ 1 MobilyticsUserProviderImpl.kt\ncom/amazon/alexa/mobile/assistant/client/metrics/MobilyticsUserProviderImpl\n*L\n74#1:94,2\n*E\n"})
/* loaded from: classes18.dex */
public final class MobilyticsUserProviderImpl implements MobilyticsUserProvider {

    @NotNull
    private final List<MobilyticsUserProvider.Listener> listeners;

    @NotNull
    private final Function0<Unit> userChangedListener;

    @NotNull
    private final UserIdentityProvider userIdentityProvider;

    public MobilyticsUserProviderImpl(@NotNull UserIdentityProvider userIdentityProvider) {
        userIdentityProvider.getClass();
        this.userIdentityProvider = userIdentityProvider;
        this.listeners = new ArrayList();
        AssistantBuilder$$ExternalSyntheticLambda15 assistantBuilder$$ExternalSyntheticLambda15 = new AssistantBuilder$$ExternalSyntheticLambda15(this, 25);
        this.userChangedListener = assistantBuilder$$ExternalSyntheticLambda15;
        userIdentityProvider.addUserChangedListener(assistantBuilder$$ExternalSyntheticLambda15);
    }

    private final void notifyUserChanged() {
        MobilyticsUser user = user();
        Iterator<T> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            try {
                ((MobilyticsUserProvider.Listener) it2.next()).onUserChanged(user);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userChangedListener$lambda$0(MobilyticsUserProviderImpl mobilyticsUserProviderImpl) {
        mobilyticsUserProviderImpl.notifyUserChanged();
        return Unit.INSTANCE;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider
    public void addListener(@NotNull MobilyticsUserProvider.Listener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider
    public void removeListener(@NotNull MobilyticsUserProvider.Listener listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }

    public final void shutdown() {
        this.userIdentityProvider.removeUserChangedListener(this.userChangedListener);
        this.listeners.clear();
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider
    @NotNull
    public MobilyticsUser user() {
        MobilyticsUserImpl.Builder builder = MobilyticsUserImpl.builder();
        String directedId = this.userIdentityProvider.getDirectedId();
        if (directedId == null) {
            directedId = "Unknown";
        }
        MobilyticsUserImpl.Builder withDirectedId = builder.withDirectedId(directedId);
        String marketplaceId = this.userIdentityProvider.getMarketplaceId();
        MobilyticsUserImpl build = withDirectedId.withMarketplaceId(marketplaceId != null ? marketplaceId : "Unknown").withIsChildProfile(this.userIdentityProvider.isChildProfile()).build();
        build.getClass();
        return build;
    }
}
