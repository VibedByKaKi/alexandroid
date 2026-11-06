package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.ReplaceWith;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes13.dex */
public final class ListViewCompat {
    private ListViewCompat() {
    }

    @ReplaceWith(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean canScrollList(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    @ReplaceWith(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void scrollListBy(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
