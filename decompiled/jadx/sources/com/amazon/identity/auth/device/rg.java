package com.amazon.identity.auth.device;

import android.content.Intent;
import android.os.Bundle;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface rg {
    String a();

    void a(Intent intent, String str);

    void a(Bundle bundle, Bundle bundle2);

    void a(String str, Intent intent, String str2);

    void a(String str, HashSet hashSet, Intent intent, String str2);

    boolean a(String str);

    MultipleAccountManager.AccountMappingType[] a(int i, String str);

    void b(Intent intent, String str);
}
