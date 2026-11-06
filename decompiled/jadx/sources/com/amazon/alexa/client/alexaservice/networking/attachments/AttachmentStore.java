package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AlexaAudioSource;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AlexaDataSource;
import com.amazon.alexa.client.alexaservice.audio.core.AlexaSpeechmarkParser;
import com.amazon.alexa.client.alexaservice.audio.core.ScaledVolumeProcessor;
import com.amazon.alexa.client.alexaservice.audio.core.VolumeCalculatingInputStream;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AttachmentStore {

    @VisibleForTesting
    static final long RETRIEVE_TIMEOUT_MS = 3000;
    private static final String TAG = "AttachmentStore";
    private final AlexaSpeechmarkParser alexaSpeechmarkParser;
    private final AudioFormatConvertingAttachmentFactory audioFormatConvertingAttachmentFactory;
    private final AlexaClientEventBus eventBus;
    private final ScaledVolumeProcessor scaledVolumeProcessor;
    private final Map<AttachmentIdentifier, Attachment> attachments = new HashMap();
    private final Map<AttachmentIdentifier, Condition> pendingRetrieveRequests = new HashMap();
    private final Lock lock = new ReentrantLock();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentStore$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$client$alexaservice$networking$attachments$AttachmentStore$AttachmentType;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            $SwitchMap$com$amazon$alexa$client$alexaservice$networking$attachments$AttachmentStore$AttachmentType = iArr;
            try {
                iArr[AttachmentType.SpeechmarkParsing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$client$alexaservice$networking$attachments$AttachmentStore$AttachmentType[AttachmentType.Bufferred.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AttachmentType {
        Bufferred,
        SpeechmarkParsing
    }

    @Inject
    public AttachmentStore(ScaledVolumeProcessor scaledVolumeProcessor, AlexaClientEventBus alexaClientEventBus, AlexaSpeechmarkParser alexaSpeechmarkParser, AudioFormatConvertingAttachmentFactory audioFormatConvertingAttachmentFactory) {
        this.scaledVolumeProcessor = scaledVolumeProcessor;
        this.eventBus = alexaClientEventBus;
        this.alexaSpeechmarkParser = alexaSpeechmarkParser;
        this.audioFormatConvertingAttachmentFactory = audioFormatConvertingAttachmentFactory;
    }

    private void clearRetrieveRequest(AttachmentIdentifier attachmentIdentifier) {
        Condition remove = this.pendingRetrieveRequests.remove(attachmentIdentifier);
        if (remove != null) {
            remove.signal();
        }
    }

    private Attachment create(AttachmentIdentifier attachmentIdentifier, AttachmentType attachmentType) {
        try {
            this.lock.lock();
            attachmentType.name();
            attachmentIdentifier.getValue();
            Attachment bufferedAttachment = AnonymousClass1.$SwitchMap$com$amazon$alexa$client$alexaservice$networking$attachments$AttachmentStore$AttachmentType[attachmentType.ordinal()] != 1 ? new BufferedAttachment(attachmentIdentifier) : new SpeechmarkParsingAttachment(attachmentIdentifier, this.alexaSpeechmarkParser);
            this.attachments.put(attachmentIdentifier, bufferedAttachment);
            clearRetrieveRequest(attachmentIdentifier);
            this.lock.unlock();
            return bufferedAttachment;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @VisibleForTesting
    public boolean contains(AttachmentIdentifier attachmentIdentifier) {
        try {
            this.lock.lock();
            return this.attachments.containsKey(attachmentIdentifier);
        } finally {
            this.lock.unlock();
        }
    }

    public Attachment createBufferedAttachment(AttachmentIdentifier attachmentIdentifier, DataFormat dataFormat) {
        try {
            this.lock.lock();
            Objects.toString(dataFormat);
            attachmentIdentifier.getValue();
            BufferedAttachment bufferedAttachment = new BufferedAttachment(attachmentIdentifier, dataFormat);
            this.attachments.put(attachmentIdentifier, bufferedAttachment);
            clearRetrieveRequest(attachmentIdentifier);
            return bufferedAttachment;
        } finally {
            this.lock.unlock();
        }
    }

    public Attachment createSpeechmarkParsingAttachment(AttachmentIdentifier attachmentIdentifier) {
        return create(attachmentIdentifier, AttachmentType.SpeechmarkParsing);
    }

    public void delete(@Nullable AttachmentIdentifier attachmentIdentifier) {
        try {
            this.lock.lock();
            if (attachmentIdentifier != null) {
                attachmentIdentifier.getValue();
                Attachment remove = this.attachments.remove(attachmentIdentifier);
                clearRetrieveRequest(attachmentIdentifier);
                if (remove != null) {
                    remove.close();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Nullable
    public Attachment get(AttachmentIdentifier attachmentIdentifier) {
        try {
            this.lock.lock();
            attachmentIdentifier.getValue();
            if (!this.attachments.containsKey(attachmentIdentifier)) {
                Condition newCondition = this.lock.newCondition();
                this.pendingRetrieveRequests.put(attachmentIdentifier, newCondition);
                boolean z = false;
                try {
                    z = newCondition.await(3000L, TimeUnit.MILLISECONDS);
                    this.pendingRetrieveRequests.remove(attachmentIdentifier);
                } catch (InterruptedException unused) {
                    Log.e(TAG, "Thread Execution Interrupted");
                }
                if (!z) {
                    Log.e(TAG, "Timeout to retrieve attachment expired");
                }
            }
            return this.attachments.get(attachmentIdentifier);
        } finally {
            this.lock.unlock();
        }
    }

    @Nullable
    public Attachment getIfExists(AttachmentIdentifier attachmentIdentifier) {
        try {
            this.lock.lock();
            if (this.attachments.containsKey(attachmentIdentifier)) {
                attachmentIdentifier.getValue();
                return this.attachments.get(attachmentIdentifier);
            }
            attachmentIdentifier.getValue();
            this.lock.unlock();
            return null;
        } finally {
            this.lock.unlock();
        }
    }

    public void onLogOut() {
        try {
            this.lock.lock();
            this.pendingRetrieveRequests.clear();
            this.attachments.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public void teardown() {
        try {
            this.lock.lock();
            Iterator<AttachmentIdentifier> it2 = this.attachments.keySet().iterator();
            while (it2.hasNext()) {
                this.attachments.get(it2.next()).close();
            }
            this.pendingRetrieveRequests.clear();
            this.attachments.clear();
            this.lock.unlock();
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public Attachment wrapForVoiceRequest(Attachment attachment) {
        try {
            this.lock.lock();
            Attachment createAudioFormatConvertingAttachment = this.audioFormatConvertingAttachmentFactory.createAudioFormatConvertingAttachment(attachment);
            this.attachments.put(createAudioFormatConvertingAttachment.getAttachmentIdentifier(), createAudioFormatConvertingAttachment);
            return createAudioFormatConvertingAttachment;
        } finally {
            this.lock.unlock();
        }
    }

    public Attachment wrapForVolumeCalculating(Attachment attachment) {
        try {
            this.lock.lock();
            if (VolumeCalculatingInputStream.isSupported(attachment.getDataFormat())) {
                attachment = new VolumeCalculatingAttachment(this.eventBus, this.scaledVolumeProcessor, attachment);
            }
            this.attachments.put(attachment.getAttachmentIdentifier(), attachment);
            this.lock.unlock();
            return attachment;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public Attachment createBufferedAttachment() {
        return createBufferedAttachment(AttachmentIdentifier.createRandom());
    }

    public Attachment createBufferedAttachment(AttachmentIdentifier attachmentIdentifier) {
        return create(attachmentIdentifier, AttachmentType.Bufferred);
    }

    public Attachment createBufferedAttachment(DataFormat dataFormat) {
        return createBufferedAttachment(AttachmentIdentifier.createRandom(), dataFormat);
    }

    public Attachment create(AlexaAudioSource alexaAudioSource) {
        return wrapForVolumeCalculating(new FileDescriptorAttachment(alexaAudioSource));
    }

    public Attachment create(AlexaDataSource alexaDataSource) {
        try {
            this.lock.lock();
            FileDescriptorAttachment fileDescriptorAttachment = new FileDescriptorAttachment(alexaDataSource);
            this.attachments.put(fileDescriptorAttachment.getAttachmentIdentifier(), fileDescriptorAttachment);
            return fileDescriptorAttachment;
        } finally {
            this.lock.unlock();
        }
    }
}
