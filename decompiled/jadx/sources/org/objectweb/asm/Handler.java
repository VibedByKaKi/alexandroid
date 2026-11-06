package org.objectweb.asm;

/* loaded from: classes11.dex */
class Handler {

    /* renamed from: a, reason: collision with root package name */
    Label f1182a;
    Label b;
    Label c;
    String d;
    int e;
    Handler f;

    public static Handler a(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        Handler a2 = a(handler.f, label, label2);
        handler.f = a2;
        int i = handler.f1182a.c;
        int i2 = handler.b.c;
        int i3 = label.c;
        int i4 = label2 == null ? Integer.MAX_VALUE : label2.c;
        if (i3 < i2 && i4 > i) {
            if (i3 <= i) {
                if (i4 >= i2) {
                    return a2;
                }
                handler.f1182a = label2;
                return handler;
            }
            if (i4 >= i2) {
                handler.b = label;
                return handler;
            }
            Handler handler2 = new Handler();
            handler2.f1182a = label2;
            handler2.b = handler.b;
            handler2.c = handler.c;
            handler2.d = handler.d;
            handler2.e = handler.e;
            handler2.f = handler.f;
            handler.b = label;
            handler.f = handler2;
        }
        return handler;
    }
}
