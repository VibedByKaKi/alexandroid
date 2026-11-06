package expo.modules.linking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.linking.ExpoLinkingModule;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lexpo/modules/linking/LinkingReactActivityLifecycleListener;", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "<init>", "()V", "onCreate", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "", "intent", "Landroid/content/Intent;", "onReceiveURL", "url", "Landroid/net/Uri;", "expo-linking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkingReactActivityLifecycleListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkingReactActivityLifecycleListener.kt\nexpo/modules/linking/LinkingReactActivityLifecycleListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1869#2,2:28\n*S KotlinDebug\n*F\n+ 1 LinkingReactActivityLifecycleListener.kt\nexpo/modules/linking/LinkingReactActivityLifecycleListener\n*L\n24#1:28,2\n*E\n"})
/* loaded from: classes9.dex */
public final class LinkingReactActivityLifecycleListener implements ReactActivityLifecycleListener {
    private final void onReceiveURL(Uri url) {
        if (url == null) {
            return;
        }
        ExpoLinkingModule.Companion companion = ExpoLinkingModule.INSTANCE;
        companion.setInitialURL(url);
        Iterator<T> it2 = companion.getOnURLReceivedObservers().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(url);
        }
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(@Nullable Activity activity, @Nullable Bundle savedInstanceState) {
        Intent intent;
        onReceiveURL((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData());
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public boolean onNewIntent(@Nullable Intent intent) {
        onReceiveURL(intent != null ? intent.getData() : null);
        return true;
    }
}
