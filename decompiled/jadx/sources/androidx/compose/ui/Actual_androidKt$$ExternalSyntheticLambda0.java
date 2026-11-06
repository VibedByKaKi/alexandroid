package androidx.compose.ui;

import com.amazon.alexa.presence.service.jobs.ForegroundServiceJobScheduler;
import com.amazon.alexa.stayorganized.ui.ShoppingListWidgetPresenter;
import com.amazon.alexa.stayorganized.ui.calendar.CalendarWidgetPresenter;
import com.amazon.dee.app.elements.bridges.LeapfrogSceneAssetsProvider;
import com.mapbox.maps.threading.AnimationThreadController;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Actual_androidKt$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ Actual_androidKt$$ExternalSyntheticLambda0(Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                ForegroundServiceJobScheduler.scheduleRecurring$lambda$1(function0);
                break;
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                ShoppingListWidgetPresenter.safeRerender$lambda$0(function0);
                break;
            case 8:
                CalendarWidgetPresenter.safeRerender$lambda$0(function0);
                break;
            case 9:
                LeapfrogSceneAssetsProvider.runInBackground$lambda$4(function0);
                break;
            case 10:
                function0.invoke();
                break;
            case 11:
                AnimationThreadController.postOnAnimatorThread$lambda$3$lambda$2(function0);
                break;
            default:
                AnimationThreadController.postOnMainThread$lambda$1(function0);
                break;
        }
    }
}
