package com.amazon.alexa.redesign;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.redesign.client.FeedsSource;
import com.amazon.alexa.redesign.client.GetContentTrigger;
import com.amazon.alexa.redesign.debug.ActivityLauncher;
import com.amazon.alexa.redesign.entity.AlertBannerModel;
import com.amazon.alexa.redesign.entity.CardModel;
import com.amazon.alexa.redesign.entity.ContentResponse;
import com.amazon.alexa.redesign.entity.DismissIdentifier;
import com.amazon.alexa.redesign.entity.SectionId;
import com.amazon.alexa.redesign.entity.agentforward.domain.CardDrawerItem;
import com.amazon.alexa.redesign.entity.templates.DomainCardTemplateModel;
import com.amazon.alexa.redesign.view.coachmark.data.AgentForwardBottomSheetState;
import com.amazon.alexa.redesign.view.coachmark.data.FTUXState;
import com.amazon.alexa.redesign.view.coachmark.data.HomeLifeCycle;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface HomeContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface HomeMetricsRecorder {
        void recordBottomSheetClickEvent(Map<String, Object> map);

        void recordBottomSheetDismissEvent(Map<String, Object> map);

        long recordClickEvent(@NonNull String str, Map<String, Object> map);

        long recordClickEvent(Map<String, Object> map);

        void recordClickEventFromCards(HashMap<String, Object> hashMap);

        void recordCoachMarkTourMetric(String str);

        void recordEnterHome(boolean z);

        void recordExitHome(boolean z);

        void recordOeBoolean(String str, boolean z);

        void recordOeCounter(MobilyticsMetricsCounter mobilyticsMetricsCounter);

        void recordOeMetric(String str);

        void recordOeTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer);

        void recordSliderEvent(String str, Integer num, Integer num2);

        void recordViewEvent(String str, Map<String, Object> map);

        void recordViewEvent(Map<String, Object> map, boolean z);

        MobilyticsMetricsCounter startOeCounter(String str, String str2, long j);

        MobilyticsMetricsCounter startOeCounter(String str, String str2, String str3, long j);

        MobilyticsMetricsTimer startOeTimer(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void clearDismissedCardIds();

        void clearEventCacheClickEvents();

        Completable clearHomeCardsFromCache();

        void clearLocalCards();

        void deleteDismissedCardId(DismissIdentifier dismissIdentifier, String str);

        Single<ContentResponse> getCardsFromMockedData();

        List<DismissIdentifier> getDismissedCardIds(String[] strArr);

        Observable<ContentResponse> getHomeCardsFromServer(GetContentTrigger getContentTrigger);

        Observable<List<DomainCardTemplateModel>> getLocalCards();

        Bundle getRNPlaceholderBundle();

        Observable<ContentResponse> getRawHomeCardsFromCache();

        boolean needRefresh();

        void publishEventBusMessage(Message message);

        void requestRefresh();

        void resetNeedRefreshValue();

        void saveDismissedCardId(DismissIdentifier dismissIdentifier, String str);

        boolean validateNetworkConnection();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LatencyInteractor {
        void dropInAppLatency();

        void endPerfUserMonitoringSpan(String str);

        void initInAppLatencyColdStart();

        void initInAppLatencyWarmStart();

        void recordColdStartInAppLatency();

        void recordColdStartLatency();

        void recordProfileEvent(String str);

        void recordSectionEvent(String str, Long l, boolean z);

        void recordSectionEvent(String str, boolean z);

        void recordTTA(boolean z);

        void recordTTA(boolean z, List<CardDrawerItem> list);

        void recordTTC();

        void recordWarmStartInAppLatency();

        void startPerfUserMonitoringSpan(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OEInteractor {
        void recordBadRouteOccurrence(String str, String str2);

        void recordEnterHome();

        void recordErrorPageView();

        void recordMalformedDataOccurrence(String str);

        void recordMalformedViewOccurrence(String str, String str2);

        void recordPullToRefresh();

        void recordReactCardRenderRequest(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void activateDebugMenu(ActivityLauncher activityLauncher, Context context);

        void displayActiveCardsFromCache(String str, View view);

        void displayBottomSheet(BottomSheetDialogFragment bottomSheetDialogFragment, View view);

        void displayMockedCards(View view);

        void end(View view);

        void fetchHomeCardsFromServer(boolean z, String str, View view);

        void filterOutDismissedCards(List<CardModel> list, String str);

        void handleClickToDismiss(View view, int i, CardModel cardModel);

        void initRNPlaceholder(View view);

        void onActivityDestroyed(View view);

        void onApiRequestActionError(String str);

        boolean onApiRequestActionStart(String str);

        void onApiRequestActionSuccess(String str, View view);

        void onBoundCardView(String str);

        void onConfigurationChange(View view);

        void onConversationDismissed(View view);

        void onCreatedCardView();

        void onDismissSectionItem(RecyclerViewItem recyclerViewItem, List<RecyclerViewItem> list, View view);

        void onHomeCardsViewFinishedLoading(boolean z);

        void onHomeModesIconClick();

        void onLayoutCompleted();

        void onLiveUpdateEvent(JSONObject jSONObject, View view);

        void onLoadOnStart();

        void onLocalCardAdded(CardModel cardModel, View view);

        void onLocalCardRemoved(CardModel cardModel, View view);

        void onLogOut(View view);

        void onNetworkChanged(View view);

        void onPauseHome(View view);

        void onPerfEvent(String str);

        void onPerfEvent(JSONObject jSONObject);

        void onPostCardsRendered(int i, int i2, View view, String str);

        void onQuickAddClick();

        void onRemoveCardClicked(View view, int i, Map<String, Object> map, String str);

        void onRequestHomeRefreshEvent(boolean z, View view);

        void onResumeHome(boolean z, View view);

        void onRnRouteEvent(JSONObject jSONObject);

        void onScrolledToEnd(View view);

        void onScrolledToViewItem(View view, RecyclerViewItem recyclerViewItem, int i, int i2);

        void onShakeEvent();

        void onSkeletonSlideUpFinished();

        void onVoxIngressFinishedLoading(boolean z, View view);

        void onVoxIngressFinishedLoadingWithLogout(boolean z, View view);

        void publishHomeInitializedEvent();

        void publishTWAAvailablityRequest();

        void recordBottomSheetClickEvent(Map<String, Object> map);

        void recordBottomSheetDismissEvent(Map<String, Object> map);

        void recordCardsSeenOnColdStart(View view, int i, int i2);

        void setLastRouteName(String str);

        void setOutageAlert(AlertBannerModel alertBannerModel, View view);

        void start(View view, boolean z);

        void unsubscribeFromEventBus(View view);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void addCard(CardModel cardModel);

        void addPage(List<CardModel> list);

        List<RecyclerViewItem> currentViewItems();

        void displayBottomSheet(BottomSheetDialogFragment bottomSheetDialogFragment);

        void displayErrorPage();

        Pair<Integer, CardModel> findDataByDismissId(String str);

        void finishRefresh();

        boolean getCslOverride();

        int getFirstReturnToPosition();

        int getFirstVisibleItemPosition();

        android.view.View getHeader();

        int getLastReturnToPosition();

        int getLastVisibleItemPosition();

        boolean getLogoutFlag();

        android.view.View getRoot();

        RecyclerViewItem getViewItemFromPosition(int i);

        void goToPosition(int i);

        void handleRotation();

        void hideErrorPage();

        void homeCardsRecyclerViewFinishedLoading(List<RecyclerViewItem> list);

        void initRNPlaceholder(Bundle bundle);

        boolean isViewAttached();

        void onAgentForwardBottomSheet(AgentForwardBottomSheetState agentForwardBottomSheetState);

        void onErrorPageRetryClicked();

        void onFTUX(FTUXState fTUXState);

        void onHomeLifeCycle(HomeLifeCycle homeLifeCycle);

        void postCallbackOnRendered(String str);

        void recordCardsSeenOnColdStart(int i, int i2);

        void registerReceivers();

        void removeActivityCard(int i);

        void removeCard(CardModel cardModel);

        void removeCardAt(int i);

        void removeCardBySectionId(SectionId sectionId);

        void resetActivity();

        void resetReturnPosition();

        void returnToLastVisitedPosition();

        void revokeSwipeExperience();

        void setFirstRenderCompleteOnLogOut();

        void setLogoutFlag(boolean z);

        void setOfflineBannerVisibility(boolean z);

        void setOutageAlert(String str);

        void setViewBackgroundColor(android.view.View view);

        void unregisterReceivers();

        void unsubscribeFromEventBus();

        void updateAccessibilityOrder(@Nullable String str);

        void updateCardModels(List<CardModel> list, FeedsSource feedsSource);

        void updateYourProfile();
    }
}
