package com.amazon.apl.android.dependencies;

import java.io.InputStream;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ITtsSourceProvider {
    void onSource(InputStream inputStream);

    void onSource(URL url);
}
