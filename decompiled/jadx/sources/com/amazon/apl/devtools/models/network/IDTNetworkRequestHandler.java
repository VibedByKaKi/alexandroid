package com.amazon.apl.devtools.models.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.apl.utils.Constants;
import com.amazon.apl.devtools.enums.DTNetworkRequestType;
import com.amazon.apl.devtools.util.IdGenerator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IDTNetworkRequestHandler {
    public static final IdGenerator IdGenerator = new IdGenerator();
    public static final Set<String> VALID_URL_SCHEMES;

    static {
        Object[] objArr = {"https", "http"};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(obj, "duplicate element: "));
                return;
            }
        }
        VALID_URL_SCHEMES = Collections.unmodifiableSet(hashSet);
    }

    static String getDefaultPackageUrl(@NonNull String str, @NonNull String str2) {
        return a$$ExternalSyntheticOutline0.m(Constants.PACKAGE_LOCATION_PREFIX, str, "/", str2, "/document.json");
    }

    static boolean isUrlRequest(@Nullable String str) {
        String scheme;
        return (str == null || (scheme = Uri.parse(str).getScheme()) == null || !VALID_URL_SCHEMES.contains(scheme.toLowerCase())) ? false : true;
    }

    void loadingFailed(int i, double d);

    void loadingFinished(int i, double d, int i2);

    void requestWillBeSent(int i, double d, String str, DTNetworkRequestType dTNetworkRequestType);
}
