package com.amazon.alexa.biloba.view.cards;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.biloba.dependency.BilobaDependencies;
import com.amazon.alexa.biloba.storage.CardsStore;
import com.amazon.alexa.biloba.view.common.DismissHandler;
import com.amazon.alexa.mosaic.view.ListItem;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DashboardBottomSheet extends BottomSheetDialogFragment implements DismissHandler {
    private final String cardId;

    @Inject
    Lazy<CardsStore> cardsStore;
    private final SharedPreferences sharedPreferences;

    @VisibleForTesting
    DialogInterface.OnShowListener showListener;

    public DashboardBottomSheet(String str, SharedPreferences sharedPreferences) {
        BilobaDependencies.inject(this);
        this.cardId = str;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateDialog$2(DialogInterface dialogInterface) {
        BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(R.id.design_bottom_sheet)).setState(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        handleDismiss(view);
        dismiss();
    }

    @Override // com.amazon.alexa.biloba.view.common.DismissHandler
    public void handleDismiss(View view) {
        this.cardsStore.get().dismissCard(this.cardId, this.sharedPreferences);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, com.amazon.alexa.biloba.R.style.TransparentBottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(bundle);
        if (this.showListener == null) {
            this.showListener = new DashboardBottomSheet$$ExternalSyntheticLambda0();
        }
        bottomSheetDialog.setOnShowListener(this.showListener);
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View inflate = layoutInflater.inflate(com.amazon.alexa.biloba.R.layout.bottom_sheet, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(com.amazon.alexa.biloba.R.id.bottom_sheet_cancel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.biloba.view.cards.DashboardBottomSheet$$ExternalSyntheticLambda1
            public final /* synthetic */ DashboardBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DashboardBottomSheet dashboardBottomSheet = this.f$0;
                switch (i2) {
                    case 0:
                        dashboardBottomSheet.lambda$onCreateView$0(view);
                        break;
                    default:
                        dashboardBottomSheet.lambda$onCreateView$1(view);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((ListItem) inflate.findViewById(com.amazon.alexa.biloba.R.id.bottom_sheet_menu_dismiss)).setOnClickListener(new View.OnClickListener(this) { // from class: com.amazon.alexa.biloba.view.cards.DashboardBottomSheet$$ExternalSyntheticLambda1
            public final /* synthetic */ DashboardBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                DashboardBottomSheet dashboardBottomSheet = this.f$0;
                switch (i22) {
                    case 0:
                        dashboardBottomSheet.lambda$onCreateView$0(view);
                        break;
                    default:
                        dashboardBottomSheet.lambda$onCreateView$1(view);
                        break;
                }
            }
        });
        return inflate;
    }

    @VisibleForTesting
    public DashboardBottomSheet(String str, SharedPreferences sharedPreferences, Lazy<CardsStore> lazy) {
        this.cardId = str;
        this.sharedPreferences = sharedPreferences;
        this.cardsStore = lazy;
    }
}
