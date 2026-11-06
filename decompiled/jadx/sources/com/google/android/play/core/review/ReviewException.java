package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.review.model.zza.zza(i))));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
