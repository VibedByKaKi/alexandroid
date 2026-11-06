package com.amazon.dee.app.services.icon;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\fJ\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/amazon/dee/app/services/icon/AppIconManager;", "", "stateAccessor", "Lcom/amazon/dee/app/services/icon/AliasStateAccessor;", "iconMetrics", "Lcom/amazon/dee/app/services/icon/IconMetrics;", "<init>", "(Lcom/amazon/dee/app/services/icon/AliasStateAccessor;Lcom/amazon/dee/app/services/icon/IconMetrics;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/amazon/dee/app/services/icon/IconMetrics;)V", "currentActiveAlias", "Lcom/amazon/dee/app/services/icon/AppIconAlias;", "getCurrentActiveAlias", "()Lcom/amazon/dee/app/services/icon/AppIconAlias;", "willCauseAppKill", "", "targetAlias", "hasEnabledManifestDefaultStray", "switchToIfPossible", "switchTo", "", "rollBackEnable", NotificationConstants.ALIAS, "switchToClassic", "isAliasEnabled", "isExplicitlyEnabled", "enableAlias", "disableAlias", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
@SourceDebugExtension({"SMAP\nAppIconManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppIconManager.kt\ncom/amazon/dee/app/services/icon/AppIconManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n295#2,2:344\n295#2,2:346\n1761#2,3:348\n774#2:351\n865#2,2:352\n1563#2:354\n1634#2,3:355\n1056#2:358\n1869#2,2:359\n1563#2:361\n1634#2,3:362\n*S KotlinDebug\n*F\n+ 1 AppIconManager.kt\ncom/amazon/dee/app/services/icon/AppIconManager\n*L\n116#1:344,2\n117#1:346,2\n147#1:348,3\n212#1:351\n212#1:352,2\n217#1:354\n217#1:355,3\n229#1:358\n241#1:359,2\n247#1:361\n247#1:362,3\n*E\n"})
/* loaded from: classes5.dex */
public final class AppIconManager {

    @NotNull
    private static final String SUBCOMPONENT = "AppIconManager";

    @NotNull
    private static final String TAG = "AppIconManager";

    @NotNull
    private final IconMetrics iconMetrics;

    @NotNull
    private final AliasStateAccessor stateAccessor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public AppIconManager(@NotNull Context context, @NotNull IconMetrics iconMetrics) {
        this(new PackageManagerAliasStateAccessor(context), iconMetrics);
        context.getClass();
        iconMetrics.getClass();
    }

    private final void disableAlias(AppIconAlias alias) {
        int i;
        if (alias.getIsManifestDefault()) {
            Log.w("AppIconManager", "Disabling manifest-default alias %s — this will kill the app", alias.name());
            i = 2;
        } else {
            i = 0;
        }
        this.stateAccessor.setEnabledSetting(alias.getAliasName(), i);
    }

    private final void enableAlias(AppIconAlias alias) {
        this.stateAccessor.setEnabledSetting(alias.getAliasName(), 1);
    }

    private final boolean hasEnabledManifestDefaultStray(AppIconAlias targetAlias) {
        EnumEntries<AppIconAlias> entries = AppIconAlias.getEntries();
        if (entries != null && entries.isEmpty()) {
            return false;
        }
        for (AppIconAlias appIconAlias : entries) {
            if (appIconAlias != targetAlias && appIconAlias.getIsManifestDefault() && isAliasEnabled(appIconAlias)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isAliasEnabled(AppIconAlias alias) {
        int enabledSetting = this.stateAccessor.getEnabledSetting(alias.getAliasName());
        if (enabledSetting == 0) {
            return alias.getIsManifestDefault();
        }
        if (enabledSetting == 1) {
            return true;
        }
        if (enabledSetting != 2) {
            return alias.getIsManifestDefault();
        }
        return false;
    }

    private final boolean isExplicitlyEnabled(AppIconAlias alias) {
        return this.stateAccessor.getEnabledSetting(alias.getAliasName()) == 1;
    }

    private final void rollBackEnable(AppIconAlias alias) {
        try {
            disableAlias(alias);
        } catch (Exception e) {
            Log.e("AppIconManager", "Failed to roll back enabling %s: %s", alias.name(), e.getMessage());
        }
    }

    @Nullable
    public final AppIconAlias getCurrentActiveAlias() {
        Object obj;
        Object obj2;
        Iterator<E> it2 = AppIconAlias.getEntries().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (isExplicitlyEnabled((AppIconAlias) obj2)) {
                break;
            }
        }
        AppIconAlias appIconAlias = (AppIconAlias) obj2;
        if (appIconAlias != null) {
            return appIconAlias;
        }
        Iterator<E> it3 = AppIconAlias.getEntries().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (isAliasEnabled((AppIconAlias) next)) {
                obj = next;
                break;
            }
        }
        return (AppIconAlias) obj;
    }

    public final synchronized void switchTo(@NotNull AppIconAlias targetAlias) {
        try {
            targetAlias.getClass();
            EnumEntries<AppIconAlias> entries = AppIconAlias.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entries) {
                AppIconAlias appIconAlias = (AppIconAlias) obj;
                if (appIconAlias != targetAlias && isAliasEnabled(appIconAlias)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty() && isAliasEnabled(targetAlias)) {
                targetAlias.name();
                return;
            }
            String name = targetAlias.name();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AppIconAlias) it2.next()).name());
            }
            Log.i("AppIconManager", "Switching app icon to %s (stale aliases to clear: %s)", name, arrayList2);
            try {
                enableAlias(targetAlias);
                List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.amazon.dee.app.services.icon.AppIconManager$switchTo$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Boolean.valueOf(((AppIconAlias) t).getIsManifestDefault()), Boolean.valueOf(((AppIconAlias) t2).getIsManifestDefault()));
                    }
                });
                AppIconAlias appIconAlias2 = (AppIconAlias) CollectionsKt.lastOrNull(sortedWith);
                boolean z = false;
                if (appIconAlias2 != null && appIconAlias2.getIsManifestDefault()) {
                    z = true;
                }
                if (z) {
                    Log.i("AppIconManager", "App icon switch complete. Active alias: %s", targetAlias.name());
                    this.iconMetrics.recordCounter(AlexaMetricsConstants.MetricEvents.APP_ICON_SWITCH_SUCCESS, "AppIconManager");
                }
                try {
                    Iterator it3 = sortedWith.iterator();
                    while (it3.hasNext()) {
                        disableAlias((AppIconAlias) it3.next());
                    }
                    if (!z) {
                        Log.i("AppIconManager", "App icon switch complete. Active alias: %s", targetAlias.name());
                        this.iconMetrics.recordCounter(AlexaMetricsConstants.MetricEvents.APP_ICON_SWITCH_SUCCESS, "AppIconManager");
                    }
                } catch (Exception e) {
                    List list = sortedWith;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((AppIconAlias) it4.next()).name());
                    }
                    Log.e("AppIconManager", "Failed to disable stale app icon(s) %s, rolling back %s: %s", arrayList3, targetAlias.name(), e.getMessage());
                    rollBackEnable(targetAlias);
                    if (z) {
                        Log.w("AppIconManager", "Rolled back switch to %s after an earlier SUCCESS metric was already recorded for it", targetAlias.name());
                    }
                    this.iconMetrics.recordError(AlexaMetricsConstants.MetricEvents.APP_ICON_SWITCH_ERROR, "AppIconManager");
                }
            } catch (Exception e2) {
                Log.e("AppIconManager", "Failed to enable app icon %s: %s", targetAlias.name(), e2.getMessage());
                this.iconMetrics.recordError(AlexaMetricsConstants.MetricEvents.APP_ICON_SWITCH_ERROR, "AppIconManager");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void switchToClassic() {
        AppIconAlias currentActiveAlias = getCurrentActiveAlias();
        AppIconAlias appIconAlias = AppIconAlias.CLASSIC;
        if (currentActiveAlias != appIconAlias) {
            appIconAlias = AppIconAlias.CLONE_CLASSIC;
        }
        switchTo(appIconAlias);
    }

    public final synchronized boolean switchToIfPossible(@NotNull AppIconAlias targetAlias) {
        targetAlias.getClass();
        if (willCauseAppKill(targetAlias)) {
            return false;
        }
        switchTo(targetAlias);
        return true;
    }

    public final synchronized boolean willCauseAppKill(@NotNull AppIconAlias targetAlias) {
        targetAlias.getClass();
        return hasEnabledManifestDefaultStray(targetAlias);
    }

    @VisibleForTesting
    public AppIconManager(@NotNull AliasStateAccessor aliasStateAccessor, @NotNull IconMetrics iconMetrics) {
        aliasStateAccessor.getClass();
        iconMetrics.getClass();
        this.stateAccessor = aliasStateAccessor;
        this.iconMetrics = iconMetrics;
    }
}
