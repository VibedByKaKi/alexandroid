package com.amazon.blueshift.bluefront.android.http;

import android.net.Uri;
import com.amazon.blueshift.bluefront.android.common.BluefrontCredential;
import java.net.MalformedURLException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SigningProtocol {
    URLWrapper sign(Uri uri, BluefrontCredential bluefrontCredential) throws MalformedURLException;
}
