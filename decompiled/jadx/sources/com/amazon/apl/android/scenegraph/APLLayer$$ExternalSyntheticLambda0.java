package com.amazon.apl.android.scenegraph;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.EducationPrimerController;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetController;
import com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LanguageCombinationPrimerController;
import com.amazon.alexa.voice.ui.onedesign.ftue.letschat.PermissionLetsChatController;
import com.amazon.alexa.voice.ui.onedesign.hints.HintsController;
import com.amazon.alexa.voice.ui.onedesign.local.search.LocalSearchController;
import com.amazon.alexa.voice.ui.onedesign.movies.list.MoviesListController;
import com.amazon.alexa.voice.ui.onedesign.movies.showtimes.MovieShowtimesController;
import com.amazon.alexa.voice.ui.onedesign.remarkable.RemarkableAlexaConversationController;
import com.amazon.alexa.voice.ui.onedesign.shopping.ShoppingController;
import com.amazon.alexa.voice.ui.onedesign.shopping.item.ShoppingItemViewHolder;
import com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlView;
import com.amazon.alexa.voice.ui.onedesign.sports.scores.SportsScoresController;
import com.amazon.alexa.voice.ui.onedesign.traffic.TrafficController;
import com.amazon.alexa.voice.ui.onedesign.travel.TravelTimeDistanceController;
import com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenController;
import com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenV2Controller;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaInChatHintViewHolder;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaInChatLinkVewHolder;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaPillResultViewHolder;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaSuggestionHintViewHolder;
import com.amazon.alexa.voice.ui.onedesign.tta.viewholder.TtaSuggestionLinkViewHolder;
import com.amazon.alexa.voice.ui.onedesign.weather.WeatherController;
import com.amazon.apl.android.IAccessibilityProvider;
import com.amazon.comms.calling.presentation.ui.views.DialPad;
import com.amazon.comms.calling.presentation.ui.views.DialPadButton;
import com.amazon.dee.app.ui.clouddrive.AlexaDeviceBackgroundImageActivity;
import com.amazon.dee.app.ui.clouddrive.ViewBoxFragment;
import com.amazon.deecomms.call.active.ActiveVideoCallView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayer$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ APLLayer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                APLLayer.lambda$applyFocusability$0((IAccessibilityProvider) obj, view);
                break;
            case 1:
                ((EducationPrimerController) obj).lambda$onCreateView$0(view);
                break;
            case 2:
                ((FtueBottomSheetController) obj).lambda$onCreateView$0(view);
                break;
            case 3:
                ((LanguageCombinationPrimerController) obj).lambda$onCreateView$0(view);
                break;
            case 4:
                ((PermissionLetsChatController) obj).lambda$onCreateView$0(view);
                break;
            case 5:
                ((HintsController) obj).lambda$onCreateView$0(view);
                break;
            case 6:
                ((LocalSearchController) obj).lambda$onCreateView$0(view);
                break;
            case 7:
                ((MoviesListController) obj).lambda$onCreateView$0(view);
                break;
            case 8:
                ((MovieShowtimesController) obj).lambda$onCreateView$0(view);
                break;
            case 9:
                RemarkableAlexaConversationController.lambda$setupUpdatePromptButtons$6((ConstraintLayout) obj, view);
                break;
            case 10:
                ((ShoppingController) obj).lambda$onCreateView$0(view);
                break;
            case 11:
                ((ShoppingItemViewHolder) obj).lambda$new$0(view);
                break;
            case 12:
                ((SpeechControlView) obj).lambda$initializePresenter$0(view);
                break;
            case 13:
                ((SportsScoresController) obj).lambda$onCreateView$0(view);
                break;
            case 14:
                ((TrafficController) obj).lambda$onCreateView$0(view);
                break;
            case 15:
                ((TravelTimeDistanceController) obj).lambda$onCreateView$0(view);
                break;
            case 16:
                ((TtaScreenController) obj).lambda$onCreateView$3(view);
                break;
            case 17:
                ((TtaScreenV2Controller) obj).lambda$setupSuggestionsView$3(view);
                break;
            case 18:
                ((TtaCardViewHolder) obj).lambda$new$0(view);
                break;
            case 19:
                ((TtaInChatHintViewHolder) obj).lambda$new$0(view);
                break;
            case 20:
                ((TtaInChatLinkVewHolder) obj).lambda$new$0(view);
                break;
            case 21:
                ((TtaPillResultViewHolder) obj).lambda$new$0(view);
                break;
            case 22:
                ((TtaSuggestionHintViewHolder) obj).lambda$new$0(view);
                break;
            case 23:
                ((TtaSuggestionLinkViewHolder) obj).lambda$new$0(view);
                break;
            case 24:
                ((WeatherController) obj).lambda$onCreateView$0(view);
                break;
            case 25:
                DialPad.onAttachedToWindow$lambda$0((DialPad) obj, view);
                break;
            case 26:
                DialPadButton.onAttachedToWindow$lambda$0((DialPadButton) obj, view);
                break;
            case 27:
                ((AlexaDeviceBackgroundImageActivity) obj).lambda$initializeDataBinding$0(view);
                break;
            case 28:
                ((ViewBoxFragment) obj).lambda$onCreateView$0(view);
                break;
            default:
                ((ActiveVideoCallView) obj).lambda$initializeSpeakerIcon$2(view);
                break;
        }
    }
}
