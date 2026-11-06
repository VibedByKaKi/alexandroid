package com.amazon.identity.auth.device;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class cr implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f567a;

    public cr(boolean z) {
        this.f567a = z;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        xe xeVar;
        Activity activity;
        Window window;
        int systemBars = WindowInsetsCompat.Type.systemBars();
        if (this.f567a) {
            systemBars |= WindowInsetsCompat.Type.ime();
        }
        Insets insets = windowInsetsCompat.getInsets(systemBars);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = insets.top;
        marginLayoutParams.leftMargin = insets.left;
        marginLayoutParams.bottomMargin = insets.bottom;
        marginLayoutParams.rightMargin = insets.right;
        view.setLayoutParams(marginLayoutParams);
        synchronized (xe.class) {
            xeVar = xe.b;
        }
        if (xeVar != null && xeVar.f1068a != 0) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity != null && (window = activity.getWindow()) != null) {
                window.getDecorView().setBackgroundColor(xeVar.f1068a);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
