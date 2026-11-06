package com.amazon.deecomms.common.ui;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.amazon.deecomms.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DropInDiscoverabilityDialogBuilder extends CustomDialogBuilder {
    public DropInDiscoverabilityDialogBuilder(@NonNull Activity activity) {
        super(activity);
        this.layoutResId = Integer.valueOf(R.layout.drop_in_discoverability_dialog);
    }

    @Override // com.amazon.deecomms.common.ui.CustomDialogBuilder
    public AppCompatDialog build() {
        disableTitleBar(true);
        withTitle(R.string.drop_in_discover_title);
        withBody(R.string.drop_in_discover_body);
        AppCompatDialog build = super.build();
        CommsTextView commsTextView = (CommsTextView) build.findViewById(R.id.point_one);
        CommsTextView commsTextView2 = (CommsTextView) build.findViewById(R.id.point_two);
        commsTextView.setText(R.string.drop_in_discover_point_one);
        commsTextView2.setText(R.string.drop_in_discover_point_two);
        return build;
    }
}
