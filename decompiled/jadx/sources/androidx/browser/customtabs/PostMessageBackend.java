package androidx.browser.customtabs;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public interface PostMessageBackend {
    void onDisconnectChannel(@NonNull Context context);

    boolean onNotifyMessageChannelReady(@Nullable Bundle bundle);

    boolean onPostMessage(@NonNull String str, @Nullable Bundle bundle);
}
