package org.apache.commons.io.input;

import com.amazon.alexa.accessory.frames.media.MediaGallery;
import com.amazon.alexa.accessory.frames.media.transform.lce.LceRetoucherProcessor;
import com.amazon.alexa.accessory.frames.media.viewer.MediaViewerFragment;
import com.amazon.alexa.accessory.frames.media.viewer.MediaViewerViewModel;
import com.amazon.alexa.accessory.notificationpublisher.reply.RemoteInputReplySender;
import com.amazon.alexa.assistant.capability.speechrecognizer.DefaultSpeechProvider;
import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInScheduler;
import com.amazon.alexa.assistant.session.directive.DefaultDirectiveScheduler;
import com.amazon.alexa.assistant.toolkit.audio.AudioModeMonitor;
import com.amazon.alexa.assistant.toolkit.audio.device.CommunicationDeviceCallbackExecutor;
import com.amazon.alexa.client.alexaservice.vad.deferredbargein.DeferredBargeInModule;
import com.amazon.alexa.client.alexaservice.vad.selfbargein.SelfBargeInModule;
import com.amazon.alexa.client.alexaservice.vad.selfbargein.SelfBargeInObserver;
import com.amazon.alexa.ra.android.smartfragment.bridge.BridgeServices;
import com.amazon.alexa.ra.android.smartfragment.crypto.DigestExecution;
import com.amazon.alexa.ra.core.features.fragments.FragmentsRepository;
import com.amazon.dee.app.services.bluetooth.DefaultBluetoothService;
import com.amazon.rtvi.capabilityagent.avs.RTVIEventSenderKt;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class ReadAheadInputStream$$ExternalSyntheticLambda1 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ReadAheadInputStream$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread;
        Thread lambda$new$13;
        Thread lambda$getOrCreateGlExecutor$3;
        Thread lambda$static$0;
        Thread lambda$static$02;
        Thread executor$lambda$1;
        Thread _init_$lambda$0;
        Thread newDefaultExecutor$lambda$4;
        Thread createSingleThreadDispatcher$lambda$0;
        Thread defaultCallbackExecutor_delegate$lambda$5$lambda$4;
        Thread executor_delegate$lambda$2$lambda$1;
        Thread lambda$providesDeferredBargeInAuthority$0;
        Thread lambda$providesSelfBargeInExecutor$0;
        Thread lambda$createDefault$0;
        Thread sharedDestroyExecutor$lambda$1;
        Thread workExecutor$lambda$1;
        Thread timeoutScheduler$lambda$3;
        Thread fragmentEventDispatcher$lambda$3;
        Thread createProfileQueryExecutor$lambda$1;
        Thread compatDeliveryTimeouts_delegate$lambda$2$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                newThread = ReadAheadInputStream.newThread(runnable);
                return newThread;
            case 1:
                lambda$new$13 = MediaGallery.lambda$new$13(runnable);
                return lambda$new$13;
            case 2:
                lambda$getOrCreateGlExecutor$3 = LceRetoucherProcessor.lambda$getOrCreateGlExecutor$3(runnable);
                return lambda$getOrCreateGlExecutor$3;
            case 3:
                lambda$static$0 = MediaViewerFragment.lambda$static$0(runnable);
                return lambda$static$0;
            case 4:
                lambda$static$02 = MediaViewerViewModel.lambda$static$0(runnable);
                return lambda$static$02;
            case 5:
                executor$lambda$1 = RemoteInputReplySender.executor$lambda$1(runnable);
                return executor$lambda$1;
            case 6:
                _init_$lambda$0 = DefaultSpeechProvider._init_$lambda$0(runnable);
                return _init_$lambda$0;
            case 7:
                newDefaultExecutor$lambda$4 = SelfBargeInScheduler.Companion.newDefaultExecutor$lambda$4(runnable);
                return newDefaultExecutor$lambda$4;
            case 8:
                createSingleThreadDispatcher$lambda$0 = DefaultDirectiveScheduler.Companion.createSingleThreadDispatcher$lambda$0(runnable);
                return createSingleThreadDispatcher$lambda$0;
            case 9:
                defaultCallbackExecutor_delegate$lambda$5$lambda$4 = AudioModeMonitor.defaultCallbackExecutor_delegate$lambda$5$lambda$4(runnable);
                return defaultCallbackExecutor_delegate$lambda$5$lambda$4;
            case 10:
                executor_delegate$lambda$2$lambda$1 = CommunicationDeviceCallbackExecutor.executor_delegate$lambda$2$lambda$1(runnable);
                return executor_delegate$lambda$2$lambda$1;
            case 11:
                lambda$providesDeferredBargeInAuthority$0 = DeferredBargeInModule.lambda$providesDeferredBargeInAuthority$0(runnable);
                return lambda$providesDeferredBargeInAuthority$0;
            case 12:
                lambda$providesSelfBargeInExecutor$0 = SelfBargeInModule.lambda$providesSelfBargeInExecutor$0(runnable);
                return lambda$providesSelfBargeInExecutor$0;
            case 13:
                lambda$createDefault$0 = SelfBargeInObserver.lambda$createDefault$0(runnable);
                return lambda$createDefault$0;
            case 14:
                sharedDestroyExecutor$lambda$1 = BridgeServices.sharedDestroyExecutor$lambda$1(runnable);
                return sharedDestroyExecutor$lambda$1;
            case 15:
                workExecutor$lambda$1 = DigestExecution.workExecutor$lambda$1(runnable);
                return workExecutor$lambda$1;
            case 16:
                timeoutScheduler$lambda$3 = DigestExecution.timeoutScheduler$lambda$3(runnable);
                return timeoutScheduler$lambda$3;
            case 17:
                fragmentEventDispatcher$lambda$3 = FragmentsRepository.fragmentEventDispatcher$lambda$3(runnable);
                return fragmentEventDispatcher$lambda$3;
            case 18:
                createProfileQueryExecutor$lambda$1 = DefaultBluetoothService.Companion.createProfileQueryExecutor$lambda$1(runnable);
                return createProfileQueryExecutor$lambda$1;
            default:
                compatDeliveryTimeouts_delegate$lambda$2$lambda$1 = RTVIEventSenderKt.compatDeliveryTimeouts_delegate$lambda$2$lambda$1(runnable);
                return compatDeliveryTimeouts_delegate$lambda$2$lambda$1;
        }
    }
}
