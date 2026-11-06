package com.amazon.alexa.smarthomecameras.handlers;

import com.amazon.alexa.smarthomecameras.model.DevicePayload;
import com.amazon.alexa.smarthomecameras.ptz.PtzEventListener;
import com.amazon.alexa.smarthomecameras.ptz.PtzGestureListener;
import com.amazon.ptz.gestures.GestureType;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewPtzGestureListener implements PtzGestureListener {
    private static final String TAG = "LiveViewPtzGestureListener";
    private final DevicePayload devicePayload;
    private GestureType lastGestureType;
    private final PtzEventListener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.smarthomecameras.handlers.LiveViewPtzGestureListener$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$ptz$gestures$GestureType;

        static {
            int[] iArr = new int[GestureType.values().length];
            $SwitchMap$com$amazon$ptz$gestures$GestureType = iArr;
            try {
                iArr[GestureType.ZOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$ptz$gestures$GestureType[GestureType.PAN_TILT_DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$ptz$gestures$GestureType[GestureType.ZOOM_TOGGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LiveViewPtzGestureListener(PtzEventListener ptzEventListener, DevicePayload devicePayload) {
        this.listener = ptzEventListener;
        this.devicePayload = devicePayload;
    }

    @Override // com.amazon.alexa.smarthomecameras.ptz.PtzGestureListener
    public synchronized void onGestureChanged(GestureType gestureType) {
        Objects.toString(gestureType);
        this.lastGestureType = gestureType;
    }

    @Override // com.amazon.alexa.smarthomecameras.ptz.PtzGestureListener
    public synchronized void onTouch() {
        try {
            Objects.toString(this.lastGestureType);
            GestureType gestureType = this.lastGestureType;
            if (gestureType == null) {
                return;
            }
            int i = AnonymousClass1.$SwitchMap$com$amazon$ptz$gestures$GestureType[gestureType.ordinal()];
            if (i == 1) {
                this.listener.onPinchZoom(this.devicePayload.getManufacturerName());
            } else if (i == 2) {
                this.listener.onPan(this.devicePayload.getManufacturerName());
            } else if (i == 3) {
                this.listener.onDoubleTapZoom(this.devicePayload.getManufacturerName());
            }
            this.lastGestureType = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
