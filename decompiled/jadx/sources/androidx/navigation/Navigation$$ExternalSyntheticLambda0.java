package androidx.navigation;

import android.view.View;
import com.amazon.alexa.aamb.cbl.CblActivity;
import com.amazon.alexa.aamb.cbl.CblViewModel;
import com.amazon.alexa.accessory.frames.media.MediaAdapter;
import com.amazon.alexa.apl.APLViewController;
import com.amazon.alexa.biloba.view.account.MembershipView;
import com.amazon.alexa.biloba.view.account.ProfileSettingsView;
import com.amazon.alexa.biloba.view.common.recycler.RadioRecyclerViewAdapter;
import com.amazon.alexa.biloba.view.comms.CommsSetupInstructionsView;
import com.amazon.alexa.enrollment.ui.complete.EnrollmentCompleteViewFragment;
import com.amazon.alexa.enrollment.ui.privacySettings.EnrollmentPrivacyTermsViewFragment;
import com.amazon.alexa.growth.coachmark.CoachMark;
import com.amazon.alexa.hho.imagepicker.ImageCropActivity;
import com.amazon.alexa.mosaic.view.NoticeBannerView;
import com.amazon.alexa.navigation.menu.model.MenuItem;
import com.amazon.alexa.navigation.menu.viewcontroller.SmartHomeNavigationViewController;
import com.amazon.alexa.redesign.debug.menu.DebugMenuController;
import com.amazon.alexa.redesign.view.errorPage.ErrorPage;
import com.amazon.alexa.redesign.view.viewtypes.ExpandableSectionHeaderView;
import com.amazon.alexa.smarthomecameras.view.LandscapeCameraView;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetChatNavCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetHintViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetInAppLinkCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetOverFlowViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetPillResultViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetRequestViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetResponseViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetSuggestionsViewHolder;
import com.amazon.alexa.voice.ui.onedesign.calendar.CalendarController;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Navigation$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Navigation$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Navigation.createNavigateOnClickListener$lambda$1((NavDirections) obj, view);
                break;
            case 1:
                ((CblActivity) obj).lambda$InitializeViewModel$1(view);
                break;
            case 2:
                ((CblViewModel) obj).setCblFlow(0);
                break;
            case 3:
                ((MediaAdapter.MediaViewHolder) obj).lambda$setPreviewOverflowCount$0(view);
                break;
            case 4:
                APLViewController.onCreateView$lambda$0((APLViewController) obj, view);
                break;
            case 5:
                ((MembershipView) obj).lambda$getDeleteConnectionLinkText$0(view);
                break;
            case 6:
                ((ProfileSettingsView) obj).lambda$buildToManageClickableSpan$0(view);
                break;
            case 7:
                ((RadioRecyclerViewAdapter.RadioRecyclerItemViewHolder) obj).lambda$bind$0(view);
                break;
            case 8:
                ((CommsSetupInstructionsView) obj).lambda$getResendLinkText$0(view);
                break;
            case 9:
                ((EnrollmentCompleteViewFragment) obj).finishActivity(view);
                break;
            case 10:
                ((EnrollmentPrivacyTermsViewFragment) obj).lambda$onCreateView$0(view);
                break;
            case 11:
                ((CoachMark) obj).lambda$renderCoachMark$5(view);
                break;
            case 12:
                ((ImageCropActivity) obj).lambda$onCreate$0(view);
                break;
            case 13:
                ((NoticeBannerView) obj).setVisibility(8);
                break;
            case 14:
                ((MenuItem) obj).onClick(view);
                break;
            case 15:
                ((SmartHomeNavigationViewController) obj).lambda$showAPlusUpsellButton$3(view);
                break;
            case 16:
                DebugMenuController.onCreateView$lambda$1$lambda$0((DebugMenuController) obj, view);
                break;
            case 17:
                ErrorPage.retryClicked$lambda$1((ErrorPage) obj, view);
                break;
            case 18:
                ExpandableSectionHeaderView.bindSeeMoreSeeLess$lambda$2((ExpandableSectionHeaderView) obj, view);
                break;
            case 19:
                ((LandscapeCameraView) obj).lambda$setupChildViews$1(view);
                break;
            case 20:
                ((PublishSubject) obj).onNext(view);
                break;
            case 21:
                ((BottomSheetChatNavCardViewHolder) obj).lambda$new$0(view);
                break;
            case 22:
                ((BottomSheetHintViewHolder) obj).lambda$new$0(view);
                break;
            case 23:
                ((BottomSheetInAppLinkCardViewHolder) obj).lambda$new$0(view);
                break;
            case 24:
                ((BottomSheetOverFlowViewHolder) obj).lambda$new$0(view);
                break;
            case 25:
                ((BottomSheetPillResultViewHolder) obj).lambda$new$0(view);
                break;
            case 26:
                ((BottomSheetRequestViewHolder) obj).lambda$new$1(view);
                break;
            case 27:
                ((BottomSheetResponseViewHolder) obj).lambda$bind$1(view);
                break;
            case 28:
                ((BottomSheetSuggestionsViewHolder) obj).lambda$new$0(view);
                break;
            default:
                ((CalendarController) obj).lambda$onCreateView$0(view);
                break;
        }
    }
}
