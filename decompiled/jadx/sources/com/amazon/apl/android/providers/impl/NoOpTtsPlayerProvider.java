package com.amazon.apl.android.providers.impl;

import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.ITtsPlayer;
import com.amazon.apl.android.dependencies.ITtsSourceProvider;
import com.amazon.apl.android.dependencies.impl.NoOpTtsPlayer;
import com.amazon.apl.android.providers.ITtsPlayerProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpTtsPlayerProvider implements ITtsPlayerProvider {
    private static final String TAG = "NoOpTtsPlayerProvider";

    @Override // com.amazon.apl.android.providers.ITtsPlayerProvider
    @NonNull
    public ITtsPlayer getPlayer() throws IllegalStateException {
        return new NoOpTtsPlayer();
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
    }

    @Override // com.amazon.apl.android.providers.ITtsPlayerProvider
    public void prepare(String str, @NonNull ITtsSourceProvider iTtsSourceProvider) {
    }
}
