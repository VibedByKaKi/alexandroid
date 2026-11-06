package com.amazon.alexa.voice.ui.onedesign.remarkable.settings;

import android.content.Context;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomSheetPresenter;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetOverFlowListItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.OverFlowListItem;
import com.amazon.alexa.voice.ui.onedesign.remarkable.metrics.RemarkableAlexaSheetUiEvent;
import com.amazon.alexa.voice.ui.onedesign.remarkable.settings.RemarkableAlexaSettingsContract;
import com.amazon.alexa.voice.ui.tta.TtaNavigator;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender;
import com.amazon.alexa.vox.ui.onedesign.R;
import com.amazon.dee.app.services.environment.Endpoints;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemarkableAlexaSettingsPresenter implements RemarkableAlexaSettingsContract.Presenter {
    private final TtaEventSender eventSender;
    private final RemarkableAlexaSettingsContract.Interactor interactor;
    private final TtaNavigator navigator;
    private final RemarkableAlexaSettingsContract.View view;

    public RemarkableAlexaSettingsPresenter(RemarkableAlexaSettingsContract.View view, RemarkableAlexaSettingsContract.Interactor interactor, TtaEventSender ttaEventSender, TtaNavigator ttaNavigator) {
        this.view = view;
        this.interactor = interactor;
        this.eventSender = ttaEventSender;
        this.navigator = ttaNavigator;
    }

    private OverFlowListItem createOverFlowListItem(final String str, final int i, final String str2, final int i2, final int i3) {
        return new OverFlowListItem() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.settings.RemarkableAlexaSettingsPresenter.1
            @Override // com.amazon.alexa.voice.ui.tta.search.ResultItem
            public String getId() {
                return str;
            }

            @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.OverFlowListItem
            public int getImageId() {
                return i3;
            }

            @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.OverFlowListItem
            public String getItemRoute() {
                return str2;
            }

            @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.OverFlowListItem
            public int getItemText() {
                return i;
            }

            @Override // com.amazon.alexa.voice.ui.tta.search.ResultItem
            public int getType() {
                return i2;
            }
        };
    }

    private void sendSettingsMetrics(int i) {
        if (i == 0) {
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_SETTINGS_ACTIVITY_TAPPED);
            return;
        }
        if (i == 1) {
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_SETTINGS_VOICE_RESPONSES_TAPPED);
        } else if (i == 2) {
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_SETTINGS_ALEXA_PRIVACY_TAPPED);
        } else {
            if (i != 3) {
                return;
            }
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_SETTINGS_ABOUT_TAPPED);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.remarkable.settings.RemarkableAlexaSettingsContract.Presenter
    public void close() {
        this.interactor.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.remarkable.settings.RemarkableAlexaSettingsContract.Presenter
    public void openSettings(Context context, BottomSheetOverFlowListItem bottomSheetOverFlowListItem) {
        sendSettingsMetrics(bottomSheetOverFlowListItem.getType());
        if (bottomSheetOverFlowListItem.getType() == 3) {
            this.interactor.openAbout();
        } else {
            this.navigator.navigateInApp(context, bottomSheetOverFlowListItem.getRoute(), null);
            close();
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.remarkable.settings.RemarkableAlexaSettingsContract.Presenter
    public void start() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BottomSheetOverFlowListItem.fromOverflowItem(createOverFlowListItem("1", R.string.remarkable_alexa_overflow_menu_activity, "activity", 0, R.drawable.ic_options_reset)));
        arrayList.add(BottomSheetOverFlowListItem.fromOverflowItem(createOverFlowListItem("2", R.string.bottom_sheet_overflow_menu_voice_responses, "v2/settings/voice-responses", 1, R.drawable.ic_settings)));
        arrayList.add(BottomSheetOverFlowListItem.fromOverflowItem(createOverFlowListItem("3", R.string.bottom_sheet_overflow_menu_privacy, BottomSheetPresenter.ROUTE_TO_ALEXA_PRIVACY, 2, R.drawable.ic_security)));
        arrayList.add(BottomSheetOverFlowListItem.fromOverflowItem(createOverFlowListItem(Endpoints.CURRENT_SCHEMA_VERSION, R.string.bottom_sheet_overflow_menu_about, null, 3, R.drawable.ic_information)));
        this.view.addItems(arrayList);
    }
}
