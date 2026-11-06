package com.amazon.alexa.enrollment.ui.kidsenrollment;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.enrollment.R;
import com.amazon.alexa.enrollment.ui.AbstractBottomSheetFragment;
import com.amazon.alexa.enrollment.ui.training.EnrollmentTrainingActivity;
import com.amazon.alexa.enrollment.utils.PermissionsHelper;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class KidsEnrollmentViewModel {
    private static final String TAG = "VoxEn_KidsEnrollmentViewModel";
    private Context context;
    private PermissionsHelper permissionsHelper;

    @Inject
    public KidsEnrollmentViewModel(Context context, PermissionsHelper permissionsHelper) {
        this.context = context;
        this.permissionsHelper = permissionsHelper;
    }

    @VisibleForTesting
    public Intent getActivityIntent(AbstractBottomSheetFragment abstractBottomSheetFragment) {
        return abstractBottomSheetFragment.getActivity().getIntent();
    }

    @VisibleForTesting
    public String getStringResources(AbstractBottomSheetFragment abstractBottomSheetFragment, int i) {
        return abstractBottomSheetFragment.getString(i);
    }

    public boolean isAudioPermissionGranted() {
        return this.permissionsHelper.checkPermission(this.context, "android.permission.RECORD_AUDIO");
    }

    public void moveToTrainingScreen(AbstractBottomSheetFragment abstractBottomSheetFragment) {
        Log.i(TAG, "Moving to enrollment training screens");
        Intent intent = new Intent(abstractBottomSheetFragment.getContext(), (Class<?>) EnrollmentTrainingActivity.class);
        intent.putExtras(getActivityIntent(abstractBottomSheetFragment));
        startActivityAndFinish(abstractBottomSheetFragment, intent);
    }

    public void requestAudioPermission(AbstractBottomSheetFragment abstractBottomSheetFragment, int i) {
        requestPermission(abstractBottomSheetFragment, getStringResources(abstractBottomSheetFragment, R.string.permission_title), getStringResources(abstractBottomSheetFragment, R.string.permission_message), new String[]{"android.permission.RECORD_AUDIO"}, i);
    }

    @VisibleForTesting
    public void requestPermission(AbstractBottomSheetFragment abstractBottomSheetFragment, String str, String str2, String[] strArr, int i) {
        this.permissionsHelper.requestPermission(abstractBottomSheetFragment, str, str2, strArr, i);
    }

    @VisibleForTesting
    public void startActivityAndFinish(AbstractBottomSheetFragment abstractBottomSheetFragment, Intent intent) {
        abstractBottomSheetFragment.getActivity().startActivity(intent);
        abstractBottomSheetFragment.getActivity().finish();
    }
}
