package org.apache.commons.io;

import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportError;
import com.amazon.alexa.accessory.frames.msp.MSPManager;
import com.amazon.alexa.accessory.frames.smartPlay.v2.CustomMediaHelper;
import com.amazon.alexa.accessory.frames.smartPlay.v2.models.MediaImage;
import com.amazon.alexa.accessory.frames.wifiap.WifiApService;
import com.amazon.alexa.app.notification.messaging.receivers.DismissNotificationMessagingReceiver;
import com.amazon.alexa.app.notification.nc.DefaultNotificationCenterFetchImpl;
import com.amazon.alexa.digitalcommerce.api.GetProductDetailsResponse;
import com.amazon.alexa.navigation.menu.viewcontroller.SmartHomeNavigationViewController;
import com.amazon.deecomms.nativemodules.CommsCvfPhoneDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.squareup.javapoet.AnnotationSpec;
import dagger.internal.codegen.javapoet.AnnotationSpecs;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.ArchUtils;
import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.arch.Processor;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.text.StrBuilder;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class FileUtils$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FileUtils$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Exception) obj2).addSuppressed((IOException) obj);
                break;
            case 1:
                ((AtomicReference) obj2).set((MediaImportError) obj);
                break;
            case 2:
                ((MSPManager) obj2).lambda$handleMSPChangeMessage$1((List) obj);
                break;
            case 3:
                CustomMediaHelper.lambda$transformImagesJsonArray$3((JSONArray) obj2, (MediaImage) obj);
                break;
            case 4:
                WifiApService.lambda$startWifiApReactive$15((SingleEmitter) obj2, (Throwable) obj);
                break;
            case 5:
                ((Runnable) obj2).run();
                break;
            case 6:
                ((NotificationCompat.Builder) obj2).addAction((NotificationCompat.Action) obj);
                break;
            case 7:
                ((DismissNotificationMessagingReceiver) obj2).lambda$onReceive$0((String) obj);
                break;
            case 8:
                ((DefaultNotificationCenterFetchImpl) obj2).sendLegalBadgeSync((List) obj);
                break;
            case 9:
                ((SnapshotKt$$ExternalSyntheticLambda3) obj2).invoke(obj);
                break;
            case 10:
                ((SnapshotKt$$ExternalSyntheticLambda3) obj2).invoke(obj);
                break;
            case 11:
                ((View) obj2).setAlpha(((Float) obj).floatValue());
                break;
            case 12:
                ((SmartHomeNavigationViewController) obj2).lambda$checkProductEligibility$0((GetProductDetailsResponse) obj);
                break;
            case 13:
                ((HashSet) obj2).add((String) obj);
                break;
            case 14:
                ((CommsCvfPhoneDelegate) obj2).registerActivityListener((ReactApplicationContext) obj);
                break;
            case 15:
                ((StringBuilder) obj2).append((String) obj);
                break;
            case 16:
                AnnotationSpecs.lambda$suppressWarnings$1((AnnotationSpec.Builder) obj2, (String) obj);
                break;
            case 17:
                ((IOException) obj2).addSuppressed((IOException) obj);
                break;
            case 18:
                ArchUtils.addProcessor((String) obj, (Processor) obj2);
                break;
            case 19:
                ((CharSet) obj2).add((String) obj);
                break;
            case 20:
                EnumUtils.lambda$generateBitVectors$0((EnumSet) obj2, (Enum) obj);
                break;
            case 21:
                Functions.accept((Functions.FailableConsumer) obj2, obj);
                break;
            case 22:
                MultiBackgroundInitializer.lambda$initialize$0((ExecutorService) obj2, (BackgroundInitializer) obj);
                break;
            case 23:
                ((PrintStream) obj2).println((String) obj);
                break;
            case 24:
                ((PrintWriter) obj2).println((String) obj);
                break;
            case 25:
                ((Function) obj2).apply(obj);
                break;
            case 26:
                Failable.accept((FailableConsumer<Object, E>) obj2, obj);
                break;
            case 27:
                ((List) obj2).add((Method) obj);
                break;
            case 28:
                ((StrBuilder) obj2).append(obj);
                break;
            default:
                ((org.apache.commons.text.StrBuilder) obj2).append(obj);
                break;
        }
    }
}
