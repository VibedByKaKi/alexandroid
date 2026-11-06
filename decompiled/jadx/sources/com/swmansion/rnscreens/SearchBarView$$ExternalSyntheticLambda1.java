package com.swmansion.rnscreens;

import android.view.View;
import android.widget.EditText;
import com.amazon.alexa.biloba.view.alertsv2.edit.EditAlertView;
import com.amazon.apl.android.scenegraph.edittext.APLEditLayer;
import com.amazon.apl.android.sgcontent.EditTextNode;
import com.amazon.comms.calling.presentation.ui.RealTimeTextViewHolder;
import com.amazon.deecomms.calling.accessibility.RealTimeTextView;
import com.google.android.material.datepicker.DateSelector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SearchBarView$$ExternalSyntheticLambda1 implements View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SearchBarView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((SearchBarView) obj).handleFocusChange(z);
                break;
            case 1:
                ((EditAlertView) obj).lambda$initializeWidgets$1(view, z);
                break;
            case 2:
                APLEditLayer.lambda$initWithLayer$0((EditTextNode) obj, view, z);
                break;
            case 3:
                RealTimeTextViewHolder.setUpListeners$lambda$3((RealTimeTextViewHolder) obj, view, z);
                break;
            case 4:
                ((RealTimeTextView) obj).lambda$setListeners$3(view, z);
                break;
            default:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0((EditText[]) obj, view, z);
                break;
        }
    }
}
