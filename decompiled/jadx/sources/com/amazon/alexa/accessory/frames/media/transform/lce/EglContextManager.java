package com.amazon.alexa.accessory.frames.media.transform.lce;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.amazon.alexa.accessory.frames.utils.Log;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class EglContextManager {
    private static final int EGL_OPENGL_ES3_BIT_KHR = 64;
    private static final String TAG = "LceRetoucher.EglContext";
    private EGLDisplay eglDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext eglContext = EGL14.EGL_NO_CONTEXT;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    private static void check(boolean z, String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public void initialize() {
        if (isInitialized()) {
            return;
        }
        try {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            check(eglGetDisplay != EGL14.EGL_NO_DISPLAY, "Unable to get EGL display");
            int[] iArr = new int[2];
            check(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "Unable to initialize EGL");
            this.eglDisplay = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            check(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 64, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0, "No suitable EGL config found");
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
            this.eglContext = eglCreateContext;
            check(eglCreateContext != EGL14.EGL_NO_CONTEXT, "Failed to create EGL context");
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            check(eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE, "Failed to create pbuffer surface");
            Log.i(TAG, "EGL context initialized");
        } catch (IllegalStateException e) {
            release();
            throw e;
        }
    }

    public boolean isInitialized() {
        return this.eglContext != EGL14.EGL_NO_CONTEXT;
    }

    public void makeCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        check(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext), "eglMakeCurrent failed");
    }

    public void release(boolean z) {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.eglDisplay, eGLContext);
            }
            EGLSurface eGLSurface2 = this.eglSurface;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.eglDisplay, eGLSurface2);
            }
            if (z) {
                EGL14.eglTerminate(this.eglDisplay);
            }
        }
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        Log.i(TAG, "EGL context released");
    }

    public void releaseCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    public void release() {
        release(true);
    }
}
