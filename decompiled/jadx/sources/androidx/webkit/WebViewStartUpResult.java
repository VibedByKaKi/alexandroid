package androidx.webkit;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@WebViewCompat.ExperimentalAsyncStartUp
/* loaded from: classes14.dex */
public interface WebViewStartUpResult {
    @Nullable
    @SuppressLint({"NullableCollection"})
    List<BlockingStartUpLocation> getBlockingStartUpLocations();

    @Nullable
    @SuppressLint({"AutoBoxing"})
    Long getMaxTimePerTaskInUiThreadMillis();

    @Nullable
    @SuppressLint({"AutoBoxing"})
    Long getTotalTimeInUiThreadMillis();
}
