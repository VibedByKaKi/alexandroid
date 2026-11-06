package com.amazon.alexa.android.extension.discovery.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.view.Surface;
import com.amazon.alexa.android.extension.discovery.AbstractExtensionService;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class TestService {
    private static final String TAG = "TestService";
    public static CountDownLatch lSvcConClosed = null;
    public static CountDownLatch lSvcConFail = null;
    public static CountDownLatch lSvcOnCon = null;
    public static CountDownLatch lSvcOnExit = null;
    public static CountDownLatch lSvcOnFocusGain = null;
    public static CountDownLatch lSvcOnFocusLost = null;
    public static CountDownLatch lSvcOnPause = null;
    public static CountDownLatch lSvcOnResume = null;
    public static CountDownLatch lSvcReceive = null;
    public static CountDownLatch lSvcRscAvailable = null;
    public static CountDownLatch lSvcRscUnavailable = null;
    public static Latch latchService = null;
    public static boolean testAsync = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AbstractTestExtensionService extends AbstractExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public IBinder onBind(Intent intent) {
            if (this.mMultiplexService == null) {
                this.mMultiplexService = ExtensionMultiplexService.getInstance().connect(Looper.myLooper(), this, TestService.testAsync);
            }
            return this.mMultiplexService;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Capability extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Capability";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Deferred extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Deferred";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeferredMulti extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "DeferredMulti";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeferredMultiMismatch extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "DeferredMultiMismatch";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FailCom extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "FailCom";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FailDied extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "FailDied";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        public void onMessage(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
            throw new RuntimeException("Doom");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FailDisconnect extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "FailDisconnect";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public IBinder onBind(Intent intent) {
            new Timer().schedule(new TimerTask() { // from class: com.amazon.alexa.android.extension.discovery.test.TestService.FailDisconnect.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Process.killProcess(Process.myPid());
                }
            }, 100L);
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FailSecurity extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "FailSecurity";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Latch extends AbstractTestExtensionService {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public int mClientID;
        public String mConfiguration;
        public ExtensionMultiplexService.ConnectionID mConnectionID = null;
        public String mReceived;

        public Latch() {
            TestService.latchService = this;
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public void disconnect(String str) {
            super.disconnect(str);
            stopSelf();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Latch";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        public void onConnect(ExtensionMultiplexService.ConnectionID connectionID, String str) {
            this.mConnectionID = connectionID;
            this.mConfiguration = str;
            TestService.lSvcOnCon.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        public void onConnectionClosed(ExtensionMultiplexService.ConnectionID connectionID, String str) {
            TestService.lSvcConClosed.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        public void onConnectionFailure(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
            TestService.lSvcConFail.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        @SuppressLint({"Assert"})
        public void onExit(ExtensionMultiplexService.ConnectionID connectionID, int i) {
            TestService.lSvcOnExit.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        @SuppressLint({"Assert"})
        public void onFocusGained(ExtensionMultiplexService.ConnectionID connectionID, int i) {
            TestService.lSvcOnFocusGain.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        @SuppressLint({"Assert"})
        public void onFocusLost(ExtensionMultiplexService.ConnectionID connectionID, int i) {
            TestService.lSvcOnFocusLost.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        @SuppressLint({"Assert"})
        public void onMessage(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
            this.mReceived = str;
            this.mClientID = i;
            TestService.lSvcReceive.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        @SuppressLint({"Assert"})
        public void onPause(ExtensionMultiplexService.ConnectionID connectionID, int i) {
            TestService.lSvcOnPause.countDown();
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        public void onResourceAvailable(ExtensionMultiplexService.ConnectionID connectionID, int i, Surface surface, Rect rect, String str) {
            this.mClientID = i;
            if (TestService.lSvcRscAvailable.getCount() == 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("lSvcRscAvailable latch count can't be 0");
                return;
            }
            if (connectionID == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("ConnectionID connectionID can't be null");
                return;
            }
            if (surface == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("Surface surface can't be null");
                return;
            }
            if (rect == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("Rect rect can't be null");
            } else if (str != null) {
                TestService.lSvcRscAvailable.countDown();
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("String resourceId can't be null");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        public void onResourceUnavailable(ExtensionMultiplexService.ConnectionID connectionID, int i, String str) {
            this.mClientID = i;
            if (connectionID == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("ConnectionID connectionId can't be null");
                return;
            }
            if (TestService.lSvcRscUnavailable.getCount() == 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("lSvcRscUnavailable latch count can't be 0");
            } else if (str != null) {
                TestService.lSvcRscUnavailable.countDown();
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("String resourceId can't be null");
            }
        }

        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService, com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService.ConnectionCallback
        @SuppressLint({"Assert"})
        public void onResume(ExtensionMultiplexService.ConnectionID connectionID, int i) {
            TestService.lSvcOnResume.countDown();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Multi extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Multi";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MultiLatch extends Latch {
        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.Latch, com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "MultiLatch";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Remote extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Remote";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Simple extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Simple";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Simple2 extends AbstractTestExtensionService {
        @Override // com.amazon.alexa.android.extension.discovery.AbstractExtensionService
        public String getName() {
            return "Simple2";
        }

        @Override // com.amazon.alexa.android.extension.discovery.test.TestService.AbstractTestExtensionService, com.amazon.alexa.android.extension.discovery.AbstractExtensionService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }
    }

    public static void latch(int i) {
        lSvcOnCon = new CountDownLatch(1);
        lSvcConClosed = new CountDownLatch(1);
        lSvcConFail = new CountDownLatch(1);
        lSvcReceive = new CountDownLatch(i);
        lSvcRscAvailable = new CountDownLatch(i);
        lSvcRscUnavailable = new CountDownLatch(i);
        lSvcOnFocusLost = new CountDownLatch(i);
        lSvcOnFocusGain = new CountDownLatch(i);
        lSvcOnPause = new CountDownLatch(i);
        lSvcOnResume = new CountDownLatch(i);
        lSvcOnExit = new CountDownLatch(i);
    }

    public static void latch() {
        latch(1);
    }
}
