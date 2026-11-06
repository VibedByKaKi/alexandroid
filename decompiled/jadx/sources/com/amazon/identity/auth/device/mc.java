package com.amazon.identity.auth.device;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.framework.RemoteMAPException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class mc {
    public static final Uri h = Uri.parse("content://com.amazon.map.generic_ipc");
    public static final Uri i = Uri.parse("content://com.amazon.map.generic_ipc.directboot");
    public static final String[] j = {"bundle_value"};
    public static ic k;

    /* renamed from: a, reason: collision with root package name */
    public final qn f807a;
    public final ic b;
    public final hl c;
    public final String d;
    public final String e;
    public final SparseIntArray f;
    public final Context g;

    public mc(Context context, String str, String str2, Integer num) {
        ic icVar;
        qn qnVar = new qn(context);
        synchronized (mc.class) {
            icVar = k;
            if (icVar == null) {
                icVar = new ic(context, fp.f623a);
                k = icVar;
            }
        }
        hl hlVar = new hl(context);
        this.f807a = qnVar;
        this.b = icVar;
        this.d = str;
        this.e = str2;
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f = sparseIntArray;
        sparseIntArray.put(500, num.intValue());
        this.c = hlVar;
        this.g = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6 A[Catch: all -> 0x0024, TryCatch #2 {all -> 0x0024, blocks: (B:3:0x000e, B:4:0x001a, B:9:0x0020, B:12:0x00c6, B:14:0x00e2, B:16:0x0111, B:19:0x0166, B:21:0x016e, B:25:0x012d, B:27:0x0131, B:30:0x013b, B:33:0x002a, B:35:0x002b, B:38:0x0033, B:40:0x003b, B:43:0x0067, B:49:0x0080, B:46:0x009f, B:56:0x01a9, B:57:0x01aa, B:6:0x001b, B:32:0x0027), top: B:2:0x000e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016e A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #2 {all -> 0x0024, blocks: (B:3:0x000e, B:4:0x001a, B:9:0x0020, B:12:0x00c6, B:14:0x00e2, B:16:0x0111, B:19:0x0166, B:21:0x016e, B:25:0x012d, B:27:0x0131, B:30:0x013b, B:33:0x002a, B:35:0x002b, B:38:0x0033, B:40:0x003b, B:43:0x0067, B:49:0x0080, B:46:0x009f, B:56:0x01a9, B:57:0x01aa, B:6:0x001b, B:32:0x0027), top: B:2:0x000e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d A[Catch: all -> 0x0024, TryCatch #2 {all -> 0x0024, blocks: (B:3:0x000e, B:4:0x001a, B:9:0x0020, B:12:0x00c6, B:14:0x00e2, B:16:0x0111, B:19:0x0166, B:21:0x016e, B:25:0x012d, B:27:0x0131, B:30:0x013b, B:33:0x002a, B:35:0x002b, B:38:0x0033, B:40:0x003b, B:43:0x0067, B:49:0x0080, B:46:0x009f, B:56:0x01a9, B:57:0x01aa, B:6:0x001b, B:32:0x0027), top: B:2:0x000e, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a(java.lang.Class r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.mc.a(java.lang.Class, android.os.Bundle):android.os.Bundle");
    }

    public final void a(Class cls, Bundle bundle, Callback callback) {
        gg ggVar = new gg(jg.c("GenericIPCSender", cls.getSimpleName()), new jc(this, callback));
        ic icVar = this.b;
        kc kcVar = new kc(ggVar, bundle, cls, icVar);
        synchronized (icVar) {
            if (!icVar.b()) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("ipc_error_code_key", 500);
                bundle2.putString("ipc_error_code_message", "Got an error while calling Generic IPC central store.");
                kcVar.onError(bundle2);
                return;
            }
            icVar.a((e7) kcVar);
        }
    }

    public final Bundle a(Bundle bundle, Uri uri) {
        try {
            return (Bundle) this.f807a.a(uri, new hc(uri, zj.a(bundle)));
        } catch (RemoteMAPException e) {
            Log.e(yf.a("GenericIPCSender"), "Got an error while calling Generic IPC central store. This can happen in certain edge cases around a crash.", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("ipc_error_code_key", 500);
            bundle2.putString("ipc_error_code_message", "Got an error while calling Generic IPC central store.");
            return bundle2;
        }
    }
}
