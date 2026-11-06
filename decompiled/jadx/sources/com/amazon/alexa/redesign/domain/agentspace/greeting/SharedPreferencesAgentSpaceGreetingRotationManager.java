package com.amazon.alexa.redesign.domain.agentspace.greeting;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.agentforward.network.GreetingItemDomain;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Singleton
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0002J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/SharedPreferencesAgentSpaceGreetingRotationManager;", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceGreetingRotationManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "advance", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "listKey", "", "scopeKey", "list", "", "canResolve", "Lkotlin/Function1;", "", "resetAll", "", "enforceTtl", "nowMillis", "", "encode", PermissionsResponse.SCOPE_KEY, "shownIds", "", "decode", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/ScopedShownSet;", "raw", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SharedPreferencesAgentSpaceGreetingRotationManager implements AgentSpaceGreetingRotationManager {
    private static final char ID_DELIM = ',';

    @NotNull
    public static final String KEY_LAST_FULL_WIPE_MS = "_last_full_wipe_ms";

    @NotNull
    public static final String PREFS_NAME = "agent_space_greeting_rotation";
    private static final char SCOPE_DELIM = '|';

    @NotNull
    private final SharedPreferences prefs;
    public static final int $stable = 8;

    @Inject
    public SharedPreferencesAgentSpaceGreetingRotationManager(@NotNull Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r4 = kotlin.text.StringsKt__StringsKt.indexOf$default(r5, com.amazon.alexa.redesign.domain.agentspace.greeting.SharedPreferencesAgentSpaceGreetingRotationManager.SCOPE_DELIM, 0, false, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.amazon.alexa.redesign.domain.agentspace.greeting.ScopedShownSet decode(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L3f
            int r4 = r5.length()
            if (r4 != 0) goto L9
            goto L3f
        L9:
            r4 = 124(0x7c, float:1.74E-43)
            r0 = 0
            r1 = 6
            int r4 = kotlin.text.StringsKt.indexOf$default(r4, r5, r0, r1)
            if (r4 >= 0) goto L14
            goto L3f
        L14:
            java.lang.String r2 = r5.substring(r0, r4)
            r3 = 1
            int r4 = r4 + r3
            java.lang.String r4 = r5.substring(r4)
            int r5 = r4.length()
            if (r5 != 0) goto L29
            java.util.Set r4 = kotlin.collections.SetsKt.emptySet()
            goto L39
        L29:
            char[] r5 = new char[r3]
            r3 = 44
            r5[r0] = r3
            java.util.List r4 = kotlin.text.StringsKt.split$default(r4, r5, r0, r1)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = kotlin.collections.CollectionsKt.toSet(r4)
        L39:
            com.amazon.alexa.redesign.domain.agentspace.greeting.ScopedShownSet r5 = new com.amazon.alexa.redesign.domain.agentspace.greeting.ScopedShownSet
            r5.<init>(r2, r4)
            return r5
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.redesign.domain.agentspace.greeting.SharedPreferencesAgentSpaceGreetingRotationManager.decode(java.lang.String):com.amazon.alexa.redesign.domain.agentspace.greeting.ScopedShownSet");
    }

    private final String encode(String scope, Set<String> shownIds) {
        return a$$ExternalSyntheticOutline0.m$1(scope, "|", CollectionsKt.joinToString$default(shownIds, ",", null, null, null, 62));
    }

    @Override // com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceGreetingRotationManager
    @Nullable
    public synchronized GreetingItemDomain advance(@NotNull String listKey, @NotNull String scopeKey, @Nullable List<GreetingItemDomain> list, @NotNull Function1<? super GreetingItemDomain, Boolean> canResolve) {
        GreetingItemDomain component1;
        listKey.getClass();
        scopeKey.getClass();
        canResolve.getClass();
        Pair<GreetingItemDomain, ScopedShownSet> decideRotationPick = AgentSpaceGreetingRotationManagerKt.decideRotationPick(list, scopeKey, decode(this.prefs.getString(listKey, null)), canResolve);
        component1 = decideRotationPick.component1();
        ScopedShownSet component2 = decideRotationPick.component2();
        if (component2 != null) {
            this.prefs.edit().putString(listKey, encode(component2.getScope(), component2.getShownIds())).apply();
        }
        return component1;
    }

    @Override // com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceGreetingRotationManager
    public synchronized void enforceTtl(long nowMillis) {
        long j = this.prefs.getLong(KEY_LAST_FULL_WIPE_MS, -1L);
        if (j < 0) {
            this.prefs.edit().putLong(KEY_LAST_FULL_WIPE_MS, nowMillis).apply();
        } else {
            if (nowMillis - j >= 1296000000) {
                this.prefs.edit().clear().putLong(KEY_LAST_FULL_WIPE_MS, nowMillis).apply();
            }
        }
    }

    @Override // com.amazon.alexa.redesign.domain.agentspace.greeting.AgentSpaceGreetingRotationManager
    public synchronized void resetAll() {
        this.prefs.edit().clear().apply();
    }
}
