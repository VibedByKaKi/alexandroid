package com.amazon.alexa.ra.core.auth;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.features.user.UserSourceApi;
import com.amazon.alexa.ra.core.ui.fragments.AuthTokenProvider;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010\u0018\u00010\u000fH\u0016J4\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00100\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/auth/CardsAuthenticationManager;", "Lcom/amazon/alexa/ra/core/ui/fragments/AuthTokenProvider;", "userSourceApi", "Lcom/amazon/alexa/ra/core/features/user/UserSourceApi;", "<init>", "(Lcom/amazon/alexa/ra/core/features/user/UserSourceApi;)V", "tokenAvailable", "Lkotlinx/coroutines/flow/StateFlow;", "", "getTokenAvailable", "()Lkotlinx/coroutines/flow/StateFlow;", "getAuthTokenForUrl", "", "url", Content.AUTHORITIES, "", "", "getTokenIfAuthorized", "authToken", "imageUrl", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardsAuthenticationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsAuthenticationManager.kt\ncom/amazon/alexa/ra/core/auth/CardsAuthenticationManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1755#2,3:96\n774#2:99\n865#2,2:100\n*S KotlinDebug\n*F\n+ 1 CardsAuthenticationManager.kt\ncom/amazon/alexa/ra/core/auth/CardsAuthenticationManager\n*L\n56#1:96,3\n69#1:99\n69#1:100,2\n*E\n"})
/* loaded from: classes18.dex */
public final class CardsAuthenticationManager implements AuthTokenProvider {

    @NotNull
    private static final String AMAZON_ANY = "AMAZON_ANY";

    @NotNull
    private static final String HOST_KEY = "host";

    @NotNull
    private static final String SMART_FRAGMENT = "SMART_FRAGMENT";

    @NotNull
    private static final String TAG = "CardsAuthenticationManager";

    @NotNull
    private static final String TYPE_KEY = "type";

    @NotNull
    private final StateFlow<Boolean> tokenAvailable;

    @NotNull
    private final UserSourceApi userSourceApi;
    public static final int $stable = 8;

    public CardsAuthenticationManager(@NotNull UserSourceApi userSourceApi) {
        userSourceApi.getClass();
        this.userSourceApi = userSourceApi;
        this.tokenAvailable = new CardsAuthenticationManager$tokenAvailable$1(this);
    }

    private final String getTokenIfAuthorized(String authToken, String imageUrl, List<? extends Map<String, String>> authorities) {
        URL url = new URL(imageUrl);
        ArrayList arrayList = new ArrayList();
        for (Object obj : authorities) {
            if (Intrinsics.areEqual(((Map) obj).get("type"), AMAZON_ANY)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) ((Map) it2.next()).get(HOST_KEY);
            if (str == null || str.length() == 0 || Intrinsics.areEqual(url.getHost(), str)) {
                return authToken;
            }
        }
        return null;
    }

    @Override // com.amazon.alexa.ra.core.ui.fragments.AuthTokenProvider
    @Nullable
    public String getAuthTokenForUrl(@NotNull String url, @Nullable List<? extends Map<String, String>> authorities) {
        List<? extends Map<String, String>> list;
        url.getClass();
        this.userSourceApi.refreshAuthToken();
        String value = this.userSourceApi.getAuthToken().getValue();
        if (value == null || (list = authorities) == null || list.isEmpty()) {
            Log.e(TAG, "getAuthTokenForUrl: token unavailable. hasToken=" + (value != null) + ", authoritiesCount=" + (authorities != null ? authorities.size() : 0));
            return null;
        }
        List<? extends Map<String, String>> list2 = authorities;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((Map) it2.next()).get("type"), SMART_FRAGMENT)) {
                    return value;
                }
            }
        }
        return getTokenIfAuthorized(value, url, authorities);
    }

    @Override // com.amazon.alexa.ra.core.ui.fragments.AuthTokenProvider
    @NotNull
    public StateFlow<Boolean> getTokenAvailable() {
        return this.tokenAvailable;
    }
}
