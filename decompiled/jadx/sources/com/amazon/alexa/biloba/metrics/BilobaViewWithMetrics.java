package com.amazon.alexa.biloba.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.dependency.BilobaDependencies;
import com.amazon.alexa.biloba.model.Card;
import com.amazon.alexa.biloba.view.cards.NotificationCard;
import com.amazon.alexa.biloba.view.cards.TipsCard;
import com.amazon.alexa.biloba.view.common.recycler.BaseRecyclerItem;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class BilobaViewWithMetrics {
    private static final String TAG = "BilobaViewWithMetrics";

    @Inject
    protected BilobaMetricsService bilobaMetricsService;

    private synchronized void inject() {
        if (this.bilobaMetricsService == null) {
            BilobaDependencies.inject(this);
        }
    }

    public void recordCardsClickMetric(@NonNull Card card, @NonNull String str) {
        inject();
        if (this.bilobaMetricsService != null) {
            if (Card.CategoryEnum.FEATURE_DISCOVERY_TIP.equals(card.getCategory())) {
                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("TipsCard.", str, ".");
                m2m.append(card.getType());
                recordClickMetric(m2m.toString(), "");
            } else if (Card.CategoryEnum.NOTIFICATION_ALERT.equals(card.getCategory())) {
                StringBuilder m2m2 = a$$ExternalSyntheticOutline0.m2m("AlertCard.", str, ".");
                m2m2.append(card.getType());
                recordClickMetric(m2m2.toString(), "");
            }
        }
    }

    public void recordCardsViewMetric(@NonNull List<BaseRecyclerItem> list, @NonNull String str) {
        inject();
        if (this.bilobaMetricsService != null) {
            for (BaseRecyclerItem baseRecyclerItem : list) {
                if (baseRecyclerItem instanceof TipsCard) {
                    Card card = ((TipsCard) baseRecyclerItem).getCard();
                    StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("TipsCard.", str, ".");
                    m2m.append(card.getType());
                    recordViewMetric(m2m.toString(), "");
                }
                if (baseRecyclerItem instanceof NotificationCard) {
                    Card card2 = ((NotificationCard) baseRecyclerItem).getCard();
                    StringBuilder m2m2 = a$$ExternalSyntheticOutline0.m2m("AlertCard.", str, ".");
                    m2m2.append(card2.getType());
                    recordViewMetric(m2m2.toString(), "");
                }
            }
        }
    }

    public void recordClickMetric(@NonNull String str, @NonNull String str2) {
        inject();
        BilobaMetricsService bilobaMetricsService = this.bilobaMetricsService;
        if (bilobaMetricsService != null) {
            bilobaMetricsService.recordUserClick(str, str2);
        }
    }

    public void recordCommsCall(@NonNull String str, @NonNull String str2) {
        inject();
        BilobaMetricsService bilobaMetricsService = this.bilobaMetricsService;
        if (bilobaMetricsService != null) {
            bilobaMetricsService.recordUserCommsCall(str, str2);
        }
    }

    public void recordCommsMessage(@NonNull String str, @NonNull String str2) {
        inject();
        BilobaMetricsService bilobaMetricsService = this.bilobaMetricsService;
        if (bilobaMetricsService != null) {
            bilobaMetricsService.recordUserCommsMessage(str, str2);
        }
    }

    public void recordOccurrence(@NonNull String str, @NonNull boolean z) {
        inject();
        BilobaMetricsService bilobaMetricsService = this.bilobaMetricsService;
        if (bilobaMetricsService != null) {
            bilobaMetricsService.recordOccurrence(str, z);
        }
    }

    public void recordViewMetric(@NonNull String str, @NonNull String str2) {
        inject();
        BilobaMetricsService bilobaMetricsService = this.bilobaMetricsService;
        if (bilobaMetricsService != null) {
            bilobaMetricsService.recordUserView(str, str2);
        }
    }
}
