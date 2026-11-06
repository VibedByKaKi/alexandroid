package com.amazon.blueshift.bluefront.android.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class URLWrapper {
    private final URL mUrl;

    public URLWrapper(String str) throws MalformedURLException {
        this.mUrl = new URL(str);
    }

    public URLConnection openConnection() throws IOException {
        return this.mUrl.openConnection();
    }

    public String toString() {
        return this.mUrl.toString();
    }
}
