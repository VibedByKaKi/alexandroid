package com.amazon.apl.android.providers;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.apl.android.IDocumentLifecycleListener;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.android.dependencies.ITtsSourceProvider;
import com.amazon.apl.android.media.TextTrack;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ITtsPlayerProvider extends IDocumentLifecycleListener {
    public static final String TAG = "ITtsPlayerProvider";

    @NonNull
    ITtsPlayer getPlayer();

    default void prepare(@NonNull String str, TextTrack textTrack) {
        if (textTrack != null) {
            Log.i(TAG, "TextTrack not supported, ignored");
        }
        prepare(str);
    }

    default void prepare(@NonNull String str, @NonNull ITtsSourceProvider iTtsSourceProvider) throws IOException {
    }

    default void prepare(@NonNull String str) {
    }
}
