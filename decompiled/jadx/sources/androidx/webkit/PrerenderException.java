package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@WebViewCompat.ExperimentalUrlPrerender
/* loaded from: classes14.dex */
public class PrerenderException extends Exception {
    public PrerenderException(@NonNull String str, @Nullable Throwable th) {
        super(str, th);
    }
}
