package com.amazon.alexa.ra.apl.fragments.extensions;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.apl.fragments.data.APLFragmentData;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.apl.android.LegacyLocalExtension;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0006\u0010\u0010\u001a\u00020\u0003J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005JL\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/extensions/AssetAuthExtension;", "Lcom/amazon/apl/android/LegacyLocalExtension;", "fragment", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "authToken", "", "<init>", "(Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;Ljava/lang/String;)V", "isAuthExtensionRegistered", "", "isAuthExtensionRegistered$annotations", "()V", "()Z", "setAuthExtensionRegistered", "(Z)V", "getUri", "getFragment", "getEnvironment", "", "", "onRegistered", "", "uri", "token", "getAuthTokenForURL", "imageURl", "onExtensionEvent", "name", "source", "properties", "callback", "Lcom/amazon/apl/android/dependencies/IExtensionEventCallback$IExtensionEventCallbackResult;", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAssetAuthExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetAuthExtension.kt\ncom/amazon/alexa/ra/apl/fragments/extensions/AssetAuthExtension\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1611#2,9:126\n1863#2:135\n1864#2:137\n1620#2:138\n774#2:140\n865#2,2:141\n1#3:136\n1#3:139\n*S KotlinDebug\n*F\n+ 1 AssetAuthExtension.kt\ncom/amazon/alexa/ra/apl/fragments/extensions/AssetAuthExtension\n*L\n51#1:126,9\n51#1:135\n51#1:137\n51#1:138\n82#1:140\n82#1:141,2\n51#1:136\n*E\n"})
/* loaded from: classes18.dex */
public final class AssetAuthExtension extends LegacyLocalExtension {
    public static final int $stable = 8;

    @NotNull
    private final String authToken;

    @NotNull
    private final APLFragmentData fragment;
    private boolean isAuthExtensionRegistered;

    public AssetAuthExtension(@NotNull APLFragmentData aPLFragmentData, @NotNull String str) {
        aPLFragmentData.getClass();
        str.getClass();
        this.fragment = aPLFragmentData;
        this.authToken = str;
    }

    @NotNull
    public final String getAuthTokenForURL(@NotNull String imageURl) {
        ArrayList arrayList;
        imageURl.getClass();
        String str = "";
        if (this.isAuthExtensionRegistered) {
            URL url = new URL(imageURl);
            List<Map<String, String>> authorities = this.fragment.getAuthorities();
            if (authorities != null) {
                arrayList = new ArrayList();
                for (Object obj : authorities) {
                    if (Intrinsics.areEqual(((Map) obj).get("type"), "AMAZON_ANY")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) ((Map) it2.next()).get("host");
                    if (str2 == null || str2.length() == 0 || url.getHost().equals(str2)) {
                        str = this.authToken;
                    }
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // com.amazon.apl.android.providers.IExtension
    @NotNull
    public Map<String, Object> getEnvironment() {
        ?? emptyList;
        List<Map<String, String>> authorities = this.fragment.getAuthorities();
        if (authorities != null) {
            emptyList = new ArrayList();
            Iterator it2 = authorities.iterator();
            while (it2.hasNext()) {
                String str = (String) ((Map) it2.next()).get("type");
                if (str != null) {
                    emptyList.add(str);
                }
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        Collection collection = (Collection) emptyList;
        if (collection.isEmpty()) {
            collection = CollectionsKt.listOf("AMAZON_ANY");
        }
        return MapsKt.mapOf(TuplesKt.to("version", "1.0"), TuplesKt.to(Content.AUTHORITIES, (List) collection));
    }

    @NotNull
    public final APLFragmentData getFragment() {
        return this.fragment;
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NotNull
    public String getUri() {
        return "aplext:assetauthentication:10";
    }

    /* renamed from: isAuthExtensionRegistered, reason: from getter */
    public final boolean getIsAuthExtensionRegistered() {
        return this.isAuthExtensionRegistered;
    }

    @Override // com.amazon.apl.android.dependencies.IExtensionEventCallback
    public void onExtensionEvent(@Nullable String name, @Nullable String uri, @NotNull Map<String, ? extends Object> source, @NotNull Map<String, ? extends Object> properties, @NotNull IExtensionEventCallback.IExtensionEventCallbackResult callback) {
        source.getClass();
        properties.getClass();
        callback.getClass();
    }

    @Override // com.amazon.apl.android.ILegacyLocalExtension
    public void onRegistered(@Nullable String uri, @Nullable String token) {
        if (Intrinsics.areEqual(uri, "aplext:assetauthentication:10")) {
            this.isAuthExtensionRegistered = true;
        }
    }

    public final void setAuthExtensionRegistered(boolean z) {
        this.isAuthExtensionRegistered = z;
    }

    @VisibleForTesting
    public static /* synthetic */ void isAuthExtensionRegistered$annotations() {
    }
}
