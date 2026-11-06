package org.webrtc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.amazon.mmcvs.aidl.IFollowMeCameraListener;
import com.amazon.mmcvs.aidl.IFollowMeCameraManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class FollowMeShim {
    private static final String FOLLOW_ME_SERVICE_CLASS_NAME = "com.amazon.mmcvs.MMCVService";
    private static final String FOLLOW_ME_SERVICE_PKG_NAME = "com.amazon.mmcvs";
    private static final String TAG = "FollowMeShim";
    private static final int WAITTIME_FOR_SERVICE_CONNECTION_MS = 500;
    private final Context applicationContext;
    private IFollowMeCameraManager followMeCameraManager;
    private Surface followMeSurface;
    private final FollowMeCameraSessionFrameUpdater frameUpdater;
    private boolean isConnectingToService;
    private boolean isInitialized;
    private final Lock lock;
    private ServiceConnection mConnection;
    private final IFollowMeCameraListener newROIListener;
    private final Condition serviceConnected;
    private RectF targetROI;
    private int videoHeight;
    private int videoWidth;

    public FollowMeShim(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.serviceConnected = reentrantLock.newCondition();
        this.newROIListener = new IFollowMeCameraListener.Stub() { // from class: org.webrtc.FollowMeShim.1
            @Override // com.amazon.mmcvs.aidl.IFollowMeCameraListener
            public void onNewROIAvailable(RectF rectF) {
                FollowMeShim.this.lock.lock();
                try {
                    FollowMeShim.this.targetROI.set(rectF);
                } finally {
                    FollowMeShim.this.lock.unlock();
                }
            }
        };
        this.frameUpdater = new FollowMeCameraSessionFrameUpdater() { // from class: org.webrtc.FollowMeShim.2
            @Override // org.webrtc.FollowMeCameraSessionFrameUpdater
            public void onCameraFrameUpdateROI(RectF rectF) {
                Lock lock;
                FollowMeShim.this.lock.lock();
                try {
                    boolean z = FollowMeShim.this.isInitialized;
                    FollowMeShim followMeShim = FollowMeShim.this;
                    if (z) {
                        FollowMeUtils.updateCurrentROI(rectF, followMeShim.targetROI, FollowMeShim.this.videoWidth, FollowMeShim.this.videoHeight);
                        lock = FollowMeShim.this.lock;
                    } else {
                        lock = followMeShim.lock;
                    }
                    lock.unlock();
                } catch (Throwable th) {
                    FollowMeShim.this.lock.unlock();
                    throw th;
                }
            }
        };
        this.mConnection = new ServiceConnection() { // from class: org.webrtc.FollowMeShim.3
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                FollowMeShim.this.lock.lock();
                try {
                    FollowMeShim.this.isConnectingToService = false;
                    FollowMeShim.this.followMeCameraManager = IFollowMeCameraManager.Stub.asInterface(iBinder);
                    Log.i(FollowMeShim.TAG, "connected to MMCV service");
                    FollowMeShim.this.serviceConnected.signal();
                } finally {
                    FollowMeShim.this.lock.unlock();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                FollowMeShim.this.lock.lock();
                try {
                    FollowMeShim.this.reset_l();
                    Log.e(FollowMeShim.TAG, "Follow Me Camera Service died!");
                } finally {
                    FollowMeShim.this.lock.unlock();
                }
            }
        };
        this.applicationContext = context;
        this.isInitialized = false;
        this.isConnectingToService = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset_l() {
        this.targetROI.set(0.0f, 0.0f, this.videoWidth, this.videoHeight);
        Surface surface = this.followMeSurface;
        if (surface != null) {
            surface.release();
        }
        this.followMeSurface = null;
        this.followMeCameraManager = null;
        this.isInitialized = false;
        this.isConnectingToService = false;
        Log.i(TAG, "FollowMe reset");
    }

    public boolean bindToService() {
        this.lock.lock();
        try {
            if (this.followMeCameraManager != null) {
                Log.w(TAG, "bindToService: alreday bind to mmcv service!");
            } else {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(FOLLOW_ME_SERVICE_PKG_NAME, FOLLOW_ME_SERVICE_CLASS_NAME));
                String str = TAG;
                Log.i(str, "try to connect to MMCV service");
                this.isConnectingToService = true;
                if (this.applicationContext.bindService(intent, this.mConnection, 1)) {
                    return true;
                }
                Log.e(str, "bindToService: unable to bind to mmcv service!");
                this.isConnectingToService = false;
            }
            return false;
        } finally {
            this.lock.unlock();
        }
    }

    public void dispose() {
        this.lock.lock();
        try {
            try {
                IFollowMeCameraManager iFollowMeCameraManager = this.followMeCameraManager;
                if (iFollowMeCameraManager != null) {
                    iFollowMeCameraManager.unregisterClient();
                }
            } catch (RemoteException e) {
                Logging.e(TAG, "cannot unregister to Follow Me Camera Service", e);
            }
            reset_l();
            this.applicationContext.unbindService(this.mConnection);
            Log.i(TAG, "FollowMe disposed");
        } finally {
            this.lock.unlock();
        }
    }

    public FollowMeCameraSessionFrameUpdater getFrameUpdater() {
        return this.frameUpdater;
    }

    public Surface init(int i, int i2) {
        String str = TAG;
        Log.i(str, "FollowMe initializing");
        this.lock.lock();
        try {
            this.videoWidth = i;
            this.videoHeight = i2;
            this.targetROI = new RectF(0.0f, 0.0f, i, i2);
            if (this.followMeCameraManager == null && this.isConnectingToService && Looper.myLooper() != Looper.getMainLooper()) {
                try {
                    Log.i(str, "Waiting for MMCV service to be connected");
                    this.serviceConnected.await(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Log.e(TAG, "FollowMe cannot be initialized, thread is interrupted.", e);
                    this.lock.unlock();
                }
            }
            IFollowMeCameraManager iFollowMeCameraManager = this.followMeCameraManager;
            if (iFollowMeCameraManager == null) {
                Log.e(str, "FollowMe cannot be initialized, MMCV service is not connected in time and followMeCameraManager is null");
            } else {
                try {
                    Surface registerClient = iFollowMeCameraManager.registerClient(i, i2, this.newROIListener);
                    this.followMeSurface = registerClient;
                    if (registerClient != null) {
                        this.isInitialized = true;
                        this.lock.unlock();
                        return registerClient;
                    }
                    Log.e(str, "FollowMe cannot be initialized, followMeSurface is null");
                } catch (RemoteException e2) {
                    Log.e(TAG, "FollowMe cannot be initialized, cannot register to Follow Me Camera Service and get mFMCSurface!", e2);
                }
            }
            this.lock.unlock();
            return null;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public boolean isInferenceEnabled() {
        this.lock.lock();
        try {
            IFollowMeCameraManager iFollowMeCameraManager = this.followMeCameraManager;
            if (iFollowMeCameraManager == null) {
                Log.w(TAG, "FollowMeCameraManager is null. Cannot return status.");
            } else {
                try {
                    return iFollowMeCameraManager.isEnabled();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            return false;
        } finally {
            this.lock.unlock();
        }
    }

    public void setInferenceEnableStatus(boolean z) {
        this.lock.lock();
        try {
            IFollowMeCameraManager iFollowMeCameraManager = this.followMeCameraManager;
            if (iFollowMeCameraManager == null) {
                Log.w(TAG, "FollowMeCameraManager is null. Cannot set status.");
            } else {
                try {
                    iFollowMeCameraManager.setEnableStatus(z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }
}
