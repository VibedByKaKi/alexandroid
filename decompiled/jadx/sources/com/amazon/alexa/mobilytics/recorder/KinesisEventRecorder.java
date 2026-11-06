package com.amazon.alexa.mobilytics.recorder;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.stub.FakeEventBus$$ExternalSyntheticLambda0;
import com.amazon.alexa.mobilytics.auth.CognitoCredentialsProvider;
import com.amazon.alexa.mobilytics.auth.CredentialsProvider;
import com.amazon.alexa.mobilytics.configuration.Endpoint;
import com.amazon.alexa.mobilytics.configuration.KinesisEndpoint;
import com.amazon.alexa.mobilytics.recorder.EventRecorder;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.mobilytics.util.Utils;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorder;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorderConfig;
import com.google.common.base.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class KinesisEventRecorder implements EventRecorder {
    private static final String TAG = Log.tag((Class<?>) KinesisEventRecorder.class);
    private final PublishSubject<List<byte[]>> errorSubject;
    private KinesisRecorder kinesisRecorder;
    private String streamName;

    private KinesisEventRecorder() {
        this.errorSubject = PublishSubject.create();
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public Observable<List<byte[]>> onSaveFailed() {
        return this.errorSubject.asObservable();
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public void saveRecord(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.kinesisRecorder.saveRecord(str, this.streamName);
        } catch (Exception e) {
            Log.e(TAG, e, "AWS SDK error -- saveRecord", new Object[0]);
        }
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public long sizeOnDisk() {
        try {
            return this.kinesisRecorder.getDiskBytesUsed();
        } catch (Exception e) {
            Log.e(TAG, e, "AWS SDK error -- sizeOnDisk", new Object[0]);
            return 0L;
        }
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public void submitAllRecords() {
        try {
            this.kinesisRecorder.submitAllRecords();
        } catch (Throwable th) {
            Log.e(TAG, th, "AWS SDK error -- submitAllRecords", new Object[0]);
        }
    }

    public /* synthetic */ KinesisEventRecorder(int i) {
        this();
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public void saveRecord(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            this.kinesisRecorder.saveRecord(bArr, this.streamName);
        } catch (Exception e) {
            Log.e(TAG, e, "AWS SDK error -- saveRecord", new Object[0]);
        }
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public void saveRecord(@NonNull String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.kinesisRecorder.saveRecord(str, str2);
        } catch (Exception e) {
            Log.e(TAG, e, "AWS SDK error -- saveRecord", new Object[0]);
        }
    }

    @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder
    public void saveRecord(byte[] bArr, @NonNull String str) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            this.kinesisRecorder.saveRecord(bArr, str);
        } catch (Exception e) {
            Log.e(TAG, e, "AWS SDK error -- saveRecord", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Singleton
    public static class Factory implements EventRecorder.Factory {
        private static final String DATA_DIRECTORY = "mobilytics";
        private static final long MAX_STORAGE_SIZE = 5242880;
        private static final String TAG = Log.tag((Class<?>) Factory.class);
        private final Context context;

        @Inject
        public Factory(@NonNull Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$create$0(KinesisEventRecorder kinesisEventRecorder, String str, List list) {
            kinesisEventRecorder.errorSubject.onNext(list);
        }

        @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder.Factory
        public EventRecorder create(@NonNull Endpoint endpoint, @NonNull CredentialsProvider credentialsProvider, @NonNull boolean z) {
            Preconditions.checkNotNull(endpoint);
            Preconditions.checkNotNull(credentialsProvider);
            if (endpoint.type() != 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("wrong endpoint type");
                return null;
            }
            if (credentialsProvider.type() != 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("wrong credential provider type");
                return null;
            }
            KinesisEndpoint kinesisEndpoint = (KinesisEndpoint) endpoint;
            CognitoCredentialsProvider cognitoCredentialsProvider = (CognitoCredentialsProvider) credentialsProvider;
            String streamName = kinesisEndpoint.streamName();
            String m = a$$ExternalSyntheticOutline0.m(new StringBuilder("mobilytics"), File.separator, streamName);
            File createDirectory = Utils.createDirectory(this.context, m);
            if (createDirectory == null) {
                Single$$ExternalSyntheticBUOutline0.m("failed to create data directory");
                return null;
            }
            String str = TAG;
            Log.i(str, "Storing data in %s", m);
            KinesisEventRecorder kinesisEventRecorder = new KinesisEventRecorder(0);
            kinesisEventRecorder.streamName = streamName;
            KinesisRecorderConfig kinesisRecorderConfig = new KinesisRecorderConfig();
            long kinesisMaxStorageLimit = z ? kinesisEndpoint.kinesisMaxStorageLimit() : 5242880L;
            Log.d(str, "Max storage limit for %s is %d", streamName, Long.valueOf(kinesisMaxStorageLimit));
            kinesisRecorderConfig.withDeadLetterListener(new FakeEventBus$$ExternalSyntheticLambda0(kinesisEventRecorder, 24)).withMaxStorageSize(kinesisMaxStorageLimit);
            kinesisEventRecorder.kinesisRecorder = new KinesisRecorder(createDirectory, kinesisEndpoint.awsRegion(), cognitoCredentialsProvider.awsCredentialsProvider(), kinesisRecorderConfig);
            return kinesisEventRecorder;
        }

        @Override // com.amazon.alexa.mobilytics.recorder.EventRecorder.Factory
        public EventRecorder create(@NonNull Endpoint endpoint, @NonNull CredentialsProvider credentialsProvider) {
            return create(endpoint, credentialsProvider, false);
        }
    }
}
