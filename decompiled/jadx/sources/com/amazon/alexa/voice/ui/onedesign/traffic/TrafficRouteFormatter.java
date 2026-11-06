package com.amazon.alexa.voice.ui.onedesign.traffic;

import android.content.Context;
import android.content.res.Resources;
import com.amazon.alexa.vox.ui.onedesign.R;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TrafficRouteFormatter implements RouteFormatter {
    private final Resources resources;

    public TrafficRouteFormatter(Context context) {
        this.resources = context.getResources();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.traffic.RouteFormatter
    public CharSequence format(CharSequence charSequence, List<? extends CharSequence> list) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        Resources resources = this.resources;
        return size == 1 ? resources.getQuantityString(R.plurals.voice_ui_od_traffic_route, 1, list.get(0), charSequence) : resources.getQuantityString(R.plurals.voice_ui_od_traffic_route, 2, list.get(0), list.get(1), charSequence);
    }
}
