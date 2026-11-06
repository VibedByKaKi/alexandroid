package com.amazon.dee.app.services.shortcut;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.voice.R;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.entitlement.EntitlementCallback;
import com.amazon.dee.app.services.entitlement.EntitlementCheckerUseCase;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.shortcut.api.ShortcutManagerApi;
import com.amazon.dee.app.services.shortcut.model.ShortcutAction;
import com.amazon.deecomms.common.Constants;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/dee/app/services/shortcut/AlexaShortcutManager;", "Lcom/amazon/dee/app/services/shortcut/api/ShortcutManagerApi;", "context", "Landroid/content/Context;", "shortcutService", "Lcom/amazon/dee/app/services/shortcut/ShortcutService;", "entitlementCheckerUseCaseLazy", "Ldagger/Lazy;", "Lcom/amazon/dee/app/services/entitlement/EntitlementCheckerUseCase;", "featureServiceV2Lazy", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "<init>", "(Landroid/content/Context;Lcom/amazon/dee/app/services/shortcut/ShortcutService;Ldagger/Lazy;Ldagger/Lazy;)V", "applicationContext", "createShortcuts", "", "removeShortcuts", "addAskAlexaShortCut", "isDynamicAppIconGateOn", "", "registerAskAlexaShortcut", "iconResId", "", "addSavedShortcuts", "shortcutList", "", "Landroidx/core/content/pm/ShortcutInfoCompat;", "getShortcutIntent", "Landroid/content/Intent;", "action", "Lcom/amazon/dee/app/services/shortcut/model/ShortcutAction;", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class AlexaShortcutManager implements ShortcutManagerApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AlexaShortcutManager";

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final Lazy<EntitlementCheckerUseCase> entitlementCheckerUseCaseLazy;

    @NotNull
    private final Lazy<FeatureServiceV2> featureServiceV2Lazy;

    @NotNull
    private final ShortcutService shortcutService;

    @Inject
    public AlexaShortcutManager(@NotNull Context context, @NotNull ShortcutService shortcutService, @NotNull Lazy<EntitlementCheckerUseCase> lazy, @NotNull Lazy<FeatureServiceV2> lazy2) {
        context.getClass();
        shortcutService.getClass();
        lazy.getClass();
        lazy2.getClass();
        this.shortcutService = shortcutService;
        this.entitlementCheckerUseCaseLazy = lazy;
        this.featureServiceV2Lazy = lazy2;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.applicationContext = applicationContext;
    }

    private final void addSavedShortcuts(List<ShortcutInfoCompat> shortcutList) {
        for (ShortcutAction shortcutAction : this.shortcutService.getActions()) {
            IconCompat createWithResource = IconCompat.createWithResource(this.applicationContext, shortcutAction.getIconResourceId());
            createWithResource.getClass();
            Intent shortcutIntent = getShortcutIntent(shortcutAction);
            Context context = this.applicationContext;
            String uniqueId = shortcutAction.getUniqueId();
            uniqueId.getClass();
            ShortcutInfoCompat.Builder builder = new ShortcutInfoCompat.Builder(context, uniqueId);
            String shortcutName = shortcutAction.getShortcutName();
            shortcutName.getClass();
            ShortcutInfoCompat.Builder shortLabel = builder.setShortLabel(shortcutName);
            String shortcutName2 = shortcutAction.getShortcutName();
            shortcutName2.getClass();
            ShortcutInfoCompat build = shortLabel.setLongLabel(shortcutName2).setIcon(createWithResource).setIntent(shortcutIntent).build();
            build.getClass();
            shortcutList.add(build);
        }
    }

    private final Intent getShortcutIntent(ShortcutAction action) {
        String routeName = action.getRouteName();
        String intentAction = action.getIntentAction();
        String targetClass = action.getTargetClass();
        if (targetClass == null) {
            targetClass = "com.amazon.dee.app.ui.main.MainActivity";
        }
        Intent intent = new Intent(ShortcutConstants.SHORTCUT_ACTION);
        intent.setData(Uri.parse(ShortcutConstants.ROUTE_PREFIX + routeName));
        intent.setClassName(this.applicationContext.getPackageName(), targetClass);
        if (intentAction != null) {
            intent.setAction(intentAction);
        }
        intent.addFlags(131072);
        intent.addFlags(268435456);
        if (routeName != null) {
            intent.putExtra(Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, routeName);
        }
        intent.putExtra(ShortcutConstants.METRIC_NAME_KEY, action.getShortcutName());
        return intent;
    }

    private final boolean isDynamicAppIconGateOn() {
        FeatureServiceV2 featureServiceV2 = this.featureServiceV2Lazy.get();
        if (featureServiceV2 == null) {
            return false;
        }
        return Intrinsics.areEqual("T1", featureServiceV2.getTreatment("AlexaMobileFoundationAndroid", "ALEXA_MOBILE_DYNAMIC_APP_ICON", "C"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerAskAlexaShortcut(int iconResId) {
        String string = this.applicationContext.getString(R.string.ask_alexa);
        string.getClass();
        IconCompat createWithResource = IconCompat.createWithResource(this.applicationContext, iconResId);
        createWithResource.getClass();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.applicationContext.getPackageName(), "com.amazon.dee.app.ui.voice.LaunchAlexaActivity"));
        intent.setAction("com.amazon.alexa.action.WIDGET_SHORTCUT");
        intent.addFlags(268435456);
        ShortcutInfoCompat build = new ShortcutInfoCompat.Builder(this.applicationContext, ShortcutConstants.ASK_ALEXA_SHORTCUT_ID).setShortLabel(string).setLongLabel(string).setIcon(createWithResource).setIntent(intent).build();
        build.getClass();
        ShortcutManagerCompat.addDynamicShortcuts(this.applicationContext, CollectionsKt.listOf(build));
    }

    @Override // com.amazon.dee.app.services.shortcut.api.ShortcutManagerApi
    public void addAskAlexaShortCut() {
        if (isDynamicAppIconGateOn()) {
            this.entitlementCheckerUseCaseLazy.get().checkEntitlement(new EntitlementCallback() { // from class: com.amazon.dee.app.services.shortcut.AlexaShortcutManager$addAskAlexaShortCut$1
                @Override // com.amazon.dee.app.services.entitlement.EntitlementCallback
                public void onEntitled() {
                    AlexaShortcutManager.this.registerAskAlexaShortcut(R.drawable.voice_ingress_plus);
                }

                @Override // com.amazon.dee.app.services.entitlement.EntitlementCallback
                public void onError() {
                    Log.w(AlexaShortcutManager.INSTANCE.getTAG(), "Entitlement check failed for Ask Alexa shortcut — defaulting to classic icon");
                    AlexaShortcutManager.this.registerAskAlexaShortcut(R.drawable.voice_ingress);
                }

                @Override // com.amazon.dee.app.services.entitlement.EntitlementCallback
                public void onNotEntitled() {
                    AlexaShortcutManager.this.registerAskAlexaShortcut(R.drawable.voice_ingress);
                }
            });
        } else {
            registerAskAlexaShortcut(R.drawable.voice_ingress);
        }
    }

    @Override // com.amazon.dee.app.services.shortcut.api.ShortcutManagerApi
    public void createShortcuts() {
        ArrayList arrayList = new ArrayList();
        addSavedShortcuts(arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        ShortcutManagerCompat.addDynamicShortcuts(this.applicationContext, arrayList);
    }

    @Override // com.amazon.dee.app.services.shortcut.api.ShortcutManagerApi
    public void removeShortcuts() {
        ShortcutManagerCompat.removeAllDynamicShortcuts(this.applicationContext);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/AlexaShortcutManager$Companion;", "", "<init>", "()V", com.dee.app.contacts.common.constants.Constants.LOG_TAG, "", "getTAG", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return AlexaShortcutManager.TAG;
        }

        private Companion() {
        }
    }
}
