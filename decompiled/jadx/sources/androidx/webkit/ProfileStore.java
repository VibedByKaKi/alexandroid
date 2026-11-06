package androidx.webkit;

import androidx.annotation.UiThread;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes14.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return ProfileStoreImpl.getInstance();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    Profile getOrCreateProfile(String str);

    Profile getProfile(String str);
}
