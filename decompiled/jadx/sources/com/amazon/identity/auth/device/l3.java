package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import com.amazon.identity.auth.device.api.MAPFuture;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface l3 {
    MAPAgeClassificationManager.AgeClassification a(Bundle bundle);

    MAPFuture a(Integer num, Integer num2, Bundle bundle, Callback callback);

    void a();

    void a(MAPAgeClassificationManager.AgeClassificationListener ageClassificationListener);

    boolean a(ArrayList arrayList, ArrayList arrayList2);

    MAPAgeClassificationManager.AgeSignalCategory b();
}
