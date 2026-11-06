package com.amazon.identity.auth.device;

import android.net.Uri;
import com.amazon.identity.auth.accounts.CentralAccountManagerCommunication$RegisterChildApplication;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class qa {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f896a = Uri.withAppendedPath(ra.f915a, "device_info");

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CentralAccountManagerCommunication$RegisterChildApplication.KEY_DEVICE_TYPE);
        arrayList.add("dsn");
        Collections.unmodifiableList(arrayList);
    }
}
